package javax.bluetooth;

import javax.microedition.io.Connection;

public class LocalDevice {
    public static LocalDevice getLocalDevice() {
        return new LocalDevice();
    }

    public ServiceRecord getRecord(Connection notifier) {
        return new ServiceRecord() {
            @Override
            public RemoteDevice getHostDevice() {
                return new RemoteDevice();
            }

            @Override
            public String getConnectionURL(int requiredSecurity, boolean mustBeMaster) {
                return new String("btl2cap://000000000000:0000;ReceiveMTU=512;TransmitMTU=512");
            }

            @Override
            public boolean setAttributeValue(int attrID, DataElement attrValue) {
                return true;
            }
        };
    }

    public String getFriendlyName() {
        return new String();
    }

    public DiscoveryAgent getDiscoveryAgent() {
        return new DiscoveryAgent();
    }

    public boolean setDiscoverable(int mode) {
        return true;
    }
}
