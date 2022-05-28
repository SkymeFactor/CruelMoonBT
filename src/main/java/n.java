//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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

// Connection manager
public final class n implements Runnable {
    String a12 = "1020304050d0708093a1b121d1e1f100";
    static boolean b12;
    static String c12;
    int[] d12 = new int[1];
    String e12;
    L2CAPConnection f12;
    static boolean g12;
    byte[] h12;
    byte[] i12;
    Enumeration j12;
    DiscoveryAgent k12;
    boolean l12;
    byte m12;
    MyDiscoveryAgent n12;
    LocalDevice o;
    LocalDevice p;
    String q;
    static boolean r;
    static boolean s = false;
    boolean t = false;
    ServerListener u;
    L2CAPConnectionNotifier v;
    String w;
    ServiceRecord x;
    Thread y;

    public n(int var1) {
        this.d12[0] = 256;
        this.f12 = null;
        this.v = null;
        this.e12 = null;
        this.x = null;
        this.o = null;
        this.n12 = null;
        this.u = null;
        this.p = null;
        this.k12 = null;
        this.j12 = null;
        this.y = null;
        c12 = null;
        r = false;
        this.l12 = false;
        this.h12 = new byte[var1];
        this.i12 = new byte[var1];
        this.q = "server";
    }

    private void c() {
        e.a("Starting client...");
        e.a("Starting DiscoveryAgent...");

        try {
            this.p = LocalDevice.getLocalDevice();
            this.k12 = this.p.getDiscoveryAgent();
            this.n12 = new MyDiscoveryAgent(this);
            this.p.setDiscoverable(10390323);
            synchronized(this.n12) {
                this.k12.startInquiry(10390323, this.n12);

                try {
                    this.n12.wait();
                } catch (InterruptedException var10) {
                    e.a("DiscoveryAgent failed");
                    g12 = false;
                    return;
                }
            }

            e.a("SearchServices...");
            this.j12 = this.n12.devices.elements();
            UUID[] var2 = new UUID[]{new UUID(this.a12, false)};
            int[] var3 = new int[]{256};
            this.u = new ServerListener(this);

            while(this.j12.hasMoreElements()) {
                synchronized(this.u) {
                    this.k12.searchServices(var3, var2, (RemoteDevice)this.j12.nextElement(), this.u);

                    try {
                        this.u.wait();
                    } catch (InterruptedException var8) {
                        e.a("serv_listener failed");
                        g12 = false;
                        return;
                    }
                }
            }
        } catch (BluetoothStateException var12) {
            e.a("SearchServices failed");
            g12 = false;
            return;
        }

        if (this.u.a != null) {
            try {
                this.w = this.u.a.getHostDevice().getFriendlyName(true);
                String var1 = LocalDevice.getLocalDevice().getFriendlyName();
                c12 = this.u.a.getConnectionURL(0, false);
                e.a("Client name:" + var1);
                e.a("Server name:" + this.w);
                e.a("Connect to url:" + c12);
                this.f12 = (L2CAPConnection)Connector.open(c12);
                g12 = true;
            } catch (Exception var7) {
                g12 = false;
            }
        } else {
            e.a("Service not find");
            g12 = false;
        }
    }

    private void d() {
        try {
            e.a("Starting server...");
            this.o = LocalDevice.getLocalDevice();
            this.o.setDiscoverable(10390323);
            this.v = (L2CAPConnectionNotifier)Connector.open("btl2cap://localhost:" + this.a12);
            this.x = this.o.getRecord(this.v);
            this.q = this.e12 == null ? this.o.getFriendlyName() : this.e12;
            this.x.setAttributeValue(this.d12[0], new DataElement(32, this.q));
            e.a("wait for client...");
            c12 = this.x.getConnectionURL(0, true).substring(10, this.x.getConnectionURL(0, true).length());
            c12 = c12.substring(0, c12.indexOf(";"));
            e.a("I:" + c12);
            this.f12 = this.v.acceptAndOpen();
            this.v.close();
            this.h();
            e.a("Wait...");
            g12 = true;
        } catch (Exception var2) {
            g12 = false;
        }
    }

    private void e() {
        try {
            this.f12 = (L2CAPConnection)Connector.open(c12);
            g12 = true;
        } catch (Exception var2) {
            g12 = false;
        }

        this.g();
    }

    private void f() {
        e.a("Starting client...");
        e.a("Starting DiscoveryAgent...");

        try {
            this.p = LocalDevice.getLocalDevice();
            this.k12 = this.p.getDiscoveryAgent();
            this.n12 = new MyDiscoveryAgent(this);
            this.p.setDiscoverable(10390323);
            synchronized(this.n12) {
                this.k12.startInquiry(10390323, this.n12);

                try {
                    this.n12.wait();
                } catch (InterruptedException var10) {
                    e.a("DiscoveryAgent feild");
                    g12 = false;
                    return;
                }
            }

            if (this.t) {
                this.i();
                return;
            }

            e.a("SearchServices...");
            this.j12 = this.n12.devices.elements();
            UUID[] var2 = new UUID[]{new UUID(this.a12, false)};
            int[] var3 = new int[]{256};
            this.u = new ServerListener(this);

            while(this.j12.hasMoreElements() && !this.t) {
                synchronized(this.u) {
                    this.k12.searchServices(var3, var2, (RemoteDevice)this.j12.nextElement(), this.u);

                    try {
                        this.u.wait();
                    } catch (InterruptedException var8) {
                        e.a("serv_listener feild");
                        g12 = false;
                        return;
                    }
                }
            }
        } catch (BluetoothStateException var12) {
            e.a("SearchServices feild");
            g12 = false;
            return;
        }

        if (this.u.a != null) {
            try {
                this.w = this.u.a.getHostDevice().getFriendlyName(true);
                String var1 = LocalDevice.getLocalDevice().getFriendlyName();
                c12 = this.u.a.getConnectionURL(0, false);
                e.a("Client name:" + var1);
                e.a("Server name:" + this.w);
                e.a("url:" + c12);
            } catch (Exception var7) {
                e.a("Service not find");
            }
        } else {
            e.a("Service not find");
        }
    }

    final void a() {
        this.t = true;

        try {
            this.f12.close();
        } catch (Exception var3) {
        }

        try {
            this.v.close();
        } catch (Exception var2) {
        }

        g12 = false;
        this.v = null;
        if (this.l12 && s) {
            try {
                if (this.k12 != null) {
                    this.k12.cancelInquiry(this.n12);
                }

                return;
            } catch (Exception var4) {
            }
        }

    }

    private void g() {
        r = false;

        try {
            this.f12.receive(this.h12);
            k.cz = this.h12[0];
            k.cl = this.h12[1];
            this.m12 = 1;
        } catch (Exception var2) {
            this.i();
            this.m12 = -1;
        }
    }

    public final void run() {
        this.t = false;
        s = true;
        if (this.l12) {
            this.f();
        } else {
            if (b12) {
                this.d();
            } else if (c12 == null) {
                this.c();
            } else {
                this.e();
            }

            if (!g12) {
                e.a("error: create connection failed");
            } else {
                e.a("connect ok");
                byte[] var3 = this.h12;
                byte[] var4 = this.i12;
                r = false;

                label62:
                while(true) {
                    while(true) {
                        do {
                            while(true) {
                                if (!g12) {
                                    break label62;
                                }

                                try {
                                    Thread.sleep(3L);
                                    break;
                                } catch (Exception var7) {
                                    this.i();
                                }
                            }
                        } while(r);

                        System.currentTimeMillis();
                        if (b12) {
                            try {
                                this.f12.send(var4);
                                this.f12.receive(var3);
                                r = true;
                                break;
                            } catch (Exception var8) {
                                this.i();
                            }
                        } else {
                            try {
                                this.f12.receive(var3);
                                this.f12.send(var4);
                                r = true;
                                break;
                            } catch (Exception var9) {
                                this.i();
                            }
                        }
                    }

                    System.currentTimeMillis();
                }
            }

            try {
                this.f12.close();
            } catch (Exception var6) {
            }

            this.f12 = null;
            r = false;
            this.v = null;
            this.e12 = null;
            this.x = null;
            this.o = null;
            this.n12 = null;
            this.u = null;
            this.p = null;
            this.k12 = null;
            this.j12 = null;
            c12 = null;
            g12 = false;
            this.l12 = false;
        }

        e.a("RUN --- OK");
        this.l12 = false;
        s = false;
    }

    private void h() {
        r = false;
        this.i12[0] = k.cz;
        this.i12[1] = (byte) k.cl;

        try {
            this.f12.send(this.i12);
        } catch (Exception var2) {
            this.i();
        }
    }

    public final void b() {
        this.y = null;
        g12 = false;
        this.y = new Thread(this);
        this.y.start();
        s = true;
    }

    private void i() {
        g12 = false;

        try {
            this.f12.close();
        } catch (Exception var2) {
        }

        this.f12 = null;
        this.l12 = false;
        r = false;
        this.v = null;
        this.e12 = null;
        this.x = null;
        this.o = null;
        this.n12 = null;
        this.u = null;
        this.p = null;
        this.k12 = null;
        this.j12 = null;
        c12 = null;
        e.a("Disconnect");
    }
}
