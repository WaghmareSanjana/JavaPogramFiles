//9. Write a Java program to create a set view of the mappings contained in a map.  

import java.util.*;  
class HM9 {  
    public static void main(String args[]) {
  HashMap < Integer, String > hm= new HashMap < Integer, String > ();
hm.put(1, "c");
hm.put(2, "c++");
hm.put(3, "java");
  Set s = hm.entrySet();
  System.out.println("set view of the mappings: " + s);
 }
}
