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

public final class GlomoConfigLoader {
    private static final Random randomGenerator = new Random();
    private static final String hexadecimalChars = "0123456789ABCDEF";
    private static final String alphaNumericChars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public GlomoConfigLoader() {
    }

    public static final String[] splitString(String separator, String data) {
        int numStrings = 1;
        int substringBeginIndex = 0;

        int dataIndex;
        for(dataIndex = 0; (dataIndex = data.indexOf(separator, dataIndex) + 1) > 0; ++numStrings) {
        }

        String[] separatedStrings = new String[numStrings];
        numStrings = 0;

        for(dataIndex = 0; (dataIndex = data.indexOf(separator, dataIndex) + 1) > 0; substringBeginIndex = dataIndex - 1 + separator.length()) {
            separatedStrings[numStrings] = data.substring(substringBeginIndex, dataIndex - 1);
            ++numStrings;
        }

        separatedStrings[numStrings] = data.substring(substringBeginIndex);
        return separatedStrings;
    }

    public static String[] readGlomoConfigFile(MIDlet midletApp, String configFilename) {
        return readGlomoConfigFile(midletApp, configFilename, true);
    }

    private static String[] readGlomoConfigFile(MIDlet midletApp, String configFilename, boolean requiresDecoding) {
        return splitString("\n", readConfigFile(midletApp, configFilename, requiresDecoding));
    }

    private static String readConfigFile(MIDlet midletApp, String filename, boolean requiresDecoding) {
        try {
            InputStream resourceStream;
            char[] configData = new char[(resourceStream = midletApp.getClass().getResourceAsStream(filename)).available() / 2 - 1];
            ByteArrayOutputStream dataBufferStream = new ByteArrayOutputStream();

            int currentSymbol;
            while((currentSymbol = resourceStream.read()) != -1) {
                dataBufferStream.write(currentSymbol);
            }

            ByteArrayInputStream byteStream = new ByteArrayInputStream(dataBufferStream.toByteArray());
            DataInputStream charStream;
            (charStream = new DataInputStream(byteStream)).readChar();

            for(int i = 0; i < configData.length; ++i) {
                configData[i] = charStream.readChar();
            }

            charStream.close();
            byteStream.close();
            dataBufferStream.close();
            String configDataString;
            decodeString((String)(configDataString = new String(configData)), 0);
            return requiresDecoding ? decodeString((String)configDataString, 0) : configDataString;
        } catch (Exception configReadException) {
            configReadException.printStackTrace();
            return null;
        }
    }

    private static int getRandomInRange(int minValue, int maxValue) {
        return Math.abs(randomGenerator.nextInt()) % (maxValue - minValue) + minValue;
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

            return (long) getRandomInRange(var0, var1);
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

        for(int i = 0; i < var1.length; ++i) {
            var1[i] = (byte)(Byte.parseByte(var0.substring(i << 1, (i << 1) + 1)) + (byte)(Byte.parseByte(var0.substring((i << 1) + 1, (i << 1) + 2)) << 4));
        }

        return var1;
    }

    private static String convertToHexString(byte[] data) {
        StringBuffer hexString = new StringBuffer("");

        for(int i = 0; i < data.length; ++i) {
            hexString.append(String.valueOf(hexadecimalChars.charAt(data[i] & 15)));
            hexString.append(String.valueOf(hexadecimalChars.charAt(data[i] >> 4 & 15)));
        }

        return hexString.toString();
    }

    private static String b(String var0, int var1) {
        if (var0.length() == 0) {
            return var0;
        } else if (var1 == 0) {
            return new String(a(var0.getBytes(), var1));
        } else if (var1 == 1) {
            return convertToHexString(a((byte[])a(var0), 0));
        } else if (var1 == 2 && var0.length() > 2) {
            StringBuffer var3 = new StringBuffer(var0.substring(0, 2));

            for(int var2 = 0; var2 < var0.length() - 2; ++var2) {
                var3.append(var0.charAt(2 + (var2 + alphaNumericChars.indexOf(var0.charAt(1))) % (var0.length() - 2)));
            }

            return var3.toString();
        } else {
            return var0;
        }
    }

    private static String a(long var0, int var2) {
        StringBuffer var3;
        for(var3 = new StringBuffer(""); var0 > 0L; var0 /= 36L) {
            var3.append(alphaNumericChars.charAt((int)(var0 % 36L)));
        }

        while(var3.length() < var2) {
            var3.append("0");
        }

        return var3.toString();
    }

    public static String decodeString(String dataBuffer, int var1) {
        char[] var13;
        char[] var14 = new char[(var13 = dataBuffer.toCharArray()).length];
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

    public static final String getMidletPropertySafe(MIDlet midletApp, String propertyName) {
        try {
            String property = midletApp.getAppProperty(propertyName) == null ? "" : midletApp.getAppProperty(propertyName);
            if (property.charAt(property.length() - 1) == ';') {
                property = property.substring(0, property.length() - 1);
            }

            return property;
        } catch (Exception e) {
            return "";
        }
    }
}
