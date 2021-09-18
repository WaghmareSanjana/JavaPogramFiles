//4. Write a Java program to insert a given element into a priority queue.  


import java.util.*;
class P4 {
  public static void main(String[] args) {
           PriorityQueue<String> p = new PriorityQueue<String>();  
          p.add("C");
          p.add("Java");
          p.add("Python");
    p.offer("c++"); 
    System.out.println("After inserting a given element into a priority queue: " + p);
  } 
}
