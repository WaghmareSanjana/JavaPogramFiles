//Java Program to Check Whether Number is Even or Odd

import java.util.*;

class E{

    public static void main(String[] args) {
        
	int n;        

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number which you want to check=");
        n = sc.nextInt();

        if(n % 2 == 0)
	{
            System.out.println("Even Number");
	}
        else
	{
            System.out.println("Odd Number");
	}
    }
}