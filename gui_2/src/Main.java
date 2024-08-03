import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JButton rb , bb , gb;
    JPanel panel;

    MyFrame(){

        rb = new JButton("red");
        bb = new JButton("blue");
        gb = new JButton("green");

        this.setLayout(new FlowLayout());
        this.add(rb);
        this.add(bb);
        this.add(gb);

        rb.addActionListener(this);
        bb.addActionListener(this);
        gb.addActionListener(this);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 400));
        this.add(panel);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == rb) {
            panel.setBackground(Color.RED);
        } else if (e.getSource() == bb) {
            panel.setBackground(Color.BLUE);
        } else if (e.getSource() == gb) {
            panel.setBackground(Color.GREEN);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("My application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}