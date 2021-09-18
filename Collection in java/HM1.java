/*Java Collection: HashMap Exercises 
1. Write a Java program to associate the specified value with the specified key in a HashMap. */


import java.util.*;  
class HM1 {  
  public static void main(String args[]) {  
  HashMap<Integer,String> hm= new HashMap<Integer,String>();  
  hm.put(1, "c");
  hm.put(2, "c++");
  hm.put(3, "java");
  for(Map.Entry h:hm.entrySet()){  
   System.out.println(h.getKey()+" "+h.getValue());  
  }  
 }  
}
