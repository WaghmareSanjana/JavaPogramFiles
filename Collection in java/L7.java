//7. Write a Java program to insert the specified element at the front of a linked list.  


import java.util.*;
class L7 {
  public static void main(String[] args) {
     LinkedList<String> list1= new LinkedList<String>();
          list1.add("python");
          list1.add("html");
          list1.add("java");
     list1.offerFirst("c");
     System.out.println("After Inserting element in linked list:" + list1);  
 }	
}
