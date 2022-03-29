//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class i {
    int a;
    int b = -1;
    Font c;
    int d = 2708892;
    int e = 1;
    int f = 1;
    String g = "";

    public i() {
        this.c();
        if (this.c == null) {
            this.d();
        }

    }

    private final int[] a(String var1, int var2, int var3, int var4) {
        int[] var5 = new int[2];
        int var6 = this.a + this.f;
        int var7 = this.a(var1, var3, var4);
        if ((var2 & 32) > 0) {
            var5[1] -= var6;
        }

        if ((var2 & 2) > 0) {
            var5[1] -= var6 >> 1;
        }

        if ((var2 & 8) > 0) {
            var5[0] -= var7;
        }

        if ((var2 & 1) > 0) {
            var5[0] -= var7 >> 1;
        }

        return var5;
    }

    public final int a(char var1) {
        return var1 != '\n' && var1 != '\r' ? this.c.charWidth(var1) + this.e : 0;
    }

    private final void c() {
        if (this.c == null) {
            this.d();
        }

        this.a = this.c.getHeight() - this.f;
    }

    private final void d() {
        this.c = Font.getFont(0, 0, 8);
        if (this.g.length() > 0 && this.g.charAt(0) == '2') {
            this.d = 16777215;
        }

    }

    private int a(Graphics var1, char var2, int var3, int var4) {
        try {
            var1.setFont(this.c);
            int var5 = var1.getColor();
            var4 -= this.c.getHeight();
            if (this.b >= 0) {
                var1.setColor(this.b);
                var1.drawChar(var2, var3 + 1, var4 + 1, 20);
            }

            var1.setColor(this.d);
            var1.drawChar(var2, var3, var4, 20);
            var1.setColor(var5);
        } catch (Exception var6) {
        }

        return this.a(var2);
    }

    public final int a(Graphics var1, char var2, int var3, int var4, int var5) {
        int var6 = var3;
        int var7 = var4 + this.a;
        String var9 = "" + var2;
        if (var5 != 0 && var5 != 20) {
            int[] var10 = this.a((String)var9, (int)var5, 0, 1);
            var6 = var3 + var10[0];
            var7 += var10[1];
        }

        return this.a(var1, var2, var6, var7);
    }

    public final void a(Graphics var1, String var2, int var3, int var4, int var5) {
        this.a(var1, var2, 0, var2.length(), var3, var4, var5);
    }

    private void a(Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var5;
        int var9 = var6 + this.a;
        if (var7 != 0 && var7 != 20) {
            int[] var10 = this.a(var2, var7, var3, var4);
            var8 = var5 + var10[0];
            var9 += var10[1];
        }

        for(int var11 = var3; var11 < var3 + var4; ++var11) {
            var8 += this.a(var1, var2.charAt(var11), var8, var9);
        }

    }

    public static i a() {
        return new i();
    }

    public final int b() {
        return this.f + this.a;
    }

    public final int a(String var1) {
        int var2 = 0;
        int var3 = var1.length();

        for(int var4 = 0; var4 < var3; ++var4) {
            var2 += this.a(var1.charAt(var4));
        }

        return var2;
    }

    private int a(String var1, int var2, int var3) {
        int var4 = 0;

        for(int var5 = 0; var5 < var3; ++var5) {
            var4 += this.a(var1.charAt(var5 + var2));
        }

        return var4;
    }
}
