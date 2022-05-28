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

public final class GlomoRegisterStorage {
    public static boolean storeModificationTime = true;

    public GlomoRegisterStorage() {
    }

    public static final int getCurrentRegionIndex() {
        return (Integer) getRecordOfTypeSafe("generalInfo", 1, Integer.valueOf(-1));
    }

    public static final int setCurrentRegionIndex(int regionIndex) {
        return (Integer) setRecordInRecordStore((String)"generalInfo", 1, Integer.valueOf(regionIndex));
    }

    public static final long getRegistrationKey() {
        return (Long) getRecordOfTypeSafe("generalInfo", 7, Long.valueOf(0L));
    }

    public static final long setRegistrationKey(long key) {
        return (Long) setRecordInRecordStore((String)"generalInfo", 7, Long.valueOf(key));
    }

    public static final long getModificationTime() {
        return (Long) getRecordOfTypeSafe("generalInfo", 2, Long.valueOf(0L));
    }

    public static final long setModificationTime(long time) {
        return (Long) pushDataToRecordStore("generalInfo", 2, Long.valueOf(time), false);
    }

    private static long setCurrentModificationTime() {
        return setModificationTime(System.currentTimeMillis());
    }

    public static final long updateRunsCount() {
        return (Long) setRecordInRecordStore((String)"generalInfo", 3, Long.valueOf(getRunsCount() + 1L));
    }

    public static final long getRunsCount() {
        return (Long) getRecordOfTypeSafe("generalInfo", 3, 0L);
    }

    public static final String setPlatformName() {
        return (String) setRecordInRecordStore((String)"generalInfo", 4, System.getProperty("microedition.platform"));
    }

    public static final String getPlatformName() {
        return (String) getRecordOfTypeSafe("generalInfo", 4, new String(""));
    }

    public static final long getSubscriptionKey() {
        return (Long) getRecordOfTypeSafe("generalInfo", 12, Long.valueOf(0L));
    }

    public static final long setSubscriptionKey(long var0) {
        return (Long) setRecordInRecordStore((String)"generalInfo", 12, Long.valueOf(var0));
    }

    public static final String setClientEnteredKey(String var0) {
        return (String) setRecordInRecordStore((String)"generalInfo", 6, new String(var0));
    }

    public static final String getClientEnteredKey() {
        return (String) getRecordOfTypeSafe("generalInfo", 6, new String(""));
    }

    public static final int getSubscriptionStatus() {
        return (Integer) getRecordOfTypeSafe("generalInfo", 13, Integer.valueOf(0));
    }

    public static final int setSubscriptionStatus(int var0) {
        return (Integer) setRecordInRecordStore((String)"generalInfo", 13, Integer.valueOf(var0));
    }

    public static final long getSubscriptionExpireTime() {
        return (Long) getRecordOfTypeSafe("generalInfo", 9, Long.valueOf(0L));
    }

    public static final long setSubscriptionExpireTime(long time) {
        return (Long) setRecordInRecordStore((String)"generalInfo", 9, Long.valueOf(time));
    }

    public static final int setSubscriptionType(int subscribeType) {
        return (Integer) setRecordInRecordStore((String)"generalInfo", 10, Integer.valueOf(subscribeType));
    }

    public static final int getSubscriptionType() {
        return (Integer) getRecordOfTypeSafe("generalInfo", 10, Integer.valueOf(-1));
    }

    private static RecordStore getRecordStore(String recordStoreName) {
        try {
            return RecordStore.openRecordStore(recordStoreName, true);
        } catch (RecordStoreException recordStoreOpeningError) {
            recordStoreOpeningError.printStackTrace();
            return null;
        }
    }

    private static void reserveRecordStoreSpace(int maxRecords, RecordStore recordStore) {
        try {
            int numRecords;
            if ((numRecords = recordStore.getNumRecords()) < maxRecords) {
                ++numRecords;

                while(numRecords <= maxRecords) {
                    recordStore.addRecord((byte[])null, 0, 0);
                    ++numRecords;
                }
            }

        } catch (RecordStoreNotOpenException reservationError) {
            reservationError.printStackTrace();
        } catch (RecordStoreException e) {
            e.printStackTrace();
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

    private static Object setRecordInRecordStore(String recordStoreName, int recordId, Object value) {
        return pushDataToRecordStore(recordStoreName, recordId, value, true);
    }

    private static Object pushDataToRecordStore(String recordStoreName, int recordId, Object value, boolean rememberTime) {
        RecordStore myRecordStore = null;
        long completionStatus = -1L;
        long oldNumRecords = 0L;
        long newNumRecords = 0L;

        try {
            try {
                myRecordStore = getRecordStore(recordStoreName);
                if (recordId <= 0) {
                    recordId = myRecordStore.getNextRecordID();
                }

                oldNumRecords = (long)myRecordStore.getNumRecords();
                reserveRecordStoreSpace(recordId, myRecordStore);
                newNumRecords = (long)myRecordStore.getNumRecords();
                completionStatus = -2L;
                ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
                DataOutputStream dataStream = new DataOutputStream(byteStream);
                if (value.getClass().getName().compareTo("java.lang.Integer") == 0) {
                    dataStream.writeInt((Integer)value);
                } else if (value.getClass().getName().compareTo("java.lang.Long") == 0) {
                    dataStream.writeLong((Long)value);
                } else if (value.getClass().getName().compareTo("java.lang.Byte") == 0) {
                    dataStream.writeByte((Byte)value);
                } else if (value.getClass().getName().compareTo("java.lang.Boolean") == 0) {
                    dataStream.writeBoolean((Boolean)value);
                } else if (value.getClass().getName().compareTo("java.lang.String") == 0) {
                    dataStream.writeUTF((String)value);
                }

                completionStatus = -3L;
                dataStream.flush();
                byteStream.flush();
                completionStatus = -4L;
                byte[] recordData = byteStream.toByteArray();
                completionStatus = -5L;
                myRecordStore.setRecord(recordId, recordData, 0, recordData.length);
                completionStatus = -6L;
                dataStream.close();
                byteStream.close();
            } catch (RecordStoreNotOpenException ignore) {
                completionStatus += -10L;
            } catch (InvalidRecordIDException ignore) {
                completionStatus += -20L;
            } catch (RecordStoreFullException ignore) {
                completionStatus += -30L;
            } catch (RecordStoreException ignore) {
                completionStatus += -40L;
            } catch (SecurityException ignore) {
                completionStatus += -50L;
            } catch (Exception e) {
                completionStatus += -60L;
                e.printStackTrace();
            }

            // In case of success set value to decimal in format (completion, numOld, numNew).
            // Example: -6 007 008
            if (completionStatus <= -10L && value.getClass().getName().compareTo("java.lang.Long") == 0) {
                value = Long.valueOf((completionStatus * 1000L - oldNumRecords) * 1000L - newNumRecords);
            }
        } finally {
            closeRecordStore(myRecordStore);
        }

        if (rememberTime && storeModificationTime) {
            setCurrentModificationTime();
        }

        return value;
    }

    private static Object getRecordOfTypeSafe(String recordStoreName, int recordId, Object javaLanguageType) {
        RecordStore recordStore = null;
        Object returnObjectHandler = javaLanguageType;

        try {
            returnObjectHandler = getRecordOfType(recordStore = getRecordStore(recordStoreName), recordId, javaLanguageType);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeRecordStore(recordStore);
        }

        return returnObjectHandler;
    }

    private static Object getRecordOfType(RecordStore recordStore, int recordId, Object javaLanguageType) throws RuntimeException {
        try {
            byte[] recordValue;
            if ((recordValue = recordStore.getRecord(recordId)) != null && javaLanguageType != null) {
                ByteArrayInputStream recordByteStream = new ByteArrayInputStream(recordValue);
                DataInputStream recordDataStream = new DataInputStream(recordByteStream);

                if (javaLanguageType.getClass().getName().compareTo("java.lang.Integer") == 0) {
                    return Integer.valueOf(recordDataStream.readInt());
                } else if (javaLanguageType.getClass().getName().compareTo("java.lang.Long") == 0) {
                    return Long.valueOf(recordDataStream.readLong());
                } else if (javaLanguageType.getClass().getName().compareTo("java.lang.Byte") == 0) {
                    return Byte.valueOf(recordDataStream.readByte());
                } else if (javaLanguageType.getClass().getName().compareTo("java.lang.Boolean") == 0) {
                    return Boolean.valueOf(recordDataStream.readBoolean());
                } else if (javaLanguageType.getClass().getName().compareTo("java.lang.String") == 0) {
                    return new String(recordDataStream.readUTF());
                } else {
                    recordDataStream.close();
                    recordByteStream.close();
                    return javaLanguageType;
                }
            } else {
                return javaLanguageType;
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static final long getRegisterLastModificationTime() {
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
