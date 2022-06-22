//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class c implements Runnable {
    int a2 = 170;
    static int b2 = -1;
    private k Q;
    int c2;
    int d2;
    static boolean e2 = false;
    boolean f2;
    static int g2;
    boolean h2 = false;
    int i2 = 0;
    int j2 = 0;
    int k2 = 0;
    int l2 = 0;
    int m2 = 0;
    static int[] n2;
    int o = 0;
    static int p;
    int q = 2;
    int r = 0;
    int s = 0;
    int t = 0;
    byte[] u;
    int v = 0;
    byte[] w;
    int x;
    int y;
    int z;
    int A;
    private int[] R;
    int B;
    int C;
    static int D = 12;
    static int E = 3;
    static boolean F;
    long G = 0L;
    long H = 0L;
    long I = 0L;
    long J = 0L;
    int K = 170;
    boolean L;
    Thread M;
    static long N = 1000L;
    int O = 100;
    static int P;

    public c(k var1) {
        this.Q = var1;
        this.M = new Thread(this);
        e2 = true;
        this.M.start();
        if (this.M.getPriority() != 1) {
            this.M.setPriority(1);
        }

    }

    public c() {
    }

    private long d() {
        return this.Q.b();
    }

    private final void e() {
        for(int var1 = 0; this.m2 > 0 && this.k2 > 0 && var1 < this.Q.cU; ++var1) {
            int var2 = -1;
            int var3 = 1000000;

            for(int var4 = 0; var4 < this.Q.cU; ++var4) {
                int[] var5;
                int var6;
                if (this.Q.ch[0][var4] > 0 && this.Q.ch[8][var4] == 1 && this.Q.ch[17][var4] <= 0 && (var6 = (var5 = this.a(this.Q.ch[1][var4], this.Q.ch[2][var4]))[1] - var5[3]) < var3) {
                    var3 = var6;
                    var2 = var4;
                }
            }

            if (var2 < 0) {
                break;
            }

            this.c(var2, 0);
            this.Q.ch[17][var2] = 1;
        }

    }

    private final void a(int var1, int var2, long var3) {
        int var6 = -1;

        int var5;
        for(var5 = 0; var5 < this.Q.bg; ++var5) {
            if (this.Q.bZ[0][var5] == 1 && this.Q.bZ[5][var5] == var2) {
                var6 = var5;
                break;
            }
        }

        if (var6 >= 0) {
            if (this.Q.bZ[12][var5] <= 0) {
                int var7 = this.Q.bZ[1][var5] + (this.Q.bZ[3][var5] >> 1);
                int var8 = this.Q.bZ[2][var5] + (this.Q.bZ[4][var5] >> 1);
                int var9 = 1;
                int var10;
                if ((var10 = this.Q.fE) < this.Q.fX) {
                    var10 = this.Q.fX;
                }

                if (var10 > 50) {
                    var10 = 50;
                }

                int var11 = 1;
                int var12 = 1;

                try {
                    int var13 = this.Q.bh - 128 + var1 - 1;
                    var11 = 1 + (this.Q.R[2][var13] - 1) / this.Q.ej;
                    var12 = 1 + (this.Q.R[3][var13] - 1) / this.Q.eg;
                } catch (Exception var17) {
                }

                var11 >>= 1;
                var12 >>= 1;

                for(long var18 = System.currentTimeMillis(); var9 < var10; ++var9) {
                    for(int var15 = var8 - var9; var15 <= var8 + var9; ++var15) {
                        if (var15 >= 0) {
                            if (var15 > this.Q.fX || System.currentTimeMillis() - var18 > var3) {
                                break;
                            }

                            for(int var16 = var7 - var9; var16 <= var7 + var9; ++var16) {
                                if (var16 >= 0) {
                                    if (var16 > this.Q.fE) {
                                        break;
                                    }

                                    if (this.Q.a(-1, var1, var2, var16 - var11, var15 - var12, false, true, true)) {
                                        this.Q.a(var1 + 64, var5);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
    }

    private final void a(int var1) {
        long var2 = (long)((k.bP - k.ee) * 5200);
        if (k.es) {
            var2 >>= this.q;
        }

        long var4 = this.d();
        if (this.H > var4) {
            this.H = var4;
        }

        if (var4 - this.H >= var2) {
            if (var4 - this.H >= 1789L) {
                int var6;
                int[] var7 = new int[(var6 = k.bA.length) + 1];
                boolean var8 = false;
                int var9 = 0;
                int var10 = -1;

                for(int var18 = 0; var18 < this.Q.bg; ++var18) {
                    try {
                        if (this.Q.bZ[0][var18] > 0 && this.Q.bZ[5][var18] == var1) {
                            ++var9;
                            ++var7[this.Q.bZ[0][var18]];
                            if (this.Q.bZ[0][var18] == 1 && this.Q.bZ[12][var18] <= 0) {
                                var10 = var18;
                            }
                        }
                    } catch (Exception var17) {
                    }
                }

                if (var10 >= 0) {
                    this.H = var4;
                    int var11 = -1;
                    int var12;
                    if ((var12 = 1 + (k.ee >> 1)) < 1) {
                        var12 = 1;
                    }

                    if (var12 > E) {
                        var12 = E;
                    }

                    int var14;
                    for(int var13 = 2; var13 <= var6; ++var13) {
                        var14 = var12;
                        if (var7[var13] > 0 && var7[var13] < var12 && this.Q.cv[var1] <= this.Q.j(var13 + 64) * var7[var13] + 2200) {
                            var14 = var7[var13];
                        }

                        if (var7[var13] > 0 && var7[var13] < var12 && var13 == 2) {
                            var14 = 1 + var9 / 4;
                        }

                        if (var7[var13] < var12 && var7[var13] < var14 && var7[var13] < k.bA[var13 - 1][1]) {
                            var12 = var7[var13];
                            var11 = var13;
                        }
                    }

                    var14 = k.ee + 1;
                    if (k.ee == k.bP) {
                        ++var14;
                    }

                    if (var14 < 6) {
                        var14 = 6;
                    }

                    if (var14 > D) {
                        var14 = D;
                    }

                    long var15 = 1500L;
                    if (var9 > 5) {
                        var15 = 700L;
                    }

                    if (!this.Q.k(var1)) {
                        var11 = 2;
                    } else if (var9 > var14) {
                        var11 = -1;
                    }

                    if (var11 > 0 && this.Q.cv[var1] > this.Q.j(var11 + 64) >> 2) {
                        this.a(var11, var1, var15);
                    }

                }
            }
        }
    }

    final void a() {
        this.y = this.B * (this.Q.fE + 1);
        this.x = this.B * (this.Q.fX + 1);
        this.z = this.Q.getWidth() - this.y >> 1;
        this.A = this.Q.getHeight() - this.x >> 1;
        int var1 = this.Q.fC;
        int var2 = this.Q.fV;
        this.d2 = var1 * this.B;
        this.c2 = var2 * this.B;
    }

    final void b() {
        int var1 = this.Q.getWidth();
        int var2 = this.Q.getHeight();

        try {
            int var3 = var1 / (this.Q.fE + 1);
            int var4 = var2 / (this.Q.fX + 1);
            int var5 = var3;
            if (var3 > var4) {
                var5 = var4;
            }

            if (var5 < 1) {
                var5 = 1;
            }

            this.B = var5;
            this.C = var5;
            this.a();
            F = false;
            this.c();
            this.B = 1;
            this.a();
        } catch (Exception var6) {
        }
    }

    private final void b(int var1) {
        this.w = new byte[1 + (this.Q.bt >> 1)];
        this.u = new byte[11];
        int[][] var2 = this.Q.ch;
        int[][] var3 = this.Q.bZ;
        int var4 = this.Q.cU;
        int var5 = this.Q.bg;

        for(int var6 = 0; var6 < var4; ++var6) {
            if (var2[0][var6] > 0 && var2[8][var6] == var1) {
                ++this.w[var2[0][var6]];
            }
        }

        for(int var7 = 0; var7 < var5; ++var7) {
            if (var3[0][var7] > 0 && var3[5][var7] == var1) {
                ++this.u[var3[0][var7]];
            }
        }

    }

    private static int[] a(Image var0, int var1, int var2, int var3, int var4, int var5) {
        Image var8 = Image.createImage(var3, var4);
        Image var9 = Image.createImage(var3, var4);
        Graphics var10;
        (var10 = var8.getGraphics()).setColor(0);
        var10.fillRect(0, 0, var3, var4);
        var10.drawImage(var0, -var1, -var2, 20);
        Graphics var11;
        (var11 = var9.getGraphics()).setColor(16777215);
        var11.fillRect(0, 0, var3, var4);
        var11.drawImage(var0, -var1, -var2, 20);
        int[] var12 = new int[var3 * var4];
        var8.getRGB(var12, 0, var3, 0, 0, var3, var4);
        int[] var13 = new int[var3 * var4];
        var9.getRGB(var13, 0, var3, 0, 0, var3, var4);

        for(int var14 = 0; var14 < var12.length; ++var14) {
            if ((var12[var14] & 16777215) <= 2105376 && (var13[var14] & 16777215) >= 14671839) {
                var12[var14] = 0;
            } else {
                var12[var14] |= -16777216;
            }
        }

        int[] var19 = var12;
        int var15;
        int var16;
        int var17;
        int var18;
        int[] var20;
        if (var5 == 2) {
            var20 = new int[var12.length];
            var18 = 0;

            for(var16 = 0; var16 < var4; ++var16) {
                var17 = var3 - 1;

                for(var15 = 0; var15 < var3; ++var15) {
                    var20[var18 * var3 + var17] = var19[var16 * var3 + var15];
                    --var17;
                }

                ++var18;
            }

            return var20;
        } else if (var5 != 1) {
            return var12;
        } else {
            var20 = new int[var12.length];
            var18 = var4 - 1;

            for(var16 = 0; var16 < var4; ++var16) {
                var17 = 0;

                for(var15 = 0; var15 < var3; ++var15) {
                    var20[var18 * var3 + var17] = var19[var16 * var3 + var15];
                    ++var17;
                }

                --var18;
            }

            return var20;
        }
    }

    static final void a(Image var0, int var1, int var2, int var3, int var4) {
        try {
            if (Display.getDisplay(NET_Lizard.app).numAlphaLevels() > 1) {
                int[] var5 = a(var0, var1, var2, var3, var4, 0);
                int var6;
                if (Display.getDisplay(NET_Lizard.app).numAlphaLevels() > 2) {
                    for(var6 = 0; var6 < var5.length; ++var6) {
                        if ((var5[var6] & -16777216) != 0) {
                            var5[var6] = var5[var6] & 16777215 | 2130706432;
                        }
                    }
                } else {
                    var6 = 0;
                    boolean var7 = false;

                    for(int var8 = 0; var8 < var4; ++var8) {
                        boolean var9 = var7;

                        for(int var10 = 0; var10 < var3; ++var10) {
                            if (var9) {
                                var5[var6] &= 16777215;
                            }

                            var9 = !var9;
                            ++var6;
                        }

                        var7 = !var7;
                    }
                }

                P = var3;
                p = var4;
                n2 = var5;
            }

        } catch (Exception var11) {
        }
    }

    private void f() {
        byte var1 = (byte) k.em;
        if (k.em > 0) {
            try {
                for(int var2 = 0; var2 <= this.Q.fX; ++var2) {
                    for(int var3 = 0; var3 <= this.Q.fE; ++var3) {
                        if (this.Q.bX[var3][var2] == var1) {
                            this.Q.bX[var3][var2] = 0;
                        }
                    }
                }

            } catch (Exception var4) {
            }
        }
    }

    private final int[] a(int var1, int var2) {
        int[] var4 = new int[4];

        for(int var7 = 0; var7 < this.Q.cU; ++var7) {
            if (this.Q.ch[0][var7] > 0 && this.Q.ch[8][var7] > 0 && this.Q.ch[8][var7] < 3 && this.Q.ch[29][var7] <= 0) {
                int var5 = Math.abs(this.Q.ch[1][var7] - var1);
                int var6 = Math.abs(this.Q.ch[2][var7] - var2);
                boolean var8 = this.Q.ch[12][var7] >= 0;
                int var9 = k.c(var5, var6);
                var5 = Math.abs(this.Q.ch[13][var7] - var1);
                var6 = Math.abs(this.Q.ch[14][var7] - var2);
                int var10 = k.c(var5, var6);
                if (var9 <= 5 || var8 && var10 <= 5) {
                    int var11 = (this.Q.ch[8][var7] - 1) * 2;
                    int var10002 = var4[var11]++;
                    ++var11;
                    int var12 = this.c(var7);
                    if (this.Q.ch[0][var7] == this.Q.bb) {
                        var12 = 0;
                    }

                    var4[var11] += var12;
                }
            }
        }

        return var4;
    }

    private final int c(int var1) {
        int var2 = this.Q.b(var1, 4);
        if (this.Q.ch[0][var1] == 8) {
            var2 = 0;

            for(int var3 = 0; var3 < this.Q.cU; ++var3) {
                if (this.Q.ch[29][var3] == var1 + 1 && this.Q.ch[0][var3] != 8) {
                    var2 += this.c(var3);
                }
            }

            return var2;
        } else {
            return var2 + var2 * this.Q.ch[10][var1] / 100;
        }
    }

    private final boolean d(int var1) {
        boolean var2 = this.Q.ch[0][var1] > 0 && this.Q.ch[0][var1] != this.Q.bb && this.Q.l(var1) && this.Q.ch[12][var1] < 0 && this.Q.ch[7][var1] <= 0 && this.Q.ch[28][var1] <= 0 && this.Q.ch[29][var1] <= 0;
        if (this.Q.ch[12][var1] < -9) {
            var2 = false;
        }

        return var2;
    }

    private final int[] e(int var1) {
        int[] var2 = new int[2];

        for(int var3 = 0; var3 < this.Q.cU; ++var3) {
            if (this.Q.ch[0][var3] > 0 && this.Q.ch[8][var3] == var1) {
                if (this.d(var3)) {
                    this.Q.ch[17][var3] = 0;
                    int var10002 = var2[0]++;
                    var2[1] += this.c(var3);
                } else {
                    this.Q.ch[17][var3] = 1;
                }

                if (var1 == 1) {
                    this.Q.ch[17][var3] = 0;
                }
            }
        }

        return var2;
    }

    private final int g() {
        int var1 = -1;
        int var2 = 0;

        for(int var3 = 0; var3 < this.Q.cU; ++var3) {
            int[] var4;
            int var5;
            if (this.Q.ch[0][var3] > 0 && this.Q.ch[8][var3] == 2 && this.Q.ch[17][var3] <= 0 && this.Q.ch[29][var3] <= 0 && (var5 = (var4 = this.a(this.Q.ch[1][var3], this.Q.ch[2][var3]))[3] - var4[1]) > var2) {
                var2 = var5;
                var1 = var3;
            }
        }

        return var1;
    }

    private final void f(int var1) {
        long var2 = (long)((k.bP - k.ee) * 4500);
        if (k.es) {
            var2 >>= this.q;
        }

        long var4 = this.d();
        if (this.I > var4 + var2) {
            this.I = var4;
        }

        if (var4 - this.I >= 300L) {
            this.I = var4;
            int var9 = 0;
            int var10 = this.Q.cU;
            int var11 = -1;
            int var12 = 0;
            int var13 = this.Q.bg;
            byte var14 = 1;
            if (this.Q.q() < 30) {
                var12 = this.Q.bg - 1;
                var13 = -1;
                var14 = -1;
            }

            boolean var15 = false;
            if (this.w[this.Q.bb] < 2 && this.Q.cv[2] < 9000) {
                var15 = true;
                if (k.bA[2][var1 - 1] <= 0) {
                    var15 = false;
                }

                if (this.u[5] <= 0 && (k.bA[4][var1 - 1] <= 0 || this.Q.cv[2] > 4300)) {
                    var15 = false;
                }

                if (this.u[5] <= 0 && this.u[1] <= 0) {
                    var15 = false;
                }
            }

            int var17;
            for(int var16 = var12; var16 != var13; var16 += var14) {
                if (this.Q.bZ[0][var16] > 1 && this.Q.bZ[5][var16] == var1 && this.Q.ce[0][this.Q.bZ[0][var16]] > 0 && (this.Q.bZ[12][var16] <= 0 || var15)) {
                    for(var17 = 1; var17 <= this.Q.ce[0][this.Q.bZ[0][var16]]; ++var17) {
                        int var18;
                        if ((var18 = this.Q.ce[var17][this.Q.bZ[0][var16]]) >= 32) {
                            var18 = var18 - 32 + 64;
                        }

                        if (var18 > 0 && var18 < 64) {
                            byte var19 = this.w[var18];
                            int var20;
                            if (var18 == this.Q.bb) {
                                if (var19 < 3 + (k.ee >> 3)) {
                                    var20 = var19 - 1;
                                } else {
                                    var20 = var19 + 1;
                                }

                                if (this.w[var18] < 2 && this.Q.cv[2] < 9000) {
                                    var20 = -10;
                                }
                            } else {
                                var20 = var19 - ((k.ee - 7) * (var18 - this.Q.bb) >> 2);
                                if (var18 == 8) {
                                    if (var20 < 3) {
                                        --var20;
                                    }

                                    if (var20 > 3) {
                                        ++var20;
                                    }
                                }
                            }

                            if (var20 < var10 && this.w[var18] < k.bF[var18 - 1][1]) {
                                var10 = var20;
                                var9 = var18;
                                var11 = var16;
                            }
                        }
                    }
                }
            }

            if (var11 >= 0 && this.Q.bZ[12][var11] > 0) {
                for(var17 = 0; var17 < this.Q.bg; ++var17) {
                    if (this.Q.bZ[0][var17] == this.Q.bZ[0][var11] && this.Q.bZ[5][var17] == var1 && this.Q.bZ[12][var17] <= 0) {
                        var11 = var17;
                        break;
                    }
                }
            }

            if (var9 > 0 && var11 >= 0 && this.Q.bZ[12][var11] <= 0) {
                this.Q.bZ[8][var11] = var9;
                this.Q.a(var9, var11);
                this.I = var4 + var2;
            }

        }
    }

    private final void b(int var1, int var2) {
        if (var1 >= 0 && var1 < this.Q.bg) {
            byte var3 = 1;
            if (var2 > 0) {
                var3 = 2;
            }

            if (var2 == 2) {
                var3 = 3;
            }

            if (this.Q.bZ[0][var1] > 0) {
                int[] var4;
                int var5 = (var4 = this.a(this.Q.bZ[1][var1], this.Q.bZ[2][var1]))[0] * var3 - var4[2];
                int var6 = var4[1] * var3 - var4[3];
                if (var5 < this.m2 && var6 < this.k2 || var2 > 0) {
                    int var8 = 0;

                    for(int var9 = 0; var8 < this.Q.cU && (var8 <= var5 || var9 <= var6); ++var8) {
                        int var7;
                        if ((var7 = this.Q.a(this.Q.bZ[1][var1], this.Q.bZ[2][var1], 2, var2, var1 + 64)) >= 0 && var7 < this.Q.cU) {
                            this.a(var7, var1 + 64, var2);
                            var9 += this.c(var7);
                        }
                    }
                }
            }

        }
    }

    private final void c(int var1, int var2) {
        if (var1 >= 0 && var1 < this.Q.cU) {
            if (this.Q.ch[0][var1] > 0) {
                int[] var3;
                int var4 = (var3 = this.a(this.Q.ch[1][var1], this.Q.ch[2][var1]))[0] - var3[2];
                int var5 = var3[1] - var3[3];
                if (var4 < this.m2 && var5 < this.k2) {
                    int var7 = 0;

                    int var6;
                    for(int var8 = 0; var7 < this.Q.cU && (var7 <= var4 || var8 <= var5) && (var6 = this.Q.a(this.Q.ch[1][var1], this.Q.ch[2][var1], 2, 0)) >= 0 && var6 < this.Q.cU; ++var7) {
                        this.a(var6, var1, var2);
                        var8 += this.c(var6);
                    }
                }
            }

        }
    }

    private void g(int var1) {
        this.Q.ch[17][var1] = 7;
        if (this.Q.ch[7][var1] > 0) {
            this.Q.ch[7][var1] = 0;
        }

        if (this.Q.ch[9][var1] <= 7) {
            int var2 = this.Q.ch[1][var1];
            int var3 = this.Q.ch[2][var1];
            boolean var4 = false;
            boolean var5 = false;
            boolean var6 = false;

            for(int var7 = var3 - 1; var7 <= var3 + 1; ++var7) {
                for(int var8 = var2 - 1; var8 <= var2 + 1; ++var8) {
                    int var9;
                    if ((var8 != var2 || var7 != var3) && (var9 = this.Q.d(var8, var7) - 64) >= 0 && var9 < this.Q.bg && this.Q.bZ[0][var9] == 3 && this.Q.bZ[5][var9] == this.Q.ch[8][var1]) {
                        var4 = true;
                    }
                }
            }

            if (var4 && this.Q.ch[27][var1] > 0) {
                int[] var10000 = this.Q.cv;
                int var10001 = this.Q.ch[8][var1];
                var10000[var10001] += this.Q.ch[27][var1] * 5;
                this.Q.ch[27][var1] = 0;
            } else {
                if (this.Q.ch[27][var1] < 100 && this.Q.cj[var2][var3] <= 0) {
                    this.Q.ch[13][var1] = this.Q.ch[1][var1];
                    this.Q.ch[14][var1] = this.Q.ch[2][var1];
                    this.b(var1, -1, this.Q.ch[2][var1]);
                    if (this.Q.ch[12][var1] < 0) {
                        this.Q.ch[12][var1] = -1;
                    }
                }

                if (this.Q.ch[27][var1] >= 100 && !var4) {
                    this.Q.ch[13][var1] = this.Q.ch[1][var1];
                    this.Q.ch[14][var1] = this.Q.ch[2][var1];
                    this.b(var1, this.Q.ch[1][var1], -1);
                    if (this.Q.ch[12][var1] < 0) {
                        this.Q.ch[12][var1] = -1;
                    }
                }

            }
        }
    }

    private void h() {
        if (!k.aT) {
            long var1 = this.d();
            if (this.G > var1) {
                this.G = var1;
            }

            long var3 = (long)(33 + (k.bP - k.ee) * 70);
            if (k.es) {
                var3 >>= this.q;
            }

            if (var1 >= this.G + var3) {
                this.G = var1;
                this.O = 5 + (k.ee - 1) * 10;
                boolean var5 = var1 > N;
                if (var1 < 9000L) {
                    this.h2 = false;
                }

                long var6;
                if ((var6 = N) < 0L) {
                    var6 = 0L;
                }

                var6 *= 2L;
                long var8 = 480000L;
                long var10 = 840000L;
                if (var6 < var8) {
                    var6 = var8;
                }

                if (var6 > var10) {
                    var6 = var10;
                }

                if (var1 > var6) {
                    this.h2 = true;
                }

                var5 &= this.h2;
                switch(this.o) {
                    case 0:
                        int[] var12 = this.i();
                        this.r = var12[0];
                        this.s = var12[1];
                        this.t = var12[2];
                        var12 = this.e(1);
                        this.l2 = var12[0];
                        var12 = this.e(2);
                        this.m2 = var12[0];
                        this.k2 = var12[1];
                        this.i2 = 0;
                        this.j2 = 0;
                        int var13 = 0;
                        int var14 = 0;

                        for(int var15 = 0; var15 < this.Q.cU; ++var15) {
                            if (this.Q.ch[0][var15] > 0) {
                                if (this.Q.ch[8][var15] == 1) {
                                    ++this.i2;
                                }

                                if (this.Q.ch[8][var15] == 2) {
                                    ++this.j2;
                                }
                            }

                            if (this.Q.ch[0][var15] > 0 && this.Q.ch[0][var15] != this.Q.bb && (this.Q.ch[0][var15] == 8 || this.Q.ch[29][var15] <= 0)) {
                                if (this.Q.ch[8][var15] == 1) {
                                    var13 += this.c(var15);
                                }

                                if (this.Q.ch[8][var15] == 2) {
                                    var14 += this.c(var15);
                                }
                            }
                        }

                        if (this.j2 > this.i2 && var14 > var13 * 6 >> 2) {
                            this.h2 = true;
                        }

                        if (var14 < var13 * 3 >> 2) {
                            this.h2 = false;
                        }
                        break;
                    case 1:
                        this.h(2);
                        break;
                    case 2:
                        if (this.s > 0 && this.m2 > 0 && this.k2 > 0) {
                            this.d(2, 1);
                        }
                        break;
                    case 3:
                        this.o();
                        break;
                    case 4:
                        if (this.s > 0 && this.m2 > 0 && this.k2 > 0 && var5) {
                            this.d(1, 0);
                        }
                        break;
                    case 5:
                        if (this.m2 > 0 && this.k2 > 0 && var5) {
                            this.e();
                        }
                    case 6:
                    case 11:
                    case 13:
                    default:
                        break;
                    case 7:
                        if (this.j2 > this.l2 + 1 && this.t > this.s + this.r && var5 && this.m2 > 0 && this.k2 > 0) {
                            for(int var16 = 0; var16 < this.Q.cU; ++var16) {
                                if (this.Q.ch[0][var16] > 0 && this.Q.ch[8][var16] == 2 && this.Q.ch[17][var16] <= 0 && this.d(var16)) {
                                    int var17 = 10000;
                                    int var20 = -1;

                                    int[] var18;
                                    int var19;
                                    for(int var21 = 0; var21 < this.Q.cU; ++var21) {
                                        if (this.Q.ch[0][var21] > 0 && this.Q.ch[8][var21] == 1 && (var19 = (var18 = this.a(this.Q.ch[1][var21], this.Q.ch[2][var21]))[1] - var18[3]) < var17) {
                                            var17 = var19;
                                            var20 = var21;
                                        }
                                    }

                                    if (var20 >= 0) {
                                        if (this.Q.q() < this.O) {
                                            this.Q.ch[7][var16] = var20 + 1;
                                        }
                                    } else {
                                        for(int var22 = 0; var22 < this.Q.bg; ++var22) {
                                            if (this.Q.bZ[0][var22] > 0 && this.Q.bZ[5][var22] == 1 && (var19 = (var18 = this.a(this.Q.bZ[1][var22], this.Q.bZ[2][var22]))[1] - var18[3]) < var17) {
                                                var17 = var19;
                                                var20 = var22;
                                            }
                                        }

                                        if (var20 >= 0 && this.Q.q() < this.O) {
                                            this.a(var16, var20 + 64, 0);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 8:
                        this.h(2);
                        break;
                    case 9:
                        this.a(2);
                        break;
                    case 10:
                        this.b(2);
                        this.f(2);
                        break;
                    case 12:
                        this.j(2);
                        break;
                    case 14:
                        this.h(2);
                        break;
                    case 15:
                        this.j();
                }

                ++this.o;
                if (this.o > 16) {
                    this.o = 0;
                }

            }
        }
    }

    private int a(int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = -1;
        if (var6 < 5) {
            var6 = 5;
        }

        boolean var13 = false;

        for(int var8 = 0; var8 < this.Q.cU; ++var8) {
            if (this.Q.ch[0][var8] > 0 && this.Q.ch[0][var8] != this.Q.bb && this.Q.ch[0][var8] != 8 && this.Q.ch[8][var8] == var3 && this.Q.ch[17][var8] <= var4 && this.Q.ch[28][var8] <= 0 && k.d(this.Q.ch[0][var8]) < 8 && k.d(this.Q.ch[0][var8]) < 8 - this.Q.ch[27][var5] && this.Q.ch[7][var8] <= 0) {
                int var9 = Math.abs(this.Q.ch[1][var8] - var1);
                int var10;
                if ((var10 = Math.abs(this.Q.ch[2][var8] - var2)) > var9) {
                    var9 = var10;
                }

                var13 = true;
                if (var4 > 0 && this.Q.ch[17][var8] > 0 && (this.Q.ch[12][var8] < -9 || this.Q.ch[12][var8] >= 0)) {
                    int var11 = Math.abs(this.Q.ch[1][var8] - this.Q.ch[13][var8]);
                    int var12;
                    if ((var12 = Math.abs(this.Q.ch[2][var8] - this.Q.ch[14][var8])) > var11) {
                        var11 = var12;
                    }

                    if (var4 > 1) {
                        var11 *= 2;
                    }

                    if (var11 < var9) {
                        var13 = false;
                    }
                }

                if (this.Q.ch[0][var8] < this.Q.bb) {
                    var9 *= 2;
                }

                if (var13 && var9 < var6) {
                    var6 = var9;
                    var7 = var8;
                }
            }
        }

        return var7;
    }

    private final int[] i() {
        int[] var1 = new int[3];

        for(int var2 = 0; var2 < this.Q.bg; ++var2) {
            if (this.Q.bZ[0][var2] > 0 && this.Q.bZ[5][var2] >= 0 && this.Q.bZ[5][var2] <= 2) {
                this.Q.bZ[7][var2] = 0;
                ++var1[this.Q.bZ[5][var2]];
            }
        }

        return var1;
    }

    private final void h(int var1) {
        int var2 = 0;
        boolean var3 = false;

        int var6;
        int var7;
        int var10;
        for(int var4 = 0; var4 < this.Q.cU; ++var4) {
            try {
                int var5;
                if (this.Q.ch[0][var4] > 0 && this.Q.ch[8][var4] != var1 && (this.Q.ch[12][var4] < -9 || this.Q.ch[12][var4] >= 0) && (var5 = this.Q.d(this.Q.ch[13][var4], this.Q.ch[14][var4]) - 64) >= 0 && var5 < this.Q.bg && this.Q.bZ[5][var5] == var1 && this.Q.bZ[18][var5] <= 0) {
                    var6 = Math.abs(this.Q.ch[13][var4] - this.Q.ch[1][var4]);
                    if ((var7 = Math.abs(this.Q.ch[14][var4] - this.Q.ch[2][var4])) > var6) {
                        var6 = var7;
                    }

                    var10 = 100 * AssetManager.e1 / k.bP;
                    if (this.Q.ch[0][var4] < this.Q.bb) {
                        var6 *= 2;
                    }

                    int var8 = 7 + (AssetManager.e1 >> 1);
                    if (this.Q.bZ[0][var5] == 1) {
                        var8 *= 2;
                        var10 *= 2;
                    }

                    if (var6 <= var8) {
                        this.Q.bZ[18][var5] = var4 + 1;
                    }

                    if (var2 < var10) {
                        var2 = var10;
                    }
                }
            } catch (Exception var9) {
            }
        }

        boolean var11 = false;

        for(var6 = 0; var6 < this.Q.bg; ++var6) {
            if (this.Q.bZ[0][var6] > 0 && this.Q.bZ[5][var6] == var1 && this.Q.bZ[18][var6] > 0 && this.Q.bZ[0][var6] == 1) {
                this.b(var6, 4);
                this.Q.bZ[18][var6] = 0;
                var10 = 200 * AssetManager.e1 / k.bP;
                if (var2 < var10) {
                    var2 = var10;
                }
            }
        }

        for(var7 = 0; var7 < this.Q.bg; ++var7) {
            if (this.Q.bZ[0][var7] > 0 && this.Q.bZ[5][var7] == var1 && this.Q.bZ[18][var7] > 0 && this.Q.bZ[0][var7] != 1) {
                this.b(var7, 3);
                this.Q.bZ[18][var7] = 0;
                if (var2 <= 0) {
                    var2 = 100 * AssetManager.e1 / k.bP;
                }
            }
        }

        if (this.Q.q() < var2) {
            this.I = 0L;
            if (this.Q.q() < var2 * 2) {
                this.H = 0L;
            }
        }

    }

    private final void i(int var1) {
        try {
            if (this.Q.ch[0][var1] > 0 && this.Q.ch[12][var1] < 0 && this.Q.ch[12][var1] >= -9 && this.Q.ch[7][var1] <= 0 && this.Q.ch[28][var1] <= 0 && this.Q.ch[29][var1] <= 0 && this.Q.ch[0][var1] != 8) {
                int var2 = this.Q.ch[8][var1];
                int var3 = this.Q.ch[1][var1];
                int var4 = this.Q.ch[2][var1];
                int var5 = this.Q.ch[9][var1];
                boolean var6 = false;
                if (var5 > 7) {
                    var6 = true;
                }

                boolean var7 = !var6 && this.Q.ch[12][var1] < 0;

                for(int var9 = var4 - 2; var9 <= var4 + 2; ++var9) {
                    for(int var10 = var3 - 2; var10 <= var3 + 2; ++var10) {
                        int var11;
                        if (var10 >= 0 && var9 >= 0 && var10 <= this.Q.fE && var9 <= this.Q.fX && (var11 = this.Q.ck[var10][var9] - 64) >= 0 && var11 < this.Q.bg && this.Q.bZ[0][var11] > 0 && this.Q.bZ[5][var11] == var2 && var7) {
                            boolean var12 = false;
                            int var13 = 0;
                            int var14 = this.Q.cU;
                            byte var15 = 1;
                            if (this.Q.q() < 50) {
                                var13 = this.Q.cU - 1;
                                var14 = -1;
                                var15 = -1;
                            }

                            for(int var17 = var13; var17 != var14; var17 += var15) {
                                if (this.Q.ch[0][var17] > 0 && this.Q.ch[28][var17] == 64 + var11) {
                                    this.Q.ch[13][var1] = this.Q.ch[1][var17];
                                    this.Q.ch[14][var1] = this.Q.ch[2][var17];
                                    this.Q.ch[12][var1] = -10;
                                    this.Q.ch[28][var1] = var17 + 1;
                                    return;
                                }
                            }
                        }
                    }
                }

            }
        } catch (Exception var16) {
        }
    }

    private final void a(int var1, int var2, int var3) {
        if (var1 >= 0 && var1 < this.Q.cU && var2 >= 0) {
            if (this.Q.q() <= this.O) {
                int var4;
                if (var2 >= 64) {
                    if ((var4 = var2 - 64) < this.Q.bg && this.Q.bZ[0][var4] > 0) {
                        this.Q.ch[13][var1] = this.Q.bZ[1][var4];
                        this.Q.ch[14][var1] = this.Q.bZ[2][var4];
                        this.Q.ch[12][var1] = -10;
                        this.Q.ch[17][var1] = 1 + var3;
                        --this.m2;
                        int var5 = this.c(var1);
                        if (this.Q.ch[0][var1] == this.Q.bb) {
                            var5 = 0;
                        }

                        this.k2 -= var5;
                    }

                } else {
                    if (var2 < this.Q.cU) {
                        this.Q.ch[7][var1] = var2 + 1;
                        this.Q.ch[17][var1] = 1;
                        --this.m2;
                        var4 = this.c(var1);
                        if (this.Q.ch[0][var1] == this.Q.bb) {
                            var4 = 0;
                        }

                        this.k2 -= var4;
                    }

                }
            }
        }
    }

    private final void j(int var1) {
        long var2 = (long)((k.bP - k.ee) * 80);
        if (k.es) {
            var2 >>= this.q;
        }

        long var4 = this.d();
        if (this.J > var4) {
            this.J = var4;
        }

        if (var4 - this.J >= var2) {
            this.J = var4;

            for(int var6 = 0; var6 < this.Q.bg; ++var6) {
                if (this.Q.bZ[0][var6] > 0 && this.Q.bZ[5][var6] == var1 && this.Q.bZ[10][var6] < 100 && (this.Q.bZ[12][var6] <= 0 || this.Q.bZ[17][var6] <= 0 || this.Q.bZ[10][var6] < (this.Q.bZ[16][var6] - this.Q.bZ[12][var6] * 100) / this.Q.bZ[16][var6])) {
                    this.Q.bZ[13][var6] = 1;
                }
            }

        }
    }

    public final void run() {
        boolean var2 = false;
        int var3 = -1;
        int var4 = -1;
        int var5 = 0;

        while(true) {
            while(e2) {
                if (k.cq) {
                    this.Q.aO = false;
                }

                if (!this.Q.aO) {
                    try {
                        Thread.sleep(30L);
                    } catch (Exception var11) {
                    }
                } else {
                    try {
                        try {
                            Thread.sleep(18L);
                        } catch (Exception var15) {
                        }

                        int var6 = this.Q.cU - 1;
                        int[][] var7 = this.Q.ch;
                        boolean var8 = false;
                        int var9 = 0;
                        byte var18 = 3;

                        int var10;
                        for(int var1 = 0; var1 < this.Q.cU; ++var1) {
                            ++var9;
                            if (var9 > 3) {
                                var9 = 0;
                            }

                            if (var9 == 0) {
                                try {
                                    Thread.sleep(5L);
                                } catch (Exception var12) {
                                }
                            }

                            var8 = !var8;
                            this.m();

                            while(var1 < var6 && var7[0][var1] <= 0) {
                                ++var1;
                            }

                            if (var8) {
                                if (this.Q.dZ >= 0) {
                                    this.Q.h(this.Q.dZ);
                                    this.Q.dZ = -1;
                                }

                                if (this.Q.eY) {
                                    k.y();
                                    this.Q.eY = false;
                                }

                                if (this.f2) {
                                    this.f();
                                    this.f2 = false;
                                }

                                if (this.L) {
                                    this.l();
                                    this.L = false;
                                }
                            }

                            if (var9 == 0 && this.Q.fi) {
                                this.k();
                            }

                            if (!e2 || this.Q.ae) {
                                break;
                            }

                            if (!this.Q.aB && !this.Q.aC) {
                                if (!k.cy && b2 < 0 && b2 != -100) {
                                    this.h();
                                    this.m();
                                }

                                if (k.cy) {
                                    if (b2 != -1) {
                                        b2 = -1;
                                    }
                                } else {
                                    if (b2 == -100) {
                                        b2 = 0;
                                        var18 = 2;
                                    }

                                    if (b2 >= 0) {
                                        var1 = b2;
                                        b2 = -1;
                                    }
                                }

                                if (this.Q.w()) {
                                    try {
                                        if (this.Q.ch[0][var1] > 0 && this.Q.ch[8][var1] < var18 && this.Q.ch[12][var1] < -9) {
                                            this.b(var1, this.Q.ch[13][var1], this.Q.ch[14][var1]);
                                            if (this.Q.ch[12][var1] >= 0) {
                                                this.Q.b(var1);
                                            }

                                            if (this.Q.ch[12][var1] < -9) {
                                                try {
                                                    if ((var10 = this.Q.ck[this.Q.ch[13][var1]][this.Q.ch[14][var1]] - 64) >= 0 && var10 < this.Q.bg) {
                                                        this.Q.ch[13][var1] = this.Q.bZ[1][var10];
                                                        this.Q.ch[14][var1] = this.Q.bZ[2][var10];
                                                    }
                                                } catch (Exception var13) {
                                                }
                                            }
                                        }

                                        if (this.Q.w()) {
                                            if (this.Q.ch[0][var1] == this.Q.bb && this.Q.ch[12][var1] >= -9 && this.Q.ch[12][var1] < 0) {
                                                this.m();
                                                this.g(var1);
                                                if (this.Q.ch[12][var1] >= 0) {
                                                    this.Q.b(var1);
                                                }
                                            }

                                            this.i(var1);
                                        }
                                    } catch (Exception var14) {
                                    }
                                }
                            }
                        }

                        ++var5;
                        if (var5 >= this.Q.cU) {
                            var5 = 0;
                        }

                        while(var5 < var6 && var7[0][var5] <= 0) {
                            ++var5;
                        }

                        try {
                            if (this.Q.ch[0][var5] == this.Q.bb && (this.Q.ch[12][var5] < -9 || this.Q.ch[12][var5] > 0)) {
                                if (var3 == var5 && var4 == this.Q.ch[12][var5]) {
                                    this.Q.ch[12][var5] = -1;
                                    var3 = -1;
                                    var4 = -1;
                                } else {
                                    var3 = var5;
                                    var4 = this.Q.ch[12][var5];
                                }
                            }

                            if (this.Q.ch[0][var5] > 0 && this.Q.ch[7][var5] > 0 && this.Q.ch[7][var5] <= this.Q.cU) {
                                var10 = this.Q.ch[7][var5] - 1;
                                if (this.Q.ch[1][var10] != this.Q.ch[13][var5] || this.Q.ch[2][var10] != this.Q.ch[14][var5]) {
                                    this.Q.ch[12][var5] = -10;
                                    this.Q.ch[13][var5] = this.Q.ch[1][var10];
                                    this.Q.ch[14][var5] = this.Q.ch[2][var10];
                                    this.b(var5, this.Q.ch[13][var5], this.Q.ch[14][var5]);
                                }
                            }
                        } catch (Exception var16) {
                        }
                    } catch (Exception var17) {
                    }
                }
            }

            return;
        }
    }

    private final void j() {
        if (this.Q.cv[2] <= 800) {
            int[] var2 = new int[k.bA.length + 2];
            int[] var3 = new int[2 + (this.Q.bt >> 1)];
            int[] var4 = new int[var2.length];
            int var6 = 0;

            for(int var7 = 0; var7 < this.Q.bg; ++var7) {
                if (this.Q.bZ[0][var7] > 0 && this.Q.bZ[5][var7] == 2) {
                    if (this.Q.bZ[0][var7] != 2) {
                        ++var6;
                    }

                    ++var2[this.Q.bZ[0][var7]];
                    var4[this.Q.bZ[0][var7]] = var7 + 1;
                }
            }

            for(int var8 = 0; var8 < this.Q.cU; ++var8) {
                if (this.Q.ch[0][var8] > 0 && this.Q.ch[8][var8] == 2) {
                    ++var3[this.Q.ch[0][var8]];
                }
            }

            byte[][] var9 = this.Q.cj;
            boolean var10 = true;

            int var12;
            for(int var11 = 0; var11 <= this.Q.fX; ++var11) {
                for(var12 = 0; var12 <= this.Q.fE; ++var12) {
                    if (var9[var12][var11] > 0) {
                        var10 = false;
                        break;
                    }
                }
            }

            if (this.Q.cv[2] < 80) {
                if (var10 && var2[3] > 0 && var4[3] > 0) {
                    this.Q.g(var4[3] - 1);
                    return;
                }

                if (var2[3] > 0 && var3[this.Q.bb] <= 0 && var2[1] <= 0 && var2[5] <= 0 && var4[3] > 0) {
                    this.Q.g(var4[3] - 1);
                    return;
                }

                if (var2[3] <= 0 || var3[this.Q.bb] <= 0) {
                    var12 = 1;
                    int var13 = -1;

                    for(int var14 = 0; var14 < var2.length; ++var14) {
                        if (var2[var14] > var12 && (var14 != 2 || var2[var14] > 1 + var6 / 3)) {
                            var13 = var14;
                            var12 = var2[var14];
                        }
                    }

                    if (var13 >= 0 && var4[var13] > 0) {
                        this.Q.g(var4[var13] - 1);
                        return;
                    }

                    if (var4[1] > 0) {
                        this.Q.g(var4[1] - 1);
                        return;
                    }
                }
            }

        }
    }

    private final void k() {
        if (this.Q.ci != null && this.R != null) {
            try {
                int var1 = this.C;
                int var2 = this.Q.fE;
                int var3 = this.Q.fX;
                byte[][] var4 = this.Q.ci;
                int[] var5 = this.R;
                int var6 = 9474192 + (this.a2 << 24);
                int var7 = 0;
                boolean var8 = false;
                int var9 = var1 * (var2 + 1);

                for(int var11 = 0; var11 <= var3; ++var11) {
                    int var14;
                    for(int var12 = 0; var12 <= var2; ++var12) {
                        if (var4[var12][var11] == 0) {
                            var7 += var1;
                        } else {
                            for(var14 = var7 + var1; var7 < var14; ++var7) {
                                var5[var7] = var6;
                            }
                        }
                    }

                    if (var1 > 1) {
                        int var10 = var1;

                        while(true) {
                            --var10;
                            if (var10 <= 0) {
                                break;
                            }

                            for(var14 = var7 + var9; var7 < var14; ++var7) {
                                var5[var7] = var5[var7 - var9];
                            }
                        }
                    }
                }

                this.R = var5;
            } catch (Exception var13) {
            }
        }
    }

    final void c() {
        try {
            int var1 = 3158064 + (this.a2 << 24);
            if (!k.s() || this.Q.ci == null) {
                var1 = 9474192 + (this.a2 << 24);
            }

            int[] var2;
            if (this.R != null && this.R.length == this.y * this.x) {
                var2 = this.R;
            } else {
                this.R = null;
                var2 = new int[this.y * this.x];
            }

            for(int var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = var1;
            }

            this.R = var2;
            this.k();
            F = true;
        } catch (Exception var4) {
            this.R = null;
        }
    }

    private void l() {
        if (k.em == 0) {
            int var1 = 115;

            while(true) {
                --var1;
                if (var1 <= 0) {
                    break;
                }

                if (this.Q.R[2][var1] == 0 && this.Q.R[3][var1] == 0) {
                    k.em = var1 + 128;
                    break;
                }
            }
        }

        if (k.em > 0) {
            byte var9 = (byte) k.em;

            try {
                int var2;
                if ((var2 = this.Q.ck[this.Q.fy][this.Q.fQ] - 1) >= 0 && var2 < this.Q.cU) {
                    if (this.Q.ch[0][var2] > 0 && this.Q.ch[8][var2] == 1) {
                        int var3 = this.Q.ch[12][var2];
                        boolean var4 = false;
                        boolean var5 = false;

                        try {
                            while(true) {
                                if (var3 < 0) {
                                    return;
                                }

                                byte var10 = this.Q.cf[var3][var2];
                                byte var11 = this.Q.cg[var3][var2];
                                this.Q.bX[var10][var11] = var9;
                                if (var10 == this.Q.ch[13][var2] && var11 == this.Q.ch[14][var2]) {
                                    break;
                                }

                                ++var3;
                            }
                        } catch (Exception var7) {
                        }
                    }

                }
            } catch (Exception var8) {
            }
        }
    }

    private final void m() {
        long var1;
        if ((var1 = System.currentTimeMillis()) - k.eH > 91L) {
            try {
                Thread.sleep(7L);
            } catch (Exception var4) {
                return;
            }
        } else if (var1 - k.eH > 120L) {
            n();
        }

    }

    private void b(int var1, int var2, int var3, boolean var4) {
        int var5 = this.Q.ch[1][var1];
        int var6 = this.Q.ch[2][var1];
        int var7;
        if ((var7 = this.Q.ch[9][var1]) > 7) {
            switch(var7 -= 8) {
                case 0:
                    --var5;
                    break;
                case 1:
                    ++var5;
                    break;
                case 2:
                    --var6;
                    break;
                case 3:
                    ++var6;
            }
        }

        if (var2 == var5 && var3 == var6) {
            this.Q.ch[12][var1] = -1;
        } else {
            boolean var8 = false;
            boolean var9 = false;
            if (var2 < 0 || var3 < 0) {
                var8 = var2 < 0;
                var9 = var3 < 0;
                var2 = var5;
                var3 = var6;
            }

            int var10 = this.Q.fE + 2;
            int var11 = this.Q.fX + 2;
            short[][] var12 = new short[var10 + 1][var11 + 1];
            int var23 = this.Q.cL;
            long var24 = 2L;
            if (this.Q.ch[8][var1] == 1) {
                var24 = 0L;
            }

            this.Q.ch[12][var1] = -12;
            boolean var26 = false;
            short var27 = 0;
            short var28;
            if ((var28 = this.Q.ck[var2][var3]) > 0 && var28 <= this.Q.cU) {
                var27 = var28;
            }

            if (var28 >= 64 && var28 - 64 < this.Q.bg) {
                var27 = var28;
            }

            try {
                int var13;
                for(var13 = 0; var13 <= var10; ++var13) {
                    var12[var13][0] = 32767;
                    var12[var13][var11] = 32767;
                }

                int var14;
                for(var14 = 0; var14 <= var11; ++var14) {
                    var12[0][var14] = 32767;
                    var12[var10][var14] = 32767;
                }

                for(var14 = 0; var14 <= this.Q.fX; ++var14) {
                    for(var13 = 0; var13 <= this.Q.fE; ++var13) {
                        if (this.Q.a(var1, var13, var14, false, true) > 0) {
                            var12[var13 + 1][var14 + 1] = 32767;
                            if (var27 != 0 && this.Q.ck[var13][var14] == var27) {
                                var12[var13 + 1][var14 + 1] = 32766;
                            }

                            int var44;
                            if (var9 && this.Q.ck[var13][var14] >= 64 && this.Q.ck[var13][var14] - 64 < this.Q.bg && (var44 = this.Q.ck[var13][var14] - 64) >= 0 && var44 < this.Q.bg && this.Q.bZ[0][var44] == 3 && this.Q.bZ[5][var44] == this.Q.ch[8][var1]) {
                                var12[var13 + 1][var14 + 1] = 0;
                            }
                        } else {
                            var12[var13 + 1][var14 + 1] = 32766;
                            if (var8 && this.Q.cj[var13][var14] > 0) {
                                var12[var13 + 1][var14 + 1] = 0;
                            }
                        }
                    }
                }

                var12[var2 + 1][var3 + 1] = 0;
                var12[var5 + 1][var6 + 1] = 32765;
                boolean var15 = false;
                byte[] var32 = new byte[]{-1, 1, 0, 0};
                byte[] var33 = new byte[]{0, 0, -1, 1};
                int var18 = var32.length;
                int var43 = var23;

                int var17;
                for(var17 = 0; var17 < var18; ++var17) {
                    if (var12[var5 + 1 + var32[var17]][var6 + 1 + var33[var17]] <= 32766) {
                        var43 = 0;
                    }
                }

                short var19;
                label244:
                while(var43 < var23) {
                    if (var4) {
                        if (this.Q.dZ >= 0) {
                            this.Q.h(this.Q.dZ);
                            this.Q.dZ = -1;
                        }

                        if (this.Q.eY) {
                            k.y();
                            this.Q.eY = false;
                        }
                    }

                    boolean var34 = false;
                    int var36 = var2 + 1 - 3 - var43;
                    int var37 = var3 + 1 - 3 - var43;
                    int var38 = var2 + 1 + 3 + var43;
                    int var39 = var3 + 1 + 3 + var43;
                    if (var8 || var9) {
                        var36 = 0;
                        var38 = var10;
                        var37 = 0;
                        var39 = var11;
                    }

                    if (var36 < 0) {
                        var36 = 0;
                    }

                    if (var38 > var10) {
                        var38 = var10;
                    }

                    if (var37 < 0) {
                        var37 = 0;
                    }

                    if (var39 > var11) {
                        var39 = var11;
                    }

                    for(var14 = var37; var14 <= var39; ++var14) {
                        if ((b2 >= 0 || b2 == -100) && var24 > 0L) {
                            return;
                        }

                        for(var13 = var36; var13 <= var38; ++var13) {
                            if (var12[var13][var14] == var43) {
                                for(var17 = 0; var17 < var18; ++var17) {
                                    if ((var19 = var12[var13 + var32[var17]][var14 + var33[var17]]) == 32766) {
                                        var12[var13 + var32[var17]][var14 + var33[var17]] = (short)(var43 + 1);
                                        var34 = true;
                                    }

                                    if (var19 == 32765) {
                                        break label244;
                                    }
                                }
                            }
                        }
                    }

                    ++var43;
                    if (var4) {
                        switch(var43) {
                            case 80:
                            case 170:
                            case 249:
                                try {
                                    Thread.sleep(7L);
                                } catch (Exception var41) {
                                }

                                this.m();
                        }
                    }

                    if (!var34) {
                        var43 = var23;
                        break;
                    }
                }

                if (var43 >= var23) {
                    this.Q.ch[12][var1] = -10;
                    return;
                }

                int var16 = 0;
                var13 = var5 + 1;
                var14 = var6 + 1;
                int var21 = var13;
                int var22 = var14;
                short var20 = 32765;
                if (this.Q.ch[12][var1] < -9) {
                    byte[][] var45 = this.Q.cf;

                    for(byte[][] var35 = this.Q.cg; var16 < var23 && var20 > 0; ++var16) {
                        if (this.Q.ch[12][var1] >= -9) {
                            return;
                        }

                        for(var17 = 0; var17 < var18; ++var17) {
                            if ((var19 = var12[var13 + var32[var17]][var14 + var33[var17]]) < var20) {
                                var20 = var19;
                                var21 = var13 + var32[var17];
                                var22 = var14 + var33[var17];
                            }
                        }

                        var45[var16][var1] = (byte)(var21 - 1);
                        var35[var16][var1] = (byte)(var22 - 1);
                        var13 = var21;
                        var14 = var22;
                    }

                    this.v = var16;
                    this.Q.ch[12][var1] = 0;
                    this.Q.ch[13][var1] = var21 - 1;
                    this.Q.ch[14][var1] = var22 - 1;
                }
            } catch (Exception var42) {
            }

        }
    }

    private void b(int var1, int var2, int var3) {
        this.b(var1, var2, var3, true);
    }

    final int a(int var1, int var2, int var3, boolean var4) {
        this.v = -1;
        int var5 = this.Q.ch[12][var1];
        int var6 = this.Q.ch[13][var1];
        int var7 = this.Q.ch[14][var1];
        this.b(var1, var2, var3, var4);
        this.Q.ch[12][var1] = var5;
        this.Q.ch[13][var1] = var6;
        this.Q.ch[14][var1] = var7;
        return this.v;
    }

    static final void a(Graphics var0, int var1, int var2) {
        if (n2 != null) {
            int var3 = var0.getClipX();
            int var4 = var0.getClipY();
            int var5 = var0.getClipWidth();
            int var6 = var0.getClipHeight();
            int var7 = var0.getTranslateX();
            int var8 = var0.getTranslateY();
            var0.translate(-var7, -var8);
            var1 += var7;
            var2 += var8;
            var1 -= P >> 1;
            var2 -= p >> 1;

            try {
                if (Display.getDisplay(NET_Lizard.app).numAlphaLevels() > 1) {
                    var0.drawRGB(n2, 0, P, var1, var2, P, p, true);
                }
            } catch (Exception var10) {
            }

            var0.translate(var7, var8);
            var0.setClip(var3, var4, var5, var6);
        }
    }

    final void a(Graphics var1) {
        try {
            boolean var2 = this.a2 >= this.K >> 1;
            byte[][] var3 = this.Q.ci;
            int[][] var4 = this.Q.ch;
            int[][] var5 = this.Q.bZ;
            var1.setClip(this.z - 1, this.A - 1, this.y + 4, this.x + 4);
            if (var2) {
                var1.setColor(95, 0, 95);
                var1.fillRect(this.z - 1, this.A - 1 + this.x + 1, this.y + 2, 1);
                var1.fillRect(this.z - 1 + this.y + 1, this.A - 1, 1, this.x + 2);
                var1.setColor(255, 0, 255);
                var1.fillRect(this.z - 1, this.A - 1, this.y + 2, 1);
                var1.fillRect(this.z - 1, this.A - 1, 1, this.x + 2);
            }

            var1.setClip(this.z, this.A, this.y, this.x);
            int var7 = this.A + var1.getTranslateY();
            if (k.b(this.z, var7, this.y, this.x)) {
                this.Q.fy = (k.fF - this.z) / this.B;
                this.Q.fQ = (k.fZ - var7) / this.B;
                this.Q.fA = this.Q.fy;
                this.Q.fS = this.Q.fQ;
                this.Q.fz = this.Q.fy;
                this.Q.fR = this.Q.fQ;
                this.Q.r();
                this.Q.fK = this.Q.fJ;
                this.Q.ge = this.Q.gd;
            }

            boolean var12 = true;
            if (this.R != null && this.B == this.C) {
                try {
                    var1.drawRGB(this.R, 0, this.y, this.z, this.A, this.y, this.x, true);
                    var12 = false;
                    F = true;
                } catch (Exception var15) {
                    F = false;
                }
            }

            if (var12) {
                var1.setColor(9474192);
                if (var2) {
                    var1.fillRect(this.z, this.A, this.y, this.x);
                }
            }

            int var8;
            int var9;
            int var10;
            int var11;
            for(int var13 = 0; var13 < this.Q.bg; ++var13) {
                if (var5[0][var13] > 0 && (!k.s() || var3 == null || var3[var5[1][var13]][var5[2][var13]] != 0)) {
                    var10 = var5[3][var13] * this.B;
                    var11 = var5[4][var13] * this.B;
                    var8 = this.z + var5[1][var13] * this.B;
                    var9 = this.A + var5[2][var13] * this.B;
                    if (k.f(this.Q.bZ[5][var13]) > 1) {
                        var1.setColor(255);
                    } else {
                        var1.setColor(16711680);
                    }

                    if (var2) {
                        var1.fillRect(var8, var9, var10, var11);
                    }
                }
            }

            var10 = this.B;
            var11 = this.B;

            for(int var14 = 0; var14 < this.Q.cU; ++var14) {
                if (var4[0][var14] > 0 && (var4[29][var14] <= 0 || var4[0][var14] == 8) && (!k.s() || var3 == null || var3[var4[1][var14]][var4[2][var14]] != 0)) {
                    var8 = this.z + var4[1][var14] * this.B;
                    var9 = this.A + var4[2][var14] * this.B;
                    if (k.f(var4[8][var14]) > 1) {
                        var1.setColor(255);
                    } else {
                        var1.setColor(16711680);
                    }

                    if (var2) {
                        var1.fillRect(var8, var9, var10, var11);
                    }
                }
            }

            var8 = this.z + this.Q.fJ * this.B;
            var9 = this.A + this.Q.gd * this.B;
            var10 = this.d2 - 1;
            var11 = this.c2 - 1;
            var1.setColor(16776960);
            if (var2) {
                var1.drawRect(var8, var9, var10, var11);
            }
        } catch (Exception var16) {
        }

        var1.setClip(0, 0, this.Q.screenWidth, this.Q.bx);
    }

    private static void n() {
        k.da = false;
        int var0 = 0;

        while(!k.da) {
            ++var0;
            if (var0 >= 500) {
                break;
            }

            try {
                Thread.sleep(5L);
            } catch (Exception var2) {
            }
        }

    }

    private final void d(int var1, int var2) {
        for(int var3 = 0; this.m2 > 0 && this.k2 > 0 && var3 < this.Q.bg; ++var3) {
            int var4;
            if ((var4 = this.g()) < 0) {
                return;
            }

            int var5 = this.Q.ch[1][var4];
            int var6 = this.Q.ch[2][var4];
            int var9 = 100;
            int var10 = 100000;
            int var11 = -1;

            for(int var12 = 0; var12 < this.Q.bg; ++var12) {
                if (this.Q.bZ[0][var12] > 0 && this.Q.bZ[5][var12] == var1 && this.Q.bZ[7][var12] <= 0) {
                    int var7 = Math.abs(this.Q.bZ[1][var12] - var5);
                    int var8;
                    if ((var8 = Math.abs(this.Q.bZ[1][var12] - var6)) > var7) {
                        var7 = var8;
                    }

                    boolean var13 = false;
                    int[] var14;
                    if (var1 == 2) {
                        var13 = (var14 = this.a(this.Q.bZ[1][var12], this.Q.bZ[2][var12]))[0] > var14[2] || var14[1] > var14[3];
                    }

                    if (var1 < 2 || var13) {
                        if (var1 != 1) {
                            if (var7 < var9) {
                                var9 = var7;
                                var11 = var12;
                            }
                        } else {
                            int var15;
                            if ((var15 = (var14 = this.a(this.Q.bZ[1][var12], this.Q.bZ[2][var12]))[1] - var14[3]) < var10 || var13) {
                                var10 = var15;
                                var11 = var12;
                            }
                        }
                    }
                }
            }

            if (var11 >= 0) {
                this.b(var11, var2);
                this.Q.bZ[7][var11] = 1;
            }
        }

    }

    private final void o() {
        for(int var1 = 0; var1 < this.Q.cU; ++var1) {
            try {
                if (this.Q.ch[0][var1] == 8 && this.Q.ch[8][var1] == 2 && this.Q.ch[7][var1] <= 0 && this.Q.ch[9][var1] < 8) {
                    int[] var2 = new int[]{1000, 1000, 1000};
                    int var3 = -1;

                    int var5;
                    int var6;
                    for(int var4 = 0; var4 < this.Q.bg; ++var4) {
                        if (this.Q.bZ[0][var4] > 0 && (this.Q.bZ[5][var4] == 1 || this.Q.bZ[5][var4] == 2)) {
                            var5 = Math.abs(this.Q.ch[1][var1] - this.Q.bZ[1][var4]);
                            var6 = Math.abs(this.Q.ch[2][var1] - this.Q.bZ[2][var4]);
                            if (var5 < var6) {
                                var5 = var6;
                            }

                            if (var2[this.Q.bZ[5][var4]] > var5) {
                                var2[this.Q.bZ[5][var4]] = var5;
                                if (this.Q.bZ[5][var4] == 2) {
                                    var3 = var4;
                                }
                            }
                        }
                    }

                    if (var2[2] < var2[1] && this.Q.ch[27][var1] < 8) {
                        if (this.Q.ch[12][var1] < 0) {
                            this.Q.ch[17][var1] = 0;
                        }

                        for(var5 = 0; var5 < 8 && (var6 = this.a(this.Q.ch[1][var1], this.Q.ch[2][var1], 2, 3, var1, var2[1] >> 1)) >= 0; ++var5) {
                            this.a(var6, var1, 2);
                        }
                    }

                    if (this.Q.ch[27][var1] >= 8) {
                        for(var5 = 0; var5 < this.Q.cU; ++var5) {
                            if (this.Q.ch[7][var5] == var1 + 1) {
                                this.Q.ch[7][var5] = 0;
                                this.Q.ch[17][var5] = 0;
                            }
                        }
                    }

                    if ((var2[1] < var2[2] || this.Q.ch[27][var1] <= 0 && var2[2] > 5) && (var2[1] <= 4 || this.Q.ch[27][var1] <= 0)) {
                        if (this.Q.ch[27][var1] > 0) {
                            this.Q.a(var1, false);
                            this.Q.ch[17][var1] = 0;
                        }

                        if (var3 >= 0 && this.Q.ch[17][var1] < 4) {
                            this.a(var1, var3 + 64, 4);
                        }
                    }
                }
            } catch (Exception var7) {
            }
        }

    }
}
