package javax.bluetooth;

public class DiscoveryAgent {
    public void searchServices(int[] attrSet, UUID[] uuidSet, RemoteDevice btDev, DiscoveryListener listener) throws BluetoothStateException {
    }

    public boolean startInquiry(int accessCode, DiscoveryListener listener) {
        return true;
    }

    public boolean cancelInquiry(DiscoveryListener listener) {
        return true;
    }
}
