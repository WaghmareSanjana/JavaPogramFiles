//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;
class B11
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        int n,PositiveNo = 0,NegativeNo = 0,zeroNo = 0;
        char ch;
        do
        {
            System.out.print("Enter the number:::: ");
            n = sc.nextInt();
        
            if(n > 0)
                PositiveNo++;
           
            else if(n < 0)
            
                NegativeNo++;
            
            else
            
                zeroNo++;
            
        
            System.out.println("Do you want to continue y or n? ");
            ch = sc.next().charAt(0);
            
        }while(ch=='y' || ch == 'Y');
        
        System.out.println("Positive numbers Entered : " + PositiveNo);
        System.out.println("Negative numbers Entered: " + NegativeNo);
        System.out.println("Zero numbersEntered: " + zeroNo);
    }  
}