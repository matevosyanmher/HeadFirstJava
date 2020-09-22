import javax.swing.*;
import java.awt.*;

public class SwingComponents_Border {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.blue));

        JFrame frame = new JFrame();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().add(BorderLayout.SOUTH,panel);
    }
}