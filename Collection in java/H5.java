//5. Write a Java program to test a hash set is empty or not.  


import java.util.*;
class H5 {
  public static void main(String[] args) {
     HashSet<String> h = new HashSet();
          h.add("c");
          h.add("c++");
          h.add("java");
    System.out.println("given array list is empty or not! "+h.isEmpty());
    h.removeAll(h);
    System.out.println("Hash Set after removing all the elements "+h);   
   }
}
