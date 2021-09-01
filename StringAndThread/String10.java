/*How to reverse the words in a given String sentence?
Write an efficient program in Java or to reverse the words in a given String sentence. For example, if the input is "Java is best," then your program should print "best is Java". There is no restriction on preserving white space. 

Sample output:
Java is best
avaJ si tseb
*/

public class String10{
   public void reverseWordInMyString(String str){
   	
	String[] words = str.split(" ");
	String reversedString = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		
		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	}
	System.out.println(str);
	System.out.println(reversedString);
   }
   public static void main(String[] args) 
   {
	String10 obj = new String10();
	obj.reverseWordInMyString("Java is best");
    }
}
