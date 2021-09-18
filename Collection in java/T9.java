//9. Write a Java program to find the numbers less than 7 in a tree set.  

import java.util.*;
class T9 {
  public static void main(String[] args) {
   TreeSet <Integer>num= new TreeSet<Integer>();
   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
   num.add(1);
   num.add(2);
   num.add(3);
   num.add(4);
   treeheadset = (TreeSet)num.headSet(7);  
   Iterator it;
   it= treeheadset.it();
   System.out.println("Tree set data: ");     
   while (it.hasNext()){
   System.out.println(it.next() + " ");
   }
   }    
}
