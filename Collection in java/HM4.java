//4. Write a Java program to remove all of the mappings from a map.  

import java.util.*;  
class HM4 {  
   public static void main(String args[]) {
  HashMap <Integer,String> hm = new HashMap <Integer,String> ();
  hm.put(1, "c");
  hm.put(2, "c++");
  hm.put(3, "java");
  hm.clear();
  System.out.println("After remove all of the mappings from a map: " + hm);
 }
}
