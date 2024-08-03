import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ListSelectionListener , ActionListener {
    JList listbox;
    JComboBox combobox;

    MyFrame() {
        String[] lan = {"java","R","Ml","Ai","C++"};

        listbox = new JList(lan);
        listbox.setVisibleRowCount(4);

        combobox = new JComboBox(lan);

        listbox.addListSelectionListener(this);
        combobox.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.add(new JScrollPane(listbox));
        this.add(combobox);
    }
    public void valueChanged(ListSelectionEvent e){
        if(e.getSource() == listbox){
            System.out.println(listbox.getSelectedValuesList());
        }
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==combobox){
            System.out.println(combobox.getSelectedItem());
        }
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