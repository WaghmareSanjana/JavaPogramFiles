//9. Write a Java program to insert some elements at the specified position into a linked list.  


import java.util.*;
class L9 {
 public static void main(String[] args) {
  LinkedList <String> list1 = new LinkedList <String> ();
  list1.add("c");
  list1.add("c++");
  list1.add("java");
  LinkedList <String> list2 = new LinkedList <String> ();
  list2.add("python");
  list1.addAll(1,list1);
  System.out.println("After Inserting elemeent in LinkedList:" +list1);
 }
}
