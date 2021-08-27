import java.util.*;
class P
{  
public static void main(String[] args)   
{  
int num,reverse=0; 
int rem;
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the value:");
num=sc.nextInt();
while(num!=0) 
{  
rem = num % 10;  
reverse = reverse * 10 + rem;  
num=num/10;
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  