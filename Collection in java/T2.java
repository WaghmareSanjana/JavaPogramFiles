//2. Write a Java program to iterate through all elements in a tree set.  


import java.util.*;
class T2 {
  public static void main(String[] args) {
  TreeSet<String> t = new TreeSet<String>();
  t.add("Red");
  t.add("Green");
  t.add("Orange");
  for (String e: t) {
    System.out.println(e);
    }
 }
}
