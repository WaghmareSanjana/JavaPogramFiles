/*Question 18 :Write a program to print following :
*
**
***
****
*****
*/


class B19 {

  public static void main(String[] args) {
    int r=5,c;

    for (r = 1; r<=5; r++) {
      for (c = 1; c <= r;c++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}