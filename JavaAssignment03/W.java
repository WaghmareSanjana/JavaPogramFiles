//Java Program to Display Factors of a Number

import java.util.*;
class W{

  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int n,i;
    System.out.println("\nEnter the number:");
    n=sc.nextInt();
    System.out.print("Factors of " +n+ " are:");
    for (i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}