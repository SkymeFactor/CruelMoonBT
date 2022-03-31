//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

// Text renderer
public final class i {
    int a8;
    int b8 = -1;
    Font c8;
    int d8 = 2708892;
    int e8 = 1;
    int f8 = 1;
    String g8 = "";

    public i() {
        this.c();
        if (this.c8 == null) {
            this.d();
        }

    }

    private final int[] a(String var1, int var2, int var3, int var4) {
        int[] var5 = new int[2];
        int var6 = this.a8 + this.f8;
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
        return var1 != '\n' && var1 != '\r' ? this.c8.charWidth(var1) + this.e8 : 0;
    }

    private final void c() {
        if (this.c8 == null) {
            this.d();
        }

        this.a8 = this.c8.getHeight() - this.f8;
    }

    private final void d() {
        this.c8 = Font.getFont(0, 0, 8);
        if (this.g8.length() > 0 && this.g8.charAt(0) == '2') {
            this.d8 = 16777215;
        }

    }

    private int a(Graphics var1, char var2, int var3, int var4) {
        try {
            var1.setFont(this.c8);
            int var5 = var1.getColor();
            var4 -= this.c8.getHeight();
            if (this.b8 >= 0) {
                var1.setColor(this.b8);
                var1.drawChar(var2, var3 + 1, var4 + 1, 20);
            }

            var1.setColor(this.d8);
            var1.drawChar(var2, var3, var4, 20);
            var1.setColor(var5);
        } catch (Exception var6) {
        }

        return this.a(var2);
    }

    public final int a(Graphics var1, char var2, int var3, int var4, int var5) {
        int var6 = var3;
        int var7 = var4 + this.a8;
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
        int var9 = var6 + this.a8;
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
        return this.f8 + this.a8;
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
