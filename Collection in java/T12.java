//12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.  


import java.util.*;
class T12 {
  public static void main(String[] args) {
   TreeSet <Integer>num = new TreeSet<Integer>();
   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
   num.add(80);
   num.add(32);
   num.add(76);
   num.add(98);
   System.out.println("strictly greater than or equal to the given element: "+num.higher(80));
   }    
}
