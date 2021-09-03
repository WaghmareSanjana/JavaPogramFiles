package hotel.management.systems;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HotelManagementSystems  extends JFrame implements ActionListener{
HotelManagementSystems(){
setBounds(0,40,1366,600);
ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/systems/icons/first.jpg"));
Image i2=i1.getImage().getScaledInstance(1366,600,Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel l1=new JLabel(i3);
l1.setBounds(0,5,1366,600);
add(l1);
JLabel l2=new JLabel("Hotel Management System");
l2.setForeground(Color.YELLOW);
l2.setFont(new Font("serif",Font.PLAIN,70));
l2.setBounds(30,465,1100,90);
l1.add(l2);
JButton b1=new JButton("Next");
b1.setBackground(Color.WHITE);
b1.setForeground(Color.BLACK);
b1.setBounds(1100,470,150,50);
b1.addActionListener(this);
l1.add(b1);
setLayout(null);
setVisible(true);
while(true){
l2.setVisible(false);
try{
Thread.sleep(500);
}catch(Exception e){}
l2.setVisible(true);
try{

Thread.sleep(500);
}catch(Exception e){}
}

}
public void actionPerformed(ActionEvent ae){
new login().setVisible(true);
this.setVisible(false);
}
public static void main(String[] args)
{
new HotelManagementSystems();

}

}