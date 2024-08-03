import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener{
    JRadioButton rb1,rb2,rb3;
    JPanel panel;
    JLabel label;

    MyFrame(){
        rb1 = new JRadioButton("red");
        rb2 = new JRadioButton("blue");
        rb3 = new JRadioButton("orange");

        label = new JLabel();

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 400));
        this.add(panel);

        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.add(rb1,BorderLayout.EAST);
        this.add(rb2,BorderLayout.CENTER);
        this.add(rb3,BorderLayout.WEST);

        this.add(label ,BorderLayout.SOUTH);
        this.add(panel);



    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rb1){
            panel.setBackground(Color.RED);
            System.out.println("this is red");
            label.setText("this is red");
        }
        if(e.getSource()==rb2){
            panel.setBackground(Color.BLUE);
            System.out.println("this is b");
        }
        if(e.getSource()==rb3){
            panel.setBackground(Color.ORANGE);
            System.out.println("this is o");
        }
    }
}

class Main{
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
        frame.setTitle("My app");
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}