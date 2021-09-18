//13. Write a Java program to remove first and last element from a linked list.  


import java.util.*;
class L13 {
  public static void main(String[] args) {
     LinkedList<String> list1= new LinkedList<String>();
          list1.add("c");
          list1.add("c++");
          list1.add("mysql");
    Object first = list1.removeFirst();
    Object last = list1.removeLast();
    System.out.println("After removing first and last element from linked list: " + list1);
  }
}
