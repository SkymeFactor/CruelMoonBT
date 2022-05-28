package javax.microedition.io;

public class Connector {
    public static Connection open(String name) {
        return new Connection();
    }
}
