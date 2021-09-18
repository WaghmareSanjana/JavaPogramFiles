//12. Write a Java program to remove a specified element from a linked list.  


import java.util.*;
class L12 {
 public static void main(String[] args) {
  LinkedList <String> list1 = new LinkedList <String> ();
  list1.add("c");
  list1.add("c++");
  list1.add("java");
  list1.remove(1);
  System.out.println("After removing element in linked list: " + list1);
 }
}
