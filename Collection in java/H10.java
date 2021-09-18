//10. Write a Java program to compare two hash set.  

import java.util.*;
class H10 {
  public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
          h.add("C");
          h.add("Java");
          h.add("C++");
          HashSet<String>h2 = new HashSet<String>();
          h2.add("Java");
          h2.add("Pythpn");
          h2.add("C++");
          HashSet<String>h3= new HashSet<String>();
         for (String e : h){
             System.out.println(h2.contains(e) ? "Yes" : "No");
          }      
     }
}
