//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import java.util.Hashtable;
import java.util.Vector;

public final class GlomoSubscriptionManager extends GlomoOptionStorage {
    public static final Vector c = new Vector(0);
    public static final Hashtable d = new Hashtable(0);
    public static final Hashtable e = new Hashtable(0);
    public static final Hashtable f = new Hashtable(0);
    public static final Hashtable g = new Hashtable(4);

    public GlomoSubscriptionManager() {
        String[] var1 = new String[]{"name", "prefix", "numReg", "priceReg", "prefix_bonus1", "numBonus1", "priceBonus1", "prefix_spec", "numSpec", "priceSpec", "prefix_subscribe_type1", "numSubscribeType1", "priceSubscribeType1", "durationSubscribeType1", "prefix_subscribe_type2", "numSubscribeType2", "priceSubscribeType2", "durationSubscribeType2", "prefix_subscribe_type3", "numSubscribeType3", "priceSubscribeType3", "durationSubscribeType3", "prefix_subscribe_type4", "numSubscribeType4", "priceSubscribeType4", "durationSubscribeType4", "specParam1", "specParam2", "specParam3", "specParam4"};
        String var2 = "name,pfxReg,snReg,priceReg,pfxBns1,snBns1,priceBns1,pfxSpec,snSpec,priceSpec,pfxSub1,snSub1,priceSub1,prmSub1,pfxSub2,snSub2,priceSub2,prmSub2,pfxSub3,snSub3,priceSub3,prmSub3,pfxSub4,snSub4,priceSub4,prmSub4,param1,param2,param3,param4";
        String[] var3 = new String[]{"name", "code", "prefix", "numReg", "priceReg", "paramReg", "prefix_bonus1", "numBonus1", "priceBonus1", "paramBonus1", "prefix_bonus2", "numBonus2", "priceBonus2", "paramBonus2", "prefix_bonus3", "numBonus3", "priceBonus3", "paramBonus3", "prefix_bonus4", "numBonus4", "priceBonus4", "paramBonus4", "prefix_subscribe_type1", "numSubscribeType1", "priceSubscribeType1", "durationSubscribeType1", "prefix_subscribe_type2", "numSubscribeType2", "priceSubscribeType2", "durationSubscribeType2", "prefix_subscribe_type3", "numSubscribeType3", "priceSubscribeType3", "durationSubscribeType3", "prefix_subscribe_type4", "numSubscribeType4", "priceSubscribeType4", "durationSubscribeType4", "prefix_spec", "numSpec", "priceSpec", "paramSpec", "specParam1", "specParam2", "specParam3", "specParam4"};
        String var4 = "name,code,pfxReg,snReg,priceReg,prmReg,pfxBns1,snBns1,priceBns1,prmBns1,pfxBns2,snBns2,priceBns2,prmBns2,pfxBns3,snBns3,priceBns3,prmBns3,pfxBns4,snBns4,priceBns4,prmBns4,pfxSub1,snSub1,priceSub1,prmSub1,pfxSub2,snSub2,priceSub2,prmSub2,pfxSub3,snSub3,priceSub3,prmSub3,pfxSub4,snSub4,priceSub4,prmSub4,pfxSpec,snSpec,priceSpec,prmSpec,param1,param2,param3,param4";
        if (!g.contains("CFG_1")) {
            g.put("CFG_1", var1);
        }

        if (!g.contains("JAD_1")) {
            g.put("JAD_1", GlomoConfigLoader.splitString(",", var2));
        }

        if (!g.contains("CFG_2")) {
            g.put("CFG_2", var3);
        }

        if (!g.contains("JAD_2")) {
            g.put("JAD_2", GlomoConfigLoader.splitString(",", var4));
        }

        this.d("-1");
        this.e("Russia");
        this.f("");
        this.g("BOMB");
        this.i("1132");
        this.k("94.00 RUR ex. VAT");
        this.m("");
        this.a(1, (String)"BOMB");
        this.c(1, "1132");
        this.e(1, "7.50 RUR ex. VAT");
        this.h(1, "");
        this.h("SPEC");
        this.j("1136");
        this.l("50 RUR ex.VAT");
        this.n("");
        this.b(5, "SUB1");
        this.d(5, "1133");
        this.f(5, "5.00 RUR ex. VAT");
        this.g(5, "1");
        this.b(6, "SUB2");
        this.d(6, "1134");
        this.f(6, "25.00 RUR ex. VAT");
        this.g(6, "7");
        this.b(7, "SUB3");
        this.d(7, "1135");
        this.f(7, "50.00 RUR ex. VAT");
        this.g(7, "14");
        this.b(8, "SUB4");
        this.d(8, "1137");
        this.f(8, "100.00 RUR ex. VAT");
        this.g(8, "30");
        this.o("");
        this.p("");
        this.q("");
        this.r("");
    }

    public final int a() {
        return this.getOptionInt("id");
    }

    private String e() {
        return this.getOption("name");
    }

    private String f() {
        return this.getOption("code");
    }

    public final String b() {
        return this.getOption("prefix");
    }

    public final String a(int var1) {
        String var10001;
        if (var1 != 5) {
            if (var1 == 6) {
                var10001 = "prefix_subscribe_type2";
                return this.getOption(var10001);
            }

            if (var1 == 7) {
                var10001 = "prefix_subscribe_type3";
                return this.getOption(var10001);
            }

            if (var1 == 8) {
                var10001 = "prefix_subscribe_type4";
                return this.getOption(var10001);
            }
        }

        var10001 = "prefix_subscribe_type1";
        return this.getOption(var10001);
    }

    public final String c() {
        return this.getOption("numReg");
    }

    public final String b(int var1) {
        String var10001;
        if (var1 != 5) {
            if (var1 == 6) {
                var10001 = "numSubscribeType2";
                return this.getOption(var10001);
            }

            if (var1 == 7) {
                var10001 = "numSubscribeType3";
                return this.getOption(var10001);
            }

            if (var1 == 8) {
                var10001 = "numSubscribeType4";
                return this.getOption(var10001);
            }
        }

        var10001 = "numSubscribeType1";
        return this.getOption(var10001);
    }

    public final String d() {
        return this.getOption("priceReg");
    }

    public final String c(int var1) {
        String var10001;
        if (var1 != 5) {
            if (var1 == 6) {
                var10001 = "priceSubscribeType2";
                return this.getOption(var10001);
            }

            if (var1 == 7) {
                var10001 = "priceSubscribeType3";
                return this.getOption(var10001);
            }

            if (var1 == 8) {
                var10001 = "priceSubscribeType4";
                return this.getOption(var10001);
            }
        }

        var10001 = "priceSubscribeType1";
        return this.getOption(var10001);
    }

    public final String d(int var1) {
        String var10001;
        if (var1 != 5) {
            if (var1 == 6) {
                var10001 = "durationSubscribeType2";
                return this.getOption(var10001);
            }

            if (var1 == 7) {
                var10001 = "durationSubscribeType3";
                return this.getOption(var10001);
            }

            if (var1 == 8) {
                var10001 = "durationSubscribeType4";
                return this.getOption(var10001);
            }
        }

        var10001 = "durationSubscribeType1";
        return this.getOption(var10001);
    }

    public final String d(String var1) {
        return this.putOption("id", var1);
    }

    private String e(String var1) {
        return this.putOption("name", var1);
    }

    private String f(String var1) {
        return this.putOption("code", var1);
    }

    private String g(String var1) {
        return this.putOption("prefix", var1);
    }

    private String h(String var1) {
        return this.putOption("prefix_spec", var1);
    }

    private String a(int var1, String var2) {
        return this.putOption(!GlomoReg.e.a("1") && var1 != 1 ? (var1 == 2 ? "prefix_bonus2" : (var1 == 3 ? "prefix_bonus3" : (var1 == 4 ? "prefix_bonus4" : "prefix_bonus1"))) : "prefix_bonus1", var2);
    }

    private String b(int var1, String var2) {
        String var10001;
        if (var1 != 5) {
            if (var1 == 6) {
                var10001 = "prefix_subscribe_type2";
                return this.putOption(var10001, var2);
            }

            if (var1 == 7) {
                var10001 = "prefix_subscribe_type3";
                return this.putOption(var10001, var2);
            }

            if (var1 == 8) {
                var10001 = "prefix_subscribe_type4";
                return this.putOption(var10001, var2);
            }
        }

        var10001 = "prefix_subscribe_type1";
        return this.putOption(var10001, var2);
    }

    private String i(String var1) {
        return this.putOption("numReg", var1);
    }

    private String c(int var1, String var2) {
        return this.putOption(!GlomoReg.e.a("1") && var1 != 1 ? (var1 == 2 ? "numBonus2" : (var1 == 3 ? "numBonus3" : (var1 == 4 ? "numBonus4" : "numBonus1"))) : "numBonus1", var2);
    }

    private String j(String var1) {
        return this.putOption("numSpec", var1);
    }

    private String d(int var1, String var2) {
        String var10001;
        if (var1 != 5) {
            if (var1 == 6) {
                var10001 = "numSubscribeType2";
                return this.putOption(var10001, var2);
            }

            if (var1 == 7) {
                var10001 = "numSubscribeType3";
                return this.putOption(var10001, var2);
            }

            if (var1 == 8) {
                var10001 = "numSubscribeType4";
                return this.putOption(var10001, var2);
            }
        }

        var10001 = "numSubscribeType1";
        return this.putOption(var10001, var2);
    }

    private String k(String var1) {
        return this.putOption("priceReg", var1);
    }

    private String e(int var1, String var2) {
        return this.putOption(!GlomoReg.e.a("1") && var1 != 1 ? (var1 == 2 ? "priceBonus2" : (var1 == 3 ? "priceBonus3" : (var1 == 4 ? "priceBonus4" : "priceBonus1"))) : "priceBonus1", var2);
    }

    private String l(String var1) {
        return this.putOption("priceSpec", var1);
    }

    private String f(int var1, String var2) {
        String var10001;
        if (var1 != 5) {
            if (var1 == 6) {
                var10001 = "priceSubscribeType2";
                return this.putOption(var10001, var2);
            }

            if (var1 == 7) {
                var10001 = "priceSubscribeType3";
                return this.putOption(var10001, var2);
            }

            if (var1 == 8) {
                var10001 = "priceSubscribeType4";
                return this.putOption(var10001, var2);
            }
        }

        var10001 = "priceSubscribeType1";
        return this.putOption(var10001, var2);
    }

    private String g(int var1, String var2) {
        String var10001;
        if (var1 != 5) {
            if (var1 == 6) {
                var10001 = "durationSubscribeType2";
                return this.putOption(var10001, var2);
            }

            if (var1 == 7) {
                var10001 = "durationSubscribeType3";
                return this.putOption(var10001, var2);
            }

            if (var1 == 8) {
                var10001 = "durationSubscribeType4";
                return this.putOption(var10001, var2);
            }
        }

        var10001 = "durationSubscribeType1";
        return this.putOption(var10001, var2);
    }

    private String m(String var1) {
        return this.putOption("paramReg", var1);
    }

    private String h(int var1, String var2) {
        return this.putOption(!GlomoReg.e.a("1") && var1 != 1 ? (var1 == 2 ? "paramBonus2" : (var1 == 3 ? "paramBonus3" : (var1 == 4 ? "paramBonus4" : "paramBonus1"))) : "paramBonus1", var2);
    }

    private String n(String var1) {
        return this.putOption("paramSpec", var1);
    }

    private String o(String var1) {
        return this.putOption("specParam1", var1);
    }

    private String p(String var1) {
        return this.putOption("specParam2", var1);
    }

    private String q(String var1) {
        return this.putOption("specParam3", var1);
    }

    private String r(String var1) {
        return this.putOption("specParam4", var1);
    }

    private int a(GlomoSubscriptionManager var1, int var2) {
        return a(var1.a(), var2, var1.e(), var1.f());
    }

    private static int a(int var0, int var1, String var2, String var3) {
        int var4 = c.size();
        c.setSize(var4 + 1);
        c.setElementAt(new GlomoOption(var0, var2, var3), var4);
        d.put(Integer.valueOf(GlomoReg.e.e() ? var1 : var0), Integer.valueOf(var4));
        return var4;
    }

    private static int g(int var0) {
        if (var0 >= 0 && var0 < c.size()) {
            GlomoOption var1 = (GlomoOption)c.elementAt(var0);
            e.put(var1.a(), Integer.valueOf(var1.c()));
            f.put(var1.b(), Integer.valueOf(var1.c()));
            return var0;
        } else {
            return -1;
        }
    }

    private GlomoSubscriptionManager a(int var1, String[] var2) {
        this.d(String.valueOf(var1));
        this.putOptions((String[])g.get("CFG_" + GlomoReg.e.a()), var2);
        return this;
    }

    private int b(String[] var1) {
        this.c(var1);
        g();

        String var2;
        String var3;
        for(int var4 = 0; ((var2 = this.getMidletProperty("c_" + String.valueOf(var4) + "_code")) + (var3 = this.getMidletProperty("c_" + String.valueOf(var4) + "_name"))).compareTo("") != 0; ++var4) {
            int var6 = -1;
            GlomoSubscriptionManager var5;
            if (null != (var5 = this.a(var1, var3, var2))) {
                var6 = var5.a();
            }

            if (var3.compareTo("") == 0) {
                var3 = var5 != null ? var5.e() : var2;
            } else if (var2.compareTo("") == 0) {
                var2 = var5 != null ? var5.f() : var3;
            }

            System.out.println("name = " + var3 + " code = " + var2);
            ((GlomoOption)c.elementAt(a(var4, var6, var3, var2))).a(var6);
        }

        return c.size();
    }

    private int c(String[] var1) {
        GlomoSubscriptionManager var2 = new GlomoSubscriptionManager();
        g();
        h();

        for(int var4 = 1; var4 < var1.length; ++var4) {
            String[] var3 = GlomoConfigLoader.splitString(";", var1[var4]);
            var2.a(var4, var3);
            if (var3.length > 1) {
                g(this.a(var2, var2.a()));
            }
        }

        return c.size();
    }

    public final int a(String[] var1) {
        return GlomoReg.e.e() ? this.b(var1) : this.c(var1);
    }

    private GlomoSubscriptionManager a(String[] var1, String var2, String var3) {
        int var4 = -1;
        if (var3.compareTo("") != 0 && f.containsKey(var3)) {
            var4 = (Integer)f.get(var3);
        } else if (var2.compareTo("") != 0 && e.containsKey(var2)) {
            var4 = (Integer)e.get(var2);
        }

        return var4 >= 0 ? this.b(var1, var4) : null;
    }

    private static GlomoOption h(int var0) {
        return (GlomoOption)c.elementAt((Integer)d.get(Integer.valueOf(var0)));
    }

    private GlomoSubscriptionManager b(String[] var1, int var2) {
        if (var2 < var1.length && var2 >= 0) {
            GlomoSubscriptionManager var3;
            (var3 = new GlomoSubscriptionManager()).setMidletHandler(this.appHandler);
            var3.a(var2, GlomoConfigLoader.splitString(";", var1[var2]));
            return var3;
        } else {
            return null;
        }
    }

    public final GlomoSubscriptionManager a(String[] var1, int var2) {
        if (GlomoReg.e.e()) {
            int var3 = var2;
            GlomoSubscriptionManager var8 = this;
            if (var2 < 0) {
                return null;
            } else {
                GlomoSubscriptionManager var10 = this.b(var1, h(var2).d());
                String[] var4 = (String[])g.get("JAD_" + GlomoReg.e.a());
                String[] var5 = (String[])g.get("CFG_" + GlomoReg.e.a());

                for(int var6 = 0; var6 < var4.length; ++var6) {
                    String var7;
                    if ((var7 = var8.getMidletProperty("c_" + String.valueOf((Integer)d.get(Integer.valueOf(var3))) + "_" + var4[var6])).compareTo("") != 0) {
                        var10.putOption(var5[var6], var7);
                    }
                }

                return var10;
            }
        } else {
            return this.b(var1, var2);
        }
    }

    public static final int e(int var0) {
        if (var0 >= 0 && var0 < c.size()) {
            return GlomoReg.e.e() ? ((GlomoOption)c.elementAt(var0)).d() : ((GlomoOption)c.elementAt(var0)).c();
        } else {
            return -1;
        }
    }

    public static final int f(int var0) {
        Integer var1;
        return (var1 = (Integer)d.get(Integer.valueOf(var0))) == null ? -1 : var1;
    }

    private static void g() {
        c.setSize(0);
        d.clear();
    }

    private static void h() {
        f.clear();
        e.clear();
    }
}
