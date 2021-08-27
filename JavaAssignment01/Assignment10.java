/* Write a program in java to convert temperature in Celsius to Fahrenheit.   
Sample Output:
Convert temperature in Celsius to Fahrenheit :
---------------------------------------------------
Input the temperature in Celsius : 35
The temperature in Celsius : 35
The temperature in Fahrenheit : 95
*/

import java.util.*; 
class Assignment10
{
   public static void main(String[] args) 
 {
   double celcius, fahrenheit;
   Scanner sc= new Scanner(System.in);
   System.out.println("Convert temperature in Celsius to Fahrenheit : ");
   System.out.println("--------------------------------------------------------- ");
   System.out.print("Input the temperature in Celsius : ");
   celcius= sc.nextDouble();
   System.out.println("The temperature in Celsius is : "+celcius);
   fahrenheit = celcius * 9.0/5.0 + 32;
   System.out.println("Temperature in Fahrenheit is : "+fahrenheit);

  }
}