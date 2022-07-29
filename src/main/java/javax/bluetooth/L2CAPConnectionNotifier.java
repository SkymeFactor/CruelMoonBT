package javax.bluetooth;

import javax.microedition.io.Connection;
import java.io.IOException;

public class L2CAPConnectionNotifier implements Connection {
    public L2CAPConnection acceptAndOpen() throws IOException {
        return new L2CAPConnection();
    }

    @Override
    public void close() {

    }
}
