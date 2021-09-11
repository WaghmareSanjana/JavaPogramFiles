
package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgotPassword extends JFrame implements ActionListener{
    
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    
    ForgotPassword(){
        
        JPanel p1=new JPanel();
        p1.setBounds(0,0,480,380);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1=new JLabel("Username");
        l1.setBounds(30,20,80,30);
        l1.setFont(new Font("Tahoma",Font.BOLD,15));
        p1.add(l1);
        
        t1=new JTextField();
        t1.setBounds(170,20,150,30);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        b1=new JButton("Search");
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(350,20,100,30);
        p1.add(b1);
        
        JLabel l2=new JLabel("Name");
        l2.setBounds(30,60,150,30);
        l2.setFont(new Font("Tahoma",Font.BOLD,15));
        p1.add(l2);
        
        t2=new JTextField();
        t2.setBounds(170,60,150,30);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        JLabel l3=new JLabel("Security Quetion");
        l3.setBounds(30,100,150,30);
        l3.setFont(new Font("Tahoma",Font.BOLD,15));
        p1.add(l3);
        
        t3=new JTextField();
        t3.setBounds(170,100,230,30);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);
        
        JLabel l4=new JLabel("Answer");
        l4.setBounds(30,140,150,30);
        l4.setFont(new Font("Tahoma",Font.BOLD,15));
        p1.add(l4);
        
        
        t4=new JTextField();
        t4.setBounds(170,140,150,30);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
        
        b2=new JButton("Retreive");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBounds(350,140,100,30);
        p1.add(b2);
        
         
        JLabel l5=new JLabel("Password");
        l5.setBounds(30,180,150,30);
        l5.setFont(new Font("Tahoma",Font.BOLD,15));
        p1.add(l5);
        
        
        t5=new JTextField();
        t5.setBounds(170,180,150,30);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t5);
        
        b3=new JButton("Back");
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        b3.setBounds(160,250,70,30);
        p1.add(b3);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/forgotpassword.jpg"));
        Image i2=i1.getImage().getScaledInstance(270,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l6=new JLabel(i3);
        l6.setBounds(520,20,270,250);
        add(l6);
        
        setBounds(200,150,850,350);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        conn c=new conn();
        if(ae.getSource()==b1){
            try{
                String sql="select *from account where username='"+t1.getText()+"'"; 
                ResultSet rs=c.s.executeQuery(sql);
                while(rs.next()){
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("security"));
                }
            }catch(Exception e){
                
            }
        }else if(ae.getSource()==b2){
            try{
                String sql="select *from account where answer='"+t4.getText()+"' AND username='"+t1.getText()+"'";
                ResultSet rs=c.s.executeQuery(sql);
                while(rs.next()){
                  
                    t5.setText(rs.getString("password"));
                }
            }catch(Exception e){
                
            }
        }else if(ae.getSource()==b3){
            this.setVisible(false);
           // new login().setVisible(true);
            
        }
    }
    public static void main(String[] args){
        new ForgotPassword().setVisible(true);
        
    }
    
}
