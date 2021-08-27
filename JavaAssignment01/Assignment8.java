/* Write a program in C++ to find the area of any triangle using Heron's Formula.   
Sample Output:
Find the area of any triangle using Heron's Formula :
----------------------------------------------------------
Input the length of 1st side of the triangle : 5
Input the length of 2nd side of the triangle : 5
Input the length of 3rd side of the triangle : 5
The area of the triangle is : 10.8253
*/

import java.util.*;
class Assignment8 {
   public static void main(String[] args) {

      double a, b, c;  //sides of triangle
      double s, Area;
      Scanner sc=new Scanner(System.in);
      System.out.println("Find the area of any triangle using Heron's Formula :");
      System.out.println("\n---------------------------------------------------------- ");
      System.out.println("Input the length of 1st side of the triangle : ");
      a=sc.nextDouble();
      System.out.println("Input the length of 2nd side of the triangle : ");
      b=sc.nextDouble();
      System.out.println("Input the length of 3rd side of the triangle :");
      c=sc.nextDouble();
      s = (a+b+c)/2.0d;
      Area = Math.sqrt(s* (s - a) * (s - b) * (s - c));
      System.out.println("The Area of Triangle is:" + Area);
   }
}