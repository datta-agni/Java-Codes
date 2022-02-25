/* Pascal's Triangle
           1
         1   1
       1   2   1
     1   3   3    1
   1   4   6   4   1
 1   5   10   10  5   1
*/

import java.util.Scanner;

public class pascal_triangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("ENTER NUMBER OF ROWS IN PASCAL TRIANGLE");
    int rows = input.nextInt();

    System.out.println("ENTER THE COEFFICIENT FOR THE PASCAL'S TRIANGLE");
    int coefficient = 1;

    for (int i = 0; i < rows; i++) {
      for (int space = 1; space < rows - i; ++space) System.out.print("  ");

      for (int j = 0; j <= i; j++) {
        if (j == 0 || i == 0)
          coefficient = 1;
        else
          coefficient = coefficient * (i - j + 1) / j;

        System.out.printf("%4d", coefficient);
      }

      System.out.println();
    }
    input.close();
  }
}
