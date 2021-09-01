/*How to check if two given String is the anagram of each other? 

 Write an efficient program in Java to check if two String is an anagram of each other. An anagram contains are of the same length and contains the same character, but in a different order, for example, "Army" and "Mary" is the anagram. Your program should return true if both Strings are the anagram, false otherwise 
Sample Output:
   Army and Mary are anagrams.
*/

import java.util.Arrays;  
   
public class String12{  
    static void isAnagram(String str1, String str2) {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(s1 + " and " + s2 + " are anagrams.");  
        } else {  
            System.out.println(s1 + " and " + s2 + " are not anagrams.");  
        }  
    }  
   
    public static void main(String[] args) {  
        isAnagram("Army", "Mary");  
}  
}