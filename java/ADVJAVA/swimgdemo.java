import javax.swing.*;
import java.awt.FlowLayout;


public class swimgdemo {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(800,400);
        f.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("username :"); //first lable l1
        f.add(l1);
        JTextField t1 = new JTextField(20); //first textfield t1
        f.add(t1);
        JLabel l2 = new JLabel("password :");
        f.add(l2);
        JTextField t2 = new JTextField(20);
        f.add(t2);
        JButton b1 = new JButton("sumbit");
        f.add(b1);
    }    
}
