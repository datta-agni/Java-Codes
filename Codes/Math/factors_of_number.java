// factors of a number

import java.util.Scanner;

public class factors_of_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER ANY POSITIVE NUMBER");

    // positive number
    int number = input.nextInt();

    System.out.print("Factors of " + number + " are: ");
    input.close();
    // loop runs from 1 to number
    for (int i = 1; i <= number; ++i) {
      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}