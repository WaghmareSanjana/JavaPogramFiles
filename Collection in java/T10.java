/*10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.  
*/


import java.util.*;
class T10 {
  public static void main(String[] args) {
   TreeSet <Integer>num = new TreeSet<Integer>();
   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
   num.add(65);
   num.add(50);
   num.add(2);
   System.out.println("Greater than or equal to 86 : "+num.ceiling(45));
   }    
}

