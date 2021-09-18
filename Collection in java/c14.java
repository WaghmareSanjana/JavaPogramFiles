//14. Write a Java program of swap two elements in an array list.  

import java.util.*;
  public class c14 {
  public static void main(String[] args) {
   List<String> array1= new ArrayList<String>();
          array1.add("Red");
          array1.add("Green");
          array1.add("Black");
          System.out.println("before Swaping Array list:");
          for(String e: array1){
          System.out.println(e);
        }
         Collections.swap(array1, 1, 2);
          System.out.println("after swaping Arrray list:");
          for(String e1: array1){
          System.out.println(e1);
         }
     }
}
