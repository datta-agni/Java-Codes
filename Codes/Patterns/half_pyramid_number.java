/*Program to print half pyramid a using numbers
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
Source Code
*/

import java.util.Scanner;

public class half_pyramid_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int rows = input.nextInt();
    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) System.out.print(j + " ");
      System.out.println();
    }
    input.close();
  }
}