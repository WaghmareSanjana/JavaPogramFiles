
package travelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1,t2,t3,t5;
    Choice c1;
    Signup(){
        JPanel p1=new JPanel();
        p1.setBounds(0,0,500,400);
        p1.setBackground(Color.CYAN);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1=new JLabel("Username");
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setBounds(50,20,100,25);
        p1.add(l1);
        
        t1=new JTextField();
        t1.setBorder(BorderFactory.createEmptyBorder());
        t1.setBounds(190,20,180,25);
        p1.add(t1);
        
        JLabel l2=new JLabel("Name");
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setBounds(50,60,100,25);
        p1.add(l2);
        
        t2=new JTextField();
        t2.setBorder(BorderFactory.createEmptyBorder());
        t2.setBounds(190,60,180,25);
        p1.add(t2);
        
        JLabel l3=new JLabel("Password");
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setBounds(50,100,100,25);
        p1.add(l3);
        
        t3=new JTextField();
        t3.setBorder(BorderFactory.createEmptyBorder());
        t3.setBounds(190,100,180,25);
        p1.add(t3);
        
        JLabel l4=new JLabel("Security Quetion");
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setBounds(50,140,125,25);
        p1.add(l4);
        
        c1=new Choice();
        c1.add("Your Nickname?");
        c1.add("Your Mothers Name");
        c1.add("City In Which U Born");
        c1.add("Your Lucky Number");
        c1.add("Your Childhood Super");
        c1.setBounds(190,140,180,35);
        p1.add(c1);
        
            
        JLabel l5=new JLabel("Answer");
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setBounds(50,180,100,25);
        p1.add(l5);
        
        t5=new JTextField();
        t5.setBorder(BorderFactory.createEmptyBorder());
        t5.setBounds(190,180,180,25);
        p1.add(t5);
        
        b1=new JButton("Create");
        b1.setFont(new Font("Tahoma",Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.CYAN);
        b1.addActionListener(this);
        b1.setBounds(80,250,100,30);
        p1.add(b1);
        
        b2=new JButton("Back");
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        b2.setForeground(Color.CYAN);
        b2.setBounds(250,250,100,30);
        p1.add(b2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/signup.png"));
        Image i2=i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l6=new JLabel(i3);
        l6.setBounds(550,20,300,300);
        add(l6);
        
        setBounds(200,140,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);   
        setVisible(true);
}
    public void actionPerformed(ActionEvent  ae){
        if(ae.getSource()==b1){
            String username=t1.getText();
            String name=t2.getText();
            String password=t3.getText();
            String security=c1.getSelectedItem();
            String answer=t5.getText();
            String query="insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
            try{
                conn c=new conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"SignUp Created Successfully!!");
                this.setVisible(false);
                                   
            }catch(Exception a){
                System.out.println(a);
            }
        }else if(ae.getSource()==b2){
            this.setVisible(false);
            new login().setVisible(true);
        }
    }
    public static void main(String args[]){
        new Signup().setVisible(true);
    }
    
}
