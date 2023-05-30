import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public JPanel panel;
    private JButton diceButton;
    private JButton dnDButton;
    private JButton button3;
    private JTextArea textArea1;
    private JButton button4;
    private JButton button5;
    private JButton d8Button;
    private JButton d6Button;
    private JButton d12Button;
    private JButton d20Button;
    private JButton d10Button;
    private JButton d100Button;
    private JPanel version2Panel;

    public JFrame frame;

    public GUI() {
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int h = 2;
                int roll = (int) (Math.random() * (h) + 1);
                textArea1.setText("You rolled a " + roll + "!");

            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int h = 4;
                int roll = (int) (Math.random() * (h) + 1);
                textArea1.setText("You rolled a " + roll + "!");
            }
        });
        d6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int h = 6;
                int roll = (int) (Math.random() * (h) + 1);
                textArea1.setText("You rolled a " + roll + "!");
            }
        });
        d8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int h = 8;
                int roll = (int) (Math.random() * (h) + 1);
                textArea1.setText("You rolled a " + roll + "!");
            }
        });
        d10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int h = 10;
                int roll = (int) (Math.random() * (h) + 1);
                textArea1.setText("You rolled a " + roll + "!");
            }
        });
        d12Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int h = 12;
                int roll = (int) (Math.random() * (h) + 1);
                textArea1.setText("You rolled a " + roll + "!");
            }
        });
        d20Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int h = 20;
                int roll = (int) (Math.random() * (h) + 1);
                textArea1.setText("You rolled a " + roll + "!");
            }
        });
        d100Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int h = 100;
                int roll = (int) (Math.random() * (h) + 1);
                textArea1.setText("You rolled a " + roll + "!");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                version2 v2 = new version2();
                v2.frame = frame;
                frame.setContentPane(v2.version2Panel);
                frame.setVisible(true);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


     public static void main(String[] args) {
            JFrame frame = new JFrame("GUI");
            GUI gui = new GUI();
            gui.frame = frame;
            frame.setContentPane(gui.panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui.panel.setPreferredSize(new Dimension(350,350));
            Font font1 = new Font ("Sans Seriff", Font.BOLD, 18);
            gui.textArea1.setFont(font1);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }



}
