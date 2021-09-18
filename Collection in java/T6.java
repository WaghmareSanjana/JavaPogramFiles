//6. Write a Java program to clone a tree set list to another tree set.  

import java.util.*;
class T6 {
  public static void main(String[] args) {
     TreeSet<String> t = new TreeSet<String>();
          t.add("C");
          t.add("C++");
          t.add("Java");
    TreeSet<String> t2 = (TreeSet<String>)t.clone();
          System.out.println("Cloned tree list: " + t2);      
     }
 }
