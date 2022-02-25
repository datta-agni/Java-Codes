import java.util.Scanner;

/*Inverted half pyramid using *
* * * * *
* * * *
* * *
* *
*
Source Code
*/
public class inverted_half_pyramid {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int rows = input.nextInt();

    for (int i = rows; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) System.out.print("* ");
      System.out.println();
    }
    input.close();
  }
}