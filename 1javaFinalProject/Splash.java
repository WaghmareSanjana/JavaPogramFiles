
package travelmanagementsystem;
import java.awt.*;
import javax.swing.*;
class Splash extends JFrame implements Runnable{
    Thread t1;
    
    Splash(){
        
        ImageIcon  i1=new ImageIcon(ClassLoader.getSystemResource("travelmanagementsystem/icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(1300, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        add(l1);
        t1=new Thread(this);
        t1.start();
    }
    public void run(){
        try{
           Thread.sleep(7000);
           this.setVisible(false);
           new login().setVisible(true);
        }catch(Exception e){}
        System.out.println();
    }

    
public static void main(String[]  args){
        Splash frame=new Splash();
        frame.setVisible(true);
        int x=1;
        for(int i=1;i<=600;i+=5,x+=6){
        frame.setBounds(650-(x+i)/2,350-(i/2),x+i,i);
        try{
            Thread.sleep(10);
        }catch(Exception e){}
        }
}
}

 
