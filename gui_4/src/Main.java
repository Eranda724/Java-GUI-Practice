import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel label;
    JButton button;
    int clk = 0;

    MyFrame() {
        button = new JButton("click me");
        label = new JLabel("HI 0");

        this.setLayout(new FlowLayout());

        this.add(button);
        this.add(label);


        button.addActionListener(this);



    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            clk++;
            label.setText("HI " + clk);
        }
    }
}

public class Main {
    public static void main(String[] args) {

            MyFrame frame = new MyFrame();
            frame.setTitle("Application");
            frame.setSize(450, 550);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }
}
