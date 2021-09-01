/* How do you count the number of words in String?

 Write a program to count a number of words in a given String. The words are separated by the following characters: space (‘ ‘) or newline (‘\n’) or tab (‘\t’) or a combination of these. For example, if input "Java is great" your program should print 3. */

public class String18{  
      static int wordcount(String string)  
        {  
          int count=0;  
      
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length();i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }  
            return count;  
        }  
      public static void main(String[] args) {  
          String string ="Java is great";  
         System.out.println(wordcount(string) + " words.");   
    }  
}  