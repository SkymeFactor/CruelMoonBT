package javax.microedition.lcdui;

public class Image {
    public static Image createImage(Image image, int x, int y, int width, int height, int transform) {
        return new Image();
    }

    public static Image createImage(int width, int height) {
        return new Image();
    }

    public static Image createImage(byte[] imageData, int imageOffset, int imageLength) {
        return new Image();
    }

    public static Image createRGBImage(int[] rgb, int width, int height, boolean processAlpha) {
        return new Image();
    }

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public Graphics getGraphics() {
        return new Graphics();
    }

    public void getRGB(int[] rgbData, int offset, int scanLength, int x, int y, int width, int height) {
    }

    public boolean isMutable() {
        return true;
    }
}
