//7. Write a Java program to compare two priority queues.  


import java.util.*;
class P7 {
  public static void main(String[] args) {
        PriorityQueue<String> p = new PriorityQueue<String>();  
          p.add("C");
          p.add("JSP");
          p.add("servlet");
          PriorityQueue<String> p1 = new PriorityQueue<String>();  
          p1.add("Html");
          p1.add("JSP");
          p1.add("CSS");
         for (String e : p){
             System.out.println(p1.contains(e) ? "Yes" : "No");
          }      
     }
}
