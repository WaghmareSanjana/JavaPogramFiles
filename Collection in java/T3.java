//3. Write a Java program to add all the elements of a specified tree set to another tree set.  


import java.util.*;
class T3 {
  public static void main(String[] args) {
  TreeSet<String> t = new TreeSet<String>();
  t.add("C");
  t.add("C++");
  t.add("Java");
  TreeSet<String> t2 = new TreeSet<String>();
  t2.add("html");
  t2.add("python");
  t2.add("Mysql");
   t.addAll(t2);
   System.out.println("after adding all element in Tree set1: "+t);
 }
}
