//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

// Bluetooth's discovery manager client
final class MyDiscoveryAgent implements DiscoveryListener {
    public Vector devices = new Vector();

    public MyDiscoveryAgent(n var1) {
    }

    public final void deviceDiscovered(RemoteDevice var1, DeviceClass var2) {
        var2.getMajorDeviceClass();
        if (!this.devices.contains(var1)) {
            this.devices.addElement(var1);
        }

    }

    public final void inquiryCompleted(int var1) {
        synchronized(this) {
            this.notify();
        }
    }

    public final void serviceSearchCompleted(int var1, int var2) {
    }

    public final void servicesDiscovered(int var1, ServiceRecord[] var2) {
    }
}
