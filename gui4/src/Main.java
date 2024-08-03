import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextArea textArea;

    MyFrame(){
        textArea = new JTextArea(15,50);
        button = new JButton("add new");

        this.setLayout(new FlowLayout());
        this.add(textArea);
        this.add(button);

        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            //System.out.println(textArea.getText()); output the all text
            //System.out.println(textArea.getText()); get only selected
            //textArea.append("Hello"); end of the sentence
            //textArea.insert("Hello",0);
            //System.out.println(textArea.getCaretPosition()); to 0 index
            textArea.insert("Hello",textArea.getCaretPosition());

        }
    }
}

public class Main {
    public static void main(String[] args) {
         MyFrame frame = new MyFrame();
         frame.setTitle("My application");
         frame.setSize(500,400);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
    }
}