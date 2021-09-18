//9. Write a Java program to copy one array list into another.  



import java.util.*;
  class c9 {
  public static void main(String[] args) {
  List<String> array1= new ArrayList<String>();
  array1.add("sanjana");
  array1.add("vaishnavi");
  array1.add("sakshi");
  System.out.println("before copy ArrayList1: " + array1);
  List<String> array2 = new ArrayList<String>();
  array2.add("65");
  array2.add("15");
  array2.add("60"); 
  System.out.println("before copy ArrayList2: " + array2);
  Collections.copy(array1, array2);
  System.out.println("After copy ArrayList1: " + array1);
  System.out.println("After copy ArrayList2: " + array2);
 }
}
