//6. Write a Java program to get a shallow copy of a HashMap instance.  


import java.util.*;  
class HM6 {  
   public static void main(String args[]){  
  HashMap<Integer,String> hm= new HashMap<Integer,String>();  
  hm.put(1, "c");
  hm.put(2, "c++");
  hm.put(3, "java");
   HashMap<Integer,String> hm2= new HashMap<Integer,String>(); 
  hm2 = (HashMap)hm.clone();     
   System.out.println(hm2);        
     }
}
