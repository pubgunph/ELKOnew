package gui_swing.ui.controller;

import gui_swing.ui.TextToSpeech;
import gui_swing.ui.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameController {
    private static String output = "";
    private MainFrame mainFrame;
    private JTextField ausgabeTextField;
    private JComboBox setVoiceBox;
    private JButton delete;
    private JButton send;
    private JButton returnButton;
    private JButton adjektive;
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
    private JButton praepositionen;
    private JButton und;
    private JButton ich;
    private JButton du;
    private JButton wir;
    private JButton das;
    private JButton oder;
    private JButton moechten;
    private JButton koennen;
    private JButton nichtButton;
    private JButton haben;
    private JButton auch;
    private JButton sein;
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

    private TextToSpeech tts = new TextToSpeech();

    public MainFrameController() {
        initComponents();
        initListeners();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        mainFrame = new MainFrame();
        ausgabeTextField = mainFrame.getAusgabeTextField();
        setVoiceBox = mainFrame.getSetVoiceBox();
        delete = mainFrame.getDelete();
        returnButton = mainFrame.getReturnButton();
        adjektive = mainFrame.getAdjektive();
        aktivitaeten = mainFrame.getAktivitaeten();
        beduerfnisse = mainFrame.getBeduerfnisse();
        farben = mainFrame.getFarben();
        floskeln = mainFrame.getFloskeln();
        gefuehle = mainFrame.getGefuehle();
        fragen = mainFrame.getFragen();
        kleidung = mainFrame.getKleidung();
        koerper = mainFrame.getKoerper();
        orte = mainFrame.getOrte();
        personen = mainFrame.getPersonen();
        verben = mainFrame.getVerben();
        zahlen = mainFrame.getZahlen();
        praepositionen = mainFrame.getPraepositionen();
        kategorie1 = mainFrame.getKategorie1();
        mit = mainFrame.getMit();
        in = mainFrame.getIn();
        ein = mainFrame.getEin();
        was = mainFrame.getWas();
        mich = mainFrame.getMich();
        weil = mainFrame.getWeil();
        bitte = mainFrame.getBitte();
        da = mainFrame.getDa();
        jetzt = mainFrame.getJetzt();
        hier = mainFrame.getHier();
        noch = mainFrame.getNoch();
        mal = mainFrame.getMal();
        und = mainFrame.getUnd();
        ich = mainFrame.getIch();
        du = mainFrame.getDu();
        wir = mainFrame.getWir();
        das = mainFrame.getDas();
        send = mainFrame.getSend();
        oder = mainFrame.getOder();
        moechten = mainFrame.getMoechten();
        koennen = mainFrame.getKoennen();
        sein = mainFrame.getSein();
        nichtButton = mainFrame.getNichtButton();
        haben = mainFrame.getHaben();
        auch = mainFrame.getAuch();
        sein = mainFrame.getSein();
        setVoice();
    }

    private void makeChange(int x) {
        switch (x) {
            case 0:
                mainFrame.kategorieAdjektive();
                break;
            case 1:
                mainFrame.kategorieAktivitaeten();
                break;
            case 2:
                mainFrame.kategorieBeduerfnisse();
                break;
            case 3:
                mainFrame.kategorieFarben();
                break;
            case 4:
                mainFrame.kategorieFloskeln();
                break;
            case 5:
                mainFrame.kategorieGefuehle();
                break;
            case 6:
                mainFrame.kategorieFragen();
                break;
            case 7:
                mainFrame.kategorieKleidung();
                break;
            case 8:
                mainFrame.kategorieKoerper();
                break;
            case 9:
                mainFrame.kategorieOrte();
                break;
            case 10:
                mainFrame.kategoriePersonen();
                break;
            case 11:
                mainFrame.kategoriePraepositionen();
                break;
            case 12:
                mainFrame.kategorieVerben();
                break;
            case 13:
                mainFrame.kategorieZahlen();
                break;
            case 14:
                mainFrame.kategorieUebersicht();
                break;
            default:
        }
    }

    private void setVoice() {
        switch (setVoiceBox.getSelectedIndex()) {
            case 0:
                tts.setVoice("bits1-hsmm");
                break;
            case 1:
                tts.setVoice("bits3-hsmm");
                break;
            default:
        }
    }

    /**
     * Adds a Word at the end of a String
     *
     * @param o string that adds text
     * @return output String
     */
    private static String addText(String o) {
        output = output + " " + o;
        return output;
    }

    /**
     * Removes the Last Word to a String
     *
     * @param o string to delete
     * @return output String
     */
    private static String removeText(String o) {
        output = o;
        return output;
    }

    private void voiceAusgeben(String x) {
        tts.speak(x, 1.0f, false, false);
    }

    public void showMainFrameWindow() {
        mainFrame.setVisible(true);
    }

    private void initListeners() {
        setVoiceBox.addActionListener(new setVoiceBoxListener());
        delete.addActionListener(new deleteListener());
        send.addActionListener(new sendListener());
        returnButton.addActionListener(new returnButtonListener());
        adjektive.addActionListener(new adjektiveListener());
        aktivitaeten.addActionListener(new aktivitaetenListener());
        beduerfnisse.addActionListener(new beduerfnisseListerner());
        farben.addActionListener(new farbenListener());
        floskeln.addActionListener(new floskelnListener());
        gefuehle.addActionListener(new gefuehleListener());
        fragen.addActionListener(new fragenListener());
        kleidung.addActionListener(new kleidungListener());
        koerper.addActionListener(new koerperListener());
        orte.addActionListener(new orteListener());
        personen.addActionListener(new personenListener());
        verben.addActionListener(new verbenListener());
        zahlen.addActionListener(new zahlenListener());
        kategorie1.addActionListener(new kategorie1Listener());
        praepositionen.addActionListener(new praepositionenListener());
        und.addActionListener(new undListener());
        ich.addActionListener(new ichListener());
        du.addActionListener(new duListener());
        wir.addActionListener(new wirListener());
        das.addActionListener(new dasListener());
        oder.addActionListener(new oderListener());
        moechten.addActionListener(new moechtenListener());
        koennen.addActionListener(new koennenListener());
        nichtButton.addActionListener(new nichtButtonListener());
        haben.addActionListener(new habenListener());
        auch.addActionListener(new auchListener());
        sein.addActionListener(new seinListener());
        mit.addActionListener(new mitListener());
        in.addActionListener(new inListener());
        ein.addActionListener(new einListener());
        was.addActionListener(new wasListener());
        mich.addActionListener(new michListener());
        weil.addActionListener(new weilListener());
        bitte.addActionListener(new bitteListener());
        da.addActionListener(new daListener());
        jetzt.addActionListener(new jetztListener());
        hier.addActionListener(new hierListener());
        noch.addActionListener(new nochListener());
        mal.addActionListener(new malListener());

    }

    private class setVoiceBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setVoice();
        }
    }

    private class deleteListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (ausgabeTextField.getText().lastIndexOf(" ") != -1) {
                ausgabeTextField.setText(removeText(ausgabeTextField.getText().substring(0, ausgabeTextField.getText().lastIndexOf(" "))));
            }
        }
    }

    private class sendListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (ausgabeTextField.getText().lastIndexOf(" ") != -1) {
                voiceAusgeben(ausgabeTextField.getText());
            }
        }
    }

    private class returnButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            makeChange(14);
        }
    }

    private class adjektiveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (adjektive.getText().equals("Adjektive")) {
                makeChange(0);
            } else {
                ausgabeTextField.setText(addText(adjektive.getText()));
            }
        }
    }

    private class aktivitaetenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (aktivitaeten.getText().equals("Aktivitäten")) {
                makeChange(1);
            } else {
                ausgabeTextField.setText(addText(aktivitaeten.getText()));
            }
        }
    }

    private class beduerfnisseListerner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (beduerfnisse.getText().equals("Bedürfnisse")) {
                makeChange(2);
            } else {
                ausgabeTextField.setText(addText(beduerfnisse.getText()));
            }
        }
    }

    private class farbenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (farben.getText().equals("Farben")) {
                makeChange(3);
            } else {
                ausgabeTextField.setText(addText(farben.getText()));
            }
        }
    }

    private class floskelnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (floskeln.getText().equals("Floskeln")) {
                makeChange(4);
            } else {
                ausgabeTextField.setText(addText(floskeln.getText()));
            }
        }
    }

    private class gefuehleListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (gefuehle.getText().equals("Gefühle")) {
                makeChange(5);
            } else {
                ausgabeTextField.setText(addText(gefuehle.getText()));
            }
        }
    }

    private class fragenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (fragen.getText().equals("Fragen")) {
                makeChange(6);
            } else {
                ausgabeTextField.setText(addText(fragen.getText()));
            }
        }
    }

    private class kleidungListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (kleidung.getText().equals("Kleidung")) {
                makeChange(7);
            } else {
                ausgabeTextField.setText(addText(kleidung.getText()));
            }
        }
    }

    private class koerperListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (koerper.getText().equals("Körper")) {
                makeChange(8);
            } else {
                ausgabeTextField.setText(addText(koerper.getText()));
            }
        }
    }

    private class orteListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (orte.getText().equals("Orte")) {
                makeChange(9);
            } else {
                ausgabeTextField.setText(addText(orte.getText()));
            }
        }
    }

    private class personenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (personen.getText().equals("Personen")) {
                makeChange(10);
            } else {
                ausgabeTextField.setText(addText(personen.getText()));
            }
        }
    }

    private class verbenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (verben.getText().equals("Verben")) {
                makeChange(12);
            } else {
                ausgabeTextField.setText(addText(verben.getText()));
            }
        }
    }

    private class zahlenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (zahlen.getText().equals("Zahlen")) {
                makeChange(13);
            } else {
                ausgabeTextField.setText(addText(zahlen.getText()));
            }
        }
    }

    private class kategorie1Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (kategorie1.getText().equals("")) {

            } else {
                ausgabeTextField.setText(addText(kategorie1.getText()));
            }
        }
    }

    private class praepositionenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (praepositionen.getText().equals("Präpositionen")) {
                makeChange(11);
            } else {
                ausgabeTextField.setText(addText(praepositionen.getText()));
            }
        }
    }

    private class undListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("und"));
        }
    }

    private class ichListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("ich"));
        }
    }

    private class duListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("du"));
        }
    }

    private class wirListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("wir"));
        }
    }

    private class dasListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("das"));
        }
    }

    private class oderListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("oder"));
        }
    }

    private class moechtenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("möchten"));
        }
    }

    private class koennenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("können"));
        }
    }

    private class nichtButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("nicht"));
        }
    }

    private class habenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("haben"));
        }
    }

    private class auchListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("auch"));
        }
    }

    private class seinListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("sein"));
        }
    }

    private class mitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("mit"));
        }
    }

    private class inListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("in"));
        }
    }

    private class einListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("ein"));
        }
    }

    private class wasListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("was"));
        }
    }

    private class michListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("mich"));
        }
    }

    private class weilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("weil"));
        }
    }

    private class bitteListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("bitte"));
        }
    }

    private class daListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("da"));
        }
    }

    private class jetztListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("jetzt"));
        }
    }

    private class hierListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("hier"));
        }
    }

    private class nochListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("noch"));
        }
    }

    private class malListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("mal"));
        }
    }
}

