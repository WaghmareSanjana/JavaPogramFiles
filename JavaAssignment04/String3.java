/*How to print the duplicate characters from the given String? (solution)*/
 Write an efficient Java program to return the duplicate characters from given String, for example, if given String is "C++" then your program should print "+" Similarly, if the input is "Java and JavaScript" then your program should print "J", "a" and "v". You can ignore the case for finding duplicates.
Sample Output:-         
Duplicate characters in a given string :
J
a
v
*/

public class String3{  
     public static void main(String[] args) {  
        String string1 = "Java and JavaScript";  
        int count;  
          
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string : ");  

        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  

                    string[j] = '0';  
                }  
            }  

            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
    }  
}   