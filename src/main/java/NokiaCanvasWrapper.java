//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class NokiaCanvasWrapper extends Canvas {
    private static final int SCREEN_WIDTH = 360;
    private static final int SCREEN_HEIGHT = 640;

    static int[] transparentRegionData;
    private static boolean apiCheckRequired = true;
    private static boolean nokiaApiEnabled = false;
    private static boolean siemensApiEnabled = false;

    public NokiaCanvasWrapper() {
        this.setFullScreenMode(true);
    }

    static final void fillRectTransparent(Graphics graphics, int x, int y, int width, int height, int color, int alpha) {
        int translateX = graphics.getTranslateX();
        int translateY = graphics.getTranslateY();
        graphics.translate(-translateX, -translateY);
        x += translateX;
        y += translateY;
        int transparentDataLength = SCREEN_WIDTH * 8;   // Because drawing is done by 8 lines of pixels
        if (transparentRegionData != null && SCREEN_WIDTH * 8 < transparentRegionData.length) {
            transparentDataLength = transparentRegionData.length;
        }

        boolean blendingFailed = true;

        int graphicsColor;
        try {
            graphicsColor = color + (alpha << 24);
            if (Display.getDisplay(NET_Lizard.app).numAlphaLevels() > 2) {
                if (transparentRegionData == null || transparentRegionData.length != transparentDataLength || transparentRegionData[0] != graphicsColor) {
                    if (transparentRegionData == null || transparentRegionData.length != transparentDataLength) {
                        if (transparentRegionData != null) {
                            transparentRegionData = null;
                        }

                        transparentRegionData = new int[transparentDataLength];
                    }
                    int[] var13 = transparentRegionData;

                    for(int i = 0; i < var13.length; ++i) {
                        var13[i] = graphicsColor;
                    }
                }

                int clipX = graphics.getClipX();
                int clipY = graphics.getClipY();
                int clipWidth = graphics.getClipWidth();
                int clipHeight = graphics.getClipHeight();
                int transparentRegionX = x;
                int transparentRegionY = y;
                if (x < clipX) {
                    width -= clipX - x;
                    transparentRegionX = clipX;
                }

                if (y < clipY) {
                    height -= clipY - y;
                    transparentRegionY = clipY;
                }

                if (transparentRegionX + width > clipX + clipWidth) {
                    width = clipX + clipWidth - transparentRegionX;
                }

                if (transparentRegionY + height > clipY + clipHeight) {
                    height = clipY + clipHeight - transparentRegionY;
                }

                try {
                    if (width > 0 && height > 0) {
                        graphics.setClip(transparentRegionX, transparentRegionY, width, height);

                        for(int i = transparentRegionY; i < transparentRegionY + height; i += 8) {
                            graphics.drawRGB(transparentRegionData, 0, SCREEN_WIDTH, 0, i, SCREEN_WIDTH, 8, true);
                        }
                    }

                    blendingFailed = false;
                } catch (Exception ignore) {
                }

                graphics.setClip(clipX, clipY, clipWidth, clipHeight);
            }
        } catch (Exception ignore) {
        }

        if (blendingFailed) {
            try {
                graphicsColor = graphics.getColor();
                graphics.setColor(color);
                graphics.fillRect(x, y, width, height);
                graphics.setColor(graphicsColor);
            } catch (Exception ignore) {
            }
        }

        graphics.translate(translateX, translateY);
    }

    @Override
    public int getHeight() {
        return SCREEN_HEIGHT;
    }

    @Override
    public int getWidth() {
        return SCREEN_WIDTH;
    }

    static final int standardizeKeyCodes(int keyCode) {
        int originalKeyCode = keyCode;
        switch(keyCode) {
            case -203:
            case -22:
            case -7:
            case -4:
            case 22: keyCode = -7; break;
            case -202:
            case -21:
            case -6:
            case -1:
            case 21: keyCode = -6; break;
        }

        if (apiCheckRequired) {
            apiCheckRequired = false;

            try {
                Class.forName("com.siemens.mp.media.control.VolumeControl");
                siemensApiEnabled = true;
            } catch (Exception ignore) {
            }

            try {
                Class.forName("com.nokia.mid.ui.FullCanvas");
                nokiaApiEnabled = true;
            } catch (Exception ignore) {
            }

            try {
                Class.forName("com.samsung.util.AudioClip");
                nokiaApiEnabled = true;
            } catch (Exception ignore) {
            }
        }

        if (siemensApiEnabled) {
            if (keyCode == -1) {
                return -6;
            }

            if (keyCode == -4) {
                return -7;
            }
        }

        if (nokiaApiEnabled) {
            if (keyCode == -6) {
                return -6;
            }

            if (keyCode == -7) {
                return -7;
            }

            if (keyCode == 10) {
                return -5;
            }
        }

        try {
            if (keyCode != KEY_STAR & keyCode != KEY_POUND && (keyCode < KEY_NUM0 || keyCode > KEY_NUM9)) {
                switch(NET_Lizard.game.getGameAction(originalKeyCode)) {
                    case UP: keyCode = -1; break;
                    case LEFT: keyCode = -3;
                    case 3:
                    case 4:
                    case 7:
                    default: break;
                    case RIGHT: keyCode = -4; break;
                    case DOWN: keyCode = -2; break;
                    case FIRE: keyCode = -5; break;
                }
            }
        } catch (Exception ignore) {
        }

        return keyCode;
    }

    static final Image a(Image img, int fileNumber) {
        try {
            Image returnImage;
            if ((returnImage = AssetManager.readImageFromFilePNG("/z" + fileNumber + ".png")) != null) {
                return returnImage;
            }
        } catch (Exception ignore) {
        }

        return Image.createImage(img, 0, 0, img.getWidth(), img.getHeight(), Image.TRANS_MIRROR);
    }

    @Override
    public void paint(java.awt.Graphics graphics) {
    }
}
