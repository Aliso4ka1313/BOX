package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Администратор on 03.10.2015.
 */
public class Main{
    public static void main(String[] args) {
        JFrame myJFrame = new JFrame ("Awesome Frame");
        myJFrame.setSize(300, 200);
        myJFrame.setLocation(100, 200);
        myJFrame.setVisible(true);

        JPanel myJPanel = new JPanel();
        myJPanel.setLayout(new FlowLayout());
        final JTextField tf = new JTextField();
        tf.setPreferredSize(new Dimension(30,40));
        myJPanel.add(tf);

        JButton jb1 = new JButton ("Click me");
        JButton jb2 = new JButton ("Click me too");
        jb1.setPreferredSize(new Dimension(100,100));
        jb1.setPreferredSize(new Dimension(50, 20));

        jb1.add(jb2);
        myJPanel.add(jb1);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action on click");
                String txt = tf.getText();
                StringBuilder sb = new StringBuilder(txt);
                sb.reverse();
                tf.setText("Some text");

            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action on click second button");
            }
        });
        myJFrame.add(myJPanel);
        myJFrame.setVisible(true);


    }
}
