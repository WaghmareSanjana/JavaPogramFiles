//10. Write a Java program to convert a priority queue to an array containing all of the elements of the queue.  


import java.util.*;
class P10 {
  public static void main(String[] args) {
           PriorityQueue<String> p = new PriorityQueue<String>(); 
          p.add("HTML");
          p.add("JSP");
          p.add("CSS");
   List<String> array = new ArrayList<String>(p);
   System.out.println("Array containing all of the elements in the queue: "+array);
    
   }    
}
