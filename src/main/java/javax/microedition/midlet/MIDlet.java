package javax.microedition.midlet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

public abstract class MIDlet {
    private final List<ActionListener> listeners = new ArrayList<>();
    private static final boolean connectionStatus = false;

    public void addListener(ActionListener listener) {
        listeners.add(listener);
    }

    public void removeListener(ActionListener listener) {
        listeners.remove(listener);
    }

    public abstract void startApp();
    public abstract void pauseApp();

    public abstract void destroyApp(boolean unconditional);

    public void notifyDestroyed() {
        int uniqueID = ((int) System.currentTimeMillis());
        ActionEvent event = new ActionEvent(this, uniqueID, "Destroyed");
        for (ActionListener listener: listeners)
            listener.actionPerformed(event);
    }

    public void notifyPaused() {
        int uniqueID = ((int) System.currentTimeMillis());
        ActionEvent event = new ActionEvent(this, uniqueID, "Paused");
        for (ActionListener listener: listeners)
            listener.actionPerformed(event);
    }

    public final boolean platformRequest(String URL) throws ConnectException {
        if (!connectionStatus)
            throw new ConnectException();
        return false;
    }

    public String getAppProperty(String key) {
        return System.getProperty(key);
    }
}
