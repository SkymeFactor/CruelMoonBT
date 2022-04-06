//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotOpenException;

public final class h {
    public static boolean a = true;

    public h() {
    }

    public static final int a() {
        return (Integer)b("generalInfo", 1, Integer.valueOf(-1));
    }

    public static final int a(int var0) {
        return (Integer)a((String)"generalInfo", 1, Integer.valueOf(var0));
    }

    public static final long b() {
        return (Long)b("generalInfo", 7, Long.valueOf(0L));
    }

    public static final long a(long var0) {
        return (Long)a((String)"generalInfo", 7, Long.valueOf(var0));
    }

    public static final long c() {
        return (Long)b("generalInfo", 2, Long.valueOf(0L));
    }

    public static final long b(long var0) {
        return (Long)a("generalInfo", 2, Long.valueOf(var0), false);
    }

    private static long n() {
        return b(System.currentTimeMillis());
    }

    public static final long d() {
        return (Long)a((String)"generalInfo", 3, Long.valueOf(e() + 1L));
    }

    public static final long e() {
        return (Long)b("generalInfo", 3, 0L);
    }

    public static final String f() {
        return (String)a((String)"generalInfo", 4, System.getProperty("microedition.platform"));
    }

    public static final String g() {
        return (String)b("generalInfo", 4, new String(""));
    }

    public static final long h() {
        return (Long)b("generalInfo", 12, Long.valueOf(0L));
    }

    public static final long c(long var0) {
        return (Long)a((String)"generalInfo", 12, Long.valueOf(var0));
    }

    public static final String a(String var0) {
        return (String)a((String)"generalInfo", 6, new String(var0));
    }

    public static final String i() {
        return (String)b("generalInfo", 6, new String(""));
    }

    public static final int j() {
        return (Integer)b("generalInfo", 13, Integer.valueOf(0));
    }

    public static final int b(int var0) {
        return (Integer)a((String)"generalInfo", 13, Integer.valueOf(var0));
    }

    public static final long k() {
        return (Long)b("generalInfo", 9, Long.valueOf(0L));
    }

    public static final long d(long var0) {
        return (Long)a((String)"generalInfo", 9, Long.valueOf(var0));
    }

    public static final int c(int var0) {
        return (Integer)a((String)"generalInfo", 10, Integer.valueOf(var0));
    }

    public static final int l() {
        return (Integer)b("generalInfo", 10, Integer.valueOf(-1));
    }

    private static RecordStore getRecordStore(String recordStoreName) {
        try {
            return RecordStore.openRecordStore(recordStoreName, true);
        } catch (RecordStoreException recordStoreOpeningError) {
            recordStoreOpeningError.printStackTrace();
            return null;
        }
    }

    private static void a(int var0, RecordStore var1) {
        try {
            int var2;
            if ((var2 = var1.getNumRecords()) < var0) {
                ++var2;

                while(var2 <= var0) {
                    var1.addRecord((byte[])null, 0, 0);
                    ++var2;
                }
            }

        } catch (RecordStoreNotOpenException var3) {
            var3.printStackTrace();
        } catch (RecordStoreException var4) {
            var4.printStackTrace();
        }
    }

    private static void closeRecordStore(RecordStore recordStore) {
        if (recordStore != null) {
            try {
                recordStore.closeRecordStore();
            } catch (RecordStoreNotOpenException recordStoreClosingError) {
                recordStoreClosingError.printStackTrace();
            } catch (RecordStoreException e) {
                e.printStackTrace();
            }
        }
    }

    private static Object a(String var0, int var1, Object var2) {
        return a(var0, var1, var2, true);
    }

    private static Object a(String var0, int var1, Object var2, boolean var3) {
        RecordStore var4 = null;
        long var5 = -1L;
        long var7 = 0L;
        long var9 = 0L;

        try {
            try {
                var4 = getRecordStore(var0);
                if (var1 <= 0) {
                    var1 = var4.getNextRecordID();
                }

                var7 = (long)var4.getNumRecords();
                a(var1, var4);
                var9 = (long)var4.getNumRecords();
                var5 = -2L;
                ByteArrayOutputStream var27 = new ByteArrayOutputStream();
                DataOutputStream var11 = new DataOutputStream(var27);
                if (var2.getClass().getName().compareTo("java.lang.Integer") == 0) {
                    var11.writeInt((Integer)var2);
                } else if (var2.getClass().getName().compareTo("java.lang.Long") == 0) {
                    var11.writeLong((Long)var2);
                } else if (var2.getClass().getName().compareTo("java.lang.Byte") == 0) {
                    var11.writeByte((Byte)var2);
                } else if (var2.getClass().getName().compareTo("java.lang.Boolean") == 0) {
                    var11.writeBoolean((Boolean)var2);
                } else if (var2.getClass().getName().compareTo("java.lang.String") == 0) {
                    var11.writeUTF((String)var2);
                }

                var5 = -3L;
                var11.flush();
                var27.flush();
                var5 = -4L;
                byte[] var12 = var27.toByteArray();
                var5 = -5L;
                var4.setRecord(var1, var12, 0, var12.length);
                var5 = -6L;
                var11.close();
                var27.close();
            } catch (RecordStoreNotOpenException var20) {
                var5 += -10L;
            } catch (InvalidRecordIDException var21) {
                var5 += -20L;
            } catch (RecordStoreFullException var22) {
                var5 += -30L;
            } catch (RecordStoreException var23) {
                var5 += -40L;
            } catch (SecurityException var24) {
                var5 += -50L;
            } catch (Exception var25) {
                var5 += -60L;
                var25.printStackTrace();
            }

            if (var5 <= -10L && var2.getClass().getName().compareTo("java.lang.Long") == 0) {
                var2 = Long.valueOf((var5 * 1000L - var7) * 1000L - var9);
            }
        } finally {
            closeRecordStore(var4);
        }

        if (var3 && a) {
            n();
        }

        return var2;
    }

    private static Object b(String var0, int var1, Object var2) {
        RecordStore var3 = null;
        Object var4 = var2;

        try {
            var4 = a(var3 = getRecordStore(var0), var1, var2);
        } catch (Exception var7) {
            var7.printStackTrace();
        } finally {
            closeRecordStore(var3);
        }

        return var4;
    }

    private static Object a(RecordStore var0, int var1, Object var2) throws RuntimeException {
        try {
            byte[] var4;
            if ((var4 = var0.getRecord(var1)) != null && var2 != null) {
                ByteArrayInputStream var5 = new ByteArrayInputStream(var4);
                DataInputStream var6 = new DataInputStream(var5);

                if (var2.getClass().getName().compareTo("java.lang.Integer") == 0) {
                    return Integer.valueOf(var6.readInt());
                } else if (var2.getClass().getName().compareTo("java.lang.Long") == 0) {
                    return Long.valueOf(var6.readLong());
                } else if (var2.getClass().getName().compareTo("java.lang.Byte") == 0) {
                    return Byte.valueOf(var6.readByte());
                } else if (var2.getClass().getName().compareTo("java.lang.Boolean") == 0) {
                    return Boolean.valueOf(var6.readBoolean());
                } else if (var2.getClass().getName().compareTo("java.lang.String") == 0) {
                    return new String(var6.readUTF());
                } else {
                    var6.close();
                    var5.close();
                    return var2;
                }
            } else {
                return var2;
            }
        } catch (Exception var3) {
            throw new RuntimeException(var3.getMessage());
        }
    }

    public static final long getGeneralInfoLastModificationTime() {
        RecordStore generalInfoRecordStore = null;
        long lastModificationTime = 0L;

        try {
            lastModificationTime = (generalInfoRecordStore = getRecordStore("generalInfo")).getLastModified();
        } catch (Exception recordStoreOpeningError) {
            recordStoreOpeningError.printStackTrace();
        } finally {
            closeRecordStore(generalInfoRecordStore);
        }

        return lastModificationTime;
    }
}
