import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Main {

    public static void main(String[] argv) {

        Display.setInitCallback((Canvas canvas) -> {
            // Load the icon
            ImageIcon icon = new ImageIcon( Objects.requireNonNull(Main.class.getResource("/icons/ico.png")) );

            // Create window
            JFrame frame = new JFrame("MoonBT");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(canvas);
            frame.addKeyListener(canvas.keyListener);
            frame.setIconImage(icon.getImage());
            frame.pack();
            frame.setVisible(true);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
        });

        SwingUtilities.invokeLater(() -> {
            // Fake the system properties
            System.setProperty("microedition.platform", "j2me-emulation-host");
            System.setProperty("MIDlet-Vendor", "NET Lizard");
            System.setProperty("MIDlet-Name", "Moon BT");
            System.setProperty("MIDlet-1", "Moon BT, /icons/ico.png, NET_Lizard");

            // Create midlet
            ActionListener exitListener = actionEvent -> {
                switch (actionEvent.getActionCommand()) {
                    case "Destroyed" -> {
                        System.out.println("[ INFO ]: Game closed");
                        System.gc();
                        System.exit(0);
                    }
                    case "Paused" -> System.out.println("[ INFO ]: Game paused");
                }
            };
            MIDlet myMidlet = new NET_Lizard();
            myMidlet.addListener(exitListener);
            myMidlet.startApp();
            System.out.println("[ INFO ]: Game launched");
        });

        // System.out.println(h.decodeBinaryString(new int[]{1819934720}));
        // try {
        //     BufferedImage img = ImageIO.read(new File(System.getProperty("user.dir") + "/src/main/resources/Decoded/img/li0.png"));
        //     myCanvas.getGraphics().drawImage(img, 0, 0, null);
        //        // Intention is to wait the thread initialization
        //        Thread.sleep(100);
        //        System.out.println(GlomoRegStarter.getAvailableRegions());
        //        for (Object it: GlomoRegStarter.getAvailableRegions()) {
        //            System.out.println(((GlomoRegion)it).getCountryName());
        //        }
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        //
        // for (String str: GlomoConfigLoader.readGlomoConfigFile(myMidlet, "/glomo.cfg"))
        //     System.out.println(str);
    }
}
