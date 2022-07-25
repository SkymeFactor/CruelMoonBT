import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

// Bluetooth's discovery manager client
final class ClientListener implements DiscoveryListener {
    public Vector<RemoteDevice> devices = new Vector<RemoteDevice>();

    public ClientListener(BluetoothManager context) {
    }

    public final void deviceDiscovered(RemoteDevice btDevice, DeviceClass cod) {
        cod.getMajorDeviceClass();
        if (!this.devices.contains(btDevice)) {
            this.devices.addElement(btDevice);
        }

    }

    public final void inquiryCompleted(int discType) {
        synchronized(this) {
            this.notify();
        }
    }

    public final void serviceSearchCompleted(int transID, int respCode) {
    }

    public final void servicesDiscovered(int transID, ServiceRecord[] servRecord) {
    }
}
