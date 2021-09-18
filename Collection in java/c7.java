//7. Write a Java program to search an element in a array list.  



import java.util.*;
  class c7 {
  public static void main(String[] args) {
  List<String> array1 = new ArrayList<String>();
  array1.add("c");
  array1.add("c++");
 array1.add("java");
  array1.add("html");
    if (array1.contains("c")) 
    System.out.println("it's Present");
    else 
    System.out.println("It's Not present!!");
 }
}
