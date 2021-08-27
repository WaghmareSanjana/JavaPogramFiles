//Write a program to calculate the sum of following series where n is input by user. 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 


import java.util.*;

class B15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n,sum = 0,i;

        System.out.print("Enter number of Elements: ");
        n = sc.nextInt();
  
        for(i = 1; i <= n; i++)
	{
            sum=sum+1/i;
	}
        
        System.out.println("sum of series : " + sum);
    }  
}