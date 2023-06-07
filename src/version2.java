import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class version2 {
    public JPanel version2Panel;
    public JFrame frame
            ;
    private JPanel panel;
    private JButton button1;
    private JButton dnDButton;
    private JButton button3;
    private JTextArea version2TextArea;
    private JButton d8Button;
    private JButton d6Button;
    private JButton d12Button;
    private JButton d20Button;
    private JButton d10Button;
    private JButton d100Button;
    private JButton createButton;
    int slotq;
    public version2() {




        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI gui = new GUI();
                gui.frame = frame;
                frame.setContentPane(gui.panel);
                frame.setVisible(true);
            }
        });
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                slotq = Integer.parseInt(JOptionPane.showInputDialog("What slot do you want to change? (1-6)"));
                slotq = slotq - 1;
                for (int i = 0 ; i< 6; i++){

                    }

            }
        });
    }
}
