//9. Write a Java program to retrieve and remove the first element.  

import java.util.*;
class P9 {
  public static void main(String[] args) {
   PriorityQueue<Integer> p = new PriorityQueue<Integer>(); 
   p.add(12);
   p.add(24);
   p.add(36);
   System.out.println("Removing first element from queue: "+p.poll());
   System.out.println("after removing first element in priority queuee: "+p);
   }    
}
