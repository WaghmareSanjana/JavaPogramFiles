//5. Write a Java program to remove all the elements from a priority queue.  


import java.util.*;
class P5 {
  public static void main(String[] args) {
          PriorityQueue<String> p = new PriorityQueue<String>();  
          p.add("c");
          p.add("c++");
          p.add("java");
    p.clear(); 
    System.out.println("After removing all the elements from a priority queue: " + p);
  } 
}
