/* Write a program in java to find the area and circumference of a circle.   
Sample Output:
Find the area and circumference of any circle :
----------------------------------------------------
Input the radius(1/2 of diameter) of a circle : 5
The area of the circle is : 78.5397
The circumference of the circle is : 31.4159
 */

import java.util.*;
class Assignment9
{
  
   public static void main(String args[])
   {
      double r,area,circumference;
      Scanner sc = new Scanner(System.in);
      System.out.println("Find the area and circumference of any circle :");
        System.out.println("\n-------------------------------------------------");
      System.out.print("Input the radius(1/2 of diameter) of a circle : ");
   
      r= sc.nextDouble();
   
      area = 3.14* (r * r);
      System.out.println("The area of the circle is : " + area);
      circumference= 3.14* 2*r;
      System.out.println( "The circumference of the circle is : "+circumference) ;
   }
}