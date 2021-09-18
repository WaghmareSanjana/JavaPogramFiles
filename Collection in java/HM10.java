//10. Write a Java program to get the value of a specified key in a map.  

import java.util.*;  
class HM10 {  
    public static void main(String args[]){  
   HashMap<Integer,String> hm= new HashMap<Integer,String>();  
	hm.put(1,"c");
	hm.put(2,"c++");
	hm.put(3,"python");
   String element=(String)hm.get(1); 
   System.out.println("value of a specified key in a map: " + element);
 }
}
