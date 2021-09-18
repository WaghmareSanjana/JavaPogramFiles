//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.  


import java.util.*;
class T4 {
  public static void main(String[] args) {
     TreeSet<String> t = new TreeSet<String>();
          t.add("Red");
          t.add("Green");
          t.add("Black");
     Iterator i = t.descendingIterator();
   
     while (i.hasNext()) {
        System.out.println(i.next());
     }
  }
}
