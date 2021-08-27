//Java Program to Swap Two Numbers

class D{

public static void main(String[] args) {
	
        int n1=92,n2=45;

        System.out.println("Input 1st number : "+n1);
 
        System.out.println("Input 2nd number : "+n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After swapping the 1st number is : " + n1);
        
        System.out.println("After Swapping the 2nd number is : " + n2);
    }
}