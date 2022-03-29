//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.midlet.MIDlet;

public final class NET_Lizard extends MIDlet {
    static NET_Lizard a;
    static int b = 0;
    static k c;
    static boolean d = true;

    public NET_Lizard() {
        a = this;
        if (f.n == null) {
            f.d();
        }

        if (c == null) {
            c = new k();
        }

    }

    public final void destroyApp(boolean var1) {
        if (d) {
            try {
                c.S = false;
            } catch (Exception var8) {
            }

            try {
                c.cr.n = false;
            } catch (Exception var7) {
            }

            try {
                c.e = false;
            } catch (Exception var6) {
            }

            try {
                m.c();
            } catch (Exception var5) {
            }

            try {
                if (k.b != null && n.g) {
                    c.d();
                }
            } catch (Exception var4) {
            }
        }

        f.c();

        try {
            c.ez = null;
        } catch (Exception var3) {
        }

        c = null;
        b = 0;
        this.notifyDestroyed();
    }

    public final void pauseApp() {
        b = 2;
        this.notifyPaused();
    }

    public static void a() {
        d = false;
        a.destroyApp(true);
        a.notifyDestroyed();
        a = null;
    }

    public final void startApp() {
        if (b == 0) {
            k.cq = true;
            c.j();
        }

        b = 1;
        d = true;
    }
}
