//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class d {
    int a3;
    boolean b3 = true;
    short[][] c3;
    Image fontImage;
    int e3 = 1;
    int f3 = 1;
    boolean g3 = false;
    boolean h3 = false;
    final byte[] i3 = new byte[]{70, 4, 71, 0, 0, 0, 83, 72, 73, 8, 74, 75, 85, 10, 76, 77, 0, 82, 0, 12, 78, 0, 2, 0, 0, 79, 16, 80, 3, 17, 0, 1, 91, -4, 92, 0, 0, 0, 104, 93, 94, -8, 95, 96, 106, -10, 97, 98, 0, 103, 0, -12, 99, 0, -2, 0, 0, 100, -16, 101, -3, -17, -1, 102, 0, 0, 5, -5, 19, -19, 20, -20, 0, 0, 0, 0, 6, -6, 7, -7, 0, 0, 0, 0, 0, 0, 0, 0, 21, -21, 9, -9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22, -22, 23, -23, 0, 0, 11, -11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 84, 105, 0, 0, 0, 0, 13, -13, 24, -24, 0, 0, 0, 0, 14, -14, 0, 0, 15, -15, 0, 0, 0, 0, 0, 0, 0, 0, 27, -27, 0, 0, 0, 0, 0, 0, 0, 0, 81, 25, -25, 26, -26, 18, -18, 0, 0, 0};
    int j3 = 127;
    String k3 = "";
    String l3 = "";
    boolean m3 = true;
    boolean n3 = true;

    public d() {
    }

    private final int[] a(String var1, int var2, int var3, int var4) {
        int[] var5 = new int[2];
        int var6 = this.a3;
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
        if (var1 != '\n' && var1 != '\r') {
            int var2;
            if ((var2 = this.a((int)var1)) >= this.c3.length) {
                var2 = 0;
            }

            return this.e3 + this.c3[var2][2];
        } else {
            return 0;
        }
    }

    private final void c() {
        byte[] var4 = AssetManager.instanceHandler.readDataChunkFromFile("cf" + this.k3, -1);
        byte var5 = 6;
        int var6 = var4.length / var5;
        if (var4.length != var6 * var5) {
            var5 = 7;
            var6 = var4.length / var5;
            if (var4.length == var6 * var5) {
                if (this.fontImage != null) {
                    if (this.fontImage.getWidth() > this.fontImage.getHeight()) {
                        this.g3 = true;
                    } else {
                        this.h3 = true;
                    }
                }
            } else {
                var5 = 8;
                var6 = var4.length / var5;
                if (var4.length == var6 * var5) {
                    this.g3 = true;
                    this.h3 = true;
                }
            }
        }

        if (this.j3 < var6) {
            this.j3 = var6;
        }

        this.c3 = new short[this.j3 + 2][6];
        int var3 = 0;

        short[] var10000;
        for(int var2 = 0; var2 < this.j3; ++var2) {
            for(int var1 = 0; var1 < 6; ++var1) {
                this.c3[var2][var1] = (short)var4[var3];
                ++var3;
                if (var1 == 0 && this.g3) {
                    this.c3[var2][var1] = (short)((this.c3[var2][var1] << 8) + var4[var3]);
                    ++var3;
                }

                if (var1 == 1 && this.h3) {
                    this.c3[var2][var1] = (short)((this.c3[var2][var1] << 8) + var4[var3]);
                    ++var3;
                }
            }

            if (this.c3[var2][0] < 0) {
                var10000 = this.c3[var2];
                var10000[0] = (short)(var10000[0] + 256);
            }

            if (this.c3[var2][1] < 0) {
                var10000 = this.c3[var2];
                var10000[1] = (short)(var10000[1] + 256);
            }

            if (var3 >= var4.length) {
                break;
            }
        }

        if (this.c3[0][2] == 0) {
            this.c3[0][2] = this.c3[16][2];
        }

        if (this.c3[0][2] == 0) {
            this.c3[0][2] = this.c3[33][2];
        }

        this.c3[0][3] = 0;
        int var10;
        int var12;
        if (var6 < 146) {
            this.m3 = false;
            this.n3 = false;
            this.b3 = false;
        } else {
            this.m3 = true;
            this.n3 = true;
            this.b3 = true;

            try {
                int var7 = 33;

                int var9;
                for(int var8 = 100; var8 <= 125; ++var8) {
                    if (this.c3[var8][2] == 0) {
                        for(var9 = 0; var9 < this.c3[var8].length; ++var9) {
                            this.c3[var8][var9] = this.c3[var7][var9];
                        }
                    }

                    ++var7;
                }

                var7 = 64;

                for(var9 = 131; var9 <= 162; ++var9) {
                    if (this.c3[var9][2] == 0) {
                        for(var10 = 0; var10 < this.c3[var9].length; ++var10) {
                            this.c3[var9][var10] = this.c3[var7][var10];
                        }
                    }

                    ++var7;
                }

                var7 = 165;

                int var11;
                for(var10 = 201; var10 <= 228; ++var10) {
                    if (this.c3[var10][2] == 0) {
                        for(var11 = 0; var11 < this.c3[var10].length; ++var11) {
                            this.c3[var10][var11] = this.c3[var7][var11];
                        }
                    }

                    ++var7;
                }

                var7 = 235;

                for(var11 = 256; var11 <= 271; ++var11) {
                    if (this.c3[var11][2] == 0) {
                        for(var12 = 0; var12 < this.c3[var11].length; ++var12) {
                            this.c3[var11][var12] = this.c3[var7][var12];
                        }
                    }

                    ++var7;
                }
            } catch (Exception var27) {
            }
        }

        this.a3 = this.c3[this.a((int)1062)][3];
        short var29 = 0;
        long var28 = 0L;
        var10 = 0;
        int[] var30 = new int[3];

        int var15;
        int var16;
        for(var12 = 0; var12 < var30.length; ++var12) {
            boolean var13 = false;
            short var14 = 0;
            var15 = 0;

            for(var16 = 65; var16 <= 90; ++var16) {
                if (var16 != var30[0] && var16 != var30[1] && var16 != var30[2]) {
                    short var31 = this.c3[this.a(var16)][3];
                    if (var14 < var31) {
                        var14 = var31;
                        var15 = var16;
                    }
                }
            }

            var30[var12] = var15;
        }

        int var32 = 100;
        int var33 = -100;

        int var17;
        int var18;
        for(var15 = 65; var15 <= 90; ++var15) {
            if (var15 != 81 && var15 != 74 && var15 != var30[0] && var15 != var30[1] && var15 != var30[2]) {
                var28 += (long)this.c3[this.a(var15)][3];
                if (var29 < this.c3[this.a(var15)][3]) {
                    var29 = this.c3[this.a(var15)][3];
                }

                ++var10;
                var16 = this.a(var15);
                var17 = -this.c3[var16][5];
                var18 = -(this.c3[var16][3] + this.c3[var16][5]);
                if (var33 < var17) {
                    var33 = var17;
                }

                if (var32 > var18) {
                    var32 = var18;
                }
            }
        }

        var16 = var33 - var32;
        this.a3 = (int)(var28 / (long)var10);
        this.a3 = var29;
        this.a3 = var16;
        var32 = 100;
        var33 = -100;

        int var19;
        for(var17 = 0; var17 < this.c3.length; ++var17) {
            var18 = -this.c3[var17][5];
            var19 = -(this.c3[var17][3] + this.c3[var17][5]);
            if (var33 < var18) {
                var33 = var18;
            }

            if (var32 > var19) {
                var32 = var19;
            }
        }

        var16 = var33 - var32;
        if (this.a3 > var16) {
            this.a3 = var16;
        }

        var19 = -var32 - this.a3;
        int var20 = var33 + var19 >> 1;
        int var21;
        if ((var21 = var19 - var20) != 0) {
            for(int var22 = 0; var22 < this.c3.length; ++var22) {
                var10000 = this.c3[var22];
                var10000[5] = (short)(var10000[5] - var21);
            }
        }

        var32 = 100;
        var33 = -100;

        int var24;
        for(int var23 = 65; var23 <= 90; ++var23) {
            if (var23 != var30[0] && var23 != var30[1] && var23 != var30[2]) {
                var24 = this.a(var23);
                int var25 = -this.c3[var24][5];
                int var26 = -(this.c3[var24][3] + this.c3[var24][5]);
                if (var33 < var25) {
                    var33 = var25;
                }

                if (var32 > var26) {
                    var32 = var26;
                }
            }
        }

        int var34 = var33 - var32;
        var19 = -var32 - this.a3;
        var20 = var33 + var19 >> 1;
        if ((var21 = var19 - var20) != 0) {
            for(var24 = 0; var24 < this.c3.length; ++var24) {
                var10000 = this.c3[var24];
                var10000[5] = (short)(var10000[5] - var21);
            }
        }

    }

    private final void loadFontImage() {
        try {
            this.fontImage = AssetManager.readImageFromFilePNG("/fnt" + this.l3 + ".png");
        } catch (Exception ignore) {
        }
    }

    public final int a(Graphics var1, char var2, int var3, int var4) {
        int var5 = var1.getClipX();
        int var6 = var1.getClipY();
        int var7 = var1.getClipWidth();
        int var8 = var1.getClipHeight();
        int var9;
        if ((var9 = this.a((int)var2)) >= this.c3.length) {
            var9 = 0;
        }

        short[] var10;
        short var11 = (var10 = this.c3[var9])[3];
        var3 += var10[4];
        var4 -= var10[5] + var11;
        int var12 = var10[2];
        int var13 = var10[3];
        int var14 = var3;
        int var15 = var4;
        if (var3 < var5) {
            var12 -= var5 - var3;
            var14 = var5;
        }

        if (var4 < var6) {
            var13 -= var6 - var4;
            var15 = var6;
        }

        if (var14 + var12 > var5 + var7) {
            var12 = var5 + var7 - var14;
        }

        if (var15 + var13 > var6 + var8) {
            var13 = var6 + var8 - var15;
        }

        if (var12 > 0 && var13 > 0) {
            var1.setClip(var14, var15, var12, var13);
            var1.drawImage(this.fontImage, var3 - var10[0], var4 - var10[1], 20);
        }

        var1.setClip(var5, var6, var7, var8);
        return this.a(var2);
    }

    public final void a(Graphics var1, String var2, int var3, int var4, int var5) {
        this.a(var1, var2, 0, var2.length(), var3, var4, var5);
    }

    public final void a(Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var5;
        int var9 = var6 + this.a3;
        if (var7 != 0 && var7 != 20) {
            int[] var10 = this.a(var2, var7, var3, var4);
            var8 = var5 + var10[0];
            var9 += var10[1];
        }

        int var25 = var1.getClipX();
        int var11 = var1.getClipY();
        int var12 = var1.getClipWidth();
        int var13 = var1.getClipHeight();

        for(int var14 = var3; var14 < var3 + var4; ++var14) {
            char var15 = var2.charAt(var14);
            int var16;
            if ((var16 = this.a((int)var15)) >= this.c3.length) {
                var16 = 0;
            }

            short[] var17;
            short var18 = (var17 = this.c3[var16])[3];
            int var19 = var8 + var17[4];
            int var20 = var9 - (var17[5] + var18);
            int var21 = var17[2];
            int var22 = var17[3];
            int var23 = var19;
            int var24 = var20;
            if (var19 < var25) {
                var21 -= var25 - var19;
                var23 = var25;
            }

            if (var20 < var11) {
                var22 -= var11 - var20;
                var24 = var11;
            }

            if (var23 + var21 > var25 + var12) {
                var21 = var25 + var12 - var23;
            }

            if (var24 + var22 > var11 + var13) {
                var22 = var11 + var13 - var24;
            }

            if (var21 > 0 && var22 > 0) {
                var1.setClip(var23, var24, var21, var22);
                var1.drawImage(this.fontImage, var19 - var17[0], var20 - var17[1], 20);
            }

            if (var15 != '\n' && var15 != '\r') {
                var8 += var17[2] + this.e3;
            }
        }

        var1.setClip(var25, var11, var12, var13);
    }

    public static d getInstance() {
        d instance;
        (instance = new d()).fontImage = null;
        instance.loadFontImage();
        instance.c3 = null;
        instance.c();
        return instance;
    }

    public final int b() {
        return this.f3 + this.a3;
    }

    private int a(int var1) {
        int var2 = var1;
        if (var1 == 946) {
            var2 = 223;
        }

        if (var2 == 161) {
            return 277;
        } else if (var2 == 191) {
            return 278;
        } else if (var2 >= 192 && var2 - 192 < this.i3.length) {
            byte var3;
            short var4;
            if ((var3 = this.i3[var2 - 192]) >= 0 && var2 != 228) {
                var4 = 100;
                if (this.b3) {
                    var4 = 165;
                }

                return var4 + var3;
            } else {
                int var5 = -var3;
                var4 = 100;
                if (this.b3) {
                    var4 = 201;
                }

                return var4 + var5;
            }
        } else {
            if (var2 > 848) {
                var2 -= 848;
            }

            if (var2 >= 97 && var2 <= 122) {
                if (this.m3) {
                    var2 += 35;
                } else {
                    var2 -= 32;
                }
            } else if (var2 >= 192 && var2 <= 223) {
                var2 -= 96;
            } else if (var2 >= 224 && var2 <= 255) {
                if (this.n3) {
                    var2 -= 61;
                } else {
                    var2 -= 128;
                }
            } else if (var2 >= 154 && var2 <= 191) {
                var2 -= 26;
            }

            var2 -= 32;
            if (var2 < 0 || var2 >= this.j3) {
                var2 = 0;
            }

            return var2;
        }
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

        for(int var5 = 0; var5 < var3 && var5 + var2 < var1.length(); ++var5) {
            var4 += this.a(var1.charAt(var5 + var2));
        }

        return var4;
    }
}
