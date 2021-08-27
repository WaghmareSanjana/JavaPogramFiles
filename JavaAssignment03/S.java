//Java Program to Multiply two Numbers

import java.util.*;
class S {

    public static void main(String[] args) {
	
	int n1,n2,mul;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        mul= n1*n2;
        System.out.println("Multiplication of Two numbers="+mul);
    }
}