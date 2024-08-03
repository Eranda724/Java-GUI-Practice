import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel label, rlabel;
    JTextField textField;
    JButton button;
    JPanel panel;

    MyFrame(){
        label = new JLabel("Distance in miles");
        textField = new JTextField(15);
        button = new JButton("Convert!");

        rlabel = new JLabel("");
        rlabel.setHorizontalAlignment(JLabel.LEFT); // Set horizontal alignment correctly

        panel = new JPanel();
        this.setLayout(new FlowLayout());
        this.add(label);
        this.add(textField);
        this.add(button);
        this.add(rlabel);

        button.addActionListener(this);


        textField.setBackground(Color.WHITE);
        button.setBackground(Color.GREEN);
        rlabel.setBackground(Color.PINK);
    }

    public void actionPerformed(ActionEvent e){
        try {
            double miles = Double.parseDouble(textField.getText());
            double kil = miles * 1.609;
            rlabel.setText(String.format("%.1f miles is %.1f kilometers", miles, kil));
        } catch (NumberFormatException ex) {
            rlabel.setText("Please enter a valid number");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("My application");
        frame.setSize(400, 300);
        frame.setBackground(Color.blue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
