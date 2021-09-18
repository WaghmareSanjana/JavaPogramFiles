//5. Write a Java program to insert the specified element at the specified position in the linked list.  
 

import java.util.*;
class L5 {
	public static void main(String[] args) {
		List <String> list1 = new LinkedList <String>();
		list1.add("c");
		list1.add("c++");
		list1.add("java");
		System.out.println("Before Inserting element in linked list:"+list1);
		list1.add(0, "python");
		System.out.println("After Inserting element in linked list:" + list1);
	}
}
