//2. Write a Java program to count the number of key-value (size) mappings in a map.  

import java.util.*;  
class HM2 {  
   public static void main(String args[]){  
  HashMap<Integer,String> hm= new HashMap<Integer,String>();  
  hm.put(1, "c");
  hm.put(2, "c++");
  hm.put(3, "java");
  System.out.println("Size of the hash map: "+hm.size());
 }
}
