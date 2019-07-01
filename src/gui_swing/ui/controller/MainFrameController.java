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
        adjektive = mainFrame.getAdjektive();

        sein = mainFrame.getSein();
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
        setVoice();
    }

    private void makeChange(int x){
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
     *
     * Adds a Word at the end of a String
     * @param o
     * @return
     */
    private static String addText(String o) {
        output = output + " " + o;
        return output;
    }

    /**
     *
     * Removes the Last Word to a String
     * @param o
     * @return
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
        und.addActionListener(new undListener());
        send.addActionListener(new sendListener());


        adjektive.addActionListener(new adjektiveListener());
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

    private class undListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("und"));
        }
    }

    private class adjektiveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            makeChange(0);
        }
    }
}

