//Java Program to Check Whether a Number is Palindrome or Not

import java.util.*;
class T{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n, rev= 0,rem;
    System.out.println("\nEnter the number which u wish to check palindrome or not:");
    n=sc.nextInt();
    int copy=n;
    while (n!= 0) {
      rem= n % 10;
      rev= rev* 10+rem;
      n/= 10;
    }
    if (copy== rev) {
      System.out.println("It is Palindrome Number");
    }
    else {
      System.out.println("It is not Palindrome.");
    }
  }
}