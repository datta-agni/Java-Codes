import java.util.Scanner;

/* Program to print half pyramid using alphabets
A
B B
C C C
D D D D
E E E E E
*/
public class half_pyramid_string {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char last = input.next().charAt(0), alphabet = input.next().charAt(0);

    for (int i = 1; i <= (last - 'A' + 1); ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(alphabet + " ");
      }
      ++alphabet;

      System.out.println();
    }
    input.close();
  }
}