/* Write a program in java to add two numbers.  
Sample Output:
Original array:
[10, 20, 30]
After append values to the end of the array:
[10 20 30 40 50 60 70 80 90]
 */

import java.util.*;
class Assignment2
{
   public static void main (String args[])
 {
   int[] Arr1 = new int[]{10,20,30};
   int[] Arr2 = new int[]{40,50,60,70,80,90};
   int lenArr1 = Arr1.length;
   int lenArr2 = Arr2.length;
   int[] concate = new int[lenArr1 + lenArr2];
   System.arraycopy(Arr1, 0, concate, 0, lenArr1);  
   System.arraycopy(Arr2, 0, concate, lenArr1, lenArr2);  
   System.out.println("Original array: " + Arrays.toString(Arr1));
   System.out.println("After append values to the end of the array: " + Arrays.toString(concate)); 
 }  
}