//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public final class e {
    static short[] a;
    static int b;
    static String[] c;
    static int d;

    public e() {
    }

    static void a(String var0) {
        int var1 = b;
        if (d >= b) {
            for(int var2 = 0; var2 < var1; ++var2) {
                a[var2] = (short)((a[var2] + 1) % var1);
            }

            c[d % var1] = new String(var0);
        } else {
            c[d] = new String(var0);
        }

        ++d;
    }

    private static void a() {
        c = null;
        a = null;
    }

    static void a(int var0) {
        a();
        b = var0;
        d = 0;
        int var1 = b;
        c = new String[b];
        a = new short[b];

        for(int var2 = 0; var2 < var1; ++var2) {
            c[var2] = new String();
            a[var2] = (short)var2;
        }

    }
}
