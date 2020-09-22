import javax.swing.*;
import java.awt.*;

public class Panel1 {

    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        frame.getContentPane().add(BorderLayout.EAST, panel);
        JButton button = new JButton("shock me");
        JButton button1 = new JButton("bliss");
        JButton button2 = new JButton("bliss");
        panel.add(button);
        panel.add(button1);
        panel.add(button2);
//        Font font = new Font("dialog.arial", Font.BOLD, 28);
//        button.setFont(font);
        frame.setDefaultCloseOperation(3);
        frame.setSize(200, 200);
        frame.setVisible(true);
//        System.out.println(button.getFont().getFontName());
    }
}
