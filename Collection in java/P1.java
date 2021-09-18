/*Java Collection: PriorityQueue Exercises
1. Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue*/

import java.util.*;
class P1 {
  public static void main(String[] args) {
  PriorityQueue<String> p=new PriorityQueue<String>();  
  p.add("pink");
  p.add("yellow");
  p.add("black");
  System.out.println(p);
 }
}
