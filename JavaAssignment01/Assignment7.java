/* Write a program in C++ to find the Area and Perimeter of a Rectangle.   
Sample Output:
Find the Area and Perimeter of a Rectangle :
-------------------------------------------------
Input the length of the rectangle : 10
Input the width of the rectangle : 15
The area of the rectangle is : 150
The perimeter of the rectangle is : 50
*/

import java.util.*;

public class Assignment7{

    public static void main(String[] args) {
        
        int l, w, area, perimeter; //l=length w=width

        Scanner sc = new Scanner(System.in);
	
	System.out.print("Find the Area and Perimeter of a Rectangle : ");	

	System.out.print("\n-----------------------------------------------");	

        System.out.println("\nInput the  length of the rectangle : ");
        l= sc.nextInt();
        
        System.out.println("\nInput the  width of the rectangle : ");
        
        w = sc.nextInt();
        perimeter = 2 * (l + w); 
        area = l * w; 
        
        System.out.println("The area of the rectangle is : " + area);
        
        System.out.println("The perimeter of the rectangle is : " + perimeter);
     }
}