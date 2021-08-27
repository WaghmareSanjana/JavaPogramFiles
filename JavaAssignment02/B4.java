//Write a program to find the factorial value of any number entered through keyboard. 

import java.util.*;
class B4{

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int n, fact=1,i;
	System.out.println("\nEnter the element that u wish to find factorial=");
	n=sc.nextInt();
        for(i = 1; i <= n; i++)
        {
 
            fact=fact*i;
        }
        System.out.println("Factorial of entered number is::"+fact);
    }
}