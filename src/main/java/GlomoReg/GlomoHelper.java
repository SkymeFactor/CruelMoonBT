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

public final class GlomoHelper {
    private static final Random randomGenerator = new Random();
    private static final String hexadecimalChars = "0123456789ABCDEF";
    private static final String alphaNumericChars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public GlomoHelper() {
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

    public static final long generateRandomKey(int minValue) {
        if (minValue != 0) {
            return 0L;
        } else {
            Integer.parseInt(GlomoConfigManager.distributor.getSmsKeyVersion());
            minValue = 1;
            int maxValue = 9;

            for(int i = 0; i < 5; ++i) {
                minValue *= 10;                 // value: 100 000
                maxValue = maxValue * 10 + 9;   // value: 999 999
            }

            return (long) getRandomInRange(minValue, maxValue);
        }
    }

    public static final String a(int type, String smsPrefix, long clientKey) {
        boolean var4 = false;
        if (GlomoConfigManager.getConfigVersionInt() > 1) {
            Integer.parseInt(GlomoConfigManager.distributor.getSmsKeyVersion());
            boolean var11 = false;
            String subDistIdHi;
            String subDistIdLo = (subDistIdHi = GlomoConfigManager.distributor.getSubDistID()).substring(0, 2);
            subDistIdHi = subDistIdHi.substring(2, 5);
            String var10 = b(convertKeyToString(
                    (clientKey != 0L ? clientKey :
                    generateRandomKey(0)) * 10000L + Long.parseLong(subDistIdHi) * 10L + (long)(type % 10),
                    7
            ), 2);

            try {
                var4 = Long.parseLong(var10) == 0L;
            } catch (Exception ignore) {
            }

            return var4 ? "" : smsPrefix + subDistIdLo + var10 + GlomoConfigManager.getSmsKeyVersion().substring(0, 1);
        } else {
            String var5 = b(convertKeyToString((clientKey != 0L ? clientKey : generateRandomKey(0)) * 10000L + Long.parseLong(GlomoConfigManager.distributor.getDistID()) * 10L + (long)(type % 10), 7), 2);

            try {
                var4 = Long.parseLong(var5) == 0L;
            } catch (Exception ignore) {
            }

            return var4 ? "" : smsPrefix + var5 + GlomoConfigManager.getSmsKeyVersion().substring(0, 1);
        }
    }

    /// TODO: Might be encryption's encoding
    private static byte[] a(byte[] input, int index) {
        byte[] output = new byte[input.length];
        if (index == 0) {
            // Fill output with array shifted by 5
            // Each element of input is: 37 ^ element
            for(index = 0; index < input.length; ++index) {
                output[(index + 5) % input.length] = (byte)(37 ^ input[index]);
            }

            // Shifted by 2 xor with the same output array
            for(index = 0; index < input.length; ++index) {
                output[index] ^= output[(index + 2) % input.length];
            }
        }

        return output;
    }

    // TODO: Potentially a hash function
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

    private static String b(String clientKey, int var1) {
        if (clientKey.length() == 0) {
            return clientKey;
        } else if (var1 == 0) {
            return new String(a(clientKey.getBytes(), var1));
        } else if (var1 == 1) {
            return convertToHexString(a((byte[])a(clientKey), 0));
        } else if (var1 == 2 && clientKey.length() > 2) {
            StringBuffer var3 = new StringBuffer(clientKey.substring(0, 2));

            for(int i = 0; i < clientKey.length() - 2; ++i) {
                var3.append(clientKey.charAt(2 + (i + alphaNumericChars.indexOf(clientKey.charAt(1))) % (clientKey.length() - 2)));
            }

            return var3.toString();
        } else {
            return clientKey;
        }
    }

    private static String convertKeyToString(long key, int minLength) {
        StringBuffer output;
        for(output = new StringBuffer(""); key > 0L; key /= 36L) {
            output.append(alphaNumericChars.charAt((int)(key % 36L)));
        }

        while(output.length() < minLength) {
            output.append("0");
        }

        return output.toString();
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
