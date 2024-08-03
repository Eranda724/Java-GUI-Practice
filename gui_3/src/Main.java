import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener, MouseListener, MouseMotionListener {
    JPanel panel;
    private int squareX = 10, squareY = 10; // Initial position of the square
    private final int SQUARE_SIZE = 10;
    private boolean dragging = false;

    MyFrame() {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillRect(squareX, squareY, SQUARE_SIZE, SQUARE_SIZE);
            }
        };

        panel.setPreferredSize(new Dimension(300, 400));
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);

        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // No actions required for this specific example
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        if (mouseX >= squareX && mouseX <= squareX + SQUARE_SIZE &&
                mouseY >= squareY && mouseY <= squareY + SQUARE_SIZE) {
            dragging = true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        dragging = false;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (dragging) {
            int mouseX = e.getX();
            int mouseY = e.getY();
            squareX = mouseX - SQUARE_SIZE / 2;
            squareY = mouseY - SQUARE_SIZE / 2;
            panel.repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Not needed for dragging functionality
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Not needed for dragging functionality
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Not needed for dragging functionality
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Not needed for dragging functionality
    }
}

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("My Application");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
