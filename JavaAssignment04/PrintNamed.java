/* Create a class named 'PrintNumber' to print various numbers of different datatypes by creating 
different functions with the same name 'printn' having a parameter for each datatype. */

public class PrintNumber {
    public int print(int a){
        System.out.println(a);
        return a;
    }
     public float print(float b){
         System.out.println(b);
        return b;
    }
      public double print(double c){
           System.out.println(c);
        return c;
       
    }
       public String print(String d){
           System.out.println(d);
        return d;
    }

public static void main(String[] args) {
      
PrintNumber a = new PrintNumber ();
PrintNumber b = new PrintNumber ();
a.print("Java");
a.print(13.13);
a.print(12.12);
a.print(73);
}
  }