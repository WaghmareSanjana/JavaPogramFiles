//3. Write a Java program to copy all of the mappings from the specified map to another map.  


import java.util.*;  
class HM3 {  
   public static void main(String args[]) {
  HashMap <Integer,String> hm1 = new HashMap <Integer,String> ();
  HashMap <Integer,String> hm2 = new HashMap <Integer,String> ();
  hm1.put(1, "c");
  hm1.put(2, "c++");
  hm1.put(3, "java");

  hm2.put(4, "html");
  hm2.put(5, "python");
  hm2.put(6, "jsp");
  hm2.putAll(hm1);

  System.out.println("After copy all of the mappings from the specified map to next: " + hm2);
 }
}
