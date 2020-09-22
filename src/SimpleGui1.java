import javax.swing.*;
import java.awt.*;


public class SimpleGui1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Button button = new Button("click me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }
}