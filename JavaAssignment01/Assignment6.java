/* Write a program in java to calculate the volume of a cylinder.   
Sample Output:
Calculate the volume of a cylinder :
-----------------------------------------
Input the radius of the cylinder : 6
Input the height of the cylinder : 8
The volume of a cylinder is : 904.32
*/

import java.util.*;
class Assignment6
{
   public static void main(String args[]) 
    {   
         double r,h,volume;
         Scanner s= new Scanner(System.in);
         System.out.println("Calculate the volume of a cylinder :");
	 System.out.println("\n------------------------------------");
         System.out.println("Input the radius of cylinder:");
         r=s.nextDouble();
         System.out.println("Input the height of cylinder:");
         h=s.nextDouble();
 
            volume=((22*r*r*h)/7.0);
 
            System.out.println("volume of Cylinder : " +volume);
       
 
       
          
   }
}