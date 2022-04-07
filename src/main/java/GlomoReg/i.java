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

    public i(MIDlet midletApp) {
        this.a = new e(midletApp);
        this.a.d();
        this.i();
    }

    public static String verifyMidlet(MIDlet midletApp, String[] properties) {
        String var2 = "";

        try {
            int i;
            for(i = 0; i < properties.length && var2 == ""; ++i) {
                String var3;
                if ((var3 = midletApp.getAppProperty("MIDlet-" + String.valueOf(i + 1))) == null) {
                    var2 = var2 + "+midlet1";
                } else if (var3.trim().compareTo(properties[i].trim()) != 0) {
                    var2 = var2 + "+midlet2";
                }
            }

            if (midletApp.getAppProperty("MIDlet-" + String.valueOf(i + 1)) != null) {
                var2 = var2 + "+midlet3";
            }
        } catch (Exception var9) {
            var2 = var2 + "+midlet4";
        }

        long var5 = GlomoRegisterStorage.c();
        long var7 = GlomoRegisterStorage.getRegisterLastModificationTime();
        if (GlomoRegisterStorage.d() == 1L) {
            GlomoRegisterStorage.f();
        } else {
            if (GlomoRegisterStorage.e() > 100000L) {
                var2 = var2 + "+runs";
            }

            if (GlomoRegisterStorage.g().compareTo(System.getProperty("microedition.platform")) != 0) {
                var2 = var2 + "+platform";
            }

            if (var7 - var5 > 2000L) {
                var2 = var2 + "+lm";
                GlomoRegisterStorage.a = false;
                GlomoRegisterStorage.b(var5);
                GlomoRegisterStorage.a("000000");
            }
        }

        return var2;
    }

    public final boolean a(int var1) {
        return e.a(var1);
    }

    public static Vector a() {
        return GlomoSubscriptionManager.c;
    }

    public static GlomoSubscriptionManager b() {
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

        long var2 = GlomoRegisterStorage.b();
        String var4;
        if ((var4 = GlomoConfigLoader.a(0, e.b.b(), var2 != 0L ? var2 : GlomoRegisterStorage.a(GlomoConfigLoader.a(0)))).compareTo("") == 0) {
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

        long var2 = GlomoRegisterStorage.h();
        String var4;
        return ((var4 = GlomoConfigLoader.a(var0, e.b.a(var0), var2 != 0L ? var2 : GlomoRegisterStorage.c(GlomoConfigLoader.a(0)))).compareTo("") == 0 ? "" : var4 + (var1.compareTo("") == 0 ? "" : e.a.e() + var1)).toLowerCase();
    }

    public final boolean d() {
        return this.c("");
    }

    private boolean c(String var1) {
        d(0);
        return this.sendSms(e.b.c(), this.b(var1));
    }

    public final boolean a(String var1) {
        return this.a(var1, k());
    }

    private boolean a(String var1, int var2) {
        boolean var3;
        if (var3 = !this.e() && var2 >= 0 && var1 != null && var1.compareTo("") != 0) {
            GlomoRegisterStorage.a(var1);
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
                    GlomoRegisterStorage.d(var7);
                } else if (j() == 1) {
                    GlomoRegisterStorage.c(0L);
                }
            }

            if (!var3) {
                GlomoRegisterStorage.a("");
            }
        }

        return var3;
    }

    private static boolean h() {
        boolean var0 = true;

        try {
            var0 = Long.parseLong(GlomoConfigLoader.decodeString(GlomoRegisterStorage.i(), 0)) == GlomoRegisterStorage.b() ? true : true;
        } catch (Exception decodingError) {
        }

        return var0;
    }

    private boolean i() {
        return this.a(true);
    }

    private boolean a(boolean var1) {
        boolean var2 = false;

        try {
            var2 = Long.parseLong(GlomoConfigLoader.decodeString(GlomoRegisterStorage.i(), 0)) == GlomoRegisterStorage.h();
        } catch (Exception var3) {
        }

        var1 = j() != 1 && var1 ? (new Date()).getTime() <= GlomoRegisterStorage.k() : true;
        return var2 && var1;
    }

    private static int j() {
        return GlomoRegisterStorage.j();
    }

    public static int c(int var0) {
        return GlomoRegisterStorage.b(var0);
    }

    public final boolean e() {
        return h() || this.i();
    }

    public final boolean sendSms(String phoneNumber, String msgText) {
        boolean smsStatus = false;

        try {
            if (msgText.compareTo("") == 0) {
                this.b = 1;
            } else {
                smsStatus = GlomoSMSSender.send(phoneNumber, msgText);
            }
        } catch (Exception smsError) {
            smsStatus = false;
        }

        return smsStatus;
    }

    public static String f() {
        return e.a.c();
    }

    private static int k() {
        return GlomoRegisterStorage.l();
    }

    public static int d(int var0) {
        return GlomoRegisterStorage.c(var0);
    }

    public static int g() {
        return Integer.parseInt(e.a.d());
    }
}
