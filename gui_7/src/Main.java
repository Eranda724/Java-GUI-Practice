import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame {
    JList listbox;
    JComboBox combobox;

    MyFrame() {
        String[] lis = {"a" , "e" , "i" , "o" , "u"};

        listbox = new JList<>(lis);
        listbox.setVisibleRowCount(3);

        combobox = new JComboBox<>(lis);

        this.setLayout(new FlowLayout());
        this.add(new JScrollPane(listbox));
        this.add(new JComboBox<String>(lis));
    }
}
public class Main {
    public static void main(String[] args)  {
        MyFrame frame = new MyFrame();
        frame.setTitle("My Application");
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}