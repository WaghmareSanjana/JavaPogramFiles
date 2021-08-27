/*Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321*/

import java.util.*;

class B6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
     
        int n,rev=0,rem,digit;
        System.out.print("Enter the number which u wish to reverse::");
        n = sc.nextInt();
        
        digit= n;
        while(digit>0)
        {
	    rem= digit % 10;
	    rev = rev * 10 + rem;
            digit=digit/10;
        }

        System.out.println("Reverse of Entered number is=" + rev);
    }
}