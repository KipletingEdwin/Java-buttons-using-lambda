import javax.swing.*;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JButton button;

    MyFrame(){

        ImageIcon icon = new ImageIcon("finger.png");

        button = new  JButton();
        button.setBounds(100, 100, 350, 200);
        button.addActionListener(e -> System.out.println("Hello"));
        button.setText("Send");
        button.setFocusable(false);
        button.setIcon(icon);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700, 700);
        this.setVisible(true);
        this.add(button);




    }
}
