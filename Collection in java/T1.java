/*Java Collection: TreeSet Exercises 
1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.  
*/

import java.util.*;
class T1 {
  public static void main(String[] args) {
  TreeSet<String> t= new TreeSet<String>();
  t.add("red");
  t.add("black");
  t.add("blue");
  System.out.println(t);
 }
}
