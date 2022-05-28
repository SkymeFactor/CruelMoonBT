package javax.bluetooth;

import javax.microedition.io.Connection;

public class LocalDevice {
    public static LocalDevice getLocalDevice() {
        return new LocalDevice();
    }

    public ServiceRecord getRecord(Connection notifier) {
        return null;
    }

    public String getFriendlyName() {
        return new String();
    }

    public DiscoveryAgent getDiscoveryAgent() {
        return new DiscoveryAgent();
    }

    public boolean setDiscoverable(int mode) {
        return true;
    }
}
