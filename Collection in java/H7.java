//7. Write a Java program to convert a hash set to an array.  


import java.util.*;
class H7 {
  public static void main(String[] args) {
     HashSet<String> h= new HashSet<String>();
          h.add("C");
          h.add("C++");
          h.add("Java");
      String[] array = new String[h.size()];
      h.toArray(array);
      for(String e: array){
        System.out.println("After convert a hash set to an array:"+e);
     }
   }
}
