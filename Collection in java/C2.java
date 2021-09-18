//2. Write a Java program to iterate through all elements in a array list.  


import java.util.*;
class c2
{
public static void main(String args[])
{
List<String> array1=new ArrayList<String>();
array1.add("Advance java");
array1.add("Operating System");
array1.add("Environmental studies");
array1.add("Advance Computer Network");
array1.add("Software Testing");
for(String a:array1){
System.out.println(a);
}
}
}
