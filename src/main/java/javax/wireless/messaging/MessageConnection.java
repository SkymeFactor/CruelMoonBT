package javax.wireless.messaging;

import javax.microedition.io.Connection;

public class MessageConnection extends Connection {
    public TextMessage newMessage(String type) {
        return new TextMessage();
    }

    public void send(TextMessage msg) {
    }
}
