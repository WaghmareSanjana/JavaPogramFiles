//Java Program to Calculate Power of a Number

import java.util.*;
class Q{
  public static void main(String[] args) {

    int base, exponent,result=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter the value of base and exponent=");
    base=sc.nextInt();
    exponent=sc.nextInt();
    while (exponent != 0) {
      result=result* base;
      exponent--;
    }

    System.out.println("Power of entered value is= " + result);
  }
}