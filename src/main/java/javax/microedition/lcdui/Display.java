package javax.microedition.lcdui;

import javax.microedition.midlet.MIDlet;

public class Display {
    public static Display getDisplay(MIDlet app) {
        return new Display();
    }

    public int numAlphaLevels() {
        return 0;
    }

    public void vibrate(int var0) {
    }

    public void setCurrent(Displayable k) {
    }
}
