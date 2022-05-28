package javax.microedition.lcdui;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Canvas extends JPanel implements Displayable{
    private final BufferedImage screen = new BufferedImage(360, 640, BufferedImage.TYPE_INT_ARGB);

    public static final int FIRE = 8;
    public static final int LEFT = 2;
    public static final int RIGHT = 5;
    public static final int UP = 1;
    public static final int DOWN = 6;

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

    @Override
    protected void paintComponent(java.awt.Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(screen, 0, 0, getWidth(), getHeight(), Color.WHITE, null);
    }

    public void serviceRepaints() {
    }

    public boolean hasPointerEvents() {
        return true;
    }

    protected void hideNotify() {
    }

    public boolean isDoubleBuffered() {
        return true;
    }

    protected void showNotify() {
    }
}
