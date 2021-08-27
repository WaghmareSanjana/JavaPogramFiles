/*Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number*/

import java.util.*;
class B3 
{
    public static void main(String[] args) 
    {
	int n,i;
        Scanner sc= new Scanner(System.in);
	System.out.print("Enter the number:");        
        n=sc.nextInt();
        for(i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}