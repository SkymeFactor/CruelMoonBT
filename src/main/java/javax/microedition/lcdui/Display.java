package javax.microedition.lcdui;

import javax.microedition.midlet.MIDlet;

public class Display {
    public interface IPrepareCanvas {
        void initCanvas(Canvas cnv);
    };

    private static IPrepareCanvas onPrepareCanvas;

    public static void setInitCallback(IPrepareCanvas callback) {
        onPrepareCanvas = callback;
    }

    public static Display getDisplay(MIDlet app) {
        return new Display();
    }

    public int numAlphaLevels() {
        return 2;
    }

    public void vibrate(int duration) {
    }

    public void setCurrent(Displayable nextDisplayable) {
        if (nextDisplayable instanceof Canvas) {
            Canvas canvas = (Canvas) nextDisplayable;
            onPrepareCanvas.initCanvas(canvas);
        } else {
            System.out.println("[ Error ]: not a canvas displayable type");
        }
    }
}
