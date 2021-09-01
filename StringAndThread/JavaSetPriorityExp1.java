//4. Program to set priorities of thread

public class JavaSetPriorityExp1 extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    

        JavaSetPriorityExp1 t1=new JavaSetPriorityExp1();    
   
        t1.setPriority(Thread.MAX_PRIORITY);    
  
        t1.start();    
    }    
}  