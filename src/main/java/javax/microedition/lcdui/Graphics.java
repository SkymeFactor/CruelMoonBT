package javax.microedition.lcdui;

import java.awt.*;

public class Graphics {
    private final java.awt.Graphics graphics;

    public Graphics(java.awt.Graphics graphics) {
        this.graphics = graphics;
    }

    public int getTranslateX() {
        return 0;
    }

    public int getTranslateY() {
        return 0;
    }

    public void translate(int x, int y) {
        graphics.translate(x, y);
    }

    public int getClipX() {
        return graphics.getClipBounds().x;
    }

    public int getClipY() {
        return graphics.getClipBounds().y;
    }

    public int getClipWidth() {
        return graphics.getClipBounds().width;
    }

    public int getClipHeight() {
        return graphics.getClipBounds().height;
    }

    public void setClip(int x, int y, int width, int height) {
        graphics.setClip(x, y, width, height);
    }

    public void drawRGB(int[] rgbData, int offset, int scanLength, int x, int y, int width, int height, boolean processAlpha) {
    }

    public int getColor() {
        return graphics.getColor().getRGB();
    }

    public void setColor(int RGB) {
        graphics.setColor(new Color(RGB));
    }

    public void fillRect(int x, int y, int width, int height) {
        graphics.fillRect(x, y, width, height);
    }

    public void setColor(int red, int green, int blue) {
        graphics.setColor(new Color(red, green, blue));
    }

    public void drawRect(int x, int y, int width, int height) {
        graphics.drawRect(x, y, width, height);
    }

    public void drawImage(Image img, int x, int y, int anchor) {
        graphics.drawImage(img.awtImage, x, y, null);
    }

    public void setFont(Font fnt) {
        graphics.setFont(new java.awt.Font("TimesRoman", java.awt.Font.PLAIN, 16));
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        graphics.drawLine(x1, y1, x2, y2);
    }

    public void drawChar(char character, int x, int y, int anchor) {
        graphics.drawString(String.valueOf(character), x, y);
    }
}
