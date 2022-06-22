package javax.microedition.lcdui;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Image {

    public static final int	TRANS_MIRROR = 2;
    public static final int	TRANS_MIRROR_ROT180 = 1;
    public static final int	TRANS_MIRROR_ROT270 = 4;
    public static final int	TRANS_MIRROR_ROT90 = 7;
    public static final int	TRANS_NONE = 0;
    public static final int	TRANS_ROT180 = 3;
    public static final int	TRANS_ROT270 = 6;
    public static final int	TRANS_ROT90 = 5;


    public final BufferedImage awtImage;

    public Image(BufferedImage image) {
        this.awtImage = image;
    }

    public static Image createImage(Image image, int x, int y, int width, int height, int transform) {
        BufferedImage src = image.awtImage.getSubimage(x, y, width, height);

        double theta = 0;
        int sx = 1, sy = 1;
        boolean swapWH = false;
        AffineTransform affineTransform = new AffineTransform();

        // Extract transformation parameters
        switch (transform) {
            case TRANS_MIRROR: sx = -1; break;
            case TRANS_MIRROR_ROT90: theta = Math.PI * 0.5; sx = -1; swapWH = true; break;
            case TRANS_MIRROR_ROT180: theta = Math.PI; sx = -1; break;
            case TRANS_MIRROR_ROT270: theta = Math.PI * 1.5; sx = -1; swapWH = true; break;
            case TRANS_ROT90: theta = Math.PI * 0.5; swapWH = true; break;
            case TRANS_ROT180: theta = Math.PI; break;
            case TRANS_ROT270: theta = Math.PI * 1.5; swapWH = true; break;
            case TRANS_NONE: return new Image(src);
            default: break;
        }

        if (swapWH) {
            int tmp = height;
            height = width;
            width = tmp;
        }
        BufferedImage dst = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // Mirroring
        affineTransform.translate(width / 2.0, height / 2.0);
        affineTransform.scale(sx, sy);
        affineTransform.translate(-width / 2.0, -height / 2.0);
        // Rotation
        affineTransform.translate((width - src.getWidth()) / 2.0, (height - src.getHeight()) / 2.0);
        affineTransform.rotate(theta, src.getWidth() / 2.0, src.getHeight() / 2.0);

        // Draw transformation into the destination image
        Graphics2D g2d = dst.createGraphics();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
        g2d.setTransform(affineTransform);
        g2d.drawImage(src, 0, 0, null);

        return new Image(dst);
    }

    public static Image createImage(int width, int height)
            throws IllegalArgumentException
    {
        if (width <= 0 || height <= 0)
            throw new IllegalArgumentException();
        return new Image(new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB));
    }

    public static Image createImage(byte[] imageData, int imageOffset, int imageLength)
            throws ArrayIndexOutOfBoundsException, NullPointerException, IllegalArgumentException
    {
        // Error checks
        if (imageData == null)
            throw new NullPointerException();
        if (imageOffset < 0
                || imageOffset > imageData.length
                || imageLength < 0
                || imageLength > imageData.length - imageOffset
        )
            throw new ArrayIndexOutOfBoundsException();

        // Method's body
        BufferedImage img;
        try {
            img = ImageIO.read(new ByteArrayInputStream(imageData));
        } catch (Exception e) {
            img = null;
        }

        if (img == null)
            throw new IllegalArgumentException();

        return new Image(img);
    }

    public static Image createRGBImage(int[] rgb, int width, int height, boolean processAlpha)
            throws NullPointerException, IllegalArgumentException, ArrayIndexOutOfBoundsException
    {
        // Error checks
        if (rgb == null)
            throw new NullPointerException();
        if (width <= 0 || height <= 0)
            throw new IllegalArgumentException();
        if (rgb.length < width * height)
            throw new ArrayIndexOutOfBoundsException();

        // Method's body
        BufferedImage img = new BufferedImage(
                width, height,
                processAlpha ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB
        );
        WritableRaster raster = img.getRaster();
        raster.setDataElements(0, 0, width, height, rgb);

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
        awtImage.getRGB(x, y, width, height, rgbData, offset, scanLength);
    }

    public boolean isMutable() {
        return true;
    }
}
