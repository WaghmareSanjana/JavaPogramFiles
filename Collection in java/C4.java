//4. Write a Java program to retrieve an element (at a specified index) from a given array list.  



import java.util.*;
  class c4 {
  public static void main(String[] args) {
  List<String> array1 = new ArrayList<String>();
  array1.add("c");
  array1.add("c++");
  array1.add("c#");
  array1.add("java");
  System.out.println(array1);
  String item = array1.get(2);
  System.out.println("element At 3rd position: "+item);
 }
}
