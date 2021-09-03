
package hotel.management.systems;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AddDriver extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5;
    JComboBox c1,c2;
    JButton b1,b2;
    AddDriver(){
        JLabel title=new JLabel("Add Drivers");
        title.setBounds(150,5,150,30);
        title.setFont(new Font("Tahoma",Font.BOLD,18));
        add(title);
        JLabel name=new JLabel("Name");
        name.setFont(new Font("Tahoma",Font.PLAIN,14));
        name.setBounds(60,70,150,30);
        add(name);
        t1=new JTextField();
        t1.setBounds(200,70,170,30);
        add(t1);
        JLabel age=new JLabel("Age");
        age.setBounds(60,120,100,30);
        age.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(age);
        t2=new JTextField();
        t2.setBounds(200,120,170,30);
        add(t2);
        JLabel gender=new JLabel("Gender");
        gender.setBounds(60,170,100,30);
        gender.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(gender);
        c1=new JComboBox(new String[] {"Male","Female"});
        c1.setBounds(200,170,170,30);
        c1.setBackground(Color.WHITE);
        add(c1);
        JLabel car=new JLabel("Car Company");
        car.setBounds(60,220,150,30);
        car.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(car);
        t3=new JTextField();
        t3.setBounds(200,220,170,30);
        add(t3);
        JLabel model=new JLabel("Car Model");
        model.setBounds(60,270,100,30);
        model.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(model);
        t4=new JTextField();
        t4.setBounds(200,270,170,30);
        add(t4);
        JLabel available=new JLabel("Available");
        available.setBounds(60,320,100,30);
        available.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(available);
        c2=new JComboBox(new String[] {"Available","Busy"});
        c2.setBounds(200,320,170,30);
        c2.setBackground(Color.WHITE);
        add(c2);
        JLabel location=new JLabel("Location");
        location.setBounds(60,370,100,30);
        location.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(location);
        t5=new JTextField();
        t5.setBounds(200,370,170,30);
        add(t5);
        b1=new JButton("Add Driver");
        b1.setBounds(60,430,130,30);
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
        b2=new JButton("Cancel");
        b2.setBounds(210,430,140,30);
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/systems/icons/eleven.jpg"));
        Image i2=i1.getImage().getScaledInstance(520, 470, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(415,70,520,390);
        add(l1);
        getContentPane().setBackground(Color.YELLOW);
        
        setLayout(null);
        setBounds(140,120,980,530);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
     if(ae.getSource()==b1){
        String name=t1.getText();
        String age=t2.getText();
        String gender=(String)c1.getSelectedItem();
        String car=t3.getText();
        String model=t4.getText();
        String available=(String)c2.getSelectedItem();
       String location=t5.getText();
        conn c=new conn();
        String str="insert into driver values('"+name+"','"+age+"','"+gender+"','"+car+"','"+model+"','"+available+"','"+location+"')";
        try{
           
           c.s.executeUpdate(str);
           JOptionPane.showMessageDialog(null,"Driver Successfully Added");
           this.setVisible(false);
        }catch(Exception e){  
        }
     }else if(ae.getSource()==b2){
        setVisible(false);
     }
    }
public static void main(String[] args){
        new AddDriver().setVisible(true);
    }
    
}
