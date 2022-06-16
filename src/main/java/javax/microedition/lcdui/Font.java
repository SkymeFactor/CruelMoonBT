package javax.microedition.lcdui;

public class Font {
    public static Font getFont(int face, int style, int size) {
        return new Font();
    }

    public int getHeight() {
        java.awt.Font font = new java.awt.Font("TimesRoman", java.awt.Font.PLAIN, 16);
        java.awt.Canvas c = new java.awt.Canvas();
        return c.getFontMetrics(font).getHeight();
    }

    public int charWidth(char ch) {
        java.awt.Font font = new java.awt.Font("TimesRoman", java.awt.Font.PLAIN, 16);
        java.awt.Canvas c = new java.awt.Canvas();
        return c.getFontMetrics(font).charWidth(ch);
    }
}
