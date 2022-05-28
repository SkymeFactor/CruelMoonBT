package javax.microedition.lcdui;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Image {
    public final java.awt.Image awtImage;

    public Image(java.awt.Image image) {
        this.awtImage = image;
    }

    public static Image createImage(Image image, int x, int y, int width, int height, int transform) {
        return new Image(image.awtImage);
    }

    public static Image createImage(int width, int height) {
        return new Image(new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB));
    }

    public static Image createImage(byte[] imageData, int imageOffset, int imageLength) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new ByteArrayInputStream(imageData));
        } catch (IOException e) {
            img = null;
        }
        return new Image(img);
    }

    public static Image createRGBImage(int[] rgb, int width, int height, boolean processAlpha) {
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        WritableRaster raster = img.getRaster();
        raster.setPixels(0, 0, width, height, rgb);

        return new Image(img);
    }

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public javax.microedition.lcdui.Graphics getGraphics() {
        return new javax.microedition.lcdui.Graphics(this.awtImage.getGraphics());
    }

    public void getRGB(int[] rgbData, int offset, int scanLength, int x, int y, int width, int height) {
    }

    public boolean isMutable() {
        return true;
    }
}
