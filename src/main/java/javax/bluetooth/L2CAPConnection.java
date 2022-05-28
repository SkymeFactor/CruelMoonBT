package javax.bluetooth;

import javax.microedition.io.Connection;

public class L2CAPConnection extends Connection {
    public int receive(byte[] inBuf) {
        return 0;
    }

    public void send(byte[] data) {
    }
}
