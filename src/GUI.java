import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GUI {
    GUI (){
        createAndShowGUI();
    }

    private static String output = "";

    /**
     *
     * @param button = Button der GUI
     * @param src = Pfad zu den Bilddateien
     * @return
     */
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

    /**
     *
     * @param c = A coinstraint that gets edited
     * @param constraints = Component Position
     * @param gridx = Row of the GUIItem
     * @param gridy = Collum of the GUIItem
     * @return
     */
    private static GridBagConstraints createGridConstraints(GridBagConstraints c, int constraints, int gridx, int gridy) {
        c.fill = constraints;
        c.gridx = gridx;
        c.gridy = gridy;
        return c;
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

    /**
     *
     * TextToSpeech with a given String
     * @param x
     * @param tts = variable for the texttospeech
     */
    private static void voiceAusgeben(String x, TextToSpeech tts) {
       tts.speak(x, 1.0f, false, false);
    }

    /**
     *
     * Sets the Voice
     * @param voice
     * @param tts
     */
    private static void setVoice(String voice, TextToSpeech tts) {
        tts.setVoice(voice);
    }

    /**
     *
     * Adds the Components to the GUI
     * @param pane
     * @param tts
     */
    private static void addComponentsToPane(Container pane, TextToSpeech tts) {
        JButton button;
        JLabel label;
        JTextField textField;
        JComboBox voices;
        GridBagConstraints c;

        pane.setLayout(new GridBagLayout());
        c = new GridBagConstraints();

        voices = new JComboBox();
        voices.addItem("DE1 Frau");
        setVoice("bits1-hsmm", tts);
        voices.addItem("DE2 Mann");
        voices.setSelectedIndex(0);
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 16);
        pane.add(voices, c);
        voices.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (voices.getSelectedIndex()) {
                    case 0:
                        setVoice("bits1-hsmm", tts);
                        break;
                    case 1:
                        setVoice("bits3-hsmm", tts);
                        break;
                    default:
                }

            }
        });

        textField = new JTextField();
        textField.setColumns(30);
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 1, 0);
        pane.add(textField, c);


        // Button Löschen
        button = new JButton();
        createButtonImage(button, "src/Pictos/FKTloeschen.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 0);
        pane.add(button, c);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // Delete Last word from TextField if there is a last Word
                if (textField.getText().lastIndexOf(" ") != -1) {
                    textField.setText(removeText(textField.getText().substring(0, textField.getText().lastIndexOf(" "))));
                }
            }
        });

        // Button ausgeben
        button = new JButton();
        createButtonImage(button, "src/Pictos/FKT ausgeben.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 2, 0);
        pane.add(button, c);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (textField.getText().lastIndexOf(" ") != -1) {
                    voiceAusgeben(textField.getText(), tts);
                }
            }
        });

        // Button und
        button = new JButton();
        createButtonImage(button, "src/Pictos/und.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 1);
        pane.add(button, c);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textField.setText(addText("und"));
            }
        });

        // Label Button und
        label = new JLabel("und");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 2);
        pane.add(label, c);

        // Lücke zwischen den verschiedenen Button
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 3);
        pane.add(Box.createVerticalStrut(10), c);

        // Button ich
        button = new JButton();
        createButtonImage(button, "src/Pictos/ich.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 4);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textField.setText(addText("ich"));
            }
        });

        pane.add(button, c);

        label = new JLabel("ich");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 5);
        pane.add(label, c);

        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 6);
        pane.add(Box.createVerticalStrut(10), c);

        // Button du
        button = new JButton();
        createButtonImage(button, "src/Pictos/du.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 7);
        pane.add(button, c);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textField.setText(addText("du"));
            }
        });


        label = new JLabel("du");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 8);
        pane.add(label, c);

        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 9);
        pane.add(Box.createVerticalStrut(10), c);


        // Button wir
        button = new JButton();
        createButtonImage(button, "src/Pictos/wir.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 10);
        pane.add(button, c);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textField.setText(addText("wir"));
            }
        });


        label = new JLabel("wir");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 11);
        pane.add(label, c);

        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 12);
        pane.add(Box.createVerticalStrut(10), c);


        // Button das
        button = new JButton();
        createButtonImage(button, "src/Pictos/das.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 13);
        pane.add(button, c);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textField.setText(addText("das"));
            }
        });


        label = new JLabel("das");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 14);
        pane.add(label, c);

        createGridConstraints(c, GridBagConstraints.NORTHWEST, 0, 15);
        pane.add(Box.createVerticalStrut(10), c);
        addCategoriesToPane(pane);
        addCategorieAdjektive(pane);

    }

    private static void addCategoriesToPane(Container pane) {
        JButton button;
        JLabel label;
        GridBagConstraints c;
        c = new GridBagConstraints();


        // Button das
        button = new JButton();
        createButtonImage(button, "src/Pictos/das.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 5, 13);
        pane.add(button, c);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                addCategorieAdjektive(pane);
            }
        });

        label = new JLabel("das");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 5, 14);
        pane.add(label, c);

        createGridConstraints(c, GridBagConstraints.NORTHWEST, 5, 15);
        pane.add(Box.createVerticalStrut(10), c);
    }

    private static void addCategorieAdjektive(Container pane) {
        JButton button;
        JLabel label;
        GridBagConstraints c;
        c = new GridBagConstraints();


        // Button das
        button = new JButton();
        createButtonImage(button, "src/Pictos/Adjektive/alt.png");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 4, 13);
        pane.add(button, c);


        label = new JLabel("test");
        createGridConstraints(c, GridBagConstraints.NORTHWEST, 4, 14);
        pane.add(label, c);

        createGridConstraints(c, GridBagConstraints.NORTHWEST, 4, 15);
        pane.add(Box.createVerticalStrut(10), c);
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("ELKO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TextToSpeech tts = new TextToSpeech();

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane(), tts);
        //addCategoriesToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

}