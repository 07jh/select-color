import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;

public class fenster extends JFrame {

    public void erstelleFenster() {

        Scanner meinScanner = new Scanner(System.in);
        System.out.println("Wähle eine der Farben");
        System.out.println("ROT, BLAU, GELB, PINK, SCHWARZ, GRUEN");
        String auswahl = meinScanner.nextLine();
        meinScanner.close();

        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color farbe = Color.GRAY;
        String titel = "Nichts Ausgewählt";

        if (auswahl.equals("ROT")) {
            farbe = Color.RED;
            titel = "ROT";
        } else if (auswahl.equals("BLAU")) {
            farbe = Color.BLUE;
            titel = "BLAU";
        } else if (auswahl.equals("GELB")) {
            farbe = Color.YELLOW;
            titel = "GELB";
        } else if (auswahl.equals("PINK")) {
            farbe = Color.PINK;
            titel = "PINK";
        } else if (auswahl.equals("SCHWARZ")) {
            farbe = Color.BLACK;
            titel = "SCHWARZ";
        } else if (auswahl.equals("GRUEN")) {
            farbe = Color.GREEN;
            titel = "GRUEN";
        }

        setTitle(titel);
        getContentPane().setBackground(farbe);
        setVisible(true);

    }


}
