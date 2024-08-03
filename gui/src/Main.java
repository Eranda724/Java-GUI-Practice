import javax.swing.*;
//import javax.swing.border.Border;
import java.awt.*;

class MyFrame extends JFrame{ //myframe kiyala wenma class ekka component add karaa
    JLabel label; //mekak denna puluwan lesi wenna
    JButton button;

    MyFrame(){
        JLabel label = new JLabel();
        label.setText("Hello"); //add label
        label.setHorizontalAlignment(JLabel.CENTER); //align label
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(Color.magenta); //text colour


        button = new JButton();
        button.setText("Hi");

        //label.setBorder(border);
        this.setLayout(new FlowLayout());

        this.add(label);
        this.add(button);


    }
}
class main{
    public static void main(String[] args){
        MyFrame  frame = new MyFrame();

        //Border border= BorderFactory.createLineBorder(Color.blue);

        //JFrame frame = new JFrame(); //frame method eka
        frame.setTitle("My first"); // title name
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close it when click cross button whenever it only hide
        frame.setVisible(true); //visible

        frame.getContentPane().setBackground(Color.lightGray); // basic colour
        //frame.getContentPane().setBackground(new Color(25,45,66)); //any colour

    }
}