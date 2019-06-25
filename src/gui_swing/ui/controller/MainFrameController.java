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
    private JButton nichtButton;
    private JButton oder;
    private JButton moechten;
    private JButton koennen;
    private JButton haben;
    private JButton auch;
    private JButton sein;
    private JLabel koennenLabel;
    private JLabel auchLabel;
    private JLabel habenLabel;
    private JLabel undLabel;
    private JLabel ichLabel;
    private JLabel duLabel;
    private JLabel wirLabel;
    private JLabel dasLabel;
    private JLabel nichtLabel;
    private JLabel seinLabel;
    private JLabel moechtenLabel;
    private JLabel oderLabel;
    TextToSpeech tts = new TextToSpeech();

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
        undLabel = mainFrame.getUndLabel();
        ichLabel = mainFrame.getIchLabel();
        duLabel = mainFrame.getDuLabel();
        wirLabel = mainFrame.getWirLabel();
        dasLabel = mainFrame.getDasLabel();
        nichtLabel = mainFrame.getNichtLabel();
        koennenLabel = mainFrame.getKoennenLabel();
        auchLabel = mainFrame.getAuchLabel();
        habenLabel = mainFrame.getHabenLabel();
        seinLabel = mainFrame.getSeinLabel();
        moechtenLabel = mainFrame.getMoechtenLabel();
        oderLabel = mainFrame.getOderLabel();
        setVoice();

    }

    public void setVoice() {
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
    }

    private class deleteListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (ausgabeTextField.getText().lastIndexOf(" ") != -1) {
                ausgabeTextField.setText(removeText(ausgabeTextField.getText().substring(0, ausgabeTextField.getText().lastIndexOf(" "))));
            }
        }
    }

    private class undListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ausgabeTextField.setText(addText("und"));
        }
    }


    private class setVoiceBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                setVoice();
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
}

