//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import javax.microedition.midlet.MIDlet;

public final class e {
    private static String c = "0";
    public static b a = new b();
    public static GlomoSubscriptionManager b = new GlomoSubscriptionManager();
    private static MIDlet appHandler;
    private static String[] config;
    private static int f = 0;

    public e(MIDlet midletApp) {
        appHandler = midletApp;
        a.setMidletHandler(midletApp);
        b.setMidletHandler(midletApp);
    }

    public static String a() {
        return c;
    }

    public static int b() {
        return Integer.parseInt(c);
    }

    public static boolean a(String var0) {
        return var0.compareTo(c) == 0;
    }

    public static String c() {
        return a.f();
    }

    private static String[] f() {
        if (config == null) {
            config = GlomoConfigLoader.readGlomoConfigFile(appHandler, "/glomo.cfg");
            f = 0;
        }

        ++f;
        return config;
    }

    private static void g() {
        if (config != null) {
            --f;
        }

        if (f == 0) {
            config = null;
            f = 0;
        }

    }

    public static boolean a(int var0) {
        if (var0 < 0) {
            return false;
        } else {
            GlomoSubscriptionManager var1 = b.a(f(), GlomoSubscriptionManager.e(var0));
            g();
            GlomoRegisterStorage.a(var1 == null ? -1 : GlomoSubscriptionManager.f(var1.a()));
            if (var1 != null) {
                b = var1;
            } else {
                b.d("-1");
            }

            return GlomoRegisterStorage.a() != -1;
        }
    }

    public final boolean d() {
        return this.b(GlomoRegisterStorage.a());
    }

    private static String h() {
        c = GlomoConfigLoader.splitString(";", f()[0])[0];
        g();
        return c;
    }

    private boolean b(int var1) {
        String[] var2 = f();
        h();
        a.a(var2);
        if (b.a(var2) <= var1) {
            var1 = -1;
        }

        g();
        return a(var1);
    }

    public static final boolean e() {
        return GlomoConfigLoader.getMidletPropertySafe(appHandler, "c_0_code").compareTo("") != 0 ||
               GlomoConfigLoader.getMidletPropertySafe(appHandler, "c_0_name").compareTo("") != 0;
    }
}
