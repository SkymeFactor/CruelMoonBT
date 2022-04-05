//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public final class SMSSender {
    private static MessageConnection connection = null;
    private static boolean sendingSuccess = false;

    public SMSSender() {
    }

    public static boolean a(String phoneNumber, String messageText) {
        sendingSuccess = false;
        if (phoneNumber.length() > 0) {
            try {
                if (connection != null) {
                    connection.close();
                    connection = null;
                }

                TextMessage msg;
                (msg = (TextMessage)(connection = (MessageConnection)Connector.open("sms://" + phoneNumber)).newMessage("text")).setPayloadText(messageText);
                connection.send(msg);
                connection.close();
                connection = null;
                sendingSuccess = true;
            } catch (IllegalArgumentException eIllegalArgument) {
                throw eIllegalArgument;
            } catch (Exception e) {
                throw e;
            }
        }

        return sendingSuccess;
    }
}
