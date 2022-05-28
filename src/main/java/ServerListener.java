//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

// Bluetooth's discovery manager server
final class ServerListener implements DiscoveryListener {
    public ServiceRecord a;

    public ServerListener(n var1) {
    }

    public final void deviceDiscovered(RemoteDevice var1, DeviceClass var2) {
    }

    public final void inquiryCompleted(int var1) {
    }

    public final void serviceSearchCompleted(int var1, int var2) {
        synchronized(this) {
            this.notify();
        }
    }

    public final void servicesDiscovered(int var1, ServiceRecord[] var2) {
        this.a = var2[0];
    }
}
