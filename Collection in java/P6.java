//6. Write a Java program to count the number of elements in a priority queue.  


import java.util.*;
class P6 {
  public static void main(String[] args) {
    PriorityQueue<String> p= new PriorityQueue<String>(); 
          p.add("c");
          p.add("c++");
          p.add("vb.net");
    System.out.println("Size of the Priority Queue: " + p.size());
   }
}
