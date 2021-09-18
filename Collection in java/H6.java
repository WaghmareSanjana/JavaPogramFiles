//6. Write a Java program to clone a hash set to another hash set.  


import java.util.*;
class H6 {
  public static void main(String[] args) {
     HashSet<String> h = new HashSet<String>();
          h.add("c");
          h.add("c++");
          h.add("Java");
    HashSet <String> h2= new HashSet <String> ();
          h2= (HashSet)h.clone();
          System.out.println("After cloning a hash set to another hash set: " + h2);         
   }
}
