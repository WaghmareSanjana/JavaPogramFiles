//Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate. 

import java.util.*;

class B10
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
     
        int n1, n2,sum;
        char ch;
        
        do
        {
            System.out.print("Enter the two number= ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            
            sum = n1 + n2;
            System.out.println("Sum of Integers: " +sum);
        
            System.out.print("Do you want to continue yes or no? ");
            ch = sc.next().charAt(0);
            

            
        }while(ch=='y' || ch == 'Y');
    }  
}