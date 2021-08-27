import java.util.*;
class H {
   public static void main(String args[]){
      double Root1 = 0,Root2= 0,determinant,sqrt;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a ,b and c coefficients:");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      determinant = (b*b)-(4*a*c);
      sqrt = Math.sqrt(determinant);
      if(determinant>0){
         Root1= (-b + sqrt)/(2*a);
         Root2= (-b - sqrt)/(2*a);
         System.out.println("Root1= "+ Root1 +" and Root2="+Root2);
      }else if(determinant == 0){
         System.out.println("Root1=Root2:: "+(-b + sqrt)/(2*a));
      }
   }
}