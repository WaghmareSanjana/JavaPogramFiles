//6. Write a Java program to remove the third element from a array list.  
 

import java.util.*;
  class c6 {
  public static void main(String[] args) {
  List<String> array1 = new ArrayList<String>();
  array1 .add("Red");
  array1 .add("Green");
  array1 .add("Orange");
  array1 .add("White");
  System.out.println("before:"+array1);
  array1.remove(1);
  System.out.println("After removing:"+array1);
 }
}
