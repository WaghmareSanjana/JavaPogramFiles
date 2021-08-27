//Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 24 ..... 



import java.util.*;

class B14
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        int n,a=0,b=1,c,i;  
 
        System.out.print("Enter number of element::: ");
        n = sc.nextInt();
 
        System.out.println(a + "\n" + b + " ");
 
        for(i = 0; i <= n; i++)
	{
            c = a+ b;
            System.out.println(""+c);
            a = b;
            b = c;
	}
    }  
}