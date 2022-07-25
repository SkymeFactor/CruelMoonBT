package javax.bluetooth;

public interface DiscoveryListener {
    void deviceDiscovered(RemoteDevice btDevice, DeviceClass cod);
    void inquiryCompleted(int discType);
    void servicesDiscovered(int transID, ServiceRecord[] servRecord);
    void serviceSearchCompleted(int transID, int respCode);
}
