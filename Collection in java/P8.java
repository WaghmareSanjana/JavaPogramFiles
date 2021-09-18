//8. Write a Java program to retrieve the first element of the priority queue.  


import java.util.*;
class P8 {
  public static void main(String[] args) {
      PriorityQueue<Integer> p = new PriorityQueue<Integer>();  
   p.add(1);
   p.add(2);
   p.add(3);
   p.add(4);
   System.out.println("The first element of the priority Queue: "+p.peek());
   }    
}
