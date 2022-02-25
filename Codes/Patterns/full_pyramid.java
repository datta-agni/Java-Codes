import java.util.Scanner;

/* Program to print full pyramid using *
 *
 * * *
 * * * * *
 * * * * * * *
 * * * * * * * * *
 */
public class full_pyramid {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int rows = input.nextInt(), k = 0;

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) System.out.print("  ");

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
    input.close();
  }
}
