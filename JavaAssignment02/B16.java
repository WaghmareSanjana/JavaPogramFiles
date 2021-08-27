//Compute the natural logarithm of 2, by adding up to n terms in the series1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/nwhere n is a positive integer input by user.


import java.util.*;

class B16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n,sum=0,sign=1,i; 
        System.out.print("Enter number of elements : ");
        n= sc.nextInt();
        
        for(i = 1; i <= n; i++)
	{
            sum=sum+ (1 * sign) / i;
            sign=sign *(-1);
	}
        
        System.out.println("the natural logarithm of 2:::" + sum);
    }  
}
