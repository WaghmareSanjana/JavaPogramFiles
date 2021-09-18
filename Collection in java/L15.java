//15. Write a Java program of swap two elements in a linked list.  


import java.util.*;
class L15 {
 public static void main(String[] args) {
  LinkedList <String> list1 = new LinkedList <String> ();
  list1.add("Mysql");
  list1.add("java");
  list1.add("Vb.Net");
    Collections.swap(list1, 0, 1);
    System.out.println("After swap two elements in linked list: " + list1);
 }
}
