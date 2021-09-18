//2. Write a Java program to iterate through all elements in priority queue.  


import java.util.*;
class P2 {
  public static void main(String[] args) {
    PriorityQueue<String> p = new PriorityQueue<String>();  
  p.add("JAVA");
  p.add("C");
  p.add("OOP");
  for (String e: p) {
    System.out.println(p);
    }
 }
}
