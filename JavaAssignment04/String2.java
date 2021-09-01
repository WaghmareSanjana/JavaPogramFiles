/*How to remove all duplicates from a given string? (solution)

Write a program to remove all the duplicate characters from a given input String, like, if the given String is "Java" then the output should be "Java". The second or further occurrence of duplicates should be removed.*/


import java.util.*;   
  

class String2  
{   

    static void removeDuplicate(char str[], int length)   
    {   
 
        int index = 0;   
    

        for (int i = 0; i < length; i++)   
        {   
              

            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
    

            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }   

    public static void main(String[] args)   
    {   
        String info = "Java";  

        char str[] = info.toCharArray();  

        int len = str.length;   
        removeDuplicate(str, len);   
    }   
}  