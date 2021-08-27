/*Write a program in java to swap two numbers.   
Sample Output:
Swap two numbers :
-----------------------
Input 1st number : 25
Input 2nd number : 39
After swapping the 1st number is : 39
After swapping the 2nd number is : 25
*/


class Assignment3{

public static void main(String[] args) {
	
        int n1=92,n2=45;

	System.out.println(" Swap two numbers :");
         
        System.out.println("\n-------------------------");	

        System.out.println("Input 1st number : "+n1);
 
        System.out.println("Input 2nd number : "+n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After swapping the 1st number is : " + n1);
        
        System.out.println("After Swapping the 2nd number is : " + n2);
    }
}