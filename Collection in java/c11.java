//11. Write a Java program to reverse elements in a array list.  
 

import java.util.*;
  class c11 {
  public static void main(String[] args) {
  List<String> array1 = new ArrayList<String>();
  array1.add("c");
  array1.add("c#");
  array1.add("html");
  System.out.println("before reversing elements in array list:" + array1);  
  Collections.reverse(array1);
  System.out.println("after reversing elements in array list :" + array1); 
 }
}
