/* Write a program in java to calculate the volume of a sphere.   
Sample Output:
Calculate the volume of a sphere :
---------------------------------------
Input the radius of a sphere : 6
The volume of a sphere is : 904.32
*/

import java.util.*;
class Assignment4
{
      
   public static void main(String args[]) 
    {   
       
		double r,volume;
		System.out.println("Calculate the volume of a sphere :");
		System.out.println("\n----------------------------------");
            	Scanner s= new Scanner(System.in);
         	System.out.println("input the radius of sphere:");
                r=s.nextDouble();       
                volume= (4*22*r*r*r)/(3*7);
 
             System.out.println("Volume of sphere is:" +volume);
      }
}
 