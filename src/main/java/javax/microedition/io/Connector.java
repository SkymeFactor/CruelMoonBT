package javax.microedition.io;

import javax.bluetooth.L2CAPConnection;
import javax.bluetooth.L2CAPConnectionNotifier;
import javax.wireless.messaging.MessageConnection;
import java.io.IOException;

public abstract class Connector {
    public static Connection open(String name) throws IOException {
        try {
            String protocol = name.substring(0, name.indexOf(":"));
            Connection connection = null;

            switch (protocol) {
                case "btl2cap" -> {
                    if (name.contains("localhost"))
                        connection = new L2CAPConnectionNotifier();
                    else
                        connection = new L2CAPConnection();
                }
                case "sms" -> {
                    connection = new MessageConnection();
                }
                case "http" -> {

                }
                case "https" -> {
                }
            }
            return connection;
        } catch (Exception e) {
            throw new IOException();
        }
    }
}
