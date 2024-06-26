import javax.swing.*;
import java.awt.*;
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
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-5);
        button.setForeground(Color.cyan);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700, 700);
        this.setVisible(true);
        this.add(button);




    }
}
