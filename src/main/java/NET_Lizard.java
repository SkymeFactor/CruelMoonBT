//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.midlet.MIDlet;

public final class NET_Lizard extends MIDlet {
    static NET_Lizard app;
    static int appState = 0;
    static k game;
    static boolean d_nl = true;

    public NET_Lizard() {
        app = this;
        if (AssetManager.instanceHandler == null) {
            AssetManager.createInstance();
        }

        if (game == null) {
            game = new k();
        }

    }

    public final void destroyApp(boolean unconditional) {
        if (d_nl) {
            try {
                game.S = false;
            } catch (Exception ignore) {
            }

            try {
                game.cr.n9 = false;
            } catch (Exception ignore) {
            }

            try {
                c.e2 = false;
            } catch (Exception ignore) {
            }

            try {
                m.c();
            } catch (Exception ignore) {
            }

            try {
                if (k.b10 != null && n.g12) {
                    game.d();
                }
            } catch (Exception ignore) {
            }
        }

        AssetManager.destroyInstance();

        try {
            game.ez = null;
        } catch (Exception ignore) {
        }

        game = null;
        appState = 0;
        this.notifyDestroyed();
    }

    public final void pauseApp() {
        appState = 2;
        this.notifyPaused();
    }

    public static void a() {
        d_nl = false;
        app.destroyApp(true);
        app.notifyDestroyed();
        app = null;
    }

    public final void startApp() {
        if (appState == 0) {
            k.cq = true;
            game.runGameThread();
        }

        appState = 1;
        d_nl = true;
    }
}
