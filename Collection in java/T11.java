//11. Write a Java program to get the element in a tree set which is less than or equal to the given element.  


import java.util.*;
class T11 {
  public static void main(String[] args) {
   TreeSet <Integer>num = new TreeSet<Integer>();
   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
   num.add(10);
   num.add(22);
   num.add(36);
   System.out.println("Less than or equal to given element : "+num.floor(35));
   }    
}
