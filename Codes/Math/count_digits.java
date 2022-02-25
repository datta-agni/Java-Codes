import java.util.Scanner;

// count the number of digits
public class count_digits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER ");

    int num = input.nextInt(), count = 0;
    input.close();
    // noinspection StatementWithEmptyBody
    for (; num != 0; num /= 10, ++count) {
    }

    System.out.println("Number of digits: " + count);
  }
}
