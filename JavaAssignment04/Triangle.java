//3.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

class Triangle
{
    int a=3,b=4,c=5;
    public static void main(String[] args)
      {
             Triangle t=new Triangle();
             int per=(t.a+t.b+t.c);
             System.out.println("perimeter of Triangle is:"+per);
             int sp=(per/2);
             int ar=((((sp*(sp-t.a))*(sp-t.b))*(sp-t.c)));       
             int area=(int)Math.sqrt(ar);   
             System.out.println("Area of Triangle is:"+area);
      }
}