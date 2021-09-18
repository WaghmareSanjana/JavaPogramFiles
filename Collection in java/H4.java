//4. Write a Java program to empty an hash set.  


import java.util.*;
class H4 {
  public static void main(String[] args) {
     HashSet<String> h = new HashSet<String>();
          h.add("C");
          h.add("C++");
          h.add("Java");
    h.removeAll(h);
    System.out.println("Hash Set after empty an hash set:"+h);   
   }
}
