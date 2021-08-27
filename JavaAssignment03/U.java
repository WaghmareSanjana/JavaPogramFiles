//Java Program to Check Whether a Number is Prime or Not

import java.util.*;
class U{

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n,i,flag=1;
    System.out.println("\nEnter the number which u wish to check whether prime or not:");
    n=sc.nextInt();
    for (i=2; i<=n/2;i++) {
      if (n%i==0) {
        flag=0;
        break;
      }
    }

    if (flag==1){
      System.out.println("It is a prime number");
}
    else{
      System.out.println("It is not a prime number");
}
  }
}