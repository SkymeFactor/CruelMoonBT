import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// Game text renderer
public final class TextRenderer {
    int a3;
    boolean b3 = true;
    short[][] fntTextureMapping;
    Image fontTexture;
    int e3 = 1;
    int f3 = 1;
    boolean g3 = false;
    boolean h3 = false;
    final byte[] i3 = new byte[]{
            70, 4, 71, 0, 0, 0, 83, 72, 73, 8, 74, 75, 85, 10, 76, 77, 0, 82, 0, 12, 78, 0, 2,
            0, 0, 79, 16, 80, 3, 17, 0, 1, 91, -4, 92, 0, 0, 0, 104, 93, 94, -8, 95, 96, 106,
            -10, 97, 98, 0, 103, 0, -12, 99, 0, -2, 0, 0, 100, -16, 101, -3, -17, -1, 102, 0,
            0, 5, -5, 19, -19, 20, -20, 0, 0, 0, 0, 6, -6, 7, -7, 0, 0, 0, 0, 0, 0, 0, 0, 21,
            -21, 9, -9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 22, -22, 23, -23, 0, 0, 11, -11, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 84, 105, 0, 0, 0, 0, 13, -13, 24, -24, 0, 0, 0, 0, 14, -14, 0, 0, 15,
            -15, 0, 0, 0, 0, 0, 0, 0, 0, 27, -27, 0, 0, 0, 0, 0, 0, 0, 0, 81, 25, -25, 26, -26,
            18, -18, 0, 0, 0
    };
    int fntTextureMappingSize = 127;
    String fntMappingIdx = "";
    String fntTextureIdx = "";
    boolean m3 = true;
    boolean n3 = true;

    public TextRenderer() {
    }

    private final int[] getAlignedOrigin(String str, int anchor, int from, int to) {
        int[] alignedOrigin = new int[2];
        int yOffset = this.a3;
        int xOffset = this.getSubstringWidth(str, from, to);
        if ((anchor & Graphics.BOTTOM) > 0) {
            alignedOrigin[1] -= yOffset;
        }

        if ((anchor & Graphics.VCENTER) > 0) {
            alignedOrigin[1] -= yOffset >> 1;
        }

        if ((anchor & Graphics.RIGHT) > 0) {
            alignedOrigin[0] -= xOffset;
        }

        if ((anchor & Graphics.HCENTER) > 0) {
            alignedOrigin[0] -= xOffset >> 1;
        }

        return alignedOrigin;
    }

    public final int getCharWidth(char ch) {
        if (ch != '\n' && ch != '\r') {
            int textureIndex;
            if ((textureIndex = this.getCharTextureIndex((int)ch)) >= this.fntTextureMapping.length) {
                textureIndex = 0;
            }

            return this.e3 + this.fntTextureMapping[textureIndex][2];
        } else {
            return 0;
        }
    }

    private final void c() {
        byte[] var4 = AssetManager.instanceHandler.readDataChunkFromFile("cf" + this.fntMappingIdx, -1);
        byte var5 = 6;
        int var6 = var4.length / var5;
        if (var4.length != var6 * var5) {
            var5 = 7;
            var6 = var4.length / var5;
            if (var4.length == var6 * var5) {
                if (this.fontTexture != null) {
                    if (this.fontTexture.getWidth() > this.fontTexture.getHeight()) {
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

        if (this.fntTextureMappingSize < var6) {
            this.fntTextureMappingSize = var6;
        }

        this.fntTextureMapping = new short[this.fntTextureMappingSize + 2][6];
        int var3 = 0;

        short[] var10000;

        // Fill the cfDecoded array
        for(int i = 0; i < this.fntTextureMappingSize; ++i) {
            for(int j = 0; j < 6; ++j) {
                this.fntTextureMapping[i][j] = (short)var4[var3];
                ++var3;
                if (j == 0 && this.g3) {
                    this.fntTextureMapping[i][j] = (short)((this.fntTextureMapping[i][j] << 8) + var4[var3]);
                    ++var3;
                }

                if (j == 1 && this.h3) {
                    this.fntTextureMapping[i][j] = (short)((this.fntTextureMapping[i][j] << 8) + var4[var3]);
                    ++var3;
                }
            }

            if (this.fntTextureMapping[i][0] < 0) {
                var10000 = this.fntTextureMapping[i];
                var10000[0] = (short)(var10000[0] + 256);
            }

            if (this.fntTextureMapping[i][1] < 0) {
                var10000 = this.fntTextureMapping[i];
                var10000[1] = (short)(var10000[1] + 256);
            }

            if (var3 >= var4.length) {
                break;
            }
        }

        if (this.fntTextureMapping[0][2] == 0) {    // True
            this.fntTextureMapping[0][2] = this.fntTextureMapping[16][2];
        }

        if (this.fntTextureMapping[0][2] == 0) {    // False
            this.fntTextureMapping[0][2] = this.fntTextureMapping[33][2];
        }

        this.fntTextureMapping[0][3] = 0;
        int var10;
        int var12;
        if (var6 < 146) {   // False
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
                for(int i = 100; i <= 125; ++i) {
                    if (this.fntTextureMapping[i][2] == 0) {
                        for(var9 = 0; var9 < this.fntTextureMapping[i].length; ++var9) {
                            this.fntTextureMapping[i][var9] = this.fntTextureMapping[var7][var9];
                        }
                    }

                    ++var7;
                }

                var7 = 64;

                for(var9 = 131; var9 <= 162; ++var9) {
                    if (this.fntTextureMapping[var9][2] == 0) {
                        for(var10 = 0; var10 < this.fntTextureMapping[var9].length; ++var10) {
                            this.fntTextureMapping[var9][var10] = this.fntTextureMapping[var7][var10];
                        }
                    }

                    ++var7;
                }

                var7 = 165;

                int var11;
                for(var10 = 201; var10 <= 228; ++var10) {
                    if (this.fntTextureMapping[var10][2] == 0) {
                        for(var11 = 0; var11 < this.fntTextureMapping[var10].length; ++var11) {
                            this.fntTextureMapping[var10][var11] = this.fntTextureMapping[var7][var11];
                        }
                    }

                    ++var7;
                }

                var7 = 235;

                for(var11 = 256; var11 <= 271; ++var11) {
                    if (this.fntTextureMapping[var11][2] == 0) {
                        for(var12 = 0; var12 < this.fntTextureMapping[var11].length; ++var12) {
                            this.fntTextureMapping[var11][var12] = this.fntTextureMapping[var7][var12];
                        }
                    }

                    ++var7;
                }
            } catch (Exception var27) {
            }
        }

        this.a3 = this.fntTextureMapping[this.getCharTextureIndex((int)1062)][3];
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
                    short var31 = this.fntTextureMapping[this.getCharTextureIndex(var16)][3];
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
                var28 += (long)this.fntTextureMapping[this.getCharTextureIndex(var15)][3];
                if (var29 < this.fntTextureMapping[this.getCharTextureIndex(var15)][3]) {
                    var29 = this.fntTextureMapping[this.getCharTextureIndex(var15)][3];
                }

                ++var10;
                var16 = this.getCharTextureIndex(var15);
                var17 = -this.fntTextureMapping[var16][5];
                var18 = -(this.fntTextureMapping[var16][3] + this.fntTextureMapping[var16][5]);
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
        for(var17 = 0; var17 < this.fntTextureMapping.length; ++var17) {
            var18 = -this.fntTextureMapping[var17][5];
            var19 = -(this.fntTextureMapping[var17][3] + this.fntTextureMapping[var17][5]);
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
            for(int var22 = 0; var22 < this.fntTextureMapping.length; ++var22) {
                var10000 = this.fntTextureMapping[var22];
                var10000[5] = (short)(var10000[5] - var21);
            }
        }

        var32 = 100;
        var33 = -100;

        int var24;
        for(int var23 = 65; var23 <= 90; ++var23) {
            if (var23 != var30[0] && var23 != var30[1] && var23 != var30[2]) {
                var24 = this.getCharTextureIndex(var23);
                int var25 = -this.fntTextureMapping[var24][5];
                int var26 = -(this.fntTextureMapping[var24][3] + this.fntTextureMapping[var24][5]);
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
            for(var24 = 0; var24 < this.fntTextureMapping.length; ++var24) {
                var10000 = this.fntTextureMapping[var24];
                var10000[5] = (short)(var10000[5] - var21);
            }
        }

    }

    private final void loadFontTexture() {
        try {
            this.fontTexture = AssetManager.readImageFromFilePNG("/fnt" + this.fntTextureIdx + ".png");
        } catch (Exception ignore) {
        }
    }

    public final int a(Graphics var1, char var2, int var3, int var4) {
        int var5 = var1.getClipX();
        int var6 = var1.getClipY();
        int var7 = var1.getClipWidth();
        int var8 = var1.getClipHeight();
        int var9;
        if ((var9 = this.getCharTextureIndex((int)var2)) >= this.fntTextureMapping.length) {
            var9 = 0;
        }

        short[] var10;
        short var11 = (var10 = this.fntTextureMapping[var9])[3];
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
            var1.drawImage(this.fontTexture, var3 - var10[0], var4 - var10[1], 20);
        }

        var1.setClip(var5, var6, var7, var8);
        return this.getCharWidth(var2);
    }

    public final void drawString(Graphics graphics, String str, int x, int y, int anchor) {
        this.drawSubstring(graphics, str, 0, str.length(), x, y, anchor);
    }

    public final void drawSubstring(Graphics graphics, String str, int from, int to, int x, int y, int anchor) {
        int var8 = x;
        int var9 = y + this.a3;
        if (anchor != 0 && anchor != 20) {
            int[] var10 = this.getAlignedOrigin(str, anchor, from, to);
            var8 = x + var10[0];
            var9 += var10[1];
        }

        int var25 = graphics.getClipX();
        int var11 = graphics.getClipY();
        int var12 = graphics.getClipWidth();
        int var13 = graphics.getClipHeight();

        for(int var14 = from; var14 < from + to; ++var14) {
            char letter = str.charAt(var14);
            int var16;
            if ((var16 = this.getCharTextureIndex((int)letter)) >= this.fntTextureMapping.length) {
                var16 = 0;
            }

            short[] var17;
            short var18 = (var17 = this.fntTextureMapping[var16])[3];
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
                graphics.setClip(var23, var24, var21, var22);
                graphics.drawImage(this.fontTexture, var19 - var17[0], var20 - var17[1], 20);
            }

            if (letter != '\n' && letter != '\r') {
                var8 += var17[2] + this.e3;
            }
        }

        graphics.setClip(var25, var11, var12, var13);
    }

    public static TextRenderer getInstance() {
        TextRenderer instance;
        (instance = new TextRenderer()).fontTexture = null;
        instance.loadFontTexture();
        instance.fntTextureMapping = null;
        instance.c();
        return instance;
    }

    public final int b() {
        return this.f3 + this.a3;
    }

    private int getCharTextureIndex(int ch) {
        int textureIndex = ch;
        if (ch == 946) {
            textureIndex = 223;
        }

        if (textureIndex == 161) {
            return 277;
        } else if (textureIndex == 191) {
            return 278;
        } else if (textureIndex >= 192 && textureIndex - 192 < this.i3.length) {
            byte var3;
            short var4;
            if ((var3 = this.i3[textureIndex - 192]) >= 0 && textureIndex != 228) {
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
            if (textureIndex > 848) {
                textureIndex -= 848;
            }

            if (textureIndex >= 97 && textureIndex <= 122) {
                if (this.m3) {
                    textureIndex += 35;
                } else {
                    textureIndex -= 32;
                }
            } else if (textureIndex >= 192 && textureIndex <= 223) {
                textureIndex -= 96;
            } else if (textureIndex >= 224 && textureIndex <= 255) {
                if (this.n3) {
                    textureIndex -= 61;
                } else {
                    textureIndex -= 128;
                }
            } else if (textureIndex >= 154 && textureIndex <= 191) {
                textureIndex -= 26;
            }

            textureIndex -= 32;
            if (textureIndex < 0 || textureIndex >= this.fntTextureMappingSize) {
                textureIndex = 0;
            }

            return textureIndex;
        }
    }

    public final int getStringWidth(String str) {
        int stringWidth = 0;
        int stringLength = str.length();

        for(int i = 0; i < stringLength; ++i) {
            stringWidth += this.getCharWidth(str.charAt(i));
        }

        return stringWidth;
    }

    private int getSubstringWidth(String str, int from, int to) {
        int substringWidth = 0;

        for(int i = 0; i < to && i + from < str.length(); ++i) {
            substringWidth += this.getCharWidth(str.charAt(i + from));
        }

        return substringWidth;
    }
}
