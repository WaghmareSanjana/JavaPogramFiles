//Java Program to Find Factorial

import java.util.*;
class K {

    public static void main(String[] args) {

        int num,Fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	num=sc.nextInt();
        for(int i = 1; i <= num; i++)
        {
            Fact=Fact*i;
        }
        System.out.println("Factorial of "+num+" is " +Fact);
    }
}