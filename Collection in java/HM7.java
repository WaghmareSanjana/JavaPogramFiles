//7. Write a Java program to test if a map contains a mapping for the specified key.  

import java.util.*;  
class HM7 {  
   public static void main(String args[]) {
  HashMap < String, Integer > hm = new HashMap < String, Integer > ();
  hm.put("C", 1);
  hm.put("C++", 2);
  hm.put("Java", 3);
  System.out.println("Is key 'C' exists?");
  if (hm.containsKey("C")) {
   System.out.println("yes " + hm.get("C"));
  } else {
   System.out.println("no!!!!");
  }
 }
}
