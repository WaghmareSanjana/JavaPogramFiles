//Write a program to calculate HCF of Two given number.


import java.util.*;

class B9
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
     
        int dividend, divisor,rem=1, hcf = 0;
        
        System.out.print("Input two number::: ");
        dividend = sc.nextInt();
        divisor = sc.nextInt();        
      while(rem != 0)
         {
            rem= dividend % divisor;
            
            if(rem== 0)
            {
                hcf = divisor;
            }
	    else
            {
                dividend = divisor;
                divisor = rem;
	    }
            
        }
        System.out.println("HCf of two given numbers::: " + hcf);
    }  
}