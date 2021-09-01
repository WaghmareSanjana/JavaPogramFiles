/*Write an efficient java program to test if two given String is a rotation of each other or not, e.g. if the given String is "XYZ" and "ZXY" then your function should return true, but if the input is "XYZ" and "YXZ" then return false.

Sample Output:
Enter original String : XYZ
Enter rotation of String : ZXY
XYZ and ZXY are rotation of each other */

import java.util.Scanner;
public class String5{

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter original String : ");
    String input = sc.nextLine();

    System.out.print("Enter rotation of String : ");
    String rotation = sc.nextLine();

    if (checkRotatation(input, rotation)) {
      System.out.println(input + " and " + rotation
          + " are rotation of each other");
    } else {
      System.out.println("They are not rotation of another");
    }

    sc.close();
  }
  
  public static boolean
   checkRotatation(String original, String rotation) {
    if (original.length() != rotation.length()) {
      return false;
    }

    String concatenated = original + original;

    if (concatenated.indexOf(rotation) != -1) {
      return true;
    }

    return false;
  }
}
