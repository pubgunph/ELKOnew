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
        createButtonImage(kategorie1, "src/Pictos/Zahlen/0.png"); //leer
    }
    
    public void kategorieFloskeln() {
        createButtonImage(adjektive, "src/Pictos/Floskeln/hell.png");
        createButtonImage(aktivitaeten, "src/Pictos/Zahlen/0.png");//leer
        createButtonImage(beduerfnisse, "src/Pictos/Zahlen/0.png");//leer
        createButtonImage(farben, "src/Pictos/Floskeln/Tsch�ss.png");
        createButtonImage(floskeln, "src/Pictos/Floskeln/Entschuldigung.png");
        createButtonImage(gefuehle, "src/Pictos/Floskeln/Danke.png");
        createButtonImage(fragen, "src/Pictos/Zahlen/0.png");//leer
        createButtonImage(kleidung, "src/Pictos/Floskeln/fertig.png");
        createButtonImage(koerper, "src/Pictos/Zahlen/0.png");
        createButtonImage(orte, "src/Pictos/Zahlen/0.png");//leer
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
        createButtonImage(kategorie1, "src/Pictos/Zahlen/0.png");//leer
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
        createButtonImage(adjektive, "src/Pictos/K�rper/Arm.png");
        createButtonImage(aktivitaeten, "src/Pictos/K�rper/Gesicht.png");
        createButtonImage(beduerfnisse, "src/Pictos/K�rper/Kopf.png");
        createButtonImage(farben, "src/Pictos/K�rper/Bein.png");
        createButtonImage(floskeln, "src/Pictos/K�rper/Hand.png");
        createButtonImage(gefuehle, "src/Pictos/K�rper/Auge.png");
        createButtonImage(fragen, "src/Pictos/K�rper/Bauch.png");
        createButtonImage(kleidung, "src/Pictos/K�rper/Fu�.png");
        createButtonImage(koerper, "src/Pictos/K�rper/Ohr.png");
        createButtonImage(orte, "src/Pictos/K�rper/R�cken.png");
        createButtonImage(personen, "src/Pictos/K�rper/Haare.png");
        createButtonImage(praepositionen, "src/Pictos/K�rper/Nase.png");
        createButtonImage(verben, "src/Pictos/K�rper/Brust.png");
        createButtonImage(zahlen, "src/Pictos/K�rper/Mund.png");
        createButtonImage(kategorie1, "src/Pictos/K�rper/Z�hne.png");
    }
    
    public void kategorieOrte() {
        createButtonImage(adjektive, "src/Pictos/Orte/Arbeit.png");
        createButtonImage(aktivitaeten, "src/Pictos/Orte/Laden.png");
        createButtonImage(beduerfnisse, "src/Pictos/Orte/Schule.png");
        createButtonImage(farben, "src/Pictos/Orte/B�cker.png");
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
        createButtonImage(kategorie1, "src/Pictos/Orte/K�che.png");
    }
    
    public void kategoriePersonen() {
        createButtonImage(adjektive, "src/Pictos/Personen/m�nnlich.png");
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
        createButtonImage(adjektive, "src/Pictos/Personen/m�nnlich.png");
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
        createButtonImage(adjektive, "src/Pictos/Pr�positionen/gern.png");
        createButtonImage(aktivitaeten, "src/Pictos/Pr�positionen/sehr.png");
        createButtonImage(beduerfnisse, "src/Pictos/Pr�positionen/mehr.png");
        createButtonImage(farben, "src/Pictos/Pr�positionen/nachher.png");
        createButtonImage(floskeln, "src/Pictos/Pr�positionen/rauf.png");
        createButtonImage(gefuehle, "src/Pictos/Pr�positionen/viel.png");
        createButtonImage(fragen, "src/Pictos/Pr�positionen/vor.png");
        createButtonImage(kleidung, "src/Pictos/Pr�positionen/runter.png");
        createButtonImage(koerper, "src/Pictos/Pr�positionen/oben.png");
        createButtonImage(orte, "src/Pictos/Pr�positionen/hinter.png");
        createButtonImage(personen, "src/Pictos/Pr�positionen/weniger.png");
        createButtonImage(praepositionen, "src/Pictos/Pr�positionen/unten.png");
        createButtonImage(verben, "src/Pictos/Pr�positionen/neben.png");
        createButtonImage(zahlen, "src/Pictos/Pr�positionen/wieder.png");
        createButtonImage(kategorie1, "src/Pictos/Pr�positionen/wenig.png");
    }
    
    public void kategorieVerben() {
        createButtonImage(adjektive, "src/Pictos/Verben/riechen.png");
        createButtonImage(aktivitaeten, "src/Pictos/Verben/schmecken.png");
        createButtonImage(beduerfnisse, "src/Pictos/Verben/f�hlen.png");
        createButtonImage(farben, "src/Pictos/Verben/sagen.png");
        createButtonImage(floskeln, "src/Pictos/Verben/�rgern.png");
        createButtonImage(gefuehle, "src/Pictos/Verben/bei�en.png");
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
        createButtonImage(aktivitaeten, "src/Pictos/KategorieAktivit�ten.png");
        createButtonImage(beduerfnisse, "src/Pictos/KategorieBed�rfnisse.png");
        createButtonImage(farben, "src/Pictos/KategorieFarben.png");
        createButtonImage(floskeln, "src/Pictos/KategorieFloskeln.png");
        createButtonImage(gefuehle, "src/Pictos/KategorieGef�hle.png");
        createButtonImage(fragen, "src/Pictos/KategorieFragen.png");
        createButtonImage(kleidung, "src/Pictos/KategorieKleidung.png");
        createButtonImage(koerper, "src/Pictos/KategorieK�rper.png");
        createButtonImage(orte, "src/Pictos/KategorieOrte.png");
        createButtonImage(personen, "src/Pictos/KategoriePersonen.png");
        createButtonImage(praepositionen, "src/Pictos/KategoriePr�positionen.png");
        createButtonImage(verben, "src/Pictos/KategorieVerben.png");
        createButtonImage(zahlen, "src/Pictos/KategorieZahlen.png");
        createButtonImage(kategorie1, "src/Pictos/Zahlen/0.png");
    }
    
    
      public JButton getAdjektive() {
        createButtonImage(adjektive, "src/Pictos/KategorieAdjektive.png");
        return adjektive;
      }
      
      public JButton getAktivitaeten() {
          createButtonImage(aktivitaeten, "src/Pictos/KategorieAktivit�ten.png");
          return aktivitaeten;
        }
      
      public JButton getBeduerfnisse() {
          createButtonImage(beduerfnisse, "src/Pictos/KategorieBed�rfnisse.png");
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
          createButtonImage(gefuehle, "src/Pictos/KategorieGef�hle.png");
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
          createButtonImage(koerper, "src/Pictos/KategorieK�rper.png");
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
          createButtonImage(praepositionen, "src/Pictos/KategoriePr�positionen.png");
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
    	createButtonImage(moechten, "src/Pictos/m�chten.png"); 
        return moechten;
    }

    public JButton getKoennen() {
    	createButtonImage(koennen, "src/Pictos/k�nnen.png");
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
