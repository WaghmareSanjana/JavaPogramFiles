//8. Write a Java program to insert the specified element at the end of a linked list.  


import java.util.*;
class L8 {
  public static void main(String[] args) {
     LinkedList<String> list1 = new LinkedList<String>();
          list1.add("c");
          list1.add("c++");
          list1.add("java");
          list1.offerLast("python");
     System.out.println("After Inserting element in linked list:" + list1);  
 }
}
