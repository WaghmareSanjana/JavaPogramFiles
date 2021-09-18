//2. Write a Java program to iterate through all elements in a hash list.  

import java.util.*;
class H2 {
  public static void main(String[] args) {
     HashSet<String> h = new HashSet<String>();
          h.add("c");
          h.add("c++");
          h.add("java");
    Iterator<String> i = h.iterator();
   while (i.hasNext()) {
   System.out.println(i.next());
   }
   }
}
