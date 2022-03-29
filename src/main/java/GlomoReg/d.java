//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package GlomoReg;

import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public final class d {
    private static MessageConnection a = null;
    private static boolean b = false;

    public d() {
    }

    public static boolean a(String var0, String var1) {
        b = false;
        if (var0.length() > 0) {
            try {
                if (a != null) {
                    a.close();
                    a = null;
                }

                TextMessage var4;
                (var4 = (TextMessage)(a = (MessageConnection)Connector.open("sms://" + var0)).newMessage("text")).setPayloadText(var1);
                a.send(var4);
                a.close();
                a = null;
                b = true;
            } catch (IllegalArgumentException var2) {
                throw var2;
            } catch (Exception var3) {
                throw var3;
            }
        }

        return b;
    }
}
