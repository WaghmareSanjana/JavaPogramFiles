//Java Program to Find LCM


import java.util.*;
class O{
  public static void main(String[] args) {

    int n1, n2, lcm;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter two numbers:");
    n1=sc.nextInt();
    n2=sc.nextInt();
    lcm = (n1 > n2) ? n1 : n2;

    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.println("The LCM of "+n1+" and "+n2+" =" +lcm);
        break;
      }
      lcm++;
    }
  }
}