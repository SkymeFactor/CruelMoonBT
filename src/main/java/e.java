//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

// Logger (???)
public final class e {
    static short[] a4;
    static int b4;
    static String[] c4;
    static int d4;

    public e() {
    }

    static void a(String var0) {
        int var1 = b4;
        if (d4 >= b4) {
            for(int i = 0; i < var1; ++i) {
                a4[i] = (short)((a4[i] + 1) % var1);
            }

            c4[d4 % var1] = new String(var0);
        } else {
            c4[d4] = new String(var0);
        }

        ++d4;
    }

    private static void a() {
        c4 = null;
        a4 = null;
    }

    static void a(int var0) {
        a();
        b4 = var0;
        d4 = 0;
        int var1 = b4;
        c4 = new String[b4];
        a4 = new short[b4];

        for(int var2 = 0; var2 < var1; ++var2) {
            c4[var2] = new String();
            a4[var2] = (short)var2;
        }

    }
}
