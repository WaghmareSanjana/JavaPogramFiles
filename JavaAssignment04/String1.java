/*How to find the maximum occurring character in a given String? (solution)*/

/*Write an efficient Java/C/Python program to return the maximum occurring character in the input string, e.g., if the input string is "Java" then the function should return 'a'.*/

/* sample output:- 
The given string is : Java
Max occurring character in the given string is : a */

import java.util.*;
public class String1{
 static final int N =150;
 static char MaxOccuringChar(String str1) {
  int ctr[] = new int[N];
  int l = str1.length();
  for (int i = 0; i < l; i++)
   ctr[str1.charAt(i)]++;
  int max = -1;
  char result = ' ';

  for (int i = 0; i < l; i++) {
   if (max < ctr[str1.charAt(i)]) {
    max = ctr[str1.charAt(i)];
    result = str1.charAt(i);
   }
  }
  return result;
 }
 public static void main(String[] args) {
  String str1 = "Java";
  System.out.println("The given string is : " + str1);
  System.out.println("Max occurring character in the given string is : " + MaxOccuringChar(str1));
 }
}