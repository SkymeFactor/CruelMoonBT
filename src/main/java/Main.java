import javax.microedition.midlet.MIDlet;

public class Main {
    public static void main(String[] argv) {
        System.setProperty("microedition.platform", "j2me-emulation-host");
        MIDlet myMidlet = new NET_Lizard();
        myMidlet.startApp();
        System.out.println("Awesome work!");
        return;
    }
}
