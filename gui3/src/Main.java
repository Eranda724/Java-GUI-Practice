//text field

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel label;
    JButton button;
    JTextField textField;

    MyFrame(){
        textField = new JTextField();
        textField.setColumns(15); //text size
        textField.setText("Welcome"); //welcome text

        button = new JButton("Click");

        label = new JLabel("Empty field");

        this.setLayout(new FlowLayout());
        this.add(textField);
        this.add(button);
        this.add(label);

        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            label.setText(textField.getText());
        }
    }
}

class Main {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("Application");
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}