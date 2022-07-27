import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

// Resource manager
public final class AssetManager {
    static byte[] a1;
    static int[] binaryStringComNokiaUIFullCanvas;
    static int c1;
    static int d1;
    static int e1;
    static int f1;
    static int g1;
    static boolean h1;
    static int[] binaryStringPNG;
    static boolean j1;
    static boolean k1;
    private static String recordStorageMNMc;
    static boolean l1;
    static int alphaBlendingEnabled;
    public static AssetManager instanceHandler;
    static boolean o;
    static int default_salt = 100;

    static {
        d1 = k.bO;
        recordStorageMNMc = k.stringMNMc;
        f1 = 1;
        l1 = false;
        o = true;
        h1 = true;
        e1 = 1;
        g1 = 0;
        c1 = 0;
        a1 = new byte[d1];
        k1 = false;
        j1 = true;
        binaryStringComNokiaUIFullCanvas = new int[]{1668246830, 1852795753, 1630432617, 1680766313, 776369516, 1816355182, 1986097920};
        binaryStringPNG = new int[]{779120231};     // PNG
        alphaBlendingEnabled = 0;
    }

    public AssetManager() {
    }

    private static final void e() {
        f1 = 1;
        o = true;
        e1 = 1;
        k.av = k.aw;
        k.dS = 1;
        c1 = 0;
        g1 = 0;
        k.ep = false;
    }

    static final Image readImageFromFilePNG(String filename) {
        byte[] imageData = instanceHandler.readDataChunkFromFile((String)filename, (int)-1);

        try {
            return Image.createImage(imageData, 0, imageData.length);
        } catch (Exception e) {
            try {
                return Image.createImage(decryptDataMethodA(imageData, default_salt), 0, imageData.length);
            } catch (Exception e2) {
                decryptDataMethodA(imageData, default_salt);
                return Image.createImage(decryptDataMethodB(imageData, imageData[2] - 3), 3, imageData.length - 3);
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
            (var12 = (var11 = Image.createImage(var3, var4)).getGraphics()).setColor(GameColors.COLOR_WHITE);
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

    static final Image readImageFromFileSafe(String filename) {
        filename = unifyFilename(filename);
        byte[] data;
        if (((data = instanceHandler.readDataChunkFromFile((String)filename, (int)-1)) == null || data.length <= 0) && filename.endsWith(".png")) {
            filename = filename.substring(0, filename.length() - 4) + ".jpg";
            data = instanceHandler.readDataChunkFromFile((String)filename, (int)-1);
        }

        try {
            return Image.createImage(data, 0, data.length);
        } catch (Exception e) {
            try {
                return Image.createImage(decryptDataMethodA(data, default_salt), 0, data.length);
            } catch (Exception e2) {
                decryptDataMethodA(data, default_salt);
                return Image.createImage(decryptDataMethodB(data, data[2] - 3), 3, data.length - 3);
            }
        }
    }

    static final byte[] getRecordFromRecordStore(String recordStoreName, byte[] recordData, boolean writeIfNotFound) {
        boolean recordWasFound = false;

        try {
            RecordStore myRecordStore;
            if ((myRecordStore = RecordStore.openRecordStore(recordStoreName, true)).getNumRecords() == 1) {
                myRecordStore.getRecord(1, recordData, 0);
                recordWasFound = true;
            }

            myRecordStore.closeRecordStore();
        } catch (Exception ignore) {
        }

        if (!recordWasFound && writeIfNotFound) {
            clearRecordStoreAndWriteRecord(recordStoreName, recordData);
        }

        return recordData;
    }

    private static byte[] getRecordFromRecordStoreSafe(String recordStoreName, byte[] recordData) {
        boolean recordWasFound = false;

        try {
            RecordStore myRecordStore;
            if ((myRecordStore = RecordStore.openRecordStore(recordStoreName, true)).getNumRecords() == 1) {
                myRecordStore.getRecord(1, recordData, 0);
                recordWasFound = true;
            }

            myRecordStore.closeRecordStore();
        } catch (Exception ignore) {
        }

        if (!recordWasFound) {
            // TODO: work on since here
            e();
            recordData = c(recordData);
            clearRecordStoreAndWriteRecord(recordStoreName, recordData);
        }

        return recordData;
    }

    static final void clearRecordStoreAndWriteRecord(String recordStoreName, byte[] recordData) {
        try {
            RecordStore myRecordStore;
            if ((myRecordStore = RecordStore.openRecordStore(recordStoreName, true)).getNumRecords() == 1) {
                myRecordStore.closeRecordStore();
                if (RecordStore.listRecordStores() != null) {
                    RecordStore.deleteRecordStore(recordStoreName);
                }

                myRecordStore = RecordStore.openRecordStore(recordStoreName, true);
            }

            myRecordStore.addRecord(recordData, 0, recordData.length);
            myRecordStore.closeRecordStore();
        } catch (Exception ignore) {
        }
    }

    private static final byte[] decryptDataMethodB(byte[] data, int salt) {
        int dataLength = data.length;
        byte saltByte = (byte)salt;

        for(int i = 0; i < dataLength; ++i) {
            data[i] ^= saltByte;
            ++saltByte;
        }

        return data;
    }

    public static final byte[] decryptDataMethodA(byte[] data, int salt) {
        int dataLength = data.length;

        for(int i = 0; i < dataLength; ++i) {
            data[i] = (byte)(data[i] ^ salt);
            ++salt;
            if (salt > 255) {
                salt = 0;
            }
        }

        return data;
    }

    private static int div(int divisible, int divisor) {
        return divisible / divisor;
    }

    static final String unifyFilename(String filename) {
        try {
            if (filename.length() > 0) {
                if (filename.charAt(0) != '/') {
                    filename = new String('/' + filename);
                }
            } else {
                filename = new String('/' + filename);
            }

            boolean filenameHasNoExtension = true;

            for(int i = 0; i < filename.length(); ++i) {
                if (filename.charAt(i) == '.') {
                    filenameHasNoExtension = false;
                }
            }

            if (filenameHasNoExtension) {
                filename = filename + decodeBinaryString(binaryStringPNG);
            }
        } catch (Exception ignore) {
        }
        return filename;
    }

    static final void a() {
        if (j1) {
            a1 = getRecordFromRecordStoreSafe(recordStorageMNMc, a1);
        }

        j1 = false;
        a1 = a(a1);
    }

    static final void b() {
        a1 = c(a1);
        if (k1) {
            clearRecordStoreAndWriteRecord(recordStorageMNMc, a1);
        }

        k1 = false;
    }

    protected final int getFileSize(String filename) {
        filename = unifyFilename(filename);
        int currentByte = 0;
        int fileSize = -1;

        try {
            InputStream resourceStream;
            if ((resourceStream = this.getClass().getResourceAsStream(filename)) == null) {
                return -1;
            }

            while(currentByte != -1) {
                currentByte = resourceStream.read();
                ++fileSize;
            }

            resourceStream.close();
        } catch (Exception e) {
            fileSize = -1;
        }

        return fileSize;
    }

    private static String decodeBinaryString(int[] encodedString) {
        String str = new String();
        long byte1 = 255L;
        long byte2 = 65280L;
        long byte3 = 16711680L;
        long byte4 = 4278190080L;

        for(int i = 0; i < encodedString.length; ++i) {
            long currentValue;
            if ((currentValue = (long)encodedString[i]) < 0L) {
                currentValue += 4294967296L;
            }

            str = str + (char)((int)((currentValue & byte4) >> 24));
            byte decodedSymbol;
            if ((decodedSymbol = (byte)((int)((currentValue & byte3) >> 16))) == 0) {
                break;
            }

            str = str + (char)decodedSymbol;
            if ((decodedSymbol = (byte)((int)((currentValue & byte2) >> 8))) == 0) {
                break;
            }

            str = str + (char)decodedSymbol;
            if ((decodedSymbol = (byte)((int)(currentValue & byte1))) == 0) {
                break;
            }

            str = str + (char)decodedSymbol;
        }
        return str;
    }

    private String[][] b(String var1, int var2) {
        String[] levelsTitles = null;   // TODO: fix wrong name
        String[][] var4 = new String[(levelsTitles = a(this.f(var1), (d)null, 0, false, false)).length][];

        for(int i = 0; i < var4.length; ++i) {
            if (levelsTitles[i] != null) {
                String var7;
                int var8;
                if ((var8 = (var7 = levelsTitles[i]).length()) > 256) {
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

                var4[i] = new String[var10];
                System.arraycopy(var9, 0, var4[i], 0, var10);
            }
        }

        return var4;
    }

    public final String[][] e(String var1) {
        return this.b((String)var1, 61);    // ASCII 61 is the space
    }

    protected final byte[] readDataChunkFromFile(String filename, int dataLength) {
        if (dataLength < 0) {
            dataLength = this.getFileSize(filename);
        }

        filename = unifyFilename(filename);
        if (dataLength <= 0) {
            return null;
        } else {
            try {
                /* In case of Nokia platform, we will use a safer function
                 * ( In fact, we must always use safer function to preserve resources integrity )
                 */
                //Class.forName(decodeBinaryString(binaryStringComNokiaUIFullCanvas));
                return this.readDataChunkFromFileSafe(filename, dataLength);
            } catch (Exception e) {
                byte[] data = new byte[dataLength];

                try {
                    InputStream resourceStream;
                    (resourceStream = this.getClass().getResourceAsStream(filename)).read(data);
                    resourceStream.close();
                } catch (Exception ignore) {
                }
                return data;
            }
        }
    }

    private final byte[] readDataChunkFromFileSafe(String filename, int dataLength) {
        byte[] data = new byte[dataLength];

        try {
            InputStream resourceStream;
            if ((resourceStream = this.getClass().getResourceAsStream(filename)) == null) {
                return data;
            }

            DataInputStream dataStream = new DataInputStream(resourceStream);
            boolean var6 = false;   // Unknown variable, never used
            int dataOffset = 0;

            int numBytesRead;
            do {
                numBytesRead = dataStream.read(data, dataOffset, data.length - dataOffset);
                dataOffset += numBytesRead;
            } while(numBytesRead != -1 && dataOffset < data.length);

            dataStream.close();
        } catch (Exception ignore) {
        }

        return data;
    }

    // TODO: some job done, continue
    private String a(String filename, char var2) {
        int fileSize = this.getFileSize(filename);
        String var4 = new String();
        byte[] textAssetBin;
        if ((textAssetBin = this.readDataChunkFromFile(filename, fileSize)) != null && textAssetBin.length > 0) {
            if (textAssetBin.length > 1 && textAssetBin[0] == 59 && textAssetBin[1] == 67) {
                textAssetBin = decryptDataMethodA(textAssetBin, default_salt);
            } else if (textAssetBin.length > 1 && textAssetBin[0] == -101 && textAssetBin[1] == -101) {
                textAssetBin = decryptDataMethodA(textAssetBin, default_salt);
            }

            byte descriptorLength = 0;
            if (textAssetBin.length >= 1 && textAssetBin[0] == 95) {
                // Game asset discovered (ascii char 95 is '_')
                descriptorLength = 2;
            }

            if (textAssetBin.length >= 2 && textAssetBin[0] == -1 && textAssetBin[1] == -2) {
                return readTextAssetFromBinary(textAssetBin);
            } else {
                int var7 = descriptorLength;
                boolean var8 = false;
                int var9;
                int var10 = (var9 = textAssetBin.length - descriptorLength) + descriptorLength;

                for(int var11 = descriptorLength; var11 < var10; ++var11) {
                    if (textAssetBin[var11] == 0) {
                        var9 = var11 - descriptorLength;
                        fileSize = var11;
                        break;
                    }
                }

                char[] var12 = new char[var9];

                int var16;
                for(int var13 = 0; var13 < var9; ++var13) {
                    if ((var16 = textAssetBin[var13 + descriptorLength]) < 0) {
                        var16 += 256;
                    }

                    var12[var13] = (char)var16;
                }

                for(; var7 < fileSize; ++var7) {
                    if ((var16 = textAssetBin[var7]) < 0) {
                        var16 += 256;
                    }

                    if (var16 == 0) {
                        break;
                    }

                    if (var16 == var2) {
                        var12[var7 - descriptorLength] = ' ';
                    }

                    if (var16 < 10) {
                        var12[var7 - descriptorLength] = ' ';
                    }

                    if (var16 >= 192 && var16 <= 255) {
                        var16 += 848;
                        var12[var7 - descriptorLength] = (char)var16;
                    }
                }

                try {
                    var4 = new String(var12);
                } catch (Exception ignored) {
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

    static final Image addBlackBackground(Image img) {
        if (img == null) {
            return null;
        } else {
            try {
                Image newImage;
                Graphics myGraphics;
                (myGraphics = (newImage = Image.createImage(img.getWidth(), img.getHeight())).getGraphics()).setClip(0, 0, img.getWidth(), img.getHeight());
                myGraphics.setColor(0);
                myGraphics.fillRect(0, 0, img.getWidth(), img.getHeight());
                myGraphics.drawImage(img, 0, 0, 20);
                img = null;
                return newImage;
            } catch (OutOfMemoryError e) {
                return img;
            }
        }
    }

    private static final byte[] a(byte[] var0) {
        if (!k.cy) {
            f1 = var0[0];
            e1 = var0[4];
            c1 = var0[8];
            g1 = var0[9];
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
            h1 = var0[6] > 0;
        }

        k.ep = var0[10] > 0;
        m.K = var0[13];
        k.du = var0[14] > 0;
        return var0;
    }

    private static Image a(Image img, int var1, int var2, int var3, int var4, int imageWidth, int imageHeight, int var7, boolean processAlpha, boolean requiresBlending, int var10) {
        boolean alphaBlendingSupported = false;
        if (img.isMutable()) {
            processAlpha = false;
        }

        if (processAlpha) {
            try {
                alphaBlendingSupported = checkIfAlphaBlendingIsSupported();
            } catch (Exception ignore) {
            }
        }

        int[] imageDataRGB = a(img, var1, var2, var3, var4, var7, processAlpha);
        if (imageWidth != var3 || imageHeight != var4) {
            imageDataRGB = a(imageDataRGB, var3, var4, imageWidth, imageHeight, requiresBlending, processAlpha, true);
        }

        if (processAlpha && !alphaBlendingSupported && requiresBlending) {
            // Make alpha blending by hands if not supported
            for(int i = 0; i < imageDataRGB.length; ++i) {
                int var14;
                if ((var14 = imageDataRGB[i] >> 24 & 255) > 0 && var14 < 255) {
                    if (var10 < 0) {
                        if (var14 <= 64) {
                            imageDataRGB[i] = 0;
                        } else {
                            imageDataRGB[i] |= -16777216;
                        }
                    } else {
                        int var15 = 256 - var14;
                        long var17 = (long)((var10 >> 16 & 255) * var15);
                        long var19 = (long)((var10 >> 8 & 255) * var15);
                        long var21 = (long)((var10 & 255) * var15);
                        int var23;
                        long var24 = (long)(((var23 = imageDataRGB[i]) >> 16 & 255) * var14);
                        long var26 = (long)((var23 >> 8 & 255) * var14);
                        long var28 = (long)((var23 & 255) * var14);
                        int var30 = (int)(var17 + var24 >> 8);
                        int var31 = (int)(var19 + var26 >> 8);
                        int var32 = (int)(var21 + var28 >> 8);
                        if (var14 < 8) {
                            imageDataRGB[i] = 0;
                        } else {
                            imageDataRGB[i] = -16777216 | var30 << 16 | var31 << 8 | var32;
                        }
                    }
                }
            }
        }

        return Image.createRGBImage(imageDataRGB, imageWidth, imageHeight, processAlpha);
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
                        if ((var18 = div((var17 + 1) * var1, var8) - 1) < 0) {
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
                                var16 = var29 = div(256 * (var17 + 1) * var1, var8) & 255;
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
                                        var16 = var32 = div(256 * (var17 + 1) * var1, var8) & 255;
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
                        if ((var19 = div((var18 + 1) * var9, var4) - 1) < 0) {
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
                                        var17 = var33 = div(256 * (var18 + 1) * var9, var4) & 255;
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
                                var17 = var30 = div(256 * (var18 + 1) * var9, var4) & 255;
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

    private static boolean checkIfAlphaBlendingIsSupported() {
        if (alphaBlendingEnabled == 0) {
            int[] whiteARGB = new int[4];

            for(int i = 0; i < whiteARGB.length; ++i) {
                whiteARGB[i] = -2130706433;  // White color, transparency = 128
            }

            Image foreground = Image.createRGBImage(whiteARGB, 2, 2, true);
            Image background;
            Graphics myGraphics;
            (myGraphics = (background = Image.createImage(2, 2)).getGraphics()).setClip(0, 0, 2, 2);
            myGraphics.setColor(0);
            myGraphics.fillRect(0, 0, 2, 2);
            myGraphics.drawImage(foreground, 0, 0, Graphics.TOP | Graphics.LEFT);
            int[] blend = new int[4];
            background.getRGB(blend, 0, 2, 0, 0, 2, 2);

            try {
                if ((blend[0] & 255) > 16 && (blend[0] & 255) < 224 && Display.getDisplay(NET_Lizard.app).numAlphaLevels() > 2) {
                    alphaBlendingEnabled = 1;
                } else {
                    alphaBlendingEnabled = -1;
                }
            } catch (Exception e) {
                alphaBlendingEnabled = -1;
            }
        }

        return alphaBlendingEnabled > 0;
    }

    private static String readTextAssetFromBinary(byte[] binaryData) {
        byte offset = 0;
        if (binaryData.length >= 2 && binaryData[0] == -1 && binaryData[1] == -2) {
            offset = 2;
        }

        int textAssetSize = 0;

        for(int i = offset; i < binaryData.length && (binaryData[i] != 0 || i + 1 < binaryData.length && binaryData[i + 1] != 0); i += 2) {
            ++textAssetSize;
        }

        char[] textAssetData = new char[textAssetSize];
        int currentByte = offset;

        for(int i = 0; i < textAssetSize; ++i) {
            int rightByte;
            if ((rightByte = binaryData[currentByte]) < 0) {
                rightByte += 256;
            }

            ++currentByte;
            int leftByte;
            if ((leftByte = binaryData[currentByte]) < 0) {
                leftByte += 256;
            }

            ++currentByte;
            textAssetData[i] = (char)(leftByte * 256 + rightByte);   // (x * 256) === x << 8
        }

        String textAsset;
        // All text assets are starting with "_&" symbols
        if ((textAsset = new String(textAssetData)).length() >= 2 && textAsset.charAt(0) == '_' && textAsset.charAt(1) == '&') {
            textAsset = textAsset.substring(2, textAsset.length());
        }

        return textAsset;
    }

    public static final void destroyInstance() {
        instanceHandler = null;
    }

    public static final void createInstance() {
        instanceHandler = new AssetManager();
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
            var0[0] = (byte) f1;
            if (e1 > 0) {
                var0[4] = (byte) e1;
            }

            var0[8] = (byte) c1;
            var0[9] = (byte) g1;
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

        if (h1) {
            var0[6] = 1;
        }

        var0[10] = 0;
        if (k.ep) {
            var0[10] = 1;
        }

        var0[13] = (byte) m.K;
        var0[14] = 0;
        if (k.du) {
            var0[14] = 1;
        }

        return var0;
    }
}
