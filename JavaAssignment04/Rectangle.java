//5.Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.


class Rectangle
{
   
   int len1=4,wid1=5,len2=5,wid2=8;
  public static void main(String[] args)
    {
            Rectangle r=new Rectangle();
            System.out.println("Area of First rectangle  is :"+r.Area(r.len1,r.wid1));
            System.out.println("Area of Second rectangle is :"+r.Area(r.len2,r.wid2));
     }
     int Area(int length,int width)
     {
               return(length*width);   
     }
} 
