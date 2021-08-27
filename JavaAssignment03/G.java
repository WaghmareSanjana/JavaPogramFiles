//Java Program to Find Largest Number Among Three Numbers

import java.util.*;  
class G  
{  
public static void main(String[] args)   
{  
int n1, n2, n3, Max;    
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the first number:");  
n1 = sc.nextInt();   
n2= sc.nextInt();    
n3= sc.nextInt();  
Max = n3 > (n1 > n2 ? n1 : n2) ? n3 : ((n1 > n2) ? n1 : n2);  
System.out.println("The largest number Among Three Numbers is: "+Max);  
}  
}  