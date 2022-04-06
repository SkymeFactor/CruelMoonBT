//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import java.util.Hashtable;

public final class b extends GlomoOptionStorage {
    public Hashtable c = new Hashtable(4);

    public b() {
        String[] var1 = new String[]{"", "DistID", "SubDistID", "DistName", "DistWWW", "DistWWWTitle", "DistMoreGamesLink", "DistMoreGamesTitle", "DistLetter", "DistFlags", "RegisterSizeKey", "BonusSizeKey", "RegisterSizeKeyType1", "RegisterSizeKeyType2", "RegisterSizeKeyType3", "RegisterSizeKeyType4", "TailSeparator", "SmsKeyVersion"};
        String[] var2 = GlomoConfigLoader.splitString(",", ",id,chId,name,glink,glinkTtl,mglink,mglinkTtl,pflag,gflag,kszReg,kszBns,kszSub1,kszSub2,kszSub3,kszSub4,tailSepar,smsKeyVer");
        this.c.put("CFG_1", var1);
        this.c.put("JAD_1", var2);
        this.c.put("CFG_2", var1);
        this.c.put("JAD_2", var2);
        this.d("0001");
        this.e("00");
        this.f("GlowingMobile");
        this.h("www.glowingmobile.com");
        this.g("Game link title");
        this.i("www.glomogames.com");
        this.j("More games");
        this.k("A");
        this.l("FLAG");
        this.m("6");
        this.n("4");
        this.o("6");
        this.p("6");
        this.q("6");
        this.r("6");
        this.s("#");
        this.t("0");
    }

    public final String a() {
        return this.getOption("DistID");
    }

    public final String b() {
        String var1;
        for(var1 = this.getOption("SubDistID"); var1.length() < (e.b() > 1 ? 5 : 2); var1 = "0" + var1) {
        }

        return var1;
    }

    public final String c() {
        return this.getOption("DistMoreGamesLink");
    }

    public final String d() {
        return this.getOption("RegisterSizeKey");
    }

    public final String e() {
        return this.getOption("TailSeparator");
    }

    public final String f() {
        return this.getOption("SmsKeyVersion");
    }

    private String d(String var1) {
        return this.putOption("DistID", var1);
    }

    private String e(String var1) {
        return this.putOption("SubDistID", var1);
    }

    private String f(String var1) {
        return this.putOption("DistName", var1);
    }

    private String g(String var1) {
        return this.putOption("DistWWWTitle", var1);
    }

    private String h(String var1) {
        return this.putOption("DistWWW", var1);
    }

    private String i(String var1) {
        return this.putOption("DistMoreGamesLink", var1);
    }

    private String j(String var1) {
        return this.putOption("DistMoreGamesTitle", var1);
    }

    private String k(String var1) {
        return this.putOption("DistLetter", var1);
    }

    private String l(String var1) {
        return this.putOption("DistFlags", var1);
    }

    private String m(String var1) {
        return this.putOption("RegisterSizeKey", var1);
    }

    private String n(String var1) {
        return this.putOption("BonusSizeKey", var1);
    }

    private String o(String var1) {
        return this.putOption("RegisterSizeKeyType1", var1);
    }

    private String p(String var1) {
        return this.putOption("RegisterSizeKeyType2", var1);
    }

    private String q(String var1) {
        return this.putOption("RegisterSizeKeyType3", var1);
    }

    private String r(String var1) {
        return this.putOption("RegisterSizeKeyType4", var1);
    }

    private String s(String var1) {
        return this.putOption("TailSeparator", var1);
    }

    private String t(String var1) {
        return this.putOption("SmsKeyVersion", var1);
    }

    private void b(String[] var1) {
        this.c(var1);
        this.putOptions((String[])this.c.get("CFG_" + e.a()), var1);
    }

    private String[] c(String[] var1) {
        String[] var2 = (String[])this.c.get("JAD_" + e.a());

        for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var3 < var1.length && var2[var3].compareTo("") != 0 && this.getMidletProperty("dst_" + var2[var3]).compareTo("") != 0) {
                var1[var3] = this.getMidletProperty("dst_" + var2[var3]);
            }
        }

        return var1;
    }

    public final void a(String[] var1) {
        this.a(var1, 0, 1);
    }

    private void a(String[] var1, int var2, int var3) {
        for(int var4 = var2; var4 < var3 && var4 < var1.length; ++var4) {
            String[] var5;
            if ((var5 = GlomoConfigLoader.splitString(";", var1[var4])).length > 1) {
                this.b(var5);
            }
        }

    }
}
