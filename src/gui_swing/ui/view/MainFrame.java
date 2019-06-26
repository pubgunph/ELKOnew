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
        createButtonImage(adjektive, "src/Pictos/Adjektive/heiß.png");
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
        createButtonImage(zahlen, "src/Pictos/Adjektive/schön.png");
        createButtonImage(kategorie1, "src/Pictos/Adjektive/vorsichtig.png");
    }
    
    public void kategorieAktivitaeten() {
        createButtonImage(adjektive, "src/Pictos/Aktivitäten/arbeiten.png");
        createButtonImage(aktivitaeten, "src/Pictos/Aktivitäten/putzen.png");
        createButtonImage(beduerfnisse, "src/Pictos/Aktivitäten/aufräumen.png");
        createButtonImage(farben, "src/Pictos/Aktivitäten/kochen.png");
        createButtonImage(floskeln, "src/Pictos/Aktivitäten/fahren.png");
        createButtonImage(gefuehle, "src/Pictos/Aktivitäten/fernsehen.png");
        createButtonImage(fragen, "src/Pictos/Aktivitäten/waschen.png");
        createButtonImage(kleidung, "src/Pictos/Aktivitäten/gehen.png");
        createButtonImage(koerper, "src/Pictos/Aktivitäten/schlafen.png");
        createButtonImage(orte, "src/Pictos/Aktivitäten/lesen.png");
        createButtonImage(personen, "src/Pictos/Aktivitäten/schwimmen.png");
        createButtonImage(praepositionen, "src/Pictos/Aktivitäten/spazieren.png");
        createButtonImage(verben, "src/Pictos/Aktivitäten/malen.png");
        createButtonImage(zahlen, "src/Pictos/Aktivitäten/Quidditch.png");
        createButtonImage(kategorie1, "src/Pictos/Aktivitäten/spielen.png");
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
        createButtonImage(aktivitaeten, "src/Pictos/Farben/weiß.png");
        createButtonImage(beduerfnisse, "src/Pictos/Farben/schwarz.png");
        createButtonImage(farben, "src/Pictos/Farben/dunkel.png");
        createButtonImage(floskeln, "src/Pictos/Farben/blau.png");
        createButtonImage(gefuehle, "src/Pictos/Farben/rot.png");
        createButtonImage(fragen, "src/Pictos/Farben/gelb.png");
        createButtonImage(kleidung, "src/Pictos/Farben/grün.png");
        createButtonImage(koerper, "src/Pictos/Farben/lila.png");
        createButtonImage(orte, "src/Pictos/Farben/orange.png");
        createButtonImage(personen, "src/Pictos/Farben/rosa.png");
        createButtonImage(praepositionen, "src/Pictos/Farben/bunt.png");
        createButtonImage(verben, "src/Pictos/Farben/braun.png");
        createButtonImage(zahlen, "src/Pictos/Farben/grau.png");
        createButtonImage(kategorie1, "src/Pictos/Zahlen/0.png"); //leer
    }
    
    public void kategorieFloskeln() {
        createButtonImage(adjektive, "src/Pictos/Floskeln/hell.png");
        createButtonImage(aktivitaeten, "src/Pictos/Zahlen/0.png");//leer
        createButtonImage(beduerfnisse, "src/Pictos/Zahlen/0.png");//leer
        createButtonImage(farben, "src/Pictos/Floskeln/Tschüss.png");
        createButtonImage(floskeln, "src/Pictos/Floskeln/Entschuldigung.png");
        createButtonImage(gefuehle, "src/Pictos/Floskeln/Danke.png");
        createButtonImage(fragen, "src/Pictos/Zahlen/0.png");//leer
        createButtonImage(kleidung, "src/Pictos/Floskeln/fertig.png");
        createButtonImage(koerper, "src/Pictos/Zahlen/0.png");
        createButtonImage(orte, "src/Pictos/Zahlen/0.png");//leer
        createButtonImage(personen, "src/Pictos/Floskeln/Quatsch.png");
        createButtonImage(praepositionen, "src/Pictos/Floskeln/Blödsinn.png");
        createButtonImage(verben, "src/Pictos/Floskeln/Arschloch.png");
        createButtonImage(zahlen, "src/Pictos/Floskeln/Blödmann.png");
        createButtonImage(kategorie1, "src/Pictos/Floskeln/Dummkopf.png");
    }
    
    public void kategorieGefuehle() {
        createButtonImage(adjektive, "src/Pictos/Gefühle/Angst.png");
        createButtonImage(aktivitaeten, "src/Pictos/Gefühle/traurig.png");
        createButtonImage(beduerfnisse, "src/Pictos/Gefühle/überrascht.png");
        createButtonImage(farben, "src/Pictos/Gefühle/fröhlich.png");
        createButtonImage(floskeln, "src/Pictos/Gefühle/weinen.png");
        createButtonImage(gefuehle, "src/Pictos/Gefühle/langweilig.png");
        createButtonImage(fragen, "src/Pictos/Gefühle/glücklich.png");
        createButtonImage(kleidung, "src/Pictos/Gefühle/lachen.png");
        createButtonImage(koerper, "src/Pictos/Gefühle/müde.png");
        createButtonImage(orte, "src/Pictos/Gefühle/wütend.png");
        createButtonImage(personen, "src/Pictos/Gefühle/neugierig.png");
        createButtonImage(praepositionen, "src/Pictos/Gefühle/wach.png");
        createButtonImage(verben, "src/Pictos/Gefühle/verliebt.png");
        createButtonImage(zahlen, "src/Pictos/Gefühle/übel.png");
        createButtonImage(kategorie1, "src/Pictos/Zahlen/0.png");//leer
    }
    
    public void kategorieFragen() {
        createButtonImage(adjektive, "src/Pictos/KategorieFragen/wie.png");
        createButtonImage(aktivitaeten, "src/Pictos/KategorieFragen/warum.png");
        createButtonImage(beduerfnisse, "src/Pictos/KategorieFragen/welche.png");
        createButtonImage(farben, "src/Pictos/KategorieFragen/wer.png");
        createButtonImage(floskeln, "src/Pictos/KategorieFragen/wo.png");
        createButtonImage(gefuehle, "src/Pictos/KategorieFragen/dürfen.png");
        createButtonImage(fragen, "src/Pictos/KategorieFragen/machen.png");
        createButtonImage(kleidung, "src/Pictos/KategorieFragen/müssen.png");
        createButtonImage(koerper, "src/Pictos/KategorieFragen/mögen.png");
        createButtonImage(orte, "src/Pictos/KategorieFragen/hören.png");
        createButtonImage(personen, "src/Pictos/KategorieFragen/sehen.png");
        createButtonImage(praepositionen, "src/Pictos/KategorieFragen/lassen.png");
        createButtonImage(verben, "src/Pictos/KategorieFragen/kommen.png");
        createButtonImage(zahlen, "src/Pictos/KategorieFragen/geben.png");
        createButtonImage(kategorie1, "src/Pictos/KategorieFragen/wissen.png");
    }
    
    public void kategorieKleidung() {
        createButtonImage(adjektive, "src/Pictos/Kleidung/Kleidung.png");
        createButtonImage(aktivitaeten, "src/Pictos/Kleidung/Hose.png");
        createButtonImage(beduerfnisse, "src/Pictos/Kleidung/T-Shirt.png");
        createButtonImage(farben, "src/Pictos/Kleidung/Schmuck.png");
        createButtonImage(floskeln, "src/Pictos/Kleidung/Hausschuhe.png");
        createButtonImage(gefuehle, "src/Pictos/Kleidung/Kleid.png");
        createButtonImage(fragen, "src/Pictos/Kleidung/Pullover.png");
        createButtonImage(kleidung, "src/Pictos/Kleidung/Brille.png");
        createButtonImage(koerper, "src/Pictos/Kleidung/Schuhe.png");
        createButtonImage(orte, "src/Pictos/Kleidung/Unterhose.png");
        createButtonImage(personen, "src/Pictos/Kleidung/Sonnenbrille.png");
        createButtonImage(praepositionen, "src/Pictos/Kleidung/Armbanduhr.png");
        createButtonImage(verben, "src/Pictos/Kleidung/Unterhemd.png");
        createButtonImage(zahlen, "src/Pictos/Kleidung/Socken.png");
        createButtonImage(kategorie1, "src/Pictos/Kleidung/Zopf.png");
    }
    
    public void kategorieKoerper() {
        createButtonImage(adjektive, "src/Pictos/Körper/Arm.png");
        createButtonImage(aktivitaeten, "src/Pictos/Körper/Gesicht.png");
        createButtonImage(beduerfnisse, "src/Pictos/Körper/Kopf.png");
        createButtonImage(farben, "src/Pictos/Körper/Bein.png");
        createButtonImage(floskeln, "src/Pictos/Körper/Hand.png");
        createButtonImage(gefuehle, "src/Pictos/Körper/Auge.png");
        createButtonImage(fragen, "src/Pictos/Körper/Bauch.png");
        createButtonImage(kleidung, "src/Pictos/Körper/Fuß.png");
        createButtonImage(koerper, "src/Pictos/Körper/Ohr.png");
        createButtonImage(orte, "src/Pictos/Körper/Rücken.png");
        createButtonImage(personen, "src/Pictos/Körper/Haare.png");
        createButtonImage(praepositionen, "src/Pictos/Körper/Nase.png");
        createButtonImage(verben, "src/Pictos/Körper/Brust.png");
        createButtonImage(zahlen, "src/Pictos/Körper/Mund.png");
        createButtonImage(kategorie1, "src/Pictos/Körper/Zähne.png");
    }
    
    public void kategorieOrte() {
        createButtonImage(adjektive, "src/Pictos/Orte/Arbeit.png");
        createButtonImage(aktivitaeten, "src/Pictos/Orte/Laden.png");
        createButtonImage(beduerfnisse, "src/Pictos/Orte/Schule.png");
        createButtonImage(farben, "src/Pictos/Orte/Bäcker.png");
        createButtonImage(floskeln, "src/Pictos/Orte/Krankenhaus.png");
        createButtonImage(gefuehle, "src/Pictos/Orte/Zimmer.png");
        createButtonImage(fragen, "src/Pictos/Orte/Flur.png");
        createButtonImage(kleidung, "src/Pictos/Orte/Haus.png");
        createButtonImage(koerper, "src/Pictos/Orte/Aufzug.png");
        createButtonImage(orte, "src/Pictos/Orte/Wohnzimmer.png");
        createButtonImage(personen, "src/Pictos/Orte/Badezimmer.png");
        createButtonImage(praepositionen, "src/Pictos/Orte/Treppe.png");
        createButtonImage(verben, "src/Pictos/Orte/Garten.png");
        createButtonImage(zahlen, "src/Pictos/Orte/Keller.png");
        createButtonImage(kategorie1, "src/Pictos/Orte/Küche.png");
    }
    
    public void kategoriePersonen() {
        createButtonImage(adjektive, "src/Pictos/Personen/männlich.png");
        createButtonImage(aktivitaeten, "src/Pictos/Personen/Baby.png");
        createButtonImage(beduerfnisse, "src/Pictos/Personen/Freund.png");
        createButtonImage(farben, "src/Pictos/Personen/weiblich.png");
        createButtonImage(floskeln, "src/Pictos/Personen/Erwachsener.png");
        createButtonImage(gefuehle, "src/Pictos/Personen/Bruder.png");
        createButtonImage(fragen, "src/Pictos/Personen/Arzt.png");
        createButtonImage(kleidung, "src/Pictos/Personen/Kind.png");
        createButtonImage(koerper, "src/Pictos/Personen/Vater.png");
        createButtonImage(orte, "src/Pictos/Personen/Pfleger.png");
        createButtonImage(personen, "src/Pictos/Personen/Schwester.png");
        createButtonImage(praepositionen, "src/Pictos/Personen/Mutter.png");
        createButtonImage(verben, "src/Pictos/Personen/Therapeut.png");
        createButtonImage(zahlen, "src/Pictos/Personen/Lehrer.png");
        createButtonImage(kategorie1, "src/Pictos/Zahlen/0.png");//leer
    }
    
    public void kategoriePersonen() {
        createButtonImage(adjektive, "src/Pictos/Personen/männlich.png");
        createButtonImage(aktivitaeten, "src/Pictos/Personen/Baby.png");
        createButtonImage(beduerfnisse, "src/Pictos/Personen/Freund.png");
        createButtonImage(farben, "src/Pictos/Personen/weiblich.png");
        createButtonImage(floskeln, "src/Pictos/Personen/Erwachsener.png");
        createButtonImage(gefuehle, "src/Pictos/Personen/Bruder.png");
        createButtonImage(fragen, "src/Pictos/Personen/Arzt.png");
        createButtonImage(kleidung, "src/Pictos/Personen/Kind.png");
        createButtonImage(koerper, "src/Pictos/Personen/Vater.png");
        createButtonImage(orte, "src/Pictos/Personen/Pfleger.png");
        createButtonImage(personen, "src/Pictos/Personen/Schwester.png");
        createButtonImage(praepositionen, "src/Pictos/Personen/Mutter.png");
        createButtonImage(verben, "src/Pictos/Personen/Therapeut.png");
        createButtonImage(zahlen, "src/Pictos/Personen/Lehrer.png");
        createButtonImage(kategorie1, "src/Pictos/Zahlen/0.png");//leer
    }
    
    public void kategoriePraepositionen() {
        createButtonImage(adjektive, "src/Pictos/Präpositionen/gern.png");
        createButtonImage(aktivitaeten, "src/Pictos/Präpositionen/sehr.png");
        createButtonImage(beduerfnisse, "src/Pictos/Präpositionen/mehr.png");
        createButtonImage(farben, "src/Pictos/Präpositionen/nachher.png");
        createButtonImage(floskeln, "src/Pictos/Präpositionen/rauf.png");
        createButtonImage(gefuehle, "src/Pictos/Präpositionen/viel.png");
        createButtonImage(fragen, "src/Pictos/Präpositionen/vor.png");
        createButtonImage(kleidung, "src/Pictos/Präpositionen/runter.png");
        createButtonImage(koerper, "src/Pictos/Präpositionen/oben.png");
        createButtonImage(orte, "src/Pictos/Präpositionen/hinter.png");
        createButtonImage(personen, "src/Pictos/Präpositionen/weniger.png");
        createButtonImage(praepositionen, "src/Pictos/Präpositionen/unten.png");
        createButtonImage(verben, "src/Pictos/Präpositionen/neben.png");
        createButtonImage(zahlen, "src/Pictos/Präpositionen/wieder.png");
        createButtonImage(kategorie1, "src/Pictos/Präpositionen/wenig.png");
    }
    
    public void kategorieVerben() {
        createButtonImage(adjektive, "src/Pictos/Verben/riechen.png");
        createButtonImage(aktivitaeten, "src/Pictos/Verben/schmecken.png");
        createButtonImage(beduerfnisse, "src/Pictos/Verben/fühlen.png");
        createButtonImage(farben, "src/Pictos/Verben/sagen.png");
        createButtonImage(floskeln, "src/Pictos/Verben/ärgern.png");
        createButtonImage(gefuehle, "src/Pictos/Verben/beißen.png");
        createButtonImage(fragen, "src/Pictos/Verben/fallen.png");
        createButtonImage(kleidung, "src/Pictos/Verben/helfen.png");
        createButtonImage(koerper, "src/Pictos/Verben/kratzen.png");
        createButtonImage(orte, "src/Pictos/Verben/holen.png");
        createButtonImage(personen, "src/Pictos/Verben/krabbeln.png");
        createButtonImage(praepositionen, "src/Pictos/Verben/rennen.png");
        createButtonImage(verben, "src/Pictos/Verben/passen.png");
        createButtonImage(zahlen, "src/Pictos/Verben/schneiden.png");
        createButtonImage(kategorie1, "src/Pictos/Verben/streicheln.png");
    }
    
    public void kategorieZahlen() {
        createButtonImage(adjektive, "src/Pictos/Zahlen/1.png");
        createButtonImage(aktivitaeten, "src/Pictos/Zahlen/2.png");
        createButtonImage(beduerfnisse, "src/Pictos/Zahlen/3.png");
        createButtonImage(farben, "src/Pictos/Zahlen/0.png");//leer
        createButtonImage(floskeln, "src/Pictos/Zahlen/4.png");
        createButtonImage(gefuehle, "src/Pictos/Zahlen/5.png");
        createButtonImage(fragen, "src/Pictos/Zahlen/6.png");
        createButtonImage(kleidung, "src/Pictos/Zahlen/0.png");//leer
        createButtonImage(koerper, "src/Pictos/Zahlen/7.png");
        createButtonImage(orte, "src/Pictos/Zahlen/8.png");
        createButtonImage(personen, "src/Pictos/Zahlen/9.png");
        createButtonImage(praepositionen, "src/Pictos/Zahlen/0.png");//leer
        createButtonImage(verben, "src/Pictos/Zahlen/0.png");//leer
        createButtonImage(zahlen, "src/Pictos/Zahlen/0.png");
        createButtonImage(kategorie1, "src/Pictos/Zahlen/0.png"); //leer
    }
    
    public void kategorieUebersicht() {
        createButtonImage(adjektive, "src/Pictos/KategorieAdjektive.png");
        createButtonImage(aktivitaeten, "src/Pictos/KategorieAktivitäten.png");
        createButtonImage(beduerfnisse, "src/Pictos/KategorieBedürfnisse.png");
        createButtonImage(farben, "src/Pictos/KategorieFarben.png");
        createButtonImage(floskeln, "src/Pictos/KategorieFloskeln.png");
        createButtonImage(gefuehle, "src/Pictos/KategorieGefühle.png");
        createButtonImage(fragen, "src/Pictos/KategorieFragen.png");
        createButtonImage(kleidung, "src/Pictos/KategorieKleidung.png");
        createButtonImage(koerper, "src/Pictos/KategorieKörper.png");
        createButtonImage(orte, "src/Pictos/KategorieOrte.png");
        createButtonImage(personen, "src/Pictos/KategoriePersonen.png");
        createButtonImage(praepositionen, "src/Pictos/KategoriePräpositionen.png");
        createButtonImage(verben, "src/Pictos/KategorieVerben.png");
        createButtonImage(zahlen, "src/Pictos/KategorieZahlen.png");
        createButtonImage(kategorie1, "src/Pictos/Zahlen/0.png");
    }
    
    
      public JButton getAdjektive() {
        createButtonImage(adjektive, "src/Pictos/KategorieAdjektive.png");
        return adjektive;
      }
      
      public JButton getAktivitaeten() {
          createButtonImage(aktivitaeten, "src/Pictos/KategorieAktivitäten.png");
          return aktivitaeten;
        }
      
      public JButton getBeduerfnisse() {
          createButtonImage(beduerfnisse, "src/Pictos/KategorieBedürfnisse.png");
          return beduerfnisse;
        }
      
      public JButton getFarben() {
          createButtonImage(farben, "src/Pictos/KategorieFarben.png");
          return farben;
        }
      
      public JButton getFloskeln() {
          createButtonImage(floskeln, "src/Pictos/KategorieFloskeln.png");
          return floskeln;
        }
      
      public JButton getGefuehle() {
          createButtonImage(gefuehle, "src/Pictos/KategorieGefühle.png");
          return gefuehle;
        }
      
      public JButton getFragen() {
          createButtonImage(fragen, "src/Pictos/KategorieFragen.png");
          return fragen;
        }
      
      public JButton getKleidung() {
          createButtonImage(kleidung, "src/Pictos/KategorieKleidung.png");
          return kleidung;
        }
      
      public JButton getKoerper() {
          createButtonImage(koerper, "src/Pictos/KategorieKörper.png");
          return koerper;
        }
      
      public JButton getOrte() {
          createButtonImage(orte, "src/Pictos/KategorieOrte.png");
          return orte;
        }
      
      public JButton getPersonen() {
          createButtonImage(personen, "src/Pictos/KategoriePersonen.png");
          return personen;
        }
      
      public JButton getPraepositionen() {
          createButtonImage(praepositionen, "src/Pictos/KategoriePräpositionen.png");
          return praepositionen;
        }
      
      public JButton getVerben() {
          createButtonImage(verben, "src/Pictos/KategorieVerben.png");
          return verben;
        }
      
      public JButton getZahlen() {
          createButtonImage(zahlen, "src/Pictos/KategorieZahlen.png");
          return zahlen;
        }
      
    public JComboBox getSetVoiceBox() {
        setVoiceBox.addItem("DE1 Frau");
        setVoiceBox.addItem("DE2 Mann");
        setVoiceBox.setSelectedIndex(0);
        return setVoiceBox;
    }

    public JButton getOder() {
    	createButtonImage(oder, "src/Pictos/oder.png");
        return oder;
    }

    public JButton getMoechten() {
    	createButtonImage(moechten, "src/Pictos/möchten.png"); 
        return moechten;
    }

    public JButton getKoennen() {
    	createButtonImage(koennen, "src/Pictos/können.png");
        return koennen;
    }

    public JButton getHaben() {
    	createButtonImage(haben, "src/Pictos/haben.png");
        return haben;
    }

    public JButton getAuch() {
    	createButtonImage(auch, "src/Pictos/auch.png");
        return auch;
    }

    public JButton getSein() {
    	createButtonImage(sein, "src/Pictos/sein.png");
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
