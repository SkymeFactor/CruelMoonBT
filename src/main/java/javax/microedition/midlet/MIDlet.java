package javax.microedition.midlet;

public abstract class MIDlet {
    public abstract void startApp();
    public abstract void pauseApp();

    public abstract void destroyApp(boolean unconditional);
    public void notifyDestroyed() {};
    public void notifyPaused() {};

    public boolean platformRequest(String URL) {
        return false;
    }

    public String getAppProperty(String key) {
        return new String();
    }
}
