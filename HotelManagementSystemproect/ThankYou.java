
package hotel.management.systems;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;

public class ThankYou extends JFrame{
    ThankYou()
    {
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("hotel/management/systems/icons/last.jpg"));
        Image i5=i4.getImage().getScaledInstance(1200, 650, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l4=new JLabel(i6);
        l4.setBounds(0,0,1366,700);
        add(l4);
       
         getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(0,0,1400,700);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new ThankYou();
    }
    
}
