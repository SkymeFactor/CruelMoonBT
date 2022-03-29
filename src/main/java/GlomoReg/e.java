//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import javax.microedition.midlet.MIDlet;

public final class e {
    private static String c = "0";
    public static b a = new b();
    public static g b = new g();
    private static MIDlet d;
    private static String[] e;
    private static int f = 0;

    public e(MIDlet var1) {
        d = var1;
        a.a(var1);
        b.a(var1);
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
        if (e == null) {
            e = GlomoReg.c.a(d, "/glomo.cfg");
            f = 0;
        }

        ++f;
        return e;
    }

    private static void g() {
        if (e != null) {
            --f;
        }

        if (f == 0) {
            e = null;
            f = 0;
        }

    }

    public static boolean a(int var0) {
        if (var0 < 0) {
            return false;
        } else {
            g var1 = b.a(f(), g.e(var0));
            g();
            h.a(var1 == null ? -1 : g.f(var1.a()));
            if (var1 != null) {
                b = var1;
            } else {
                b.d("-1");
            }

            return h.a() != -1;
        }
    }

    public final boolean d() {
        return this.b(h.a());
    }

    private static String h() {
        c = GlomoReg.c.a(";", f()[0])[0];
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
        return GlomoReg.c.b(d, "c_0_code").compareTo("") != 0 || GlomoReg.c.b(d, "c_0_name").compareTo("") != 0;
    }
}
