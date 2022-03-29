//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import java.util.Date;
import java.util.Vector;
import javax.microedition.midlet.MIDlet;

public final class i {
    private int b = 0;
    public e a;

    public i(MIDlet var1) {
        this.a = new e(var1);
        this.a.d();
        this.i();
    }

    public static String a(MIDlet var0, String[] var1) {
        String var2 = "";

        try {
            int var4;
            for(var4 = 0; var4 < var1.length && var2 == ""; ++var4) {
                String var3;
                if ((var3 = var0.getAppProperty("MIDlet-" + String.valueOf(var4 + 1))) == null) {
                    var2 = var2 + "+midlet1";
                } else if (var3.trim().compareTo(var1[var4].trim()) != 0) {
                    var2 = var2 + "+midlet2";
                }
            }

            if (var0.getAppProperty("MIDlet-" + String.valueOf(var4 + 1)) != null) {
                var2 = var2 + "+midlet3";
            }
        } catch (Exception var9) {
            var2 = var2 + "+midlet4";
        }

        long var5 = h.c();
        long var7 = h.m();
        if (h.d() == 1L) {
            h.f();
        } else {
            if (h.e() > 100000L) {
                var2 = var2 + "+runs";
            }

            if (h.g().compareTo(System.getProperty("microedition.platform")) != 0) {
                var2 = var2 + "+platform";
            }

            if (var7 - var5 > 2000L) {
                var2 = var2 + "+lm";
                h.a = false;
                h.b(var5);
                h.a("000000");
            }
        }

        return var2;
    }

    public final boolean a(int var1) {
        return e.a(var1);
    }

    public static Vector a() {
        return g.c;
    }

    public static g b() {
        return e.b;
    }

    public final String c() {
        return this.b("");
    }

    private String b(String var1) {
        if (var1 == null) {
            var1 = "";
        }

        if (k() == -1) {
            d(0);
        }

        long var2 = h.b();
        String var4;
        if ((var4 = c.a(0, e.b.b(), var2 != 0L ? var2 : h.a(c.a(0)))).compareTo("") == 0) {
            this.b = 1;
        }

        return (var4.compareTo("") == 0 ? "" : var4 + (var1.compareTo("") == 0 ? "" : e.a.e() + var1)).toLowerCase();
    }

    public final String b(int var1) {
        return a(var1, "");
    }

    private static String a(int var0, String var1) {
        if (var1 == null) {
            var1 = "";
        }

        long var2 = h.h();
        String var4;
        return ((var4 = c.a(var0, e.b.a(var0), var2 != 0L ? var2 : h.c(c.a(0)))).compareTo("") == 0 ? "" : var4 + (var1.compareTo("") == 0 ? "" : e.a.e() + var1)).toLowerCase();
    }

    public final boolean d() {
        return this.c("");
    }

    private boolean c(String var1) {
        d(0);
        return this.a(e.b.c(), this.b(var1));
    }

    public final boolean a(String var1) {
        return this.a(var1, k());
    }

    private boolean a(String var1, int var2) {
        boolean var3;
        if (var3 = !this.e() && var2 >= 0 && var1 != null && var1.compareTo("") != 0) {
            h.a(var1);
            if (var2 == 0) {
                var3 = h();
            } else if (var2 != 5 && var2 != 6 && var2 != 7 && var2 != 8) {
                var3 = false;
            } else if (var3 = this.a(false)) {
                if (j() == 0) {
                    Date var4;
                    Date var10000 = var4 = new Date();
                    var10000.setTime(var10000.getTime() + Long.parseLong(b().d(var2)) * 24L * 60L * 60L * 1000L);
                    long var7 = var4.getTime();
                    long var6 = 0L;
                    h.d(var7);
                } else if (j() == 1) {
                    h.c(0L);
                }
            }

            if (!var3) {
                h.a("");
            }
        }

        return var3;
    }

    private static boolean h() {
        boolean var0 = true;

        try {
            var0 = Long.parseLong(c.a(h.i(), 0)) == h.b() ? true : true;
        } catch (Exception var1) {
        }

        return var0;
    }

    private boolean i() {
        return this.a(true);
    }

    private boolean a(boolean var1) {
        boolean var2 = false;

        try {
            var2 = Long.parseLong(c.a(h.i(), 0)) == h.h();
        } catch (Exception var3) {
        }

        var1 = j() != 1 && var1 ? (new Date()).getTime() <= h.k() : true;
        return var2 && var1;
    }

    private static int j() {
        return h.j();
    }

    public static int c(int var0) {
        return h.b(var0);
    }

    public final boolean e() {
        return h() || this.i();
    }

    public final boolean a(String var1, String var2) {
        boolean var3 = false;

        try {
            if (var2.compareTo("") == 0) {
                this.b = 1;
            } else {
                var3 = d.a(var1, var2);
            }
        } catch (Exception var4) {
            var3 = false;
        }

        return var3;
    }

    public static String f() {
        return e.a.c();
    }

    private static int k() {
        return h.l();
    }

    public static int d(int var0) {
        return h.c(var0);
    }

    public static int g() {
        return Integer.parseInt(e.a.d());
    }
}
