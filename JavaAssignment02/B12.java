//Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.


import java.util.*;

class B12
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        int n;
        int max = Integer.MIN_VALUE;  
        int min = Integer.MAX_VALUE;  

        char ch;
	
        do
        {
            System.out.print("Input the number which u wish :: ");
            n = sc.nextInt();
        
            if(n > max)
            {
                max = n;
            }
            
            if(n < min)
            {
                min = n;
            }
        
            System.out.println("Do you want to continue yes or no ? ");
            ch = sc.next().charAt(0);
            
        }while(ch=='y' || ch == 'Y');
        
        System.out.println("Largest number in Entered Value: " + max);
        System.out.println("Smallest number in Entered Value: " + min);
    }  
}