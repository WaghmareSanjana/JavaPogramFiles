//5. Write a Java program to check whether a map contains key-value mappings (empty) or not.  

import java.util.*;  
class HM5 {  
   public static void main(String args[]) {
  HashMap <Integer,String> hm = new HashMap <Integer,String> ();
  hm.put(1, "c");
  hm.put(2, "c++");
  hm.put(3, "java");
  boolean result = hm.isEmpty();
  System.out.println("Is hash map empty?  " + result);
  hm.clear();
  result = hm.isEmpty();
  System.out.println("Is hash map empty?  " + result);
 }
}
