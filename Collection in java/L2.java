//2. Write a Java program to iterate through all elements in a linked list.  


import java.util.*;
  public class L2 {
  public static void main(String[] args) {
  List<String> list1 = new LinkedList<String>();
  list1.add("c");
  list1.add("c++");
  list1.add("java");
  for (String e: list1) {
    System.out.println(e);
    }
 }
}
