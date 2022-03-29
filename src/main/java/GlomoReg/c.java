//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.midlet.MIDlet;

public final class c {
    private static Random a = new Random();
    private static String b = "0123456789ABCDEF";
    private static String c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public c() {
    }

    public static final String[] a(String var0, String var1) {
        int var2 = 1;
        int var4 = 0;

        int var3;
        for(var3 = 0; (var3 = var1.indexOf(var0, var3) + 1) > 0; ++var2) {
        }

        String[] var5 = new String[var2];
        var2 = 0;

        for(var3 = 0; (var3 = var1.indexOf(var0, var3) + 1) > 0; var4 = var3 - 1 + var0.length()) {
            var5[var2] = var1.substring(var4, var3 - 1);
            ++var2;
        }

        var5[var2] = var1.substring(var4);
        return var5;
    }

    public static String[] a(MIDlet var0, String var1) {
        return a(var0, var1, true);
    }

    private static String[] a(MIDlet var0, String var1, boolean var2) {
        return a("\n", b(var0, var1, var2));
    }

    private static String b(MIDlet var0, String var1, boolean var2) {
        try {
            InputStream var7;
            char[] var10 = new char[(var7 = var0.getClass().getResourceAsStream(var1)).available() / 2 - 1];
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();

            int var4;
            while((var4 = var7.read()) != -1) {
                var3.write(var4);
            }

            ByteArrayInputStream var8 = new ByteArrayInputStream(var3.toByteArray());
            DataInputStream var11;
            (var11 = new DataInputStream(var8)).readChar();

            for(int var5 = 0; var5 < var10.length; ++var5) {
                var10[var5] = var11.readChar();
            }

            var11.close();
            var8.close();
            var3.close();
            String var9;
            a((String)(var9 = new String(var10)), 0);
            return var2 ? a((String)var9, 0) : var9;
        } catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static int a(int var0, int var1) {
        return Math.abs(a.nextInt()) % (var1 - var0) + var0;
    }

    public static final long a(int var0) {
        if (var0 != 0) {
            return 0L;
        } else {
            Integer.parseInt(e.a.f());
            var0 = 1;
            int var1 = 9;

            for(int var2 = 0; var2 < 5; ++var2) {
                var0 *= 10;
                var1 = var1 * 10 + 9;
            }

            return (long)a(var0, var1);
        }
    }

    public static final String a(int var0, String var1, long var2) {
        boolean var4 = false;
        if (e.b() > 1) {
            Integer.parseInt(e.a.f());
            boolean var11 = false;
            String var6;
            String var7 = (var6 = e.a.b()).substring(0, 2);
            var6 = var6.substring(2, 5);
            String var10 = b(a((var2 != 0L ? var2 : a(0)) * 10000L + Long.parseLong(var6) * 10L + (long)(var0 % 10), 7), 2);

            try {
                var4 = Long.parseLong(var10) == 0L;
            } catch (Exception var8) {
            }

            return var4 ? "" : var1 + var7 + var10 + e.c().substring(0, 1);
        } else {
            String var5 = b(a((var2 != 0L ? var2 : a(0)) * 10000L + Long.parseLong(e.a.a()) * 10L + (long)(var0 % 10), 7), 2);

            try {
                var4 = Long.parseLong(var5) == 0L;
            } catch (Exception var9) {
            }

            return var4 ? "" : var1 + var5 + e.c().substring(0, 1);
        }
    }

    private static byte[] a(byte[] var0, int var1) {
        byte[] var2 = new byte[var0.length];
        if (var1 == 0) {
            for(var1 = 0; var1 < var0.length; ++var1) {
                var2[(var1 + 5) % var0.length] = (byte)(37 ^ var0[var1]);
            }

            for(var1 = 0; var1 < var0.length; ++var1) {
                var2[var1] ^= var2[(var1 + 2) % var0.length];
            }
        }

        return var2;
    }

    private static byte[] a(String var0) {
        if (var0.length() % 2 == 1) {
            var0 = var0 + "0";
        }

        byte[] var1 = new byte[var0.length() / 2];

        for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = (byte)(Byte.parseByte(var0.substring(var2 << 1, (var2 << 1) + 1)) + (byte)(Byte.parseByte(var0.substring((var2 << 1) + 1, (var2 << 1) + 2)) << 4));
        }

        return var1;
    }

    private static String a(byte[] var0) {
        StringBuffer var1 = new StringBuffer("");

        for(int var2 = 0; var2 < var0.length; ++var2) {
            var1.append(String.valueOf(b.charAt(var0[var2] & 15)));
            var1.append(String.valueOf(b.charAt(var0[var2] >> 4 & 15)));
        }

        return var1.toString();
    }

    private static String b(String var0, int var1) {
        if (var0.length() == 0) {
            return var0;
        } else if (var1 == 0) {
            return new String(a(var0.getBytes(), var1));
        } else if (var1 == 1) {
            return a(a((byte[])a(var0), 0));
        } else if (var1 == 2 && var0.length() > 2) {
            StringBuffer var3 = new StringBuffer(var0.substring(0, 2));

            for(int var2 = 0; var2 < var0.length() - 2; ++var2) {
                var3.append(var0.charAt(2 + (var2 + c.indexOf(var0.charAt(1))) % (var0.length() - 2)));
            }

            return var3.toString();
        } else {
            return var0;
        }
    }

    private static String a(long var0, int var2) {
        StringBuffer var3;
        for(var3 = new StringBuffer(""); var0 > 0L; var0 /= 36L) {
            var3.append(c.charAt((int)(var0 % 36L)));
        }

        while(var3.length() < var2) {
            var3.append("0");
        }

        return var3.toString();
    }

    public static String a(String var0, int var1) {
        char[] var13;
        char[] var14 = new char[(var13 = var0.toCharArray()).length];
        int var3 = var13.length + 1;

        int var5;
        for(var5 = 1; var5 < var3; ++var5) {
            var14[var5 - 1] = var13[var5 - 1];
        }

        int var4;
        for(var4 = 1; var4 < var3; var4 = var4 << 1 | 1) {
        }

        var4 >>= 1;

        for(int var11 = var3 - var4; var11 > 0; var11 -= var13.length - var4 + (var13.length - var4 > 0 ? 0 : 1)) {
            int var10 = 0;

            for(int var9 = 4; var9 <= var4 + 1 << 1; var9 += 2) {
                var5 = 0;
                int var12 = 0;
                int var8 = 0;
                int var6 = 1;

                for(int var7 = var4 + 1 >> 1; var5 <= var10; var7 >>= 1) {
                    int var2;
                    var12 = var5 >= var10 && (var9 >> 1) - 2 + (var10 << 1) - var12 - (var4 >> 1) <= 0 ? (var14[var11 + (var9 >> 1) - 3] = (char)(var14[var11 + (var9 >> 1) - 3] + (var14[var11 - 1 - (var10 << 1) + var12 + (var4 >> 1)] - (var14[var11 - 1 - (var10 << 1) + var12 + (var4 >> 1)] = var14[var11 + (var9 >> 1) - 3])))) + ((var9 >> 1) + (var10 << 1) - (var4 >> 1) - var12 - 2 == 0 ? 0 : (var14[var11 + (var9 >> 1) - 3] = (char)(((var2 = var14[var11 + (var9 >> 1) - 3] + 142) % 10 + 10 + (var11 - 3) % 10) % 10 + var2 / 10 * 10 - 142))) + (var14[var11 - 1 - (var10 << 1) + var12 + (var4 >> 1)] = (char)(((var2 = var14[var11 - 1 - (var10 << 1) + var12 + (var4 >> 1)] + 142) % 10 + 10 + (var11 - 3) % 10) % 10 + var2 / 10 * 10 - 142)) : (var8 += (((var9 >> 1) - 2 & var6) == 0 ? 1 : -1) * (var7 >> 1) + 2);
                    ++var5;
                    var6 <<= 1;
                }

                var10 += var9 >> 1 == 2 << var10 ? 1 : 0;
            }
        }

        for(var5 = 1; var5 < var3; ++var5) {
            var13[var5 - 1] = var14[var5 - 1];
        }

        return new String(var13);
    }

    public static final String b(MIDlet var0, String var1) {
        try {
            String var3;
            String var10000 = var3 = var0.getAppProperty(var1) == null ? "" : var0.getAppProperty(var1);
            if (var10000.charAt(var10000.length() - 1) == ';') {
                var3 = var3.substring(0, var3.length() - 1);
            }

            return var3;
        } catch (Exception var2) {
            return "";
        }
    }
}
