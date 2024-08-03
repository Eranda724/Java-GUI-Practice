import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
    JButton btn1 , btn2, btn3, btn4,btn5 , btn6, btn7, btn8,btn9,btn10,btn11,btn12;
    JPanel panel1, panel2;
    MyFrame(){
    /*  button layouts

        btn1 = new JButton("B1");
        btn2 = new JButton("B2");
        btn3 = new JButton("B3");
        btn4 = new JButton("B4");

       this.setLayout(new BorderLayout());
       this.add(btn1 , BorderLayout.EAST);
       this.add(btn2 , BorderLayout.NORTH);
       this.add(btn3 , BorderLayout.SOUTH);
       this.add(btn4 , BorderLayout.WEST);

        FlowLayout f = new FlowLayout();
        f.setAlignment(FlowLayout.CENTER);
        f.setHgap(60);
        f.setVgap(40);
        this.setLayout(f);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btn4);
*/

        //panels

        btn1 = new JButton("B1");
        btn2 = new JButton("B2");
        btn3 = new JButton("B3");
        btn4 = new JButton("B4");
        btn5 = new JButton("B5");
        btn6 = new JButton("B6");
        btn7 = new JButton("B7");
        btn8 = new JButton("B8");
        btn9 = new JButton("B9");
        btn10 = new JButton("B10");
        btn11 = new JButton("B11");
        btn12 = new JButton("B12");

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.yellow);
        panel1.add(btn6);
        panel1.add(btn7);
        panel1.add(btn8);

        panel2 = new JPanel();
        //panel2.setLayout(new FlowLayout());
        panel2.setLayout(new GridLayout(4,1)); //full area
        panel2.add(btn9);
        panel2.add(btn10);
        panel2.add(btn11);
        panel2.add(btn12);

        this.setLayout(new BorderLayout());
        this.add(btn1,BorderLayout.NORTH);
        //this.add(btn2,BorderLayout.EAST);
        this.add(panel2,BorderLayout.EAST);
        this.add(btn3,BorderLayout.SOUTH);
        this.add(btn4,BorderLayout.WEST);
        //this.add(btn5,BorderLayout.CENTER);
        this.add(panel1,BorderLayout.CENTER);
    }

}

class main{
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
        frame.setTitle("gui8");
        frame.setSize(450,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}