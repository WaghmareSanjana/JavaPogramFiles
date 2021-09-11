
package travelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dashboard extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    String username;
    
    Dashboard(String username){
        this.username=username;
        JPanel p=new JPanel();
        p.setBounds(0,0,1920,30);
        p.setLayout(null);
        p.setBackground(Color.RED);
        add(p);
        
        JPanel p1=new JPanel();
        p1.setBounds(0,20,200,1000);
        p1.setLayout(null);
        p1.setBackground(Color.RED);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/home.jpg"));
        Image  i2=i1.getImage().getScaledInstance(1980,1080,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1980,1080);
        add(l1);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/dashboard.jpg"));
        Image  i5=i4.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(5 ,5,30,30);
        p.add(l2);
        
        JLabel l3=new JLabel("DashBoard");
        l3.setBounds(40,0,300,30);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tahoma",Font.BOLD,30));
        p.add(l3);
        
        b1=new JButton("Add Personal Details");
        b1.setBackground(Color.RED);
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Tahoma",Font.BOLD,15));
        b1.setMargin(new Insets(0,0,0,80));
        b1.addActionListener(this);
        b1.setBounds(0,20,250,30);
        p1.add(b1);
        
        b2=new JButton("Update Personal Details");
        b2.setBackground(Color.RED);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Tahoma",Font.BOLD,15));
        b2.setMargin(new Insets(0,0,0,50));
        b2.addActionListener(this);
        b2.setBounds(0,50,250,30);
        p1.add(b2);
        
        b3=new JButton("View Details");
        b3.setBackground(Color.RED);
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("Tahoma",Font.BOLD,15));
        b3.setMargin(new Insets(0,0,0,80));
        b3.addActionListener(this);
        b3.setBounds(0,80,200,30);
        p1.add(b3);
        
        b4=new JButton("Delete Personal Details");
        b4.setBackground(Color.RED);
        b4.setForeground(Color.BLACK);
        b4.setFont(new Font("Tahoma",Font.BOLD,15));
        b4.setMargin(new Insets(0,0,0,60));
        b4.addActionListener(this);
        b4.setBounds(0,110,250,30);
        p1.add(b4);
       
        b5=new JButton("Check Package");
        b5.setBackground(Color.RED);
        b5.setForeground(Color.BLACK);
        b5.setFont(new Font("Tahoma",Font.BOLD,15));
        b5.setMargin(new Insets(0,0,0,60));
        b5.addActionListener(this);
        b5.setBounds(0,140,200,30);
        p1.add(b5);
        
        b6=new JButton("Book Package");
        b6.setBackground(Color.RED);
        b6.setForeground(Color.BLACK);
        b6.setFont(new Font("Tahoma",Font.BOLD,15));
        b6.setMargin(new Insets(0,0,0,60));
        b6.addActionListener(this);
        b6.setBounds(0,170,200,30);
        p1.add(b6);
        
        b7=new JButton("View Package");
        b7.setBackground(Color.RED);
        b7.setForeground(Color.BLACK);
        b7.setFont(new Font("Tahoma",Font.BOLD,15));
        b7.setMargin(new Insets(0,0,0,60));
        b7.addActionListener(this);
        b7.setBounds(0,200,200,30);
        p1.add(b7);
        
        b8=new JButton("View Hotels");
        b8.setBackground(Color.RED);
        b8.setForeground(Color.BLACK);
        b8.setFont(new Font("Tahoma",Font.BOLD,15));
        b8.setMargin(new Insets(0,0,0,80));
        b8.addActionListener(this);
        b8.setBounds(0,230,200,30);
        p1.add(b8);
        
        b9=new JButton("Book  Hotel");
        b9.setBackground(Color.RED);
        b9.setForeground(Color.BLACK);
        b9.setFont(new Font("Tahoma",Font.BOLD,15));
        b9.setMargin(new Insets(0,0,0,70));
        b9.addActionListener(this);
        b9.setBounds(0,260,200,30);
        p1.add(b9);
        
        b10=new JButton("View Booked Hotels");
        b10.setBackground(Color.RED);
        b10.setForeground(Color.BLACK);
        b10.setFont(new Font("Tahoma",Font.BOLD,15));
        b10.setMargin(new Insets(0,0,0,70));
        b10.addActionListener(this);
        b10.setBounds(0,290,250,30);
        p1.add(b10);
        
        b11=new JButton("Destinations");
        b11.setBackground(Color.RED);
        b11.setForeground(Color.BLACK);
        b11.setFont(new Font("Tahoma",Font.BOLD,15));
        b11.setMargin(new Insets(0,0,0,70));
        b11.addActionListener(this);
        b11.setBounds(0,320,200,30);
        p1.add(b11);
        
        b12=new JButton("Payment");
        b12.setBackground(Color.RED);
        b12.setForeground(Color.BLACK);
        b12.setFont(new Font("Tahoma",Font.BOLD,15));
        b12.setMargin(new Insets(0,0,0,80));
        b12.addActionListener(this);
        b12.setBounds(0,350,200,30);
        p1.add(b12);
        
        b13=new JButton("Calculator");
        b13.setBackground(Color.RED);
        b13.setForeground(Color.BLACK);
        b13.setFont(new Font("Tahoma",Font.BOLD,15));
        b13.setMargin(new Insets(0,0,0,80));
        b13.addActionListener(this);
        b13.setBounds(0,380,200,30);
        p1.add(b13);
        
        b14=new JButton("Notepad");
        b14.setBackground(Color.RED);
        b14.setForeground(Color.BLACK);
        b14.setFont(new Font("Tahoma",Font.BOLD,15));
        b14.addActionListener(this);
        b14.setMargin(new Insets(0,0,0,80));
        b14.setBounds(0,410,200,30);
        p1.add(b14);
        
        b15=new JButton("About");
        b15.setBackground(Color.RED);
        b15.setForeground(Color.BLACK);
        b15.setFont(new Font("Tahoma",Font.BOLD,15));
        b15.addActionListener(this);
        b15.setMargin(new Insets(0,0,0,100));
        b15.setBounds(0,440,200,30);
        p1.add(b15);
        
        JLabel l5=new JLabel("Travel and Tourism Management System");
        l5.setBounds(360,40,1000,60);
        l5.setFont(new Font("RALEWAY",Font.PLAIN,35));
        l5.setForeground(Color.WHITE);
        l1.add(l5);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try {
                new AddCustomer(username).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(ae.getSource()==b2){
            try {
                new UpdateCustomer(username).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(ae.getSource()==b3){
            try {
                new ViewCustomers().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(ae.getSource()==b4){
            try {
                new DeleteCustomer().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(ae.getSource()==b5){
            new CheckPackage().setVisible(true);
        }else if(ae.getSource()==b6){
            new BookPackage(username).setVisible(true);
        }else if(ae.getSource()==b7){
            new ViewPackage(username).setVisible(true);
        }else if(ae.getSource()==b8){
            new CheckHotels().setVisible(true);
        }else if(ae.getSource()==b9){
            new BookHotels(username).setVisible(true);
        }else if(ae.getSource()==b10){
            new ViewBookedHotel(username).setVisible(true);
        }else if(ae.getSource()==b11){
            new Destinations().setVisible(true);
        }else if(ae.getSource()==b12){
            new Payment().setVisible(true);
        }else if(ae.getSource()==b13){
            try{
                Runtime.getRuntime().exec("calc.exe");
                
            }catch(Exception e){
                
            }
            
        }else if(ae.getSource()==b14){
             try{
                Runtime.getRuntime().exec("notepad.exe");
                
            }catch(Exception e){
                
            }
            
        }else if(ae.getSource()==b15){
            new About().setVisible(true);
        }
    }
    public static void main(String[] args){
        new Dashboard("username").setVisible(true);
    }
    
}
