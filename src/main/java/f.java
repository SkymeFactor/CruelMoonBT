//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public final class f {
    static byte[] a;
    static int[] b;
    static int c;
    static int d;
    static int e;
    static int f;
    static int g;
    static boolean h;
    static int[] i;
    static boolean j;
    static boolean k;
    private static String q;
    static boolean l;
    static int m;
    public static f n;
    static boolean o;
    static int p = 100;

    static {
        d = k.bO;
        q = k.cI;
        f = 1;
        l = false;
        o = true;
        h = true;
        e = 1;
        g = 0;
        c = 0;
        a = new byte[d];
        k = false;
        j = true;
        b = new int[]{1668246830, 1852795753, 1630432617, 1680766313, 776369516, 1816355182, 1986097920};
        i = new int[]{779120231};
        m = 0;
    }

    public f() {
    }

    private static final void e() {
        f = 1;
        o = true;
        e = 1;
        k.av = k.aw;
        k.dS = 1;
        c = 0;
        g = 0;
        k.ep = false;
    }

    static final Image a(String var0) {
        byte[] var1 = n.a((String)var0, (int)-1);

        try {
            return Image.createImage(var1, 0, var1.length);
        } catch (Exception var5) {
            try {
                return Image.createImage(a(var1, p), 0, var1.length);
            } catch (Exception var4) {
                a(var1, p);
                return Image.createImage(b(var1, var1[2] - 3), 3, var1.length - 3);
            }
        }
    }

    private static int[] a(Image var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
        Image var9 = var0;
        if (!var0.isMutable()) {
            Graphics var10;
            (var10 = (var9 = Image.createImage(var3, var4)).getGraphics()).setColor(0);
            var10.fillRect(0, 0, var3, var4);
            var10.drawImage(var0, -var1, -var2, 20);
        }

        int[] var17 = new int[var3 * var4];
        var9.getRGB(var17, 0, var3, 0, 0, var3, var4);
        int var14;
        if (var6 && !var0.isMutable()) {
            Image var11;
            Graphics var12;
            (var12 = (var11 = Image.createImage(var3, var4)).getGraphics()).setColor(16777215);
            var12.fillRect(0, 0, var3, var4);
            var12.drawImage(var0, -var1, -var2, 20);
            int[] var13 = new int[var3 * var4];
            var11.getRGB(var13, 0, var3, 0, 0, var3, var4);

            for(var14 = 0; var14 < var17.length; ++var14) {
                if ((var17[var14] & 255) <= 32 && (var13[var14] & 255) >= 223) {
                    var17[var14] = 0;
                } else {
                    var17[var14] |= -16777216;
                }
            }
        }

        int[] var15 = var17;
        int var16;
        int var18;
        int var19;
        int var20;
        if (var5 == 1) {
            var14 = var4 - 1;

            for(var19 = 0; var19 < var4; ++var19) {
                var20 = var3 - 1;

                for(var18 = 0; var18 < var3; ++var18) {
                    if (var14 * var3 + var20 <= var19 * var3 + var18) {
                        return var15;
                    }

                    var16 = var15[var14 * var3 + var20];
                    var15[var14 * var3 + var20] = var15[var19 * var3 + var18];
                    var15[var19 * var3 + var18] = var16;
                    --var20;
                }

                --var14;
            }

            return var15;
        } else if (var5 != 2) {
            return var17;
        } else {
            var14 = 0;

            for(var19 = 0; var19 < var4; ++var19) {
                var20 = var3 - 1;

                for(var18 = 0; var18 < var3 && var20 > var18; ++var18) {
                    var16 = var15[var14 * var3 + var20];
                    var15[var14 * var3 + var20] = var15[var19 * var3 + var18];
                    var15[var19 * var3 + var18] = var16;
                    --var20;
                }

                ++var14;
            }

            return var15;
        }
    }

    static final Image b(String var0) {
        var0 = c(var0);
        byte[] var1;
        if (((var1 = n.a((String)var0, (int)-1)) == null || var1.length <= 0) && var0.endsWith(".png")) {
            var0 = var0.substring(0, var0.length() - 4) + ".jpg";
            var1 = n.a((String)var0, (int)-1);
        }

        try {
            return Image.createImage(var1, 0, var1.length);
        } catch (Exception var5) {
            try {
                return Image.createImage(a(var1, p), 0, var1.length);
            } catch (Exception var4) {
                a(var1, p);
                return Image.createImage(b(var1, var1[2] - 3), 3, var1.length - 3);
            }
        }
    }

    static final byte[] a(String var0, byte[] var1, boolean var2) {
        boolean var3 = false;

        try {
            RecordStore var4;
            if ((var4 = RecordStore.openRecordStore(var0, true)).getNumRecords() == 1) {
                var4.getRecord(1, var1, 0);
                var3 = true;
            }

            var4.closeRecordStore();
        } catch (Exception var6) {
        }

        if (!var3 && var2) {
            a(var0, var1);
        }

        return var1;
    }

    private static byte[] b(String var0, byte[] var1) {
        boolean var2 = false;

        try {
            RecordStore var3;
            if ((var3 = RecordStore.openRecordStore(var0, true)).getNumRecords() == 1) {
                var3.getRecord(1, var1, 0);
                var2 = true;
            }

            var3.closeRecordStore();
        } catch (Exception var5) {
        }

        if (!var2) {
            e();
            var1 = c(var1);
            a(var0, var1);
        }

        return var1;
    }

    static final void a(String var0, byte[] var1) {
        try {
            RecordStore var2;
            if ((var2 = RecordStore.openRecordStore(var0, true)).getNumRecords() == 1) {
                var2.closeRecordStore();
                if (RecordStore.listRecordStores() != null) {
                    RecordStore.deleteRecordStore(var0);
                }

                var2 = RecordStore.openRecordStore(var0, true);
            }

            var2.addRecord(var1, 0, var1.length);
            var2.closeRecordStore();
        } catch (Exception var4) {
        }
    }

    private static final byte[] b(byte[] var0, int var1) {
        int var2 = var0.length;
        byte var4 = (byte)var1;

        for(int var3 = 0; var3 < var2; ++var3) {
            var0[var3] ^= var4;
            ++var4;
        }

        return var0;
    }

    public static final byte[] a(byte[] var0, int var1) {
        int var2 = var0.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            var0[var3] = (byte)(var0[var3] ^ var1);
            ++var1;
            if (var1 > 255) {
                var1 = 0;
            }
        }

        return var0;
    }

    private static int a(int var0, int var1) {
        return var0 / var1;
    }

    static final String c(String var0) {
        try {
            if (var0.length() > 0) {
                if (var0.charAt(0) != '/') {
                    var0 = new String('/' + var0);
                }
            } else {
                var0 = new String('/' + var0);
            }

            boolean var3 = true;

            for(int var4 = 0; var4 < var0.length(); ++var4) {
                if (var0.charAt(var4) == '.') {
                    var3 = false;
                }
            }

            if (var3) {
                var0 = var0 + a(i);
            }
        } catch (Exception var5) {
        }

        return var0;
    }

    static final void a() {
        if (j) {
            a = b(q, a);
        }

        j = false;
        a = a(a);
    }

    static final void b() {
        a = c(a);
        if (k) {
            a(q, a);
        }

        k = false;
    }

    protected final int d(String var1) {
        var1 = c(var1);
        int var2 = 0;
        int var3 = -1;

        try {
            InputStream var4;
            if ((var4 = this.getClass().getResourceAsStream(var1)) == null) {
                return -1;
            }

            while(var2 != -1) {
                var2 = var4.read();
                ++var3;
            }

            var4.close();
        } catch (Exception var5) {
            var3 = -1;
        }

        return var3;
    }

    private static String a(int[] var0) {
        String var1 = new String();

        for(int var5 = 0; var5 < var0.length; ++var5) {
            long var3;
            if ((var3 = (long)var0[var5]) < 0L) {
                var3 += 4294967296L;
            }

            var1 = var1 + (char)((int)((var3 & 4278190080L) >> 24));
            byte var2;
            if ((var2 = (byte)((int)((var3 & 16711680L) >> 16))) == 0) {
                break;
            }

            var1 = var1 + (char)var2;
            if ((var2 = (byte)((int)((var3 & 65280L) >> 8))) == 0) {
                break;
            }

            var1 = var1 + (char)var2;
            if ((var2 = (byte)((int)(var3 & 255L))) == 0) {
                break;
            }

            var1 = var1 + (char)var2;
        }

        return var1;
    }

    private String[][] b(String var1, int var2) {
        String[] var3 = null;
        String[][] var4 = new String[(var3 = a(this.f(var1), (d)null, 0, false, false)).length][];

        for(int var6 = 0; var6 < var4.length; ++var6) {
            if (var3[var6] != null) {
                String var7;
                int var8;
                if ((var8 = (var7 = var3[var6]).length()) > 256) {
                    var8 = 256;
                }

                String[] var9 = new String[var8];
                int var10 = 0;
                int var11 = 0;

                for(int var12 = 0; var12 <= var7.length(); ++var12) {
                    int var13 = var2;
                    if (var12 < var7.length()) {
                        var13 = var7.charAt(var12);
                    }

                    if (var13 == var2 && var10 < var8) {
                        var9[var10] = var7.substring(var11, var12);
                        var11 = var12 + 1;
                        ++var10;
                    }
                }

                var4[var6] = new String[var10];
                System.arraycopy(var9, 0, var4[var6], 0, var10);
            }
        }

        return var4;
    }

    public final String[][] e(String var1) {
        return this.b((String)var1, 61);
    }

    protected final byte[] a(String var1, int var2) {
        if (var2 < 0) {
            var2 = this.d(var1);
        }

        var1 = c(var1);
        if (var2 <= 0) {
            return null;
        } else {
            try {
                Class.forName(a(b));
                return this.c(var1, var2);
            } catch (Exception var6) {
                byte[] var3 = new byte[var2];

                try {
                    InputStream var4;
                    (var4 = this.getClass().getResourceAsStream(var1)).read(var3);
                    var4.close();
                } catch (Exception var5) {
                }

                return var3;
            }
        }
    }

    private final byte[] c(String var1, int var2) {
        byte[] var3 = new byte[var2];

        try {
            InputStream var4;
            if ((var4 = this.getClass().getResourceAsStream(var1)) == null) {
                return var3;
            }

            DataInputStream var5 = new DataInputStream(var4);
            boolean var6 = false;
            int var7 = 0;

            int var9;
            do {
                var9 = var5.read(var3, var7, var3.length - var7);
                var7 += var9;
            } while(var9 != -1 && var7 < var3.length);

            var5.close();
        } catch (Exception var8) {
        }

        return var3;
    }

    private String a(String var1, char var2) {
        int var3 = this.d(var1);
        String var4 = new String();
        byte[] var5;
        if ((var5 = this.a(var1, var3)) != null && var5.length > 0) {
            if (var5.length > 1 && var5[0] == 59 && var5[1] == 67) {
                var5 = a(var5, p);
            } else if (var5.length > 1 && var5[0] == -101 && var5[1] == -101) {
                var5 = a(var5, p);
            }

            byte var6 = 0;
            if (var5.length >= 1 && var5[0] == 95) {
                var6 = 2;
            }

            if (var5.length >= 2 && var5[0] == -1 && var5[1] == -2) {
                return b(var5);
            } else {
                int var7 = var6;
                boolean var8 = false;
                int var9;
                int var10 = (var9 = var5.length - var6) + var6;

                for(int var11 = var6; var11 < var10; ++var11) {
                    if (var5[var11] == 0) {
                        var9 = var11 - var6;
                        var3 = var11;
                        break;
                    }
                }

                char[] var12 = new char[var9];

                int var16;
                for(int var13 = 0; var13 < var9; ++var13) {
                    if ((var16 = var5[var13 + var6]) < 0) {
                        var16 += 256;
                    }

                    var12[var13] = (char)var16;
                }

                for(; var7 < var3; ++var7) {
                    if ((var16 = var5[var7]) < 0) {
                        var16 += 256;
                    }

                    if (var16 == 0) {
                        break;
                    }

                    if (var16 == var2) {
                        var12[var7 - var6] = ' ';
                    }

                    if (var16 < 10) {
                        var12[var7 - var6] = ' ';
                    }

                    if (var16 >= 192 && var16 <= 255) {
                        var16 += 848;
                        var12[var7 - var6] = (char)var16;
                    }
                }

                try {
                    var4 = new String(var12);
                } catch (Exception var15) {
                }

                return var4;
            }
        } else {
            return null;
        }
    }

    public final String f(String var1) {
        return this.a(var1, ' ');
    }

    static final Image a(Image var0) {
        if (var0 == null) {
            return null;
        } else {
            try {
                Image var1;
                Graphics var2;
                (var2 = (var1 = Image.createImage(var0.getWidth(), var0.getHeight())).getGraphics()).setClip(0, 0, var0.getWidth(), var0.getHeight());
                var2.setColor(0);
                var2.fillRect(0, 0, var0.getWidth(), var0.getHeight());
                var2.drawImage(var0, 0, 0, 20);
                var0 = null;
                return var1;
            } catch (OutOfMemoryError var3) {
                return var0;
            }
        }
    }

    private static final byte[] a(byte[] var0) {
        if (!k.cy) {
            f = var0[0];
            e = var0[4];
            c = var0[8];
            g = var0[9];
            k.ec = var0[3];
            k.dS = var0[11];
        }

        o = var0[2] > 0;
        k.av = var0[5];
        if (k.av < 0) {
            k.av = 0;
        }

        if (k.av > k.aw) {
            k.av = k.aw;
        }

        if (!k.cy) {
            h = var0[6] > 0;
        }

        k.ep = var0[10] > 0;
        m.K = var0[13];
        k.du = var0[14] > 0;
        return var0;
    }

    private static Image a(Image var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, int var10) {
        boolean var11 = false;
        if (var0.isMutable()) {
            var8 = false;
        }

        if (var8) {
            try {
                var11 = f();
            } catch (Exception var33) {
            }
        }

        int[] var12 = a(var0, var1, var2, var3, var4, var7, var8);
        if (var5 != var3 || var6 != var4) {
            var12 = a(var12, var3, var4, var5, var6, var9, var8, true);
        }

        if (var8 && !var11 && var9) {
            for(int var13 = 0; var13 < var12.length; ++var13) {
                int var14;
                if ((var14 = var12[var13] >> 24 & 255) > 0 && var14 < 255) {
                    if (var10 < 0) {
                        if (var14 <= 64) {
                            var12[var13] = 0;
                        } else {
                            var12[var13] |= -16777216;
                        }
                    } else {
                        int var15 = 256 - var14;
                        long var17 = (long)((var10 >> 16 & 255) * var15);
                        long var19 = (long)((var10 >> 8 & 255) * var15);
                        long var21 = (long)((var10 & 255) * var15);
                        int var23;
                        long var24 = (long)(((var23 = var12[var13]) >> 16 & 255) * var14);
                        long var26 = (long)((var23 >> 8 & 255) * var14);
                        long var28 = (long)((var23 & 255) * var14);
                        int var30 = (int)(var17 + var24 >> 8);
                        int var31 = (int)(var19 + var26 >> 8);
                        int var32 = (int)(var21 + var28 >> 8);
                        if (var14 < 8) {
                            var12[var13] = 0;
                        } else {
                            var12[var13] = -16777216 | var30 << 16 | var31 << 8 | var32;
                        }
                    }
                }
            }
        }

        return Image.createRGBImage(var12, var5, var6, var8);
    }

    static final Image a(Image var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9) {
        return a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, -1);
    }

    private static int[] a(int[] var0, int var1, int var2, int var3, int var4, boolean var5, boolean var6, boolean var7) {
        if (var3 == var1 && var4 == var2) {
            return var0;
        } else if (var0 == null) {
            return var0;
        } else {
            int var8 = var3;
            int var9 = var2;
            Object var10 = null;
            int var12;
            int var13;
            int var17;
            int var18;
            int var19;
            int var29;
            int var30;
            int var31;
            int var32;
            int var33;
            int var34;
            int[] var36;
            if (var3 == var1 && var2 == var2) {
                var36 = var0;
            } else {
                var36 = new int[var3 * var2];

                for(int var11 = 0; var11 < var9; ++var11) {
                    var12 = -1;
                    var13 = var8 - 1;
                    int var16 = 0;

                    for(var17 = 0; var17 < var8; ++var17) {
                        if ((var18 = a((var17 + 1) * var1, var8) - 1) < 0) {
                            var18 = 0;
                        }

                        if (var17 == var13) {
                            var18 = var1 - 1;
                        }

                        if (var18 >= var1) {
                            var18 = var1 - 1;
                        }

                        var19 = var18 - var12;
                        if (!var5) {
                            var36[var11 * var8 + var17] = var0[var11 * var1 + var18];
                        } else {
                            long var20 = 0L;
                            long var22 = 0L;
                            long var24 = 0L;
                            long var26 = 0L;
                            if (var19 <= 1 || var19 == 2 && var16 > 0) {
                                var16 = var29 = a(256 * (var17 + 1) * var1, var8) & 255;
                                var30 = var18;
                                var31 = var1 * var11 + var18;
                                var32 = var0[var31];
                                if (var18 < var1 - 1) {
                                    var30 = var18 + 1;
                                }

                                var31 = var1 * var11 + var30;
                                var33 = var0[var31];
                                var36[var11 * var8 + var17] = a(var32, var33, var29, var6, var7);
                            } else {
                                for(int var28 = var12 + 1; var28 <= var18; ++var28) {
                                    var29 = var1 * var11 + var28;
                                    var30 = var0[var29];
                                    if (var28 == var12 + 1 && var16 > 0) {
                                        var32 = var0[var29];
                                        if (var28 < var1 - 1) {
                                            ++var28;
                                        }

                                        var29 = var1 * var11 + var28;
                                        var33 = var0[var29];
                                        var30 = a(var32, var33, 256, var6, var7);
                                        var34 = 1;
                                        if (var6) {
                                            var34 = var30 >> 24 & 255;
                                            var26 += (long)var34;
                                        }

                                        var20 += (long)((var30 >> 16 & 255) * var34);
                                        var22 += (long)((var30 >> 8 & 255) * var34);
                                        var24 += (long)((var30 & 255) * var34);
                                    }

                                    if (var28 == var18) {
                                        var16 = var32 = a(256 * (var17 + 1) * var1, var8) & 255;
                                        var33 = var0[var29];
                                        if (var28 < var1 - 1) {
                                            ++var28;
                                        }

                                        var29 = var1 * var11 + var28;
                                        var34 = var0[var29];
                                        var30 = a(var33, var34, var32, var6, var7);
                                    }

                                    var31 = 1;
                                    if (var6) {
                                        var31 = var30 >> 24 & 255;
                                        var26 += (long)var31;
                                    }

                                    var20 += (long)((var30 >> 16 & 255) * var31);
                                    var22 += (long)((var30 >> 8 & 255) * var31);
                                    var24 += (long)((var30 & 255) * var31);
                                }

                                if (var19 == 2 && !var6) {
                                    if (var6) {
                                        var26 >>= 1;
                                    }

                                    var20 >>= 1;
                                    var22 >>= 1;
                                    var24 >>= 1;
                                } else if (var19 <= 0) {
                                    var26 = 0L;
                                } else if (var6) {
                                    if (var26 > 0L) {
                                        var20 /= var26;
                                        var22 /= var26;
                                        var24 /= var26;
                                    }

                                    var26 /= (long)var19;
                                } else {
                                    var20 /= (long)var19;
                                    var22 /= (long)var19;
                                    var24 /= (long)var19;
                                }

                                if (var7) {
                                    var36[var11 * var8 + var17] = (int)(var26 << 24 | var20 << 16 | var22 << 8 | var24);
                                } else if (var26 < 128L && var6) {
                                    var36[var11 * var8 + var17] = 0;
                                } else {
                                    var36[var11 * var8 + var17] = (int)(-16777216L | var20 << 16 | var22 << 8 | var24);
                                }
                            }
                        }

                        var12 = var18;
                    }
                }
            }

            if (var3 == var8 && var4 == var9) {
                return var36;
            } else {
                int[] var37 = new int[var3 * var4];

                for(var12 = 0; var12 < var3; ++var12) {
                    var13 = -1;
                    int var14 = var4 - 1;
                    var17 = 0;

                    for(var18 = 0; var18 < var4; ++var18) {
                        if ((var19 = a((var18 + 1) * var9, var4) - 1) < 0) {
                            var19 = 0;
                        }

                        if (var18 == var14) {
                            var19 = var9 - 1;
                        }

                        if (var19 >= var9) {
                            var19 = var9 - 1;
                        }

                        int var38 = var19 - var13;
                        if (!var5) {
                            var37[var18 * var3 + var12] = var36[var19 * var8 + var12];
                        } else {
                            long var21 = 0L;
                            long var23 = 0L;
                            long var25 = 0L;
                            long var27 = 0L;
                            if (var38 > 1 && (var38 != 2 || var17 <= 0)) {
                                for(var29 = var13 + 1; var29 <= var19; ++var29) {
                                    var30 = var8 * var29 + var12;
                                    var31 = var36[var30];
                                    int var35;
                                    if (var29 == var13 + 1 && var17 > 0) {
                                        var33 = var36[var30];
                                        if (var29 < var9 - 1) {
                                            ++var29;
                                        }

                                        var30 = var8 * var29 + var12;
                                        var34 = var36[var30];
                                        var31 = a(var33, var34, 256, var6, var7);
                                        var35 = 1;
                                        if (var6) {
                                            var35 = var31 >> 24 & 255;
                                            var27 += (long)var35;
                                        }

                                        var21 += (long)((var31 >> 16 & 255) * var35);
                                        var23 += (long)((var31 >> 8 & 255) * var35);
                                        var25 += (long)((var31 & 255) * var35);
                                    }

                                    if (var29 == var19) {
                                        var17 = var33 = a(256 * (var18 + 1) * var9, var4) & 255;
                                        var34 = var36[var30];
                                        if (var29 < var9 - 1) {
                                            ++var29;
                                        }

                                        var30 = var8 * var29 + var12;
                                        var35 = var36[var30];
                                        var31 = a(var34, var35, var33, var6, var7);
                                    }

                                    var32 = 1;
                                    if (var6) {
                                        var32 = var31 >> 24 & 255;
                                        var27 += (long)var32;
                                    }

                                    var21 += (long)((var31 >> 16 & 255) * var32);
                                    var23 += (long)((var31 >> 8 & 255) * var32);
                                    var25 += (long)((var31 & 255) * var32);
                                }

                                if (var38 == 2 && !var6) {
                                    if (var6) {
                                        var27 >>= 1;
                                    }

                                    var21 >>= 1;
                                    var23 >>= 1;
                                    var25 >>= 1;
                                } else if (var38 <= 0) {
                                    var27 = 0L;
                                } else if (var6) {
                                    if (var27 > 0L) {
                                        var21 /= var27;
                                        var23 /= var27;
                                        var25 /= var27;
                                    }

                                    var27 /= (long)var38;
                                } else {
                                    var21 /= (long)var38;
                                    var23 /= (long)var38;
                                    var25 /= (long)var38;
                                }

                                if (var7) {
                                    var37[var18 * var3 + var12] = (int)(var27 << 24 | var21 << 16 | var23 << 8 | var25);
                                } else if (var27 < 128L && var6) {
                                    var37[var18 * var3 + var12] = 0;
                                } else {
                                    var37[var18 * var3 + var12] = (int)(-16777216L | var21 << 16 | var23 << 8 | var25);
                                }
                            } else {
                                var17 = var30 = a(256 * (var18 + 1) * var9, var4) & 255;
                                var31 = var19;
                                var32 = var8 * var19 + var12;
                                var33 = var36[var32];
                                if (var19 < var9 - 1) {
                                    var31 = var19 + 1;
                                }

                                var32 = var8 * var31 + var12;
                                var34 = var36[var32];
                                var37[var18 * var3 + var12] = a(var33, var34, var30, var6, var7);
                            }
                        }

                        var13 = var19;
                    }
                }

                return var37;
            }
        }
    }

    private static String[] a(String var0, d var1, int var2, boolean var3, boolean var4) {
        if (var0 == null) {
            return null;
        } else if (var0.length() <= 0) {
            return new String[]{""};
        } else {
            int var5;
            String[] var6 = new String[var5 = var0.length()];
            boolean var7 = false;
            int var8 = 0;
            int var9 = 0;
            boolean var11 = false;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 1;
            int var16 = 0;
            boolean var17 = true;
            boolean var18 = false;

            for(int var19 = 0; var19 < var5 + 1; ++var19) {
                char var10;
                if (var19 >= var5) {
                    var10 = '\n';
                } else {
                    var10 = var0.charAt(var19);
                }

                int var22;
                if (var3) {
                    var22 = var1.a(var10);
                } else {
                    var22 = 5;
                }

                if (var10 != '\n' && var10 != '\r') {
                    var9 += var22;
                    var8 += var22;
                }

                switch(var10) {
                    case '\n':
                    case '\r':
                        var15 = var19;
                        var9 = var2 + 1;
                        var8 = 0;
                        if (var19 < var5) {
                            ++var19;
                            if (var19 < var5) {
                                char var23 = var10;
                                if (((var10 = var0.charAt(var19)) == '\n' || var10 == '\r') && var10 != var23) {
                                    ++var19;
                                }
                            }

                            var16 = var19--;
                        } else {
                            var16 = var5;
                        }

                        var10 = '\n';
                        break;
                    case '.':
                        if (!var17 || var19 + 1 < var5 && var10 == var0.charAt(var19 + 1)) {
                            break;
                        }
                    case '@':
                        if (var10 == '@') {
                            var17 = false;
                        }
                    case ' ':
                        var15 = var19 + 1;
                        var8 = 0;
                }

                if ((var9 <= var2 || !var3) && var10 != '\n') {
                    ++var12;
                } else {
                    if (var15 == var14 && var12 > 0) {
                        var15 = var14 + var12;
                        var8 = 0;
                        if (var19 < var5 && var19 + 1 > var15) {
                            var8 = var1.a(var0.substring(var15, var19 + 1));
                        }
                    }

                    if (var15 > var14) {
                        var6[var13] = var0.substring(var14, var15);
                    } else {
                        var6[var13] = "";
                    }

                    var14 = var15;
                    if (var15 < var16) {
                        var14 = var16;
                    }

                    var15 = var14;
                    var9 = var8;
                    var12 = var19 - var14 + 1;
                    if (var4 && var6[var13] != null && var6[var13].length() > 0) {
                        while(var6[var13].length() > 0 && var6[var13].charAt(var6[var13].length() - 1) == ' ') {
                            var6[var13] = var6[var13].substring(0, var6[var13].length() - 1);
                        }
                    }

                    var17 = true;
                    ++var13;
                }
            }

            String[] var21 = null;
            var21 = new String[var13];
            System.arraycopy(var6, 0, var21, 0, var13);
            return var21;
        }
    }

    final String[] a(String var1, d var2, int var3, boolean var4) {
        return a(var1, var2, var3, var4, true);
    }

    private static boolean f() {
        if (m == 0) {
            int[] var2 = new int[4];

            for(int var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = -2130706433;
            }

            Image var4 = Image.createRGBImage(var2, 2, 2, true);
            Image var5;
            Graphics var6;
            (var6 = (var5 = Image.createImage(2, 2)).getGraphics()).setClip(0, 0, 2, 2);
            var6.setColor(0);
            var6.fillRect(0, 0, 2, 2);
            var6.drawImage(var4, 0, 0, 20);
            int[] var7 = new int[4];
            var5.getRGB(var7, 0, 2, 0, 0, 2, 2);

            try {
                if ((var7[0] & 255) > 16 && (var7[0] & 255) < 224 && Display.getDisplay(NET_Lizard.a).numAlphaLevels() > 2) {
                    m = 1;
                } else {
                    m = -1;
                }
            } catch (Exception var9) {
                m = -1;
            }
        }

        return m > 0;
    }

    private static String b(byte[] var0) {
        byte var1 = 0;
        if (var0.length >= 2 && var0[0] == -1 && var0[1] == -2) {
            var1 = 2;
        }

        int var2 = 0;

        for(int var3 = var1; var3 < var0.length && (var0[var3] != 0 || var3 + 1 < var0.length && var0[var3 + 1] != 0); var3 += 2) {
            ++var2;
        }

        char[] var4 = new char[var2];
        int var7 = var1;

        for(int var8 = 0; var8 < var2; ++var8) {
            int var5;
            if ((var5 = var0[var7]) < 0) {
                var5 += 256;
            }

            ++var7;
            int var6;
            if ((var6 = var0[var7]) < 0) {
                var6 += 256;
            }

            ++var7;
            var4[var8] = (char)(var6 * 256 + var5);
        }

        String var9;
        if ((var9 = new String(var4)).length() >= 2 && var9.charAt(0) == '_' && var9.charAt(1) == '&') {
            var9 = var9.substring(2, var9.length());
        }

        return var9;
    }

    public static final void c() {
        n = null;
    }

    public static final void d() {
        n = new f();
    }

    private static int a(int var0, int var1, int var2, boolean var3, boolean var4) {
        if (var0 == var1) {
            return var0;
        } else {
            int var6 = 256 - var2;
            if (var6 == 0) {
                return var1;
            } else if (var2 == 0) {
                return var0;
            } else {
                long var8 = 0L;
                long var10 = 0L;
                long var12 = 0L;
                long var14 = 0L;
                long var16 = 0L;
                long var18 = 0L;
                long var20 = 0L;
                long var22 = 0L;
                long var24 = 0L;
                long var26 = 0L;
                long var28 = 0L;
                long var30 = 0L;
                if (var3) {
                    var22 = (long)(var0 >> 24 & 255);
                }

                var16 = (long)((var0 >> 16 & 255) * var6);
                var18 = (long)((var0 >> 8 & 255) * var6);
                var20 = (long)((var0 & 255) * var6);
                if (var3) {
                    var30 = (long)(var1 >> 24 & 255);
                }

                var24 = (long)((var1 >> 16 & 255) * var2);
                var26 = (long)((var1 >> 8 & 255) * var2);
                var28 = (long)((var1 & 255) * var2);
                long var32 = 0L;
                if (var3 && (var22 < 255L || var30 < 255L)) {
                    var32 = var22 * (long)var6 + var30 * (long)var2;
                }

                if (var3) {
                    var14 = var22 * (long)var6 + var30 * (long)var2 >> 8;
                }

                if (var14 < 0L) {
                    var14 = 0L;
                }

                if (var14 > 255L) {
                    var14 = 255L;
                }

                if (var32 > 0L) {
                    if ((var8 = (var16 * var22 + var24 * var30) / var32) < 0L) {
                        var8 = 0L;
                    }

                    if (var8 > 255L) {
                        var8 = 255L;
                    }

                    if ((var10 = (var18 * var22 + var26 * var30) / var32) < 0L) {
                        var10 = 0L;
                    }

                    if (var10 > 255L) {
                        var10 = 255L;
                    }

                    if ((var12 = (var20 * var22 + var28 * var30) / var32) < 0L) {
                        var12 = 0L;
                    }

                    if (var12 > 255L) {
                        var12 = 255L;
                    }
                } else {
                    if ((var8 = var16 + var24 >> 8) < 0L) {
                        var8 = 0L;
                    }

                    if (var8 > 255L) {
                        var8 = 255L;
                    }

                    if ((var10 = var18 + var26 >> 8) < 0L) {
                        var10 = 0L;
                    }

                    if (var10 > 255L) {
                        var10 = 255L;
                    }

                    if ((var12 = var20 + var28 >> 8) < 0L) {
                        var12 = 0L;
                    }

                    if (var12 > 255L) {
                        var12 = 255L;
                    }
                }

                if (var4) {
                    return (int)(var14 << 24 | var8 << 16 | var10 << 8 | var12);
                } else {
                    return var14 < 128L && var3 ? 0 : (int)(-16777216L | var8 << 16 | var10 << 8 | var12);
                }
            }
        }
    }

    private static final byte[] c(byte[] var0) {
        if (!k.cy) {
            var0[0] = (byte)f;
            if (e > 0) {
                var0[4] = (byte)e;
            }

            var0[8] = (byte)c;
            var0[9] = (byte)g;
            var0[11] = k.dS;
        }

        var0[2] = 0;
        if (o) {
            var0[2] = 1;
        }

        var0[3] = k.ec;
        var0[5] = k.av;
        if (!k.cy) {
            var0[6] = 0;
        }

        if (h) {
            var0[6] = 1;
        }

        var0[10] = 0;
        if (k.ep) {
            var0[10] = 1;
        }

        var0[13] = (byte)m.K;
        var0[14] = 0;
        if (k.du) {
            var0[14] = 1;
        }

        return var0;
    }
}
