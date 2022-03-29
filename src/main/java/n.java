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

public final class n implements Runnable {
    String a = "1020304050d0708093a1b121d1e1f100";
    static boolean b;
    static String c;
    int[] d = new int[1];
    String e;
    L2CAPConnection f;
    static boolean g;
    byte[] h;
    byte[] i;
    Enumeration j;
    DiscoveryAgent k;
    boolean l;
    byte m;
    b n;
    LocalDevice o;
    LocalDevice p;
    String q;
    static boolean r;
    static boolean s = false;
    boolean t = false;
    l u;
    L2CAPConnectionNotifier v;
    String w;
    ServiceRecord x;
    Thread y;

    public n(int var1) {
        this.d[0] = 256;
        this.f = null;
        this.v = null;
        this.e = null;
        this.x = null;
        this.o = null;
        this.n = null;
        this.u = null;
        this.p = null;
        this.k = null;
        this.j = null;
        this.y = null;
        c = null;
        r = false;
        this.l = false;
        this.h = new byte[var1];
        this.i = new byte[var1];
        this.q = "server";
    }

    private void c() {
        e.a("Starting client...");
        e.a("Starting DiscoveryAgent...");

        try {
            this.p = LocalDevice.getLocalDevice();
            this.k = this.p.getDiscoveryAgent();
            this.n = new b(this);
            this.p.setDiscoverable(10390323);
            synchronized(this.n) {
                this.k.startInquiry(10390323, this.n);

                try {
                    this.n.wait();
                } catch (InterruptedException var10) {
                    e.a("DiscoveryAgent feild");
                    g = false;
                    return;
                }
            }

            e.a("SearchServices...");
            this.j = this.n.a.elements();
            UUID[] var2 = new UUID[]{new UUID(this.a, false)};
            int[] var3 = new int[]{256};
            this.u = new l(this);

            while(this.j.hasMoreElements()) {
                synchronized(this.u) {
                    this.k.searchServices(var3, var2, (RemoteDevice)this.j.nextElement(), this.u);

                    try {
                        this.u.wait();
                    } catch (InterruptedException var8) {
                        e.a("serv_listener feild");
                        g = false;
                        return;
                    }
                }
            }
        } catch (BluetoothStateException var12) {
            e.a("SearchServices feild");
            g = false;
            return;
        }

        if (this.u.a != null) {
            try {
                this.w = this.u.a.getHostDevice().getFriendlyName(true);
                String var1 = LocalDevice.getLocalDevice().getFriendlyName();
                c = this.u.a.getConnectionURL(0, false);
                e.a("Client name:" + var1);
                e.a("Server name:" + this.w);
                e.a("Connect to url:" + c);
                this.f = (L2CAPConnection)Connector.open(c);
                g = true;
            } catch (Exception var7) {
                g = false;
            }
        } else {
            e.a("Service not find");
            g = false;
        }
    }

    private void d() {
        try {
            e.a("Starting server...");
            this.o = LocalDevice.getLocalDevice();
            this.o.setDiscoverable(10390323);
            this.v = (L2CAPConnectionNotifier)Connector.open("btl2cap://localhost:" + this.a);
            this.x = this.o.getRecord(this.v);
            this.q = this.e == null ? this.o.getFriendlyName() : this.e;
            this.x.setAttributeValue(this.d[0], new DataElement(32, this.q));
            e.a("wait for client...");
            c = this.x.getConnectionURL(0, true).substring(10, this.x.getConnectionURL(0, true).length());
            c = c.substring(0, c.indexOf(";"));
            e.a("I:" + c);
            this.f = this.v.acceptAndOpen();
            this.v.close();
            this.h();
            e.a("Wait...");
            g = true;
        } catch (Exception var2) {
            g = false;
        }
    }

    private void e() {
        try {
            this.f = (L2CAPConnection)Connector.open(c);
            g = true;
        } catch (Exception var2) {
            g = false;
        }

        this.g();
    }

    private void f() {
        e.a("Starting client...");
        e.a("Starting DiscoveryAgent...");

        try {
            this.p = LocalDevice.getLocalDevice();
            this.k = this.p.getDiscoveryAgent();
            this.n = new b(this);
            this.p.setDiscoverable(10390323);
            synchronized(this.n) {
                this.k.startInquiry(10390323, this.n);

                try {
                    this.n.wait();
                } catch (InterruptedException var10) {
                    e.a("DiscoveryAgent feild");
                    g = false;
                    return;
                }
            }

            if (this.t) {
                this.i();
                return;
            }

            e.a("SearchServices...");
            this.j = this.n.a.elements();
            UUID[] var2 = new UUID[]{new UUID(this.a, false)};
            int[] var3 = new int[]{256};
            this.u = new l(this);

            while(this.j.hasMoreElements() && !this.t) {
                synchronized(this.u) {
                    this.k.searchServices(var3, var2, (RemoteDevice)this.j.nextElement(), this.u);

                    try {
                        this.u.wait();
                    } catch (InterruptedException var8) {
                        e.a("serv_listener feild");
                        g = false;
                        return;
                    }
                }
            }
        } catch (BluetoothStateException var12) {
            e.a("SearchServices feild");
            g = false;
            return;
        }

        if (this.u.a != null) {
            try {
                this.w = this.u.a.getHostDevice().getFriendlyName(true);
                String var1 = LocalDevice.getLocalDevice().getFriendlyName();
                c = this.u.a.getConnectionURL(0, false);
                e.a("Client name:" + var1);
                e.a("Server name:" + this.w);
                e.a("url:" + c);
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
            this.f.close();
        } catch (Exception var3) {
        }

        try {
            this.v.close();
        } catch (Exception var2) {
        }

        g = false;
        this.v = null;
        if (this.l && s) {
            try {
                if (this.k != null) {
                    this.k.cancelInquiry(this.n);
                }

                return;
            } catch (Exception var4) {
            }
        }

    }

    private void g() {
        r = false;

        try {
            this.f.receive(this.h);
            k.cz = this.h[0];
            k.cl = this.h[1];
            this.m = 1;
        } catch (Exception var2) {
            this.i();
            this.m = -1;
        }
    }

    public final void run() {
        this.t = false;
        s = true;
        if (this.l) {
            this.f();
        } else {
            if (b) {
                this.d();
            } else if (c == null) {
                this.c();
            } else {
                this.e();
            }

            if (!g) {
                e.a("error: creat connect fail");
            } else {
                e.a("connect ok");
                byte[] var3 = this.h;
                byte[] var4 = this.i;
                r = false;

                label62:
                while(true) {
                    while(true) {
                        do {
                            while(true) {
                                if (!g) {
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
                        if (b) {
                            try {
                                this.f.send(var4);
                                this.f.receive(var3);
                                r = true;
                                break;
                            } catch (Exception var8) {
                                this.i();
                            }
                        } else {
                            try {
                                this.f.receive(var3);
                                this.f.send(var4);
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
                this.f.close();
            } catch (Exception var6) {
            }

            this.f = null;
            r = false;
            this.v = null;
            this.e = null;
            this.x = null;
            this.o = null;
            this.n = null;
            this.u = null;
            this.p = null;
            this.k = null;
            this.j = null;
            c = null;
            g = false;
            this.l = false;
        }

        e.a("RUN --- OK");
        this.l = false;
        s = false;
    }

    private void h() {
        r = false;
        this.i[0] = k.cz;
        this.i[1] = (byte)k.cl;

        try {
            this.f.send(this.i);
        } catch (Exception var2) {
            this.i();
        }
    }

    public final void b() {
        this.y = null;
        g = false;
        this.y = new Thread(this);
        this.y.start();
        s = true;
    }

    private void i() {
        g = false;

        try {
            this.f.close();
        } catch (Exception var2) {
        }

        this.f = null;
        this.l = false;
        r = false;
        this.v = null;
        this.e = null;
        this.x = null;
        this.o = null;
        this.n = null;
        this.u = null;
        this.p = null;
        this.k = null;
        this.j = null;
        c = null;
        e.a("Disconnect");
    }
}
