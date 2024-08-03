import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu, helpMenu;
    JMenuItem newItem, openItem, closeItem;

    MyFrame(){
        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");

        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        closeItem = new JMenuItem("Close");

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        closeItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        newItem.setMnemonic(KeyEvent.VK_N);
        openItem.setMnemonic(KeyEvent.VK_O);
        closeItem.setMnemonic(KeyEvent.VK_C);

        fileMenu.add(newItem);
        fileMenu.addSeparator();
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(closeItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);


    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == newItem){
            System.out.println("New");
        }
        if(e.getSource() == openItem){
            System.out.println("Open");
        }
        if(e.getSource() == closeItem){
            System.exit(0);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("gui8");
        frame.setSize(450,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}