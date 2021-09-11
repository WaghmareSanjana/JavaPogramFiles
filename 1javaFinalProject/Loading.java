
package travelmanagementsystem;

import java.awt.*;
import javax.swing.*;

public class Loading extends JFrame implements Runnable{
    
    JProgressBar p;
    Thread t;
    String username;
    
    Loading(String username){
        
        this.username = username;
        t = new Thread((Runnable) this);
        
        JLabel l1=new JLabel("TRAVELS AND TOURISM APPLICATION");
        l1.setBounds(50,20,700,40);
        l1.setFont(new Font("RALEWAY",Font.BOLD,35));
        l1.setForeground(Color.BLUE);
        add(l1);
        
        p=new JProgressBar();
        p.setBounds(110,80,500,40);
        p.setStringPainted(true);
        add(p);
        
        JLabel l2=new JLabel("Please Wait...");
        l2.setFont(new Font("Tahoma",Font.BOLD,15));
        l2.setForeground(Color.RED);
        l2.setBounds(300,120,120,25);
        add(l2);
        
        JLabel l3=new JLabel("Welcome "+username);
        l3.setBounds(50,300,140,25);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l3);
        
        setBounds(170,150,750,400);
        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        setUpLoading();
       
        
    }

    Loading() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void run(){
        try{
            for(int i=1;i<=101;i++){
                int m=p.getMaximum();
                int n=p.getValue();
                if(n<m){
                    p.setValue(p.getValue()+1);
                }
                else{
                    i=101;
                    setVisible(false);
                    new Dashboard(username).setVisible(true);
                }
                Thread.sleep(50);
  
                
            }
              }catch(Exception e){
            e.printStackTrace();
        }
    }
            public void setUpLoading(){
                setVisible(false);
                 t.start();
            }
            
      
    
    public static void main(String[]  args)
    {
        new Loading("").setVisible(true);
    }
    
}
