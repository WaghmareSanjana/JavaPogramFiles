//Java Program to Calculate Sum of Natural Numbers

import java.util.*;
class I
{  
public static void main(String[] args)   
{  
int i, num, sum = 0;
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the Number of Elemeent..");
num=sc.nextInt();   
for(i = 1; i <= num; i++)  
{  
sum = sum + i;  
}  
System.out.println("Sum of First "+num+ " Natural Numbers is = " + sum);  
}  
}  
