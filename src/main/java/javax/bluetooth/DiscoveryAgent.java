package javax.bluetooth;

public class DiscoveryAgent {
    // =================== Constant fields ===================
    public static final int CACHED = 0;
    public static final int GIAC = 10390323;    // General/Unlimited inquiry access code
    public static final int LIAC = 10390272;    // Limited dedicated inquiry access code
    public static final int NOT_DISCOVERABLE = 0;
    public static final int PREKNOWN = 1;

    public int searchServices(int[] attrSet, UUID[] uuidSet, RemoteDevice btDev, DiscoveryListener listener) throws BluetoothStateException {
        return 0;
    }

    public boolean startInquiry(int accessCode, DiscoveryListener listener) {
        return true;
    }

    public boolean cancelInquiry(DiscoveryListener listener) {
        synchronized (listener) {
            listener.notify();
        }
        return true;
    }
}
