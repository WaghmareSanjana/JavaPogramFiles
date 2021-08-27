//Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.

class B13
{
    public static void main(String[] args) 
     {
        int n, rem,i,sum = 0;
        System.out.print("Armstrong numbers between 1 to 500:");
        for(i = 2; i <= 500; i++)
        {
            n = i;
            while(n > 0)
            {
                rem = n % 10;
                sum = sum + (rem * rem * rem);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.println(""+i);
            }
            sum = 0;
        }
    }
}