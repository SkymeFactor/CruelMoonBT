package javax.microedition.rms;

public class RecordStore {
    public static RecordStore openRecordStore(String recordStoreName, boolean createIfNecessary) throws RecordStoreException {
        return new RecordStore();
    }

    public static String[] listRecordStores() {
        return new String[0];
    }

    public static void deleteRecordStore(String recordStoreName) {
    }

    public int getNumRecords() {
        return 0;
    }

    public int getRecord(int recordId, byte[] buffer, int offset) {
        return 0;
    }

    public void closeRecordStore() throws RecordStoreNotOpenException, RecordStoreException {
    }

    public byte[] getRecord(int recordId) {
        return null;
    }

    public long getLastModified() {
        return 0;
    }

    public void setRecord(int recordId, byte[] newData, int offset, int numBytes) {
    }

    public void addRecord(byte[] data, int offset, int numBytes) throws RecordStoreException {
    }

    public int getNextRecordID() throws RecordStoreException {
        return 0;
    }
}
