//14. Write a Java program to remove all the elements from a linked list.  
 
import java.util.*;
class L14 {
  public static void main(String[] args) {
     LinkedList<String> list1 = new LinkedList<String>();
          list1.add("c");
          list1.add("c++");
          list1.add("java");
    list1.clear(); 
    System.out.println("After removing All element in linked list: " + list1);
  }
}
