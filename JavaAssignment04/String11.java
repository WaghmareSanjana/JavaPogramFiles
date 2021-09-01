/*How to find the smallest substring in a given string containing all characters of another string? 

Write an efficient function in Java to print the smallest substring in a given string containing all characters of another String. For example, if the given String is "this is a test string" and "tist", then the output should be "t stri".

Sample Output:
The given string is : this is a test string
Characters to find in the main string are : tist
The smallest window which contains the finding characters is : t stri
*/

import java.util.*;
class String11
{
    public static String pickSubstring(String samp_str ,String pat_str)
	{
        int ln1  = samp_str.length();
        int ln2  = pat_str.length();
        if(ln1 < ln2)
		{ 
            System.out.println("No such window can exist");
            return "";
        }
        int gvn_strg [] = new int[156];
        int pat_stgr [] = new int[156];
        for(int i=0;i<ln2;i++)
            pat_stgr[pat_str.charAt(i)]++;
        int ctr = 0,start = 0,start_index = -1,min_length = Integer.MAX_VALUE;
        for(int j=0;j<ln1;j++)
		{
            gvn_strg[samp_str.charAt(j)]++;
            if(pat_stgr[samp_str.charAt(j)] != 0 && gvn_strg[samp_str.charAt(j)] <= pat_stgr[samp_str.charAt(j)])
                ctr++;
            if(ctr == ln2)
			{
                while(gvn_strg[samp_str.charAt(start)] > pat_stgr[samp_str.charAt(start)] || pat_stgr[samp_str.charAt(start)] == 0)
				{
					if(gvn_strg[samp_str.charAt(start)] > pat_stgr[samp_str.charAt(start)] || pat_stgr[samp_str.charAt(start)] == 0)
                        gvn_strg[samp_str.charAt(start)]--;
                    start++;
                }
                int length_window = j - start + 1;
                if(min_length > length_window)
				{
                    min_length = length_window;
                    start_index = start;
                }
                }
        }
        if(start_index == -1)
		{
            System.out.println("No such window exists");
            return "";
        }
        return samp_str.substring(start_index,start_index + min_length);
    }
    public static void main(String args[])
	{
        String str = "this is a test string";
        String pat = "tist";
        System.out.println("The given string is : "+str);
        System.out.println("Characters to find in the main string are : "+pat);
        
        System.out.print("The smallest window which contains the finding characters is : " + pickSubstring(str, pat));
    }
}