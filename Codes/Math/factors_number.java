import java.util.Scanner;

// factors of a number
public class factors_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // positive number
    int number = input.nextInt();

    input.close();
    System.out.print("Factors of " + number + " are: ");

    // loop runs from 1 to 60
    for (int i = 1; i <= number; ++i) {
      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}