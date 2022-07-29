//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

// Bluetooth Debug Logger
public final class BTLoggerDBG {
    static short[] msgIndices;
    static int logSize;
    static String[] messages;
    static int logIndex;

    public BTLoggerDBG() {
    }

    static void log(String msg) {
        int maxMessages = logSize;
        if (logIndex >= logSize) {
            for(int i = 0; i < maxMessages; ++i) {
                msgIndices[i] = (short)((msgIndices[i] + 1) % maxMessages);
            }

            messages[logIndex % maxMessages] = new String(msg);
        } else {
            messages[logIndex] = new String(msg);
        }

        ++logIndex;
        System.out.println("[ BT_INFO ]: " + msg);
    }

    private static void clean() {
        messages = null;
        msgIndices = null;
    }

    static void initialize(int maxSize) {
        clean();
        logSize = maxSize;
        logIndex = 0;
        int maxMessages = logSize;
        messages = new String[logSize];
        msgIndices = new short[logSize];

        for(int i = 0; i < maxMessages; ++i) {
            messages[i] = new String();
            msgIndices[i] = (short)i;
        }

    }
}
