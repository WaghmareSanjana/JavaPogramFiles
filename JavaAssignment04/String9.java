/*How to print all permutation of a String?

 Write an efficient program to print all permutations of a given String in Java. For example, if given input is "123" then your program should print all 6 permutations e.g. "123", "132", "213", "231", "312" and "321". 

Sample Output:
All the possible permutations of 123 are :
123 132 213 231 312 321


public class String9{ 

    static void printPermutn(String str, String ans){ 

        if (str.length() == 0){ 

            System.out.print(ans + " "); 

            return; 

        } 

     for (int i = 0; i < str.length(); i++) { 

            char ch = str.charAt(i); 

            String ros = str.substring(0, i) +  

                         str.substring(i + 1); 
   

            printPermutn(ros, ans + ch); 

        } 

    }

    public static void main(String[] args) 

    { 
    System.out.println("All the possible permutations of 123 are : ");

        String s = "123"; 

        printPermutn(s, ""); 

    } 
} 