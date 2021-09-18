//5. Write a Java program to get the first and last elements in a tree set.  
 

import java.util.*;
class T5 {
  public static void main(String[] args) {
  TreeSet<String> t = new TreeSet<String>();
  t.add("java");
  t.add("C");
  t.add("Python");
    Object first = t.first();
    System.out.println("first Element is: "+first);
    Object last = t.last();
    System.out.println("Last Element is: "+last);
 }
}
