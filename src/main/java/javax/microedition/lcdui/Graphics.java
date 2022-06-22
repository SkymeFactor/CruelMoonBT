package javax.microedition.lcdui;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class Graphics {

    public final static int HCENTER = 1;
    public final static int VCENTER = 2;
    public final static int LEFT = 4;
    public final static int RIGHT = 8;
    public final static int TOP = 16;
    public final static int BOTTOM = 32;
    public final static int BASELINE = 64;

    private final java.awt.Graphics graphics;
    private final java.awt.font.FontRenderContext frc;
    private int translateX = 0, translateY = 0;

    public Graphics(java.awt.Graphics graphics) {
        this.graphics = graphics;
        frc = new FontRenderContext(new AffineTransform(), false, false);
    }

    public int getTranslateX() {
        return translateX;
    }

    public int getTranslateY() {
        return translateY;
    }

    public void translate(int x, int y) {
        graphics.translate(x, y);
        translateX += x;
        translateY += y;
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
        BufferedImage img = new BufferedImage(
                width, height,
                processAlpha ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB
        );
        img.setRGB(0, 0, width, height, rgbData, offset, scanLength);

        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
        g2d.drawImage(img, x, y, null);
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
        x = getAnchorX(x, img.getWidth(), anchor);
        y = getAnchorY(y, img.getHeight(), anchor);

        graphics.drawImage(img.awtImage, x, y, null);
    }

    public void setFont(Font fnt) {
        graphics.setFont(new java.awt.Font("TimesRoman", java.awt.Font.PLAIN, 16));
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        graphics.drawLine(x1, y1, x2, y2);
    }

    public void drawChar(char character, int x, int y, int anchor) {
        Rectangle2D bounds = graphics.getFont().getStringBounds(String.valueOf(character), frc);
        x = getAnchorX(x, (int) bounds.getWidth(), anchor);
        y = getAnchorY(y, (int) bounds.getHeight(), anchor) + (int) (bounds.getHeight());

        graphics.drawString(String.valueOf(character), x, y);
    }

    private static int getAnchorX(int x, int size, int anchor) {
        if ((anchor & LEFT) != 0) {
            return x;
        }
        if ((anchor & RIGHT) != 0) {
            return x - size;
        }
        if ((anchor & HCENTER) != 0) {
            return x - size / 2;
        }
        throw new RuntimeException("Unknown anchor: " + anchor);
    }

    private static int getAnchorY(int y, int size, int anchor) {
        if ((anchor & TOP) != 0) {
            return y;
        }
        if ((anchor & BOTTOM) != 0) {
            return y - size;
        }
        if ((anchor & VCENTER) != 0) {
            return y - size / 2;
        }
        throw new RuntimeException("Unknown anchor: " + anchor);
    }

}
