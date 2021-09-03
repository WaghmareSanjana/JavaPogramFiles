package hotel.management.systems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class PickUP extends JFrame implements ActionListener{
    Choice c1;
    JButton b1,b2;
    JTable t1;
    PickUP(){
        JLabel l1=new JLabel("PickUp Service");
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setBounds(400,30,200,30);
        add(l1);
        JLabel l2=new JLabel("Type Of CAR");
         l2.setFont(new Font("Tahoma",Font.BOLD,13));
        l2.setBounds(50,100,100,30);
        add(l2);
        c1=new Choice();
                try{
                    conn c=new conn();
                    ResultSet rs=c.s.executeQuery("Select *from driver");
                    while(rs.next()){
                        c1.add(rs.getString("model"));
                    }
                }catch(Exception e){
                    
                }
                c1.setBounds(150,100,200,25);
                add(c1);
           
        t1=new JTable();
        t1.setBounds(0,190,1000,300);
        add(t1);
        b1=new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(300,520,120,30);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(500,520,120,30);
        b2.addActionListener(this);
        add(b2);
        JLabel l3=new JLabel("Name");
        l3.setBounds(45,150,100,20);
        add(l3);
        JLabel l4=new JLabel("Age");
        l4.setBounds(200,150,100,30);
        add(l4);
        JLabel l5=new JLabel("Gender");
        l5.setBounds(330,150,100,30);
        add(l5);
        JLabel l6=new JLabel("Company");
        l6.setBounds(480,150,100,30);
        add(l6);
        JLabel l7=new JLabel("Brand");
        l7.setBounds(630,150,100,30);
        add(l7);
        JLabel l8=new JLabel("Availability");
        l8.setBounds(760,150,100,30);
        add(l8);
        JLabel l9=new JLabel("Location");
        l9.setBounds(890,150,100,30);
        add(l9);
        
        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        setBounds(150,20,1000,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
               String str="select *from driver where model='"+c1.getSelectedItem()+"'";
               conn c=new conn();
               ResultSet rs;
               rs=c.s.executeQuery(str);
                   t1.setModel(DbUtils.resultSetToTableModel(rs));
               
            }catch(Exception e){
                
            }
        }else if(ae.getSource()==b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new PickUP().setVisible(true);
    }
    
}
