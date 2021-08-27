//Java Program to Display Fibonacci Series

import java.util.*;
class M{
  public static void main(String[] args) {

    int n,a= 0, b= 1;
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter the value of n=");
    n=sc.nextInt();
    System.out.println("Fibonacci Series upto " +n+ " numbers=");
 
    for (int i = 1; i <= n; i++) {
      System.out.println(" "+a+" ");
      int c= a+ b;
      a= b;
      b= c;
    }
  }
}