//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.


import java.util.*;
class B7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
     
        int n,even=0,odd=0;
        char ch;
       do
        {
            System.out.print("Enter the number:: ");
            n = sc.nextInt();
        
            if( n%2 == 0)
            {
                even=even+n;
            }
            else
            {
                odd=odd+n;
            }
        
            System.out.print("Do you want to continue y/n? ");
            ch= sc.next().charAt(0);
            
        } while(ch =='y' || ch == 'Y');
        
        System.out.println("Sum of even Integers: " + even);
        System.out.println("Sum of odd Integers: " + odd);
    }  
}