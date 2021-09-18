//6. Write a Java program to insert elements into the linked list at the first and last position.  


import java.util.LinkedList;
class L6 {
  public static void main(String[] args) {
     LinkedList<String> list1= new LinkedList<String>();
          list1.add("c");
          list1.add("c++");
          list1.add("c#");
     System.out.println("Before Inserting element in linked list:" +list1);   
    list1.addFirst("PHP");
     System.out.println("After Inserting elemnet in linked list:" + list1);  
 }
}
