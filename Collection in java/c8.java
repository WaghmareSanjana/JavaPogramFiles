//8. Write a Java program to sort a given array list.  
 

import java.util.*;
  class c8 {
  public static void main(String[] args) {
  List<String> array1 = new ArrayList<String>();
  array1.add("sanjana");
  array1.add("vaishnavi");
  array1.add("sakshi");
  System.out.println("before: "+array1);
  Collections.sort(array1);
  System.out.println("after sorting the array is: "+array1);    
 }
}
