//15. Write a Java program to join two array lists.  


import java.util.*;
  class c15 {
  public static void main(String[] args) {
   List<String> array1= new ArrayList<String>();
          array1.add("c");
          array1.add("c++");
          array1.add("java");
          System.out.println("first array list: " + array1);
          List<String> array2= new ArrayList<String>();
          array2.add("Red");
          array2.add("Green");
          array2.add("Black");
          array2.add("Pink");
          System.out.println("second array List: " + array2);
        List<String> join = new ArrayList<String>();
        join.addAll(array1);
        join.addAll(array2);
        System.out.println("Array After Joining array list: " + join);
        

     }
}
