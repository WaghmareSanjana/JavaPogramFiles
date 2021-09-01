/*How do you check if a given String is Palindrome or not? 

Write an efficient program in java to check if a Given string is a palindrome, considering only alphanumeric characters and ignoring cases. For example,"121" is a palindrome, but "123" is not. Your function should return true if given String is a palindrome, false otherwise.
 Sample Output:
Enter a string : 121
Entered string is a palindrome.
*/

import java.util.*;   
class string13 
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.print("Enter a string : ");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string is a palindrome.");  
      else  
         System.out.println("Entered string is not a palindrome.");   
   }  
}  