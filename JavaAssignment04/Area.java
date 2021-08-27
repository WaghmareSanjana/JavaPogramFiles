//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard


import java.util.*;
class Area
{
  int length,width;
  public static void main(String[] args)
  {
     int l,w;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the length and width rectangle="); 
     l=sc.nextInt();
     w=sc.nextInt();
     Area a=new Area(l,w);
    System.out.println("Area of Rectangle is :"+a.getArea());
  }
  Area(int l,int w)
  {
       length=l;
       width=w;
   }
  int getArea()
  {
        return(length*width);
  }
  
}
