//8.Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.


import java.util.*;
class Average{

 public static void main(String[] args)
    {
	int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three number: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        System.out.print("average of three numbers entered by user:: " + calculate(x, y, z)+"\n" );
    }

  public static int  calculate(int x, int y, int z)
    {
        return (x+ y + z) / 3;
    }
}
