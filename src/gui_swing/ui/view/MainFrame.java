package gui_swing.ui.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainFrame extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
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
    private JButton praepositionen;

    /**
     * Constructor
     */
    public MainFrame() {
        setSize(WIDTH, HEIGHT);
        setMinimumSize(new Dimension(WIDTH, HEIGHT));
        setContentPane(mainPanel);
        setLocationRelativeTo(null);

    }

    private void createButtonImage(JButton button, String src) {
        BufferedImage myPicture;
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
    }

    private BufferedImage createTransparentImage (){
        return new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
    }

    private void setInvisibleButton(JButton button){
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setIcon(new ImageIcon(createTransparentImage()));
    }

    public void kategorieAdjektive() {
        createButtonImage(adjektive, "src/Pictos/Adjektive/heiss.png");
        adjektive.setText("heiß");
        createButtonImage(aktivitaeten, "src/Pictos/Adjektive/schwer.png");
        aktivitaeten.setText("schwer");
        createButtonImage(beduerfnisse, "src/Pictos/Adjektive/laut.png");
        beduerfnisse.setText("laut");
        createButtonImage(farben, "src/Pictos/Adjektive/kalt.png");
        farben.setText("kalt");
        createButtonImage(floskeln, "src/Pictos/Adjektive/neu.png");
        floskeln.setText("neu");
        createButtonImage(gefuehle, "src/Pictos/Adjektive/gleich.png");
        gefuehle.setText("gleich");
        createButtonImage(fragen, "src/Pictos/Adjektive/cool.png");
        fragen.setText("cool");
        createButtonImage(kleidung, "src/Pictos/Adjektive/alt.png");
        kleidung.setText("alt");
        createButtonImage(koerper, "src/Pictos/Adjektive/gut.png");
        koerper.setText("gut");
        createButtonImage(orte, "src/Pictos/Adjektive/lang.png");
        orte.setText("lang");
        createButtonImage(personen, "src/Pictos/Adjektive/voll.png");
        personen.setText("voll");
        createButtonImage(praepositionen, "src/Pictos/Adjektive/schlecht.png");
        praepositionen.setText("schlecht");
        createButtonImage(verben, "src/Pictos/Adjektive/schnell.png");
        verben.setText("schnell");
        createButtonImage(zahlen, "src/Pictos/Adjektive/schoen.png");
        zahlen.setText("schön");
        createButtonImage(kategorie1, "src/Pictos/Adjektive/vorsichtig.png");
        kategorie1.setText("vorsichtig");
    }

    public void kategorieAktivitaeten() {
        createButtonImage(adjektive, "src/Pictos/Aktivitaeten/arbeiten.png");
        adjektive.setText("arbeiten");
        createButtonImage(aktivitaeten, "src/Pictos/Aktivitaeten/putzen.png");
        aktivitaeten.setText("putzen");
        createButtonImage(beduerfnisse, "src/Pictos/Aktivitaeten/aufraeumen.png");
        beduerfnisse.setText("aufräumen");
        createButtonImage(farben, "src/Pictos/Aktivitaeten/kochen.png");
        farben.setText("kochen");
        createButtonImage(floskeln, "src/Pictos/Aktivitaeten/fahren.png");
        floskeln.setText("fahren");
        createButtonImage(gefuehle, "src/Pictos/Aktivitaeten/fernsehen.png");
        gefuehle.setText("fernsehen");
        createButtonImage(fragen, "src/Pictos/Aktivitaeten/waschen.png");
        fragen.setText("waschen");
        createButtonImage(kleidung, "src/Pictos/Aktivitaeten/gehen.png");
        kleidung.setText("gehen");
        createButtonImage(koerper, "src/Pictos/Aktivitaeten/schlafen.png");
        koerper.setText("schlafen");
        createButtonImage(orte, "src/Pictos/Aktivitaeten/lesen.png");
        orte.setText("lesen");
        createButtonImage(personen, "src/Pictos/Aktivitaeten/schwimmen.png");
        personen.setText("schwimmen");
        createButtonImage(praepositionen, "src/Pictos/Aktivitaeten/spazieren.png");
        praepositionen.setText("spazieren");
        createButtonImage(verben, "src/Pictos/Aktivitaeten/malen.png");
        verben.setText("malen");
        createButtonImage(zahlen, "src/Pictos/Aktivitaeten/Quidditch.png");
        zahlen.setText("Quidditch");
        createButtonImage(kategorie1, "src/Pictos/Aktivitaeten/spielen.png");
        kategorie1.setText("spielen");
    }

    public void kategorieBeduerfnisse() {
        createButtonImage(adjektive, "src/Pictos/Beduerfnisse/essen.png");
        adjektive.setText("essn");
        createButtonImage(aktivitaeten, "src/Pictos/Beduerfnisse/baden.png");
        aktivitaeten.setText("baden");
        createButtonImage(beduerfnisse, "src/Pictos/Beduerfnisse/duschen.png");
        befuerfnisse.setText("duschen");
        createButtonImage(farben, "src/Pictos/Beduerfnisse/trinken.png");
        farben.setText("trinken");
        createButtonImage(floskeln, "src/Pictos/Beduerfnisse/gesund.png");
        floskeln.setText("gesund");
        createButtonImage(gefuehle, "src/Pictos/Beduerfnisse/Husten.png");
        gefuhele.setText("Husten");
        createButtonImage(fragen, "src/Pictos/Beduerfnisse/Medikament.png");
        fragen.setText("Medikament");
        createButtonImage(kleidung, "src/Pictos/Beduerfnisse/krank.png");
        kleidung.setText("krank");
        createButtonImage(koerper, "src/Pictos/Beduerfnisse/Pipi.png");
        koerper.setText("Pipi");
        createButtonImage(orte, "src/Pictos/Beduerfnisse/Schmerzen.png");
        orte.setText("Schmerzen");
        createButtonImage(personen, "src/Pictos/Beduerfnisse/Schnupfen.png");
        personen.setText("Schnupfen");
        createButtonImage(praepositionen, "src/Pictos/Beduerfnisse/Stinker.png");
        praepositionen.setText("Stinker");
        createButtonImage(verben, "src/Pictos/Beduerfnisse/schwindelig.png");
        verben.setText("schwindelig");
        createButtonImage(zahlen, "src/Pictos/Beduerfnisse/Anfall.png");
        zahlen.setText("Anfall");
        createButtonImage(kategorie1, "src/Pictos/Beduerfnisse/verletzt.png");
        kategorie1.setText("verletzt");
    }

    public void kategorieFarben() {
        createButtonImage(adjektive, "src/Pictos/Farben/hell.png");
        adjektive.setText("hell");
        createButtonImage(aktivitaeten, "src/Pictos/Farben/weiss.png");
        aktivitaeten.setText("weiß");
        createButtonImage(beduerfnisse, "src/Pictos/Farben/schwarz.png");
        beduerfnise.setText("schwarz");
        createButtonImage(farben, "src/Pictos/Farben/dunkel.png");
        farben.setText("dunkel");
        createButtonImage(floskeln, "src/Pictos/Farben/blau.png");
        floskeln.setText("blau");
        createButtonImage(gefuehle, "src/Pictos/Farben/rot.png");
        gefuhle.setText("rot");
        createButtonImage(fragen, "src/Pictos/Farben/gelb.png");
        fragen.setText("gelb");
        createButtonImage(kleidung, "src/Pictos/Farben/gruen.png");
        kleidung.setText("grün");
        createButtonImage(koerper, "src/Pictos/Farben/lila.png");
        koerper.setText("lila");
        createButtonImage(orte, "src/Pictos/Farben/orange.png");
        orte.setText("orange");
        createButtonImage(personen, "src/Pictos/Farben/rosa.png");
        personen.setText("rosa");
        createButtonImage(praepositionen, "src/Pictos/Farben/bunt.png");
        praepositionen.setText("bunt");
        createButtonImage(verben, "src/Pictos/Farben/braun.png");
        verben.setText("braun");
        createButtonImage(zahlen, "src/Pictos/Farben/grau.png");
        zahlen.setText("grau");
        setInvisibleButton(kategorie1);
        kategorie1.setText("");
    }

    public void kategorieFloskeln() {
        createButtonImage(adjektive, "src/Pictos/Floskeln/Hallo.png");
        adjektive.setText("Hallo");
        setInvisibleButton(aktivitaeten);
        aktivitaeten.setText("");
        setInvisibleButton(beduerfnisse);
        beduerfnisse.setText("");
        createButtonImage(farben, "src/Pictos/Floskeln/Tschuess.png");
        farben.setText("Tschüss");
        createButtonImage(floskeln, "src/Pictos/Floskeln/Entschuldigung.png");
        floskeln.setText("Entschuldigung");
        createButtonImage(gefuehle, "src/Pictos/Floskeln/Danke.png");
        gefuehle.setText("Danke");
        setInvisibleButton(fragen);
        fragen.setText("");
        createButtonImage(kleidung, "src/Pictos/Floskeln/fertig.png");
        kleidung.setText("fertig");
        setInvisibleButton(koerper);
        koerper.setText("");
        setInvisibleButton(orte);
        orte.setText("");
        createButtonImage(personen, "src/Pictos/Floskeln/Quatsch.png");
        personen.setText("Quatsch");
        createButtonImage(praepositionen, "src/Pictos/Floskeln/Bloedsinn.png");
        praepositionen.setText("Blödsinn");
        createButtonImage(verben, "src/Pictos/Floskeln/Arschloch.png");
        verben.setText("Arschloch");
        createButtonImage(zahlen, "src/Pictos/Floskeln/Bloedmann.png");
        zahlen.setText("Blödmann");
        createButtonImage(kategorie1, "src/Pictos/Floskeln/Dummkopf.png");
        kategorie1.setText("Dummkopf");
    }

    public void kategorieGefuehle() {
        createButtonImage(adjektive, "src/Pictos/Gefuehle/Angst.png");
        adjektive.setText("Angst");
        createButtonImage(aktivitaeten, "src/Pictos/Gefuehle/traurig.png");
        aktivitaeten.setText("traurig");
        createButtonImage(beduerfnisse, "src/Pictos/Gefuehle/ueberrascht.png");
        beduerfnisse.setText("überrascht");
        createButtonImage(farben, "src/Pictos/Gefuehle/froehlich.png");
        farben.setText("fröhlich");
        createButtonImage(floskeln, "src/Pictos/Gefuehle/weinen.png");
        floskeln.setText("weinen");
        createButtonImage(gefuehle, "src/Pictos/Gefuehle/langweilig.png");
        gefuehle.setText("langweilig");
        createButtonImage(fragen, "src/Pictos/Gefuehle/gluecklich.png");
        fragen.setText("glücklich");
        createButtonImage(kleidung, "src/Pictos/Gefuehle/lachen.png");
        kleidung.setText("lachen");
        createButtonImage(koerper, "src/Pictos/Gefuehle/muede.png");
        koerper.setText("müde");
        createButtonImage(orte, "src/Pictos/Gefuehle/wuetend.png");
        orte.setText("wütend");
        createButtonImage(personen, "src/Pictos/Gefuehle/neugierig.png");
        personen.setText("neugierig");
        createButtonImage(praepositionen, "src/Pictos/Gefuehle/wach.png");
        praepositionen.setText("wach");
        createButtonImage(verben, "src/Pictos/Gefuehle/verliebt.png");
        verben.setText("verliebt");
        createButtonImage(zahlen, "src/Pictos/Gefuehle/uebel.png");
        zahlen.setText("übel");
        setInvisibleButton(kategorie1);
        kategorie1.setText("");
    }

    public void kategorieFragen() {
        createButtonImage(adjektive, "src/Pictos/KategorieFragen/wie.png");
        adjektive.setText("wie");
        createButtonImage(aktivitaeten, "src/Pictos/KategorieFragen/warum.png");
        aktivitaeten.setText("warum");
        createButtonImage(beduerfnisse, "src/Pictos/KategorieFragen/welche.png");
        beduerfnisse.setText("welche");
        createButtonImage(farben, "src/Pictos/KategorieFragen/wer.png");
        farben.setText("wer");
        createButtonImage(floskeln, "src/Pictos/KategorieFragen/wo.png");
        floskeln.setText("wo");
        createButtonImage(gefuehle, "src/Pictos/KategorieFragen/duerfen.png");
        gefuehle.setText("dürfen");
        createButtonImage(fragen, "src/Pictos/KategorieFragen/machen.png");
        fragen.setText("machen");
        createButtonImage(kleidung, "src/Pictos/KategorieFragen/muessen.png");
        kleidung.setText("müssen");
        createButtonImage(koerper, "src/Pictos/KategorieFragen/moegen.png");
        koerper.setText("mögen");
        createButtonImage(orte, "src/Pictos/KategorieFragen/hoeren.png");
        orte.setText("hören");
        createButtonImage(personen, "src/Pictos/KategorieFragen/sehen.png");
        personen.setText("sehen");
        createButtonImage(praepositionen, "src/Pictos/KategorieFragen/lassen.png");
        praepositionen.setText("lassen");
        createButtonImage(verben, "src/Pictos/KategorieFragen/kommen.png");
        verben.setText("kommen");
        createButtonImage(zahlen, "src/Pictos/KategorieFragen/geben.png");
        zahlen.setText("geben");
        createButtonImage(kategorie1, "src/Pictos/KategorieFragen/wissen.png");
        kategorie1.setText("wissen");
    }

    public void kategorieKleidung() {
        createButtonImage(adjektive, "src/Pictos/Kleidung/Kleidung.png");
        adjektive.setText("Kleidung");
        createButtonImage(aktivitaeten, "src/Pictos/Kleidung/Hose.png");
        aktivitaeten.setText("Hose");
        createButtonImage(beduerfnisse, "src/Pictos/Kleidung/T-Shirt.png");
        beduerfnisse.setText("T-Shirt");
        createButtonImage(farben, "src/Pictos/Kleidung/Schmuck.png");
        farben.setText("Schmuck");
        createButtonImage(floskeln, "src/Pictos/Kleidung/Hausschuhe.png");
        floskeln.setText("Hausschuhe");
        createButtonImage(gefuehle, "src/Pictos/Kleidung/Kleid.png");
        gefuehle.setText("Kleid");
        createButtonImage(fragen, "src/Pictos/Kleidung/Pullover.png");
        fragen.setText("Pullover");
        createButtonImage(kleidung, "src/Pictos/Kleidung/Brille.png");
        kleidung.setText("Brille");
        createButtonImage(koerper, "src/Pictos/Kleidung/Schuhe.png");
        koerper.setText("Schuhe");
        createButtonImage(orte, "src/Pictos/Kleidung/Unterhose.png");
        orte.setText("Unterhose");
        createButtonImage(personen, "src/Pictos/Kleidung/Sonnenbrille.png");
        personen.setText("Sonnenbrille");
        createButtonImage(praepositionen, "src/Pictos/Kleidung/Armbanduhr.png");
        praepositionen.setText("Armbanduhr");
        createButtonImage(verben, "src/Pictos/Kleidung/Unterhemd.png");
        verben.setText("Unterhemd");
        createButtonImage(zahlen, "src/Pictos/Kleidung/Socken.png");
        zahlen.setText("Socken");
        createButtonImage(kategorie1, "src/Pictos/Kleidung/Zopf.png");
        kategorie1.setText("Zopf");
    }

    public void kategorieKoerper() {
        createButtonImage(adjektive, "src/Pictos/Koerper/Arm.png");
        adjektive.setText("Arm");
        createButtonImage(aktivitaeten, "src/Pictos/Koerper/Gesicht.png");
        aktivitaeten.setText("Gesicht");
        createButtonImage(beduerfnisse, "src/Pictos/Koerper/Kopf.png");
        beduerfnisse.setText("Kopf");
        createButtonImage(farben, "src/Pictos/Koerper/Bein.png");
        farben.setText("Bein");
        createButtonImage(floskeln, "src/Pictos/Koerper/Hand.png");
        floskeln.setText("Hand");
        createButtonImage(gefuehle, "src/Pictos/Koerper/Auge.png");
        gefuehle.setText("Auge");
        createButtonImage(fragen, "src/Pictos/Koerper/Bauch.png");
        fragen.setText("Bauch");
        createButtonImage(kleidung, "src/Pictos/Koerper/Fuss.png");
        kleidung.setText("Fuß");
        createButtonImage(koerper, "src/Pictos/Koerper/Ohr.png");
        koerper.setText("Ohr");
        createButtonImage(orte, "src/Pictos/Koerper/Ruecken.png");
        orte.setText("Rücken");
        createButtonImage(personen, "src/Pictos/Koerper/Haare.png");
        personen.setText("Haare");
        createButtonImage(praepositionen, "src/Pictos/Koerper/Nase.png");
        praepositionen.setText("Nase");
        createButtonImage(verben, "src/Pictos/Koerper/Brust.png");
        verben.setText("Brust");
        createButtonImage(zahlen, "src/Pictos/Koerper/Mund.png");
        zahlen.setText("Mund");
        createButtonImage(kategorie1, "src/Pictos/Koerper/Zaehne.png");
        kategorie1.setText("Zähne");
    }

    public void kategorieOrte() {
        createButtonImage(adjektive, "src/Pictos/Orte/Arbeit.png");
        adjektive.setText("Arbeit");
        createButtonImage(aktivitaeten, "src/Pictos/Orte/Laden.png");
        aktivitaeten.setText("Laden");
        createButtonImage(beduerfnisse, "src/Pictos/Orte/Schule.png");
        beduerfnisse.setText("Schule");
        createButtonImage(farben, "src/Pictos/Orte/Baecker.png");
        farben.setText("Bäcker");
        createButtonImage(floskeln, "src/Pictos/Orte/Krankenhaus.png");
        floskeln.setText("Krankenhaus");
        createButtonImage(gefuehle, "src/Pictos/Orte/Zimmer.png");
        gefuehle.setText("Zimmer");
        createButtonImage(fragen, "src/Pictos/Orte/Flur.png");
        fragen.setText("Flur");
        createButtonImage(kleidung, "src/Pictos/Orte/Haus.png");
        kleidung.setText("Haus");
        createButtonImage(koerper, "src/Pictos/Orte/Aufzug.png");
        koerper.setText("Aufzug");
        createButtonImage(orte, "src/Pictos/Orte/Wohnzimmer.png");
        orte.setText("Wohnzimmer");
        createButtonImage(personen, "src/Pictos/Orte/Badezimmer.png");
        personen.setText("Badezimmer");
        createButtonImage(praepositionen, "src/Pictos/Orte/Treppe.png");
        praepositionen.setText("Treppe");
        createButtonImage(verben, "src/Pictos/Orte/Garten.png");
        verben.setText("Garten");
        createButtonImage(zahlen, "src/Pictos/Orte/Keller.png");
        zahlen.setText("Keller");
        createButtonImage(kategorie1, "src/Pictos/Orte/Kueche.png");
        kategorie1.setText("Küche");
    }

    public void kategoriePersonen() {
        createButtonImage(adjektive, "src/Pictos/Personen/maennlich.png");
        adjektive.setText("männlich");
        createButtonImage(aktivitaeten, "src/Pictos/Personen/Baby.png");
        aktivitaeten.setText("Baby");
        createButtonImage(beduerfnisse, "src/Pictos/Personen/Freund.png");
        beduerfnisse.setText("Freund");
        createButtonImage(farben, "src/Pictos/Personen/weiblich.png");
        farben.setText("weiblich");
        createButtonImage(floskeln, "src/Pictos/Personen/Erwachsener.png");
        floskeln.setText("Erwachsener");
        createButtonImage(gefuehle, "src/Pictos/Personen/Bruder.png");
        gefuehle.setText("Bruder");
        createButtonImage(fragen, "src/Pictos/Personen/Arzt.png");
        fragen.setText("Arzt");
        createButtonImage(kleidung, "src/Pictos/Personen/Kind.png");
        kleidung.setText("Kind");
        createButtonImage(koerper, "src/Pictos/Personen/Vater.png");
        koerper.setText("Vater");
        createButtonImage(orte, "src/Pictos/Personen/Pfleger.png");
        orte.setText("Pfleger");
        createButtonImage(personen, "src/Pictos/Personen/Schwester.png");
        personen.setText("Schwester");
        createButtonImage(praepositionen, "src/Pictos/Personen/Mutter.png");
        praepositionen.setText("Mutter");
        createButtonImage(verben, "src/Pictos/Personen/Therapeut.png");
        verben.setText("Therapeut");
        createButtonImage(zahlen, "src/Pictos/Personen/Lehrer.png");
        zahlen.setText("Lehrer");
        setInvisibleButton(kategorie1);
        kategorie1.setText("");
    }

    public void kategoriePraepositionen() {
        createButtonImage(adjektive, "src/Pictos/Praepositionen/gern.png");
        adjektive.setText("gern");
        createButtonImage(aktivitaeten, "src/Pictos/Praepositionen/sehr.png");
        aktivitaeten.setText("sehr");
        createButtonImage(beduerfnisse, "src/Pictos/Praepositionen/mehr.png");
        beduerfnisse.setText("mehr");
        createButtonImage(farben, "src/Pictos/Praepositionen/nachher.png");
        farben.setText("nachher");
        createButtonImage(floskeln, "src/Pictos/Praepositionen/rauf.png");
        floskeln.setText("rauf");
        createButtonImage(gefuehle, "src/Pictos/Praepositionen/viel.png");
        gefuehle.setText("viel");
        createButtonImage(fragen, "src/Pictos/Praepositionen/vor.png");
        fragen.setText("vor");
        createButtonImage(kleidung, "src/Pictos/Praepositionen/runter.png");
        kleidung.setText("runter");
        createButtonImage(koerper, "src/Pictos/Praepositionen/oben.png");
        koerper.setText("oben");
        createButtonImage(orte, "src/Pictos/Praepositionen/hinter.png");
        orte.setText("hinter");
        createButtonImage(personen, "src/Pictos/Praepositionen/weniger.png");
        personen.setText("weniger");
        createButtonImage(praepositionen, "src/Pictos/Praepositionen/unten.png");
        praepositionen.setText("unter");
        createButtonImage(verben, "src/Pictos/Praepositionen/neben.png");
        verben.setText("neben");
        createButtonImage(zahlen, "src/Pictos/Praepositionen/wieder.png");
        zahlen.setText("wieder");
        createButtonImage(kategorie1, "src/Pictos/Praepositionen/wenig.png");
        kategorie1.setText("wenig");
    }

    public void kategorieVerben() {
        createButtonImage(adjektive, "src/Pictos/Verben/riechen.png");
        adjektive.setText("riechen");
        createButtonImage(aktivitaeten, "src/Pictos/Verben/schmecken.png");
        aktivitaeten.setText("schmecken");
        createButtonImage(beduerfnisse, "src/Pictos/Verben/fuehlen.png");
        beduerfnisse.setText("fühlen");
        createButtonImage(farben, "src/Pictos/Verben/sagen.png");
        farben.setText("sagen");
        createButtonImage(floskeln, "src/Pictos/Verben/aergern.png");
        floskeln.setText("ärgern");
        createButtonImage(gefuehle, "src/Pictos/Verben/beissen.png");
        gefuhle.setText("beißen");
        createButtonImage(fragen, "src/Pictos/Verben/fallen.png");
        fragen.setText("fallen");
        createButtonImage(kleidung, "src/Pictos/Verben/helfen.png");
        kleidung.setText("helfen");
        createButtonImage(koerper, "src/Pictos/Verben/kratzen.png");
        koerper.setText("kratzen");
        createButtonImage(orte, "src/Pictos/Verben/holen.png");
        orte.setText("holen");
        createButtonImage(personen, "src/Pictos/Verben/krabbeln.png");
        personen.setText("krabbeln");
        createButtonImage(praepositionen, "src/Pictos/Verben/rennen.png");
        praepositionen.setText("rennen");
        createButtonImage(verben, "src/Pictos/Verben/passen.png");
        verben.setText("passen");
        createButtonImage(zahlen, "src/Pictos/Verben/schneiden.png");
        zahlen.setText("schneiden");
        createButtonImage(kategorie1, "src/Pictos/Verben/streicheln.png");
        kategorie1.setText("streicheln");
    }
    

    public void kategorieZahlen() {
        createButtonImage(adjektive, "src/Pictos/Zahlen/1.png");
        adjektive.setText("1");
        createButtonImage(aktivitaeten, "src/Pictos/Zahlen/2.png");
        aktivitaeten.setText("2");
        createButtonImage(beduerfnisse, "src/Pictos/Zahlen/3.png");
        beduerfnisse.setText("3");
        setInvisibleButton(farben);
        farben.setText("");
        createButtonImage(floskeln, "src/Pictos/Zahlen/4.png");
        floskeln.setText("4");
        createButtonImage(gefuehle, "src/Pictos/Zahlen/5.png");
        gefuhele.setText("5");
        createButtonImage(fragen, "src/Pictos/Zahlen/6.png");
        fragen.setText("6");
        setInvisibleButton(kleidung);
        kleidung.setText("");
        createButtonImage(koerper, "src/Pictos/Zahlen/7.png");
        koerper.setText("7");
        createButtonImage(orte, "src/Pictos/Zahlen/8.png");
        orte.setText("8");
        createButtonImage(personen, "src/Pictos/Zahlen/9.png");
        personen.setText("9");
        setInvisibleButton(praepositionen);
        praepositionen.setText("");
        setInvisibleButton(verben);
        verben.setText("");
        createButtonImage(zahlen, "src/Pictos/Zahlen/0.png");
        zahlen.setText("0");
        setInvisibleButton(kategorie1);
        kategorie1.setText("");
    }

    public void kategorieUebersicht() {
        getAdjektive();
        adjektive.setText("Adjektive");
        getAktivitaeten();
        aktivitaeten.setText("AktivitÃ¤ten");
        getBeduerfnisse();
        beduerfnisse.setText("BedÃ¼rfnisse");
        getFarben();
        farben.setText("Farben");
        getFloskeln();
        floskeln.setText("Floskeln");
        getGefuehle();
        gefuehle.setText("Gefuehle");
        getFragen();
        kleidung.setText("Kleidung");
        getKleidung();
        koerper.setText("KÃ¶rper");
        getKoerper();
        fragen.setText("Fragen");
        getOrte();
        orte.setText("Orte");
        getPersonen();
        personen.setText("Personen");
        getPraepositionen();
        praepositionen.setText("PrÃ¤positionen");
        getVerben();
        verben.setText("Verben");
        getZahlen();
        zahlen.setText("Zahlen");
        getKategorie1();
        kategorie1.setText("");
    }

    public JButton getAdjektive() {
        createButtonImage(adjektive, "src/Pictos/KategorieAdjektive.png");
        return adjektive;
    }

    public JButton getAktivitaeten() {
        createButtonImage(aktivitaeten, "src/Pictos/KategorieAktivitaeten.png");
        return aktivitaeten;
    }

    public JButton getBeduerfnisse() {
        createButtonImage(beduerfnisse, "src/Pictos/KategorieBeduerfnisse.png");
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
        createButtonImage(gefuehle, "src/Pictos/KategorieGefuehle.png");
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
        createButtonImage(koerper, "src/Pictos/KategorieKoerper.png");
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
        createButtonImage(praepositionen, "src/Pictos/KategoriePraepositionen.png");
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
        createButtonImage(moechten, "src/Pictos/moechten.png");
        return moechten;
    }

    public JButton getKoennen() {
        createButtonImage(koennen, "src/Pictos/koennen.png");
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

    public JButton getReturnButton() {
        createButtonImage(returnButton, "src/Pictos/FKT zurueck.png");
        return returnButton;
    }

    public JButton getKategorie1() {
        setInvisibleButton(kategorie1);
        return kategorie1;
    }

    public JButton getMit() {
        createButtonImage(mit, "src/Pictos/mit.png");
        return mit;
    }

    public JButton getIn() {
        createButtonImage(in, "src/Pictos/ein.png");
        return in;
    }

    public JButton getEin() {
        createButtonImage(ein, "src/Pictos/ein.png");
        return ein;
    }

    public JButton getWas() {
        createButtonImage(was, "src/Pictos/was.png");
        return was;
    }

    public JButton getMich() {
        createButtonImage(mich, "src/Pictos/mich.png");
        return mich;
    }

    public JButton getWeil() {
        createButtonImage(weil, "src/Pictos/weil.png");
        return weil;
    }

    public JButton getBitte() {
        createButtonImage(bitte, "src/Pictos/bitte.png");
        return bitte;
    }

    public JButton getDa() {
        createButtonImage(da, "src/Pictos/da.png");
        return da;
    }

    public JButton getJetzt() {
        createButtonImage(jetzt, "src/Pictos/jetzt.png");
        return jetzt;
    }

    public JButton getHier() {
        createButtonImage(hier, "src/Pictos/hier.png");
        return hier;
    }

    public JButton getNoch() {
        createButtonImage(noch, "src/Pictos/noch.png");
        return noch;
    }

    public JButton getMal() {
        createButtonImage(mal, "src/Pictos/mal.png");
        return mal;
    }


}
