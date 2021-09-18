//3. Write a Java program to add all the elements of a priority queue to another priority queue.  


import java.util.*;
class P3 {
public static void main(String[] args) {
  PriorityQueue<String> q = new PriorityQueue<String>();  
  q.add("C");
  q.add("C++");
  q.add("C#");
  PriorityQueue<String> q1 = new PriorityQueue<String>();  
  q1.add("Java");
  q1.add("Core Java");
  q1.add("JSP");
   q.addAll(q1);
   System.out.println("After Adding: "+q);
 }
}
