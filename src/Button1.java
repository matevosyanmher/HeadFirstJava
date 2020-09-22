import javax.swing.*;
import java.awt.*;

public class Button1 {

    public static void main(String[] args) {
        Button1 gui = new Button1();
        gui.go();
    }

    private void go() {
        JFrame frame;

        Font font = new Font("serif", Font.ITALIC, 40);

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton NORTH = new JButton("NORTH");
        JButton SOUTH = new JButton("SOUTH");
        SOUTH.setFont(font);
        JButton EAST = new JButton("EAST");
        JButton WEST = new JButton("WEST");
        JButton CENTRE = new JButton("CENTRE");
        System.out.println(SOUTH.getFont().getFontName());

        frame.getContentPane().add(BorderLayout.NORTH, NORTH);
        frame.getContentPane().add(BorderLayout.SOUTH, SOUTH);
        frame.getContentPane().add(BorderLayout.EAST, EAST);
        frame.getContentPane().add(BorderLayout.WEST, WEST);
        frame.getContentPane().add(BorderLayout.CENTER, CENTRE);

        frame.setSize(300, 300);
        frame.setVisible(true);

    }
}
