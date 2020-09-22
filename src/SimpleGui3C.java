import javax.swing.*;
import java.awt.*;

public class SimpleGui3C {
    JFrame frame;
    int x;
    int y;

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel drawPanel = new DrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.pack();
//        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            drawPanel.repaint();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class DrawPanel extends JPanel {
        public void paintComponent(Graphics g) {

            g.setColor(Color.RED);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor(Color.ORANGE);
            g.fillOval(x, y, 40, 40);
        }

    }
}
