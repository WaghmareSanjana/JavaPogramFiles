//8. Write a Java program to test if a map contains a mapping for the specified value.  


import java.util.*;  
class HM8 {  
   public static void main(String args[]) {
  HashMap < Integer, String > hm = new HashMap < Integer, String > ();
  hm.put(1, "C");
  hm.put(2, "C++");
  hm.put(3, "Java");
  System.out.println("1. Is value 'Java' exists?");
  if (hm.containsValue("Java")) {
   System.out.println("Yes!!!!! ");
  } else {
   System.out.println("no!!!!");
  }
 }
}
