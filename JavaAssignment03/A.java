//Java Program to Add, subtract, multiply and divide Two Numbers

import java.util.*;
 
class A
{
  public static void main(String args[])
  {
    int n1, n2, add, sub, mul,div;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    n1 = sc.nextInt();
    n2= sc.nextInt();

    add = n1 + n2;
    sub = n1 - n2;
    mul = n1* n2;
    div=n1/n2;

    System.out.println("Addition = " + add);
    System.out.println("Substraction = " + sub);
    System.out.println("Multiplication = " + mul);
    System.out.println("Division = " + div);
  }
}