//Java Program to Check Armstrong Number

import java.util.*;
class V{

    public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
        int n,digit,rem,Solution=0;
	System.out.println("Enter the number:");
	n=sc.nextInt();
        digit = n;
        while (digit!= 0)
        {
            rem= digit % 10;
            Solution += Math.pow(rem,3);
            digit/= 10;
        }

        if(Solution== n){
            System.out.println("It  is an Armstrong number.");
}
        else{
            System.out.println("It is not an Armstrong number.");
}
    }
}