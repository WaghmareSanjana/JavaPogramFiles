//9. Write a Java program to convert a hash set to a List/ArrayList.  

import java.util.*;
class H9 {
  public static void main(String[] args) {
     HashSet<String> h = new HashSet<String>();
          h.add("C");
          h.add("C++");
          h.add("Java");
     List<String> list1 = new ArrayList<String>(h);
     System.out.println("After converting hashset to array list: "+ list1);
  }
}
