//5. Write a Java program to update specific array element by given element. 


import java.util.*;
  class c5 {
  public static void main(String[] args) {
  List<String> array1= new ArrayList<String>();
  array1.add("c");
  array1.add("c++");
  array1.add("c#");
  array1.add("java");
  System.out.println("before update:"+array1);
  array1.set(3, "python");
  System.out.println("after update:"+array1);
 }
}
