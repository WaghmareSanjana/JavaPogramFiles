//Java Program to Make a Simple Calculator to Add, Subtract, Multiply or Divide Using switch...case

import java.util.*;

class X{
  public static void main(String[] args) {

    char ch;
    int n1, n2,Answer;
    Scanner sc= new Scanner(System.in);
    System.out.println("Select the operator which u which to use: +, -, *, or /");
    ch= sc.next().charAt(0);
    System.out.println("Enter two number");
    n1 = sc.nextInt();
    n2 = sc.nextInt();

    switch (ch) {
      case '+':
        Answer= n1 + n2;
        System.out.println(n1 + " + " + n2 + " :: " + Answer);
        break;
      case '-':
        Answer = n1 - n2;
        System.out.println(n1 + " - " + n2 + "::" + Answer );
        break;
      case '*':
        Answer = n1 * n2;
        System.out.println(n1 + " * " + n2 + " ::" + Answer );
        break;

      case '/':
        Answer = n1 / n2;
        System.out.println(n1 + " / " + n2 + " ::" + Answer );
        break;

      default:
        System.out.println("Invalid choice!!!!");
        break;
    }

   
  }
}
