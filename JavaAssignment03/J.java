//Java Program to Check Leap Year

import java.util.*;
class J {

  public static void main(String[] args) {

    int year;
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter the year which u wish to check.");
    year=sc.nextInt();
    if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) 
	{
	      System.out.println("Entered year "+year + "  is a leap year.");
	}
    else
	{	
	      System.out.println(year + " is not a leap year.");
        }
}
}
