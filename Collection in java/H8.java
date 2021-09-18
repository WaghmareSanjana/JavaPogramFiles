//8. Write a Java program to convert a hash set to a tree set.  


import java.util.*;
class H8 {
  public static void main(String[] args) {
     HashSet<String> h = new HashSet<String>();
          h.add("c");
          h.add("html");
          h.add("Assembly");
     Set<String> t= new TreeSet<String>(h);
     for(String e : t){
        System.out.println("After converting hash set to tree set:"+e);
     }
  }
}
