//10. Write a Java program to shuffle elements in a array list. 


import java.util.*;
  public class c10 {
  public static void main(String[] args) {
  List<String> array1 = new ArrayList<String>();
  array1.add("c");
  array1.add("c++");
  array1.add("c#");
  System.out.println("before shuffling elements in array list:" + array1);  
  Collections.shuffle(array1);
  System.out.println("after shuffling elements in array:" + array1); 
 }
}
 

