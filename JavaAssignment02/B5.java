/*Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)*/

import java.util.*;

class B5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
     
        int base,power,Answer=1,i;
        
        System.out.println("Enter the base::");
        base = sc.nextInt();
        
        System.out.print("Enter the power:: ");
        power = sc.nextInt();

        for(i = 1; i <= power; i++)
        {
	    Answer=Answer*base;
        }

        System.out.println("value of one number raised to the power of another:"+ Answer);
    }
}