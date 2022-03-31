//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.midlet.MIDlet;

public final class NET_Lizard extends MIDlet {
    static NET_Lizard app;
    static int b_nl = 0;
    static k c_nl;
    static boolean d_nl = true;

    public NET_Lizard() {
        app = this;
        if (f.instanceHandler == null) {
            f.d();
        }

        if (c_nl == null) {
            c_nl = new k();
        }

    }

    public final void destroyApp(boolean unconditional) {
        if (d_nl) {
            try {
                c_nl.S = false;
            } catch (Exception var8) {
            }

            try {
                c_nl.cr.n9 = false;
            } catch (Exception var7) {
            }

            try {
                c.e2 = false;
            } catch (Exception var6) {
            }

            try {
                m.c();
            } catch (Exception var5) {
            }

            try {
                if (k.b10 != null && n.g12) {
                    c_nl.d();
                }
            } catch (Exception var4) {
            }
        }

        f.c();

        try {
            c_nl.ez = null;
        } catch (Exception var3) {
        }

        c_nl = null;
        b_nl = 0;
        this.notifyDestroyed();
    }

    public final void pauseApp() {
        b_nl = 2;
        this.notifyPaused();
    }

    public static void a() {
        d_nl = false;
        app.destroyApp(true);
        app.notifyDestroyed();
        app = null;
    }

    public final void startApp() {
        if (b_nl == 0) {
            k.cq = true;
            c_nl.j();
        }

        b_nl = 1;
        d_nl = true;
    }
}
