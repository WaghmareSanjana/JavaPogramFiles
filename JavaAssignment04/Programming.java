/* Create a class named 'Programming'. While creating an object of the class, 
if nothing is passed to it, then the message "I love programming languages" should be printed. 
If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
For example, while creating the object if we pass "cpp", then "I love cpp" should be printed. */

import java.util.*;

class Programming{
     String ss;
    String name ;
    public Program(String ss)
    {
        name = ss;
    }
    public Program(){
        name = "I love programming languages ";
    }
        }
public class Programming {
    public static void main(String[] args) {
        Program obj = new Program();
        obj.ss = "C++";
        System.out.println("I love " + obj.ss);
        System.out.println(obj.name);

    }
}