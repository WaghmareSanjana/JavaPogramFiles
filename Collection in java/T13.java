//13. Write a Java program to get an element in a tree set which is strictly less than the given element.  


import java.util.*;
class T13 {
  public static void main(String[] args) {
   TreeSet <Integer>num = new TreeSet<Integer>();
   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
   num.add(80);
   num.add(2);
   num.add(50);
   num.add(20);
   System.out.println("strictly less than the given element: "+num.lower(20));
   }    
}
