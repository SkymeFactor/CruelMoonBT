package javax.microedition.lcdui;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public abstract class Canvas extends JPanel implements Displayable{
    private final BufferedImage screen = new BufferedImage(360, 640, BufferedImage.TYPE_INT_ARGB);

    public static final int FIRE = 8;
    public static final int LEFT = 2;
    public static final int RIGHT = 5;
    public static final int UP = 1;
    public static final int DOWN = 6;

    public static final int KEY_SOFTKEY1 = 21;
    public static final int KEY_SOFTKEY2 = 22;
    public static final int KEY_STAR = 42;
    public static final int KEY_POUND = 35;
    public static final int KEY_NUM0 = 48;
    public static final int KEY_NUM1 = 49;
    public static final int KEY_NUM2 = 50;
    public static final int KEY_NUM3 = 51;
    public static final int KEY_NUM4 = 52;
    public static final int KEY_NUM5 = 53;
    public static final int KEY_NUM6 = 54;
    public static final int KEY_NUM7 = 55;
    public static final int KEY_NUM8 = 56;
    public static final int KEY_NUM9 = 57;

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(360, 640);
    }

    public int getGameAction(int keyCode) {
        return keyCode;
    }

    public void setFullScreenMode(boolean mode) {
    }

    public void repaint() {
        super.repaint();
    }

    public abstract void paint(Graphics graphics);

    @Override
    protected void paintComponent(java.awt.Graphics graphics) {
        super.paintComponent(graphics);
        System.out.println(getWidth() + "" + getHeight());
        graphics.drawImage(screen, 0, 0, getWidth(), getHeight(), Color.WHITE, null);
    }

    public void serviceRepaints() {
    }

    public boolean hasPointerEvents() {
        return false;
    }

    protected void hideNotify() {
    }

    public boolean isDoubleBuffered() {
        return false;
    }

    protected void showNotify() {
    }

    protected abstract void keyPressed(int keyCode);
    protected abstract void keyReleased(int keyCode);

    public final KeyListener keyListener = new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = convertKeyEventToKeyCode(e);
            if (keyCode != 0)
                Canvas.this.keyPressed(keyCode);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = convertKeyEventToKeyCode(e);
            if (keyCode != 0)
                Canvas.this.keyReleased(keyCode);
        }
    };

    private static int convertKeyEventToKeyCode(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                return javax.microedition.lcdui.Canvas.FIRE;
            case KeyEvent.VK_LEFT:
                return javax.microedition.lcdui.Canvas.LEFT;
            case KeyEvent.VK_RIGHT:
                return javax.microedition.lcdui.Canvas.RIGHT;
            case KeyEvent.VK_UP:
                return javax.microedition.lcdui.Canvas.UP;
            case KeyEvent.VK_DOWN:
                return javax.microedition.lcdui.Canvas.DOWN;
            case KeyEvent.VK_1:
                return javax.microedition.lcdui.Canvas.KEY_SOFTKEY1;
            case KeyEvent.VK_BACK_SPACE:
                return javax.microedition.lcdui.Canvas.KEY_SOFTKEY2;
            default:
                System.out.println("unknown keyEvent: " + keyEvent);
                return 0;
        }
    }

}
