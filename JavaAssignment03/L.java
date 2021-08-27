//Java Program to Generate Multiplication Table

import java.util.*;
class L{

    public static void main(String[] args) {

        int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter the number which u want to generate Multiplication Table");
	num=sc.nextInt();
        for(int i = 1; i <=10; i++)
        {
            System.out.println(num+" * "+i+" ="+(num*i));
        }
    }
}