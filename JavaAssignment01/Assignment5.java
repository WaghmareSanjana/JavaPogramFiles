/* Write a program in java to calculate the volume of a cube.   
Sample Output:
Calculate the volume of a cube :
---------------------------------------
Input the side of a cube : 5
The volume of a cube is : 125
*/

import java.util.*;
class Assignment5
{
      
  
 
   public static void main(String args[]) 
    {   
       
	    double side,volume;
	    System.out.println("Calculate the volume of a cube :");
            System.out.println("\n----------------------------------");
            Scanner sc= new Scanner(System.in);
            System.out.println("Input the side of cube:");
            side=sc.nextDouble();
            volume=side*side*side;
            System.out.println("The volume of Cube is: " +volume);
       
 
       
          
   }
} 
 