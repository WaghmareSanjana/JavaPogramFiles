//12. Write a Java program to extract a portion of a array list.  
 

import java.util.*;
  class c12 {
  public static void main(String[] args) {
  List<String> array1= new ArrayList<String>();
  array1.add("java");
  array1.add("python");
  array1.add("nodejs");
  System.out.println("Array List: " + array1);
  List<String> array2= array1.subList(0, 1);
  System.out.println("extracting a portion of a array list: " + array2);
 }
}
