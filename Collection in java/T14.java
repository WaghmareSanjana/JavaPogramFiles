//14. Write a Java program to retrieve and remove the first element of a tree set.  


import java.util.*;
class T14 {
  public static void main(String[] args) {
   TreeSet <Integer>num = new TreeSet<Integer>();
   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
   num.add(50);
   num.add(20);
   num.add(10);
   System.out.println("remove the first element of a tree set: "+num.pollFirst());
   System.out.println("after removing first element in tree set: "+
num);
   }    
}
