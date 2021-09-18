//4. Write a Java program to iterate a linked list in reverse order.  


import java.util.*;
class L4 {
	public static void main(String[] args)
	{
	LinkedList<String> list1 = new LinkedList<>();
	list1.add("c");
	list1.add("c++");
	list1.add("java");
	Iterator<String> i =list1.descendingIterator();
	while (i.hasNext())
	{
           System.out.println(i.next());
	}
	}
}
