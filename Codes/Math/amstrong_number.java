import java.util.Scanner;

// amstrong numbers
public class amstrong_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number = input.nextInt(), originalNumber, remainder, result = 0, n = 0;
    originalNumber = number;

    input.close();

    // noinspection StatementWithEmptyBody
    for (; originalNumber != 0; originalNumber /= 10, ++n) originalNumber = number;

    for (; originalNumber != 0; originalNumber /= 10) {
      remainder = originalNumber % 10;
      result += Math.pow(remainder, n);
    }

    if (result == number)
      System.out.println(number + " is an Armstrong number.");
    else
      System.out.println(number + " is not an Armstrong number.");
  }
}