import GlomoReg.GlomoRegStarter;
import GlomoReg.GlomoRegionPolicyManager;

import javax.imageio.ImageIO;
import javax.microedition.lcdui.Canvas;
import javax.microedition.midlet.MIDlet;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Main {

    public static void main(String[] argv) {
        JFrame frame = new JFrame("MoonBT");
        ImageIcon icon = new ImageIcon( Objects.requireNonNull(Main.class.getResource("/icons/ico.png")) );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas myCanvas = new Canvas();
        frame.add(myCanvas);
        frame.setIconImage(icon.getImage());
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        System.setProperty("microedition.platform", "j2me-emulation-host");
        System.setProperty("MIDlet-Vendor", "NET Lizard");
        System.setProperty("MIDlet-Name", "Moon BT");
        System.setProperty("MIDlet-1", "Moon BT, /icons/ico.png, NET_Lizard");
        MIDlet myMidlet = new NET_Lizard();
        myMidlet.startApp();
        System.out.println("Awesome work!");
        //System.out.println(h.decodeBinaryString(new int[]{1819934720}));
        try {
            BufferedImage img = ImageIO.read(new File(System.getProperty("user.dir") + "/src/main/resources/Decoded/img/li0.png"));
            //myCanvas.getGraphics().drawImage(img, 0, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(GlomoRegStarter.getAvailableRegions());

        /*for (String str: GlomoConfigLoader.readGlomoConfigFile(myMidlet, "/glomo.cfg"))
            System.out.println(str);*/
        return;
    }
}
