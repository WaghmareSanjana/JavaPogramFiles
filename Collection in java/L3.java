//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.  

import java.util.*;
  class L3 {
  public static void main(String[] args) {
     LinkedList<String> list1= new LinkedList<String>();
  list1.add("c");
  list1.add("c++");
  list1.add("java");
   Iterator l= list1.listIterator(2);
   while (l.hasNext()) {
   System.out.println(l.next());
   }
   }
}
