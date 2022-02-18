import java.util.Scanner;

/*Inverted half pyramid using numbers
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
Source Code
*/
public class inverted_half_pyramid_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int rows = input.nextInt();

    for (int i = rows; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    input.close();
  }
}