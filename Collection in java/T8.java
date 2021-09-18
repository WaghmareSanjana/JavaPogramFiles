//8. Write a Java program to compare two tree sets.  

import java.util.*;
class T8 {
  public static void main(String[] args) {
        TreeSet<String> t1 = new TreeSet<String>();
          t1.add("c");
          t1.add("c++");
          t1.add("java");
          TreeSet<String> t2 = new TreeSet<String>();
          t2.add("c");
          t2.add("jsp");
          t2.add("java");
          TreeSet<String> t3 = new TreeSet<String>();
         for (String e : t1){
             System.out.println(t2.contains(e) ? "Yes" : "No");
          }      
     }
}
