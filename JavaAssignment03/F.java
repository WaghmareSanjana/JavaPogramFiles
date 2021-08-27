//Java Program to Check Whether a character is Vowel or Consonant.

import java.util.*;
class F
{
	public static void main(String[] args)
	{
	char ch;
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter a character which You wish to Check : ");

	ch=sc.next( ).charAt(0);	 		

	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'|| ch=='u'||ch=='U')
	{
	System.out.println(ch+" is Vowel"); 
	}
	else
	{
		System.out.println(ch+" is Constant");
	}
	      		
	}
}
