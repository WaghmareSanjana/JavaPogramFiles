//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.  


import java.util.*;
class L10 {
  public static void main(String[] args) {
     LinkedList<String> list1 = new LinkedList<String>();
          list1.add("C");
          list1.add("C++");
          list1.add("Java");
    Object first = list1.getFirst();
    System.out.println("First Element is: "+first);
    Object last = list1.getLast();
    System.out.println("Last Element is: "+last);
 }
}
