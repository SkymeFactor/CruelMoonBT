//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class a extends Canvas {
    static int[] a5;
    private static boolean b5 = true;
    private static boolean c5 = false;
    private static boolean d5 = false;

    public a() {
        this.setFullScreenMode(true);
    }

    static final void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = var0.getTranslateX();
        int var8 = var0.getTranslateY();
        var0.translate(-var7, -var8);
        var1 += var7;
        var2 += var8;
        int var10 = 2880;
        if (a5 != null && 2880 < a5.length) {
            var10 = a5.length;
        }

        boolean var11 = true;

        int var12;
        try {
            var12 = var5 + (var6 << 24);
            if (Display.getDisplay(NET_Lizard.app).numAlphaLevels() > 2) {
                int var14;
                if (a5 == null || a5.length != var10 || a5[0] != var12) {
                    if (a5 == null || a5.length != var10) {
                        if (a5 != null) {
                            a5 = null;
                        }

                        a5 = new int[var10];
                    }

                    int[] var13 = a5;

                    for(var14 = 0; var14 < var13.length; ++var14) {
                        var13[var14] = var12;
                    }
                }

                int var23 = var0.getClipX();
                var14 = var0.getClipY();
                int var15 = var0.getClipWidth();
                int var16 = var0.getClipHeight();
                int var17 = var1;
                int var18 = var2;
                if (var1 < var23) {
                    var3 -= var23 - var1;
                    var17 = var23;
                }

                if (var2 < var14) {
                    var4 -= var14 - var2;
                    var18 = var14;
                }

                if (var17 + var3 > var23 + var15) {
                    var3 = var23 + var15 - var17;
                }

                if (var18 + var4 > var14 + var16) {
                    var4 = var14 + var16 - var18;
                }

                try {
                    if (var3 > 0 && var4 > 0) {
                        var0.setClip(var17, var18, var3, var4);

                        for(int var19 = var18; var19 < var18 + var4; var19 += 8) {
                            var0.drawRGB(a5, 0, 360, 0, var19, 360, 8, true);
                        }
                    }

                    var11 = false;
                } catch (Exception var21) {
                }

                var0.setClip(var23, var14, var15, var16);
            }
        } catch (Exception var22) {
        }

        if (var11) {
            try {
                var12 = var0.getColor();
                var0.setColor(var5);
                var0.fillRect(var1, var2, var3, var4);
                var0.setColor(var12);
            } catch (Exception var20) {
            }
        }

        var0.translate(var7, var8);
    }

    public int getHeight() {
        return 640;
    }

    public int getWidth() {
        return 360;
    }

    static final int a(int var0) {
        int var1 = var0;
        switch(var0) {
            case -203:
            case -22:
            case -7:
            case -4:
            case 22:
                var0 = -7;
                break;
            case -202:
            case -21:
            case -6:
            case -1:
            case 21:
                var0 = -6;
        }

        if (b5) {
            b5 = false;

            try {
                Class.forName("com.siemens.mp.media.control.VolumeControl");
                d5 = true;
            } catch (Exception var5) {
            }

            try {
                Class.forName("com.nokia.mid.ui.FullCanvas");
                c5 = true;
            } catch (Exception var4) {
            }

            try {
                Class.forName("com.samsung.util.AudioClip");
                c5 = true;
            } catch (Exception var3) {
            }
        }

        if (d5) {
            if (var0 == -1) {
                return -6;
            }

            if (var0 == -4) {
                return -7;
            }
        }

        if (c5) {
            if (var0 == -6) {
                return -6;
            }

            if (var0 == -7) {
                return -7;
            }

            if (var0 == 10) {
                return -5;
            }
        }

        // Additional Game Actions:
        // 42 - KEY_STAR
        // 35 - KEY_POUND
        // 48 - KEY_NUM0
        // 57 - KEY_NUM9
        try {
            if (var0 != 42 & var0 != 35 && (var0 < 48 || var0 > 57)) {
                switch(NET_Lizard.c_nl.getGameAction(var1)) {
                    case 1: // UP
                        var0 = -1;
                        break;
                    case 2: // LEFT
                        var0 = -3;
                    case 3:
                    case 4:
                    case 7:
                    default:
                        break;
                    case 5: // RIGHT
                        var0 = -4;
                        break;
                    case 6: // DOWN
                        var0 = -2;
                        break;
                    case 8: // FIRE
                        var0 = -5;
                }
            }
        } catch (Exception var6) {
        }

        return var0;
    }

    static final Image a(Image var0, int var1) {
        try {
            Image var2;
            if ((var2 = f.a("/z" + var1 + ".png")) != null) {
                return var2;
            }
        } catch (Exception var3) {
        }

        return Image.createImage(var0, 0, 0, var0.getWidth(), var0.getHeight(), 2);
    }

    public void paint(Graphics var1) {
    }
}
