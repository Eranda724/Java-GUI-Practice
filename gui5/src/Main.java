import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JCheckBox check1,check2;
    JTextField textField;


    MyFrame(){
        check1 = new JCheckBox("Bold");
        check2 = new JCheckBox("Italic");

        textField = new JTextField(15);
        //textField.setColumns(15); //set column another method

        this.add(check1);
        this.add(check2);
        this.add(textField);
        this.setLayout(new FlowLayout());

        check1.addActionListener(this);
        check2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){

        int bold = 0;
        int italic = 0;
        if(check1.isSelected()){
            //textField.setFont(new Font("Times New Romen",1,12));
            //didn't change when it untick
            bold = Font.BOLD;
        }
        if(check2.isSelected()){
            //textField.setFont(new Font("Times New Romen",1,12));
            italic = Font.ITALIC;
            }
        textField.setFont(new Font("Times New Romen",bold|italic,12));


    }
}
class Main{
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
        frame.setTitle("My Application");
        frame.setSize(420,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}