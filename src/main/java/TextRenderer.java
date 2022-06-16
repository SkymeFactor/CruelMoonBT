import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;


public final class TextRenderer {

    int fontHeight;
    int shadowColor = -1;
    Font defaultFont;
    int primaryColor = 2708892;     // Deep blue, ARGB
    int shadowWidth = 1;
    int shadowHeight = 1;
    String colorMode = "";          // Optionally can contain "2" for a white color

    public TextRenderer() {
        this.initialize();
        if (this.defaultFont == null) {
            this.useDefaultFontSettings();
        }

    }

    private final int[] getAlignedOrigin(String str, int align, int offset, int length) {
        int[] newOrigin = new int[2];  // Zeroed by default
        int xOffset = this.fontHeight + this.shadowHeight;
        int yOffset = this.getSubstringWidth(str, offset, length);
        if ((align & Graphics.BOTTOM) > 0) {
            newOrigin[1] -= xOffset;
        }

        if ((align & Graphics.VCENTER) > 0) {
            newOrigin[1] -= xOffset >> 1;
        }

        if ((align & Graphics.RIGHT) > 0) {
            newOrigin[0] -= yOffset;
        }

        if ((align & Graphics.HCENTER) > 0) {
            newOrigin[0] -= yOffset >> 1;
        }

        return newOrigin;
    }

    public final int getSymbolWidth(char symbol) {
        return symbol != '\n' && symbol != '\r' ? this.defaultFont.charWidth(symbol) + this.shadowWidth : 0;
    }

    private final void initialize() {
        if (this.defaultFont == null) {
            this.useDefaultFontSettings();
        }

        this.fontHeight = this.defaultFont.getHeight() - this.shadowHeight;
    }

    private final void useDefaultFontSettings() {
        this.defaultFont = Font.getFont(0, 0, 8);
        if (this.colorMode.length() > 0 && this.colorMode.charAt(0) == '2') {
            this.primaryColor = 16777215;   // White
        }

    }

    private int drawSymbol(Graphics graphics, char symbol, int x, int y) {
        try {
            graphics.setFont(this.defaultFont);
            int colorRestore = graphics.getColor();
            y -= this.defaultFont.getHeight();
            if (this.shadowColor >= 0) {
                graphics.setColor(this.shadowColor);
                graphics.drawChar(symbol, x + 1, y + 1, 20);
            }

            graphics.setColor(this.primaryColor);
            graphics.drawChar(symbol, x, y, 20);
            graphics.setColor(colorRestore);
        } catch (Exception ignore) {
        }

        return this.getSymbolWidth(symbol);
    }

    public final int drawSymbolAligned(Graphics graphics, char symbol, int x, int y, int align) {
        int xAligned = x;
        int yAligned = y + this.fontHeight;
        String str = "" + symbol;
        if (align != 0 && align != (Graphics.TOP | Graphics.LEFT)) {
            int[] origin = this.getAlignedOrigin((String)str, (int)align, 0, 1);
            xAligned = x + origin[0];
            yAligned += origin[1];
        }

        return this.drawSymbol(graphics, symbol, xAligned, yAligned);
    }

    public final void drawTextAligned(Graphics graphics, String str, int x, int y, int align) {
        this.drawSubstringAligned(graphics, str, 0, str.length(), x, y, align);
    }

    private void drawSubstringAligned(Graphics graphics, String str, int offset, int length, int x, int y, int align) {
        int xAligned = x;
        int yAligned = y + this.fontHeight;
        if (align != 0 && align != (Graphics.TOP | Graphics.LEFT)) {
            int[] origin = this.getAlignedOrigin(str, align, offset, length);
            xAligned = x + origin[0];
            yAligned += origin[1];
        }

        for(int i = offset; i < offset + length; ++i) {
            xAligned += this.drawSymbol(graphics, str.charAt(i), xAligned, yAligned);
        }
    }

    public static TextRenderer getInstance() {
        return new TextRenderer();
    }

    public final int getTextHeight() {
        return this.shadowHeight + this.fontHeight;
    }

    public final int getTextWidth(String str) {
        int width = 0;
        int length = str.length();

        for(int i = 0; i < length; ++i) {
            width += this.getSymbolWidth(str.charAt(i));
        }

        return width;
    }

    private int getSubstringWidth(String str, int offset, int length) {
        int width = 0;

        for(int i = 0; i < length; ++i) {
            width += this.getSymbolWidth(str.charAt(i + offset));
        }

        return width;
    }
}
