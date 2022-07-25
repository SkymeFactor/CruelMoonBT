import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

// Bluetooth's discovery manager server
final class ServerListener implements DiscoveryListener {
    public ServiceRecord remoteService;

    public ServerListener(BluetoothManager context) {
    }

    public final void deviceDiscovered(RemoteDevice btDevice, DeviceClass cod) {
    }

    public final void inquiryCompleted(int discType) {
    }

    public final void serviceSearchCompleted(int transID, int respCode) {
        synchronized(this) {
            this.notify();
        }
    }

    public final void servicesDiscovered(int transID, ServiceRecord[] servRecord) {
        this.remoteService = servRecord[0];
    }
}
