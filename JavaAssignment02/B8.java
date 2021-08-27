//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.

import java.util.*;

class B8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
     
        int n,i;
	boolean flag=true;
        
        System.out.print("Enter the number::: ");
        n = sc.nextInt();
        
        for(i = 2; i < n; i++)
	{
	    if(n % i == 0)
            {
                flag = false;
                break;
            }
        }

	if(flag && n > 1)
        {
            System.out.println("Entered Number is prime");
        }
	else
        {
            System.out.println("Entered Number is not prime");
        }
        
    }  
}