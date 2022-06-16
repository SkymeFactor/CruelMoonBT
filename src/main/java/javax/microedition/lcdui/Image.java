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

    public static Image createImage(byte[] imageData, int imageOffset, int imageLength)
            throws ArrayIndexOutOfBoundsException, NullPointerException, IllegalArgumentException
    {
        if (imageData == null)
            throw new NullPointerException();

        if (imageOffset < 0
                || imageOffset > imageData.length
                || imageLength < 0
                || imageLength > imageData.length - imageOffset
        )
            throw new ArrayIndexOutOfBoundsException();

        BufferedImage img = null;

        try {
            img = ImageIO.read(new ByteArrayInputStream(imageData));
        } catch (Exception e) {
            img = null;
        }

        if (img == null)
            throw new IllegalArgumentException();

        return new Image(img);
    }

    public static Image createRGBImage(int[] rgb, int width, int height, boolean processAlpha) {
        BufferedImage img = new BufferedImage(
                width, height,
                //processAlpha ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB
                BufferedImage.TYPE_INT_ARGB
        );
        WritableRaster raster = img.getRaster();
        raster.setPixels(0, 0, width, height, rgb);

        return new Image(img);
    }

    public int getWidth() {
        return awtImage.getWidth(null);
    }

    public int getHeight() {
        return awtImage.getHeight(null);
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
