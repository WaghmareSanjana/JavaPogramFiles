
/*Write an efficient Java function that takes two strings as arguments and removes the characters from the first string, which are present in the second string. For example, if the first String "India is great" and the second String is "in" then the output should be "da s great" 


Enter the first String : india is great
Enter the second String : in
After removing the characters of second string from first string : da s great */

 import java.util.Scanner;
public class String4{  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str,sbstr;
        
        System.out.print("Enter the first String : ");
        str = sc.nextLine();
        
        System.out.print("Enter the second String : ");
        sbstr = sc.nextLine();
        
        char [] c1str = str.toCharArray();
        char [] c2sbstr = sbstr.toCharArray();
       
        
            for(int j=0;j<c2sbstr.length;j++) {
                for(int i=0;i<c1str.length;i++) {

                if(c1str[i] == c2sbstr[j]) {
                    c1str[i] = 0;
                }    
            }
        }

        System.out.print("After removing the characters of second string from first string :");

        for(int i=0;i<c1str.length;i++) {
            System.out.print(c1str[i]); 
        }  
    }
}