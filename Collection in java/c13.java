//13. Write a Java program to compare two array lists.  
 
import java.util.*;
  class c13 {
  public static void main(String[] args) {
   List<String> array1= new ArrayList<String>();
          array1.add("c");
          array1.add("c++");
          array1.add("java");
          List<String> array2= new ArrayList<String>();
          array2.add("c");
          array2.add("c++");
          array2.add("python");
    
          List<String>  array3 = new ArrayList<String>();
          for (String e : array1)
             array3.add(array2.contains(e) ? "Yes" : "No");
          System.out.println(array3);
         
     }
}
