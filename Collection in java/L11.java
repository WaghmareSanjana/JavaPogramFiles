//11. Write a Java program to display the elements and their positions in a linked list.  


import java.util.*;
class L11 {
  public static void main(String[] args) {
     LinkedList<String> list1= new LinkedList<String>();
          list1.add("C");
          list1.add("c++");
          list1.add("java");
  for(int i=0; i < list1.size(); i++)
   {
      System.out.println("Position oof "+i+" element linked list : "+list1.get(i));
    } 
 }
}
