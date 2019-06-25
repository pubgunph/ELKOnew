package gui_swing.ui.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainFrame extends JFrame {
    private static JButton createButtonImage(JButton button, String src) {
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

    public static final int WIDTH = 700;
    public static final int HEIGHT = 700;
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
    private JLabel undLabel;
    private JLabel ichLabel;
    private JLabel duLabel;
    private JLabel wirLabel;
    private JLabel dasLabel;
    private JLabel nichtLabel;
    private JLabel koennenLabel;
    private JLabel auchLabel;
    private JLabel habenLabel;
    private JLabel seinLabel;
    private JLabel moechtenLabel;
    private JLabel oderLabel;

    public MainFrame() {
        setSize(WIDTH, HEIGHT);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
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

    public JLabel getKoennenLabel() {
        return koennenLabel;
    }

    public JLabel getAuchLabel() {
        return auchLabel;
    }

    public JLabel getHabenLabel() {
        return habenLabel;
    }

    public JButton getHaben() {
        return haben;
    }

    public JButton getAuch() {
        return auch;
    }

    public JLabel getSeinLabel() {
        return seinLabel;
    }

    public JButton getSein() {
        return sein;
    }

    public JLabel getMoechtenLabel() {
        return moechtenLabel;
    }

    public JLabel getOderLabel() {
        return oderLabel;
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
        return ausgabeTextField;
    }

    public JButton getNichtButton() {
        createButtonImage(nichtButton, "src/Pictos/nicht.png");
        return nichtButton;
    }

    public JLabel getUndLabel() {
        return undLabel;
    }

    public JLabel getIchLabel() {
        return ichLabel;
    }

    public JLabel getDuLabel() {
        return duLabel;
    }

    public JLabel getWirLabel() {
        return wirLabel;
    }

    public JLabel getDasLabel() {
        return dasLabel;
    }

    public JLabel getNichtLabel() {
        return nichtLabel;
    }


}
