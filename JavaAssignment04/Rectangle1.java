/* Create a class named 'Rectangle' with two data members- length and breadth and a function to
calculate the area which is 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas. */

class Rectangle{
    int length;
    int breadth;

    public Rectangle()
    {
        int length = 0;
        int breadth = 0;

    }

    public Rectangle(int lenght)
    {
        this.length = 3;
         breadth = 6;

    }
    public Rectangle(int length,int breadth)
    {
        this.length = 9;
        this.breadth = 7;
    }
    public void  m1()
    {
        System.out.println(length*breadth);
    }
}
public class Recatangle1{
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.m1();
        Rectangle obj1= new Rectangle(20);
        obj1.m1();
        Rectangle obj2 = new Rectangle(14,2);        
        obj2.m1();


    }
}