//7. Write a Java program to get the number of elements in a tree set.  

import java.util.*;
class T7 {
  public static void main(String[] args) {
     TreeSet<String> t = new TreeSet<String>();
          t.add("C");
          t.add("C++");
          t.add("Java");
    System.out.println("Size of the tree set: " + t.size());
   }
}
