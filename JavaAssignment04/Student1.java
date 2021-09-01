/*Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of the Student class, then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating the object of the Student class. */

class student{
     String s;
    String name;
  public student(String s){
      name = s;
  }
  public student()
  {
      name = "unknown";
  }
}
public class student1{
    public static void main(String[] args) {
        
        student obj = new student();
        obj.s = "Vishi";
        
        System.out.println(obj.s);
        System.out.println(obj.name);

    }
}