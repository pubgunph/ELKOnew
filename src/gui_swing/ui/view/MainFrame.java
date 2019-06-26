package gui_swing.ui.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainFrame extends JFrame {
    public static final int WIDTH = 850;
    public static final int HEIGHT = 600;
    private JTextField ausgabeTextField;
    private JComboBox setVoiceBox;
    private JPanel mainPanel;
    private JButton delete;
    private JButton und;
    private JButton ich;
    private JButton du;
    private JButton wir;
    private JButton das;
    private JButton send;
    private JButton oder;
    private JButton moechten;
    private JButton koennen;
    private JButton nichtButton;
    private JButton haben;
    private JButton auch;
    private JButton sein;
    private JButton adjektive;
    private JButton returnButton;
    private JButton aktivitaeten;
    private JButton beduerfnisse;
    private JButton farben;
    private JButton floskeln;
    private JButton gefuehle;
    private JButton fragen;
    private JButton kleidung;
    private JButton koerper;
    private JButton orte;
    private JButton personen;
    private JButton verben;
    private JButton zahlen;
    private JButton kategorie1;
    private JButton mit;
    private JButton in;
    private JButton ein;
    private JButton was;
    private JButton mich;
    private JButton weil;
    private JButton bitte;
    private JButton da;
    private JButton jetzt;
    private JButton hier;
    private JButton noch;
    private JButton mal;
    private JButton praepositon;

    /**
     *
     * Constructor
     */
    public MainFrame() {
        setSize(WIDTH, HEIGHT);
        setMinimumSize(new Dimension(WIDTH, HEIGHT));
        setContentPane(mainPanel);
        setLocationRelativeTo(null);

    }

    private JButton createButtonImage(JButton button, String src) {
        BufferedImage myPicture = null;
        Image newimg = null;

        try {
            myPicture = ImageIO.read(new File(src));
            newimg = myPicture.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);

        } catch (IOException e) {
            e.printStackTrace();
        }
        button.setIcon(new ImageIcon(newimg));
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setContentAreaFilled(false);
        return button;
    }

    public void kategorieAdjektive() {
        createButtonImage(adjektive, "src/Pictos/Adjektive/hei�.png");
        createButtonImage(aktivitaeten, "src/Pictos/Adjektive/schwer.png");
        createButtonImage(beduerfnisse, "src/Pictos/Adjektive/laut.png");
        createButtonImage(farben, "src/Pictos/Adjektive/kalt.png");
        createButtonImage(floskeln, "src/Pictos/Adjektive/neu.png");
        createButtonImage(gefuehle, "src/Pictos/Adjektive/gleich.png");
        createButtonImage(fragen, "src/Pictos/Adjektive/cool.png");
        createButtonImage(kleidung, "src/Pictos/Adjektive/alt.png");
        createButtonImage(koerper, "src/Pictos/Adjektive/gut.png");
        createButtonImage(orte, "src/Pictos/Adjektive/lang.png");
        createButtonImage(personen, "src/Pictos/Adjektive/voll.png");
        createButtonImage(praepositionen, "src/Pictos/Adjektive/schlecht.png");
        createButtonImage(verben, "src/Pictos/Adjektive/schnell.png");
        createButtonImage(zahlen, "src/Pictos/Adjektive/sch�n.png");
        createButtonImage(kategorie1, "src/Pictos/Adjektive/vorsichtig.png");
    }
    
    public void kategorieAktivitaeten() {
        createButtonImage(adjektive, "src/Pictos/Aktivit�ten/arbeiten.png");
        createButtonImage(aktivitaeten, "src/Pictos/Aktivit�ten/putzen.png");
        createButtonImage(beduerfnisse, "src/Pictos/Aktivit�ten/aufr�umen.png");
        createButtonImage(farben, "src/Pictos/Aktivit�ten/kochen.png");
        createButtonImage(floskeln, "src/Pictos/Aktivit�ten/fahren.png");
        createButtonImage(gefuehle, "src/Pictos/Aktivit�ten/fernsehen.png");
        createButtonImage(fragen, "src/Pictos/Aktivit�ten/waschen.png");
        createButtonImage(kleidung, "src/Pictos/Aktivit�ten/gehen.png");
        createButtonImage(koerper, "src/Pictos/Aktivit�ten/schlafen.png");
        createButtonImage(orte, "src/Pictos/Aktivit�ten/lesen.png");
        createButtonImage(personen, "src/Pictos/Aktivit�ten/schwimmen.png");
        createButtonImage(praepositionen, "src/Pictos/Aktivit�ten/spazieren.png");
        createButtonImage(verben, "src/Pictos/Aktivit�ten/malen.png");
        createButtonImage(zahlen, "src/Pictos/Aktivit�ten/Quidditch.png");
        createButtonImage(kategorie1, "src/Pictos/Aktivit�ten/spielen.png");
    }
    
    public void kategorieBeduerfnisse() {
        createButtonImage(adjektive, "src/Pictos/Adjektive/essen.png");
        createButtonImage(aktivitaeten, "src/Pictos/Adjektive/baden.png");
        createButtonImage(beduerfnisse, "src/Pictos/Adjektive/duschen.png");
        createButtonImage(farben, "src/Pictos/Adjektive/trinken.png");
        createButtonImage(floskeln, "src/Pictos/Adjektive/gesund.png");
        createButtonImage(gefuehle, "src/Pictos/Adjektive/Husten.png");
        createButtonImage(fragen, "src/Pictos/Adjektive/Medikament.png");
        createButtonImage(kleidung, "src/Pictos/Adjektive/krank.png");
        createButtonImage(koerper, "src/Pictos/Adjektive/Pipi.png");
        createButtonImage(orte, "src/Pictos/Adjektive/Schmerzen.png");
        createButtonImage(personen, "src/Pictos/Adjektive/Schnupfen.png");
        createButtonImage(praepositionen, "src/Pictos/Adjektive/Stinker.png");
        createButtonImage(verben, "src/Pictos/Adjektive/schwindelig.png");
        createButtonImage(zahlen, "src/Pictos/Adjektive/Anfall.png");
        createButtonImage(kategorie1, "src/Pictos/Adjektive/verletzt.png");
    }

    public void kategorieFarben() {
        createButtonImage(adjektive, "src/Pictos/Farben/hell.png");
        createButtonImage(aktivitaeten, "src/Pictos/Farben/wei�.png");
        createButtonImage(beduerfnisse, "src/Pictos/Farben/schwarz.png");
        createButtonImage(farben, "src/Pictos/Farben/dunkel.png");
        createButtonImage(floskeln, "src/Pictos/Farben/blau.png");
        createButtonImage(gefuehle, "src/Pictos/Farben/rot.png");
        createButtonImage(fragen, "src/Pictos/Farben/gelb.png");
        createButtonImage(kleidung, "src/Pictos/Farben/gr�n.png");
        createButtonImage(koerper, "src/Pictos/Farben/lila.png");
        createButtonImage(orte, "src/Pictos/Farben/orange.png");
        createButtonImage(personen, "src/Pictos/Farben/rosa.png");
        createButtonImage(praepositionen, "src/Pictos/Farben/bunt.png");
        createButtonImage(verben, "src/Pictos/Farben/braun.png");
        createButtonImage(zahlen, "src/Pictos/Farben/grau.png");
        createButtonImage(kategorie1, "src/Pictos/Zahlen/0.png"); //muesste man irgendwie leer setzen
    }
    
    public void kategorieFloskeln() {
        createButtonImage(adjektive, "src/Pictos/Floskeln/hell.png");
        createButtonImage(aktivitaeten, "src/Pictos/Zahlen/0.png");
        createButtonImage(beduerfnisse, "src/Pictos/Zahlen/0.png");
        createButtonImage(farben, "src/Pictos/Floskeln/Tsch�ss.png");
        createButtonImage(floskeln, "src/Pictos/Floskeln/Entschuldigung.png");
        createButtonImage(gefuehle, "src/Pictos/Floskeln/Danke.png");
        createButtonImage(fragen, "src/Pictos/Zahlen/0.png");
        createButtonImage(kleidung, "src/Pictos/Floskeln/fertig.png");
        createButtonImage(koerper, "src/Pictos/Zahlen/0.png");
        createButtonImage(orte, "src/Pictos/Zahlen/0.png");
        createButtonImage(personen, "src/Pictos/Floskeln/Quatsch.png");
        createButtonImage(praepositionen, "src/Pictos/Floskeln/Bl�dsinn.png");
        createButtonImage(verben, "src/Pictos/Floskeln/Arschloch.png");
        createButtonImage(zahlen, "src/Pictos/Floskeln/Bl�dmann.png");
        createButtonImage(kategorie1, "src/Pictos/Floskeln/Dummkopf.png");
    }
    
    public void kategorieGefuehle() {
        createButtonImage(adjektive, "src/Pictos/Gef�hle/Angst.png");
        createButtonImage(aktivitaeten, "src/Pictos/Gef�hle/traurig.png");
        createButtonImage(beduerfnisse, "src/Pictos/Gef�hle/�berrascht.png");
        createButtonImage(farben, "src/Pictos/Gef�hle/fr�hlich.png");
        createButtonImage(floskeln, "src/Pictos/Gef�hle/weinen.png");
        createButtonImage(gefuehle, "src/Pictos/Gef�hle/langweilig.png");
        createButtonImage(fragen, "src/Pictos/Gef�hle/gl�cklich.png");
        createButtonImage(kleidung, "src/Pictos/Gef�hle/lachen.png");
        createButtonImage(koerper, "src/Pictos/Gef�hle/m�de.png");
        createButtonImage(orte, "src/Pictos/Gef�hle/w�tend.png");
        createButtonImage(personen, "src/Pictos/Gef�hle/neugierig.png");
        createButtonImage(praepositionen, "src/Pictos/Gef�hle/wach.png");
        createButtonImage(verben, "src/Pictos/Gef�hle/verliebt.png");
        createButtonImage(zahlen, "src/Pictos/Gef�hle/�bel.png");
        createButtonImage(kategorie1, "src/Pictos/Zahlen/0.png");
    }
    
    public void kategorieFragen() {
        createButtonImage(adjektive, "src/Pictos/KategorieFragen/wie.png");
        createButtonImage(aktivitaeten, "src/Pictos/KategorieFragen/warum.png");
        createButtonImage(beduerfnisse, "src/Pictos/KategorieFragen/welche.png");
        createButtonImage(farben, "src/Pictos/KategorieFragen/wer.png");
        createButtonImage(floskeln, "src/Pictos/KategorieFragen/wo.png");
        createButtonImage(gefuehle, "src/Pictos/KategorieFragen/d�rfen.png");
        createButtonImage(fragen, "src/Pictos/KategorieFragen/machen.png");
        createButtonImage(kleidung, "src/Pictos/KategorieFragen/m�ssen.png");
        createButtonImage(koerper, "src/Pictos/KategorieFragen/m�gen.png");
        createButtonImage(orte, "src/Pictos/KategorieFragen/h�ren.png");
        createButtonImage(personen, "src/Pictos/KategorieFragen/sehen.png");
        createButtonImage(praepositionen, "src/Pictos/KategorieFragen/lassen.png");
        createButtonImage(verben, "src/Pictos/KategorieFragen/kommen.png");
        createButtonImage(zahlen, "src/Pictos/KategorieFragen/geben.png");
        createButtonImage(kategorie1, "src/Pictos/KategorieFragen/wissen.png");
    }
    
    
      public JButton getAdjektive() {
        createButtonImage(adjektive, "src/Pictos/KategorieAdjektive.png");
        return adjektive;
    }

    public JComboBox getSetVoiceBox() {
        setVoiceBox.addItem("DE1 Frau");
        setVoiceBox.addItem("DE2 Mann");
        setVoiceBox.setSelectedIndex(0);
        return setVoiceBox;
    }

    public JButton getOder() {
        return oder;
    }

    public JButton getMoechten() {
        return moechten;
    }

    public JButton getKoennen() {
        return koennen;
    }

    public JButton getHaben() {
        return haben;
    }

    public JButton getAuch() {
        return auch;
    }

    public JButton getSein() {
        return sein;
    }

    public JButton getDelete() {
        createButtonImage(delete, "src/Pictos/FKTloeschen.png");
        return delete;
    }

    public JButton getUnd() {
        createButtonImage(und, "src/Pictos/und.png");
        return und;
    }

    public JButton getIch() {
        createButtonImage(ich, "src/Pictos/ich.png");
        return ich;
    }

    public JButton getDu() {
        createButtonImage(du, "src/Pictos/du.png");
        return du;
    }

    public JButton getWir() {
        createButtonImage(wir, "src/Pictos/wir.png");
        return wir;
    }

    public JButton getDas() {
        createButtonImage(das, "src/Pictos/das.png");
        return das;
    }

    public JButton getSend() {
        createButtonImage(send, "src/Pictos/FKT ausgeben.png");
        return send;
    }

    public JTextField getAusgabeTextField() {
        ausgabeTextField.setEditable(false);
        return ausgabeTextField;
    }

    public JButton getNichtButton() {
        createButtonImage(nichtButton, "src/Pictos/nicht.png");
        return nichtButton;
    }

}
