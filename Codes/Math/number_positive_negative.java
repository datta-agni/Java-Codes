// check a number is positive or negative

import java.util.Scanner;

public class number_positive_negative {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double number = input.nextInt();

    // true if number is less than 0
    if (number < 0.0)
      System.out.println(number + " is a negative number.");
    // true if number is greater than 0
    else if (number > 0.0)
      System.out.println(number + " is a positive number.");
    // if both test expression is evaluated to false
    else
      System.out.println(number + " is 0.");

    input.close();
  }
}
