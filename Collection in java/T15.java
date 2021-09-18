//15. Write a Java program to retrieve and remove the last element of a tree set.  

import java.util.*;
class T15 {
  public static void main(String[] args) {
   TreeSet <Integer>num = new TreeSet<Integer>();
   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
   num.add(20);
   num.add(22);
   num.add(24);
   System.out.println("remove the last element of a tree set: "+num.pollLast());
   System.out.println("after removing last element: "+num);
   }    
}
