import java.util.Enumeration;
import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DataElement;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.L2CAPConnection;
import javax.bluetooth.L2CAPConnectionNotifier;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;
import javax.microedition.io.Connector;


public final class BluetoothManager implements Runnable {
    String serviceUUID = "1020304050d0708093a1b121d1e1f100";
    static boolean isServer;
    static String connectionURL;
    int[] servRecordAttrIDs = new int[1];
    String defaultServerName;  // Apparently is always null
    L2CAPConnection connection;
    static boolean isConnected;
    byte[] receiveBuffer;
    byte[] sendBuffer;
    Enumeration<?> remoteDevices;
    DiscoveryAgent discoveryAgent;
    boolean isInDiscoveryMode;
    byte connectionState;   // 0: unset, 1: set, -1: error
    ClientListener clientListener;
    LocalDevice localDeviceAsServer;
    LocalDevice localDeviceAsClient;
    String localServerName;
    static boolean isAwaitingData;
    static boolean isRunning = false;
    boolean connectionAborted = false;
    ServerListener serverListener;
    L2CAPConnectionNotifier connectionNotifier;
    String remoteServerName;
    ServiceRecord serviceInfo;
    Thread threadHandle;

    public BluetoothManager(int bufferSize) {
        this.servRecordAttrIDs[0] = 256;
        this.connection = null;
        this.connectionNotifier = null;
        this.defaultServerName = null;
        this.serviceInfo = null;
        this.localDeviceAsServer = null;
        this.clientListener = null;
        this.serverListener = null;
        this.localDeviceAsClient = null;
        this.discoveryAgent = null;
        this.remoteDevices = null;
        this.threadHandle = null;
        connectionURL = null;
        isAwaitingData = false;
        this.isInDiscoveryMode = false;
        this.receiveBuffer = new byte[bufferSize];
        this.sendBuffer = new byte[bufferSize];
        this.localServerName = "server";
    }

    private void startClient() {
        BTLoggerDBG.log("Starting client...");
        BTLoggerDBG.log("Starting DiscoveryAgent...");

        try {
            this.localDeviceAsClient = LocalDevice.getLocalDevice();
            this.discoveryAgent = this.localDeviceAsClient.getDiscoveryAgent();
            this.clientListener = new ClientListener(this);
            this.localDeviceAsClient.setDiscoverable(DiscoveryAgent.GIAC);
            synchronized(this.clientListener) {
                this.discoveryAgent.startInquiry(DiscoveryAgent.GIAC, this.clientListener);

                try {
                    this.clientListener.wait();
                } catch (InterruptedException exception) {
                    BTLoggerDBG.log("DiscoveryAgent failed");
                    isConnected = false;
                    return;
                }
            }

            BTLoggerDBG.log("SearchServices...");
            this.remoteDevices = this.clientListener.devices.elements();
            UUID[] uuids = new UUID[]{new UUID(this.serviceUUID, false)};
            int[] attrs = new int[]{256};   // service name attribute 0x0100
            this.serverListener = new ServerListener(this);

            while(this.remoteDevices.hasMoreElements()) {
                synchronized(this.serverListener) {
                    this.discoveryAgent.searchServices(
                            attrs, uuids,
                            (RemoteDevice)this.remoteDevices.nextElement(),
                            this.serverListener
                    );

                    try {
                        this.serverListener.wait();
                    } catch (InterruptedException exception) {
                        BTLoggerDBG.log("serv_listener failed");
                        isConnected = false;
                        return;
                    }
                }
            }
        } catch (BluetoothStateException exception) {
            BTLoggerDBG.log("SearchServices failed");
            isConnected = false;
            return;
        }

        if (this.serverListener.remoteService != null) {
            try {
                this.remoteServerName = this.serverListener.remoteService.getHostDevice().getFriendlyName(true);
                String localClientName = LocalDevice.getLocalDevice().getFriendlyName();
                connectionURL = this.serverListener.remoteService.getConnectionURL(0, false);
                BTLoggerDBG.log("Client name:" + localClientName);
                BTLoggerDBG.log("Server name:" + this.remoteServerName);
                BTLoggerDBG.log("Connect to url:" + connectionURL);
                this.connection = (L2CAPConnection)Connector.open(connectionURL);
                isConnected = true;
            } catch (Exception exception) {
                isConnected = false;
            }
        } else {
            BTLoggerDBG.log("Service not find");
            isConnected = false;
        }
    }

    private void startServer() {
        try {
            BTLoggerDBG.log("Starting server...");
            this.localDeviceAsServer = LocalDevice.getLocalDevice();
            this.localDeviceAsServer.setDiscoverable(DiscoveryAgent.GIAC);
            this.connectionNotifier = (L2CAPConnectionNotifier)Connector.open("btl2cap://localhost:" + this.serviceUUID);
            this.serviceInfo = this.localDeviceAsServer.getRecord(this.connectionNotifier);
            this.localServerName = this.defaultServerName == null ? this.localDeviceAsServer.getFriendlyName() : this.defaultServerName;
            this.serviceInfo.setAttributeValue(this.servRecordAttrIDs[0], new DataElement(DataElement.STRING, this.localServerName));
            BTLoggerDBG.log("wait for client...");
            // Removes protocol (btl2cap://) from address
            connectionURL = this.serviceInfo.getConnectionURL(0, true).substring(10);
            // Removes arguments from address
            connectionURL = connectionURL.substring(0, connectionURL.indexOf(";"));
            BTLoggerDBG.log("I:" + connectionURL);
            this.connection = this.connectionNotifier.acceptAndOpen();
            this.connectionNotifier.close();
            this.ping();
            BTLoggerDBG.log("Wait...");
            isConnected = true;
        } catch (Exception exception) {
            isConnected = false;
        }
    }

    private void reconnectClient() {
        try {
            this.connection = (L2CAPConnection)Connector.open(connectionURL);
            isConnected = true;
        } catch (Exception exception) {
            isConnected = false;
        }

        this.pong();
    }

    private void findServer() {
        BTLoggerDBG.log("Starting client...");
        BTLoggerDBG.log("Starting DiscoveryAgent...");

        try {
            this.localDeviceAsClient = LocalDevice.getLocalDevice();
            this.discoveryAgent = this.localDeviceAsClient.getDiscoveryAgent();
            this.clientListener = new ClientListener(this);
            this.localDeviceAsClient.setDiscoverable(DiscoveryAgent.GIAC);
            synchronized(this.clientListener) {
                this.discoveryAgent.startInquiry(DiscoveryAgent.GIAC, this.clientListener);

                try {
                    this.clientListener.wait();
                } catch (InterruptedException exception) {
                    BTLoggerDBG.log("DiscoveryAgent feild");
                    isConnected = false;
                    return;
                }
            }

            if (this.connectionAborted) {
                this.disconnect();
                return;
            }

            BTLoggerDBG.log("SearchServices...");
            this.remoteDevices = this.clientListener.devices.elements();
            UUID[] uuids = new UUID[]{new UUID(this.serviceUUID, false)};
            int[] attrs = new int[]{256};
            this.serverListener = new ServerListener(this);

            while(this.remoteDevices.hasMoreElements() && !this.connectionAborted) {
                synchronized(this.serverListener) {
                    this.discoveryAgent.searchServices(attrs, uuids, (RemoteDevice)this.remoteDevices.nextElement(), this.serverListener);

                    try {
                        this.serverListener.wait();
                    } catch (InterruptedException exception) {
                        BTLoggerDBG.log("serv_listener feild");
                        isConnected = false;
                        return;
                    }
                }
            }
        } catch (BluetoothStateException exception) {
            BTLoggerDBG.log("SearchServices feild");
            isConnected = false;
            return;
        }

        if (this.serverListener.remoteService != null) {
            try {
                this.remoteServerName = this.serverListener.remoteService.getHostDevice().getFriendlyName(true);
                String localClientName = LocalDevice.getLocalDevice().getFriendlyName();
                connectionURL = this.serverListener.remoteService.getConnectionURL(0, false);
                BTLoggerDBG.log("Client name:" + localClientName);
                BTLoggerDBG.log("Server name:" + this.remoteServerName);
                BTLoggerDBG.log("url:" + connectionURL);
            } catch (Exception exception) {
                BTLoggerDBG.log("Service not find");
            }
        } else {
            BTLoggerDBG.log("Service not find");
        }
    }

    final void abortConnection() {
        this.connectionAborted = true;

        try {
            this.connection.close();
        } catch (Exception ignore) {
        }

        try {
            this.connectionNotifier.close();
        } catch (Exception ignore) {
        }

        isConnected = false;
        this.connectionNotifier = null;
        if (this.isInDiscoveryMode && isRunning) {
            try {
                if (this.discoveryAgent != null) {
                    this.discoveryAgent.cancelInquiry(this.clientListener);
                }

                return;
            } catch (Exception ignore) {
            }
        }

    }

    private void pong() {
        isAwaitingData = false;

        try {
            this.connection.receive(this.receiveBuffer);
            k.cz = this.receiveBuffer[0];
            k.cl = this.receiveBuffer[1];
            this.connectionState = 1;
        } catch (Exception exception) {
            this.disconnect();
            this.connectionState = -1;
        }
    }

    public final void run() {
        this.connectionAborted = false;
        isRunning = true;
        if (this.isInDiscoveryMode) {
            this.findServer();
        } else {
            if (isServer) {
                this.startServer();
            } else if (connectionURL == null) {
                this.startClient();
            } else {
                this.reconnectClient();
            }

            if (!isConnected) {
                BTLoggerDBG.log("error: create connection failed");
            } else {
                BTLoggerDBG.log("connect ok");
                byte[] inBuff = this.receiveBuffer;
                byte[] outBuff = this.sendBuffer;
                isAwaitingData = false;

                // TODO: Too many loops. Ideally, requires optimization
                label62:
                while(true) {
                    while(true) {
                        do {
                            while(true) {
                                if (!isConnected) {
                                    break label62;
                                }

                                try {
                                    Thread.sleep(3L);
                                    break;
                                } catch (Exception exception) {
                                    this.disconnect();
                                }
                            }
                        } while(isAwaitingData);

                        System.currentTimeMillis();
                        if (isServer) {
                            try {
                                this.connection.send(outBuff);
                                this.connection.receive(inBuff);
                                isAwaitingData = true;
                                break;
                            } catch (Exception exception) {
                                this.disconnect();
                            }
                        } else {
                            try {
                                this.connection.receive(inBuff);
                                this.connection.send(outBuff);
                                isAwaitingData = true;
                                break;
                            } catch (Exception exception) {
                                this.disconnect();
                            }
                        }
                    }

                    System.currentTimeMillis();
                }
            }

            try {
                this.connection.close();
            } catch (Exception ignore) {
            }

            this.connection = null;
            isAwaitingData = false;
            this.connectionNotifier = null;
            this.defaultServerName = null;
            this.serviceInfo = null;
            this.localDeviceAsServer = null;
            this.clientListener = null;
            this.serverListener = null;
            this.localDeviceAsClient = null;
            this.discoveryAgent = null;
            this.remoteDevices = null;
            connectionURL = null;
            isConnected = false;
            this.isInDiscoveryMode = false;
        }

        BTLoggerDBG.log("RUN --- OK");
        this.isInDiscoveryMode = false;
        isRunning = false;
    }

    private void ping() {
        isAwaitingData = false;
        this.sendBuffer[0] = k.cz;
        this.sendBuffer[1] = (byte) k.cl;

        try {
            this.connection.send(this.sendBuffer);
        } catch (Exception exception) {
            this.disconnect();
        }
    }

    public final void launchInSeparateThread() {
        this.threadHandle = null;
        isConnected = false;
        this.threadHandle = new Thread(this);
        this.threadHandle.start();
        isRunning = true;
    }

    private void disconnect() {
        isConnected = false;

        try {
            this.connection.close();
        } catch (Exception ignore) {
        }

        this.connection = null;
        this.isInDiscoveryMode = false;
        isAwaitingData = false;
        this.connectionNotifier = null;
        this.defaultServerName = null;
        this.serviceInfo = null;
        this.localDeviceAsServer = null;
        this.clientListener = null;
        this.serverListener = null;
        this.localDeviceAsClient = null;
        this.discoveryAgent = null;
        this.remoteDevices = null;
        connectionURL = null;
        BTLoggerDBG.log("Disconnect");
    }
}
