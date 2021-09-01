/*How to reverse a given String? 

 Write a program to reverse a String in Java or choice of your programming language. You can write either the recursive or iterative solution. For example, if a given input is "abcd," then your function should return "dcba". 

Sample Output:
Original String : java values
Reverse String : seulav avaj */

import java.io.FileNotFoundException;
import java.io.IOException;

public class String6{

    public static void main(String args[]) throws FileNotFoundException, IOException {

 
        String str = "java values";
        System.out.println("Original String : " + str);

 
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String : " + reverseStr);
     }
}