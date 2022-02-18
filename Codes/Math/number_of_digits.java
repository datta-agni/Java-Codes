import java.util.Scanner;

/** Find the number of digits in a number. */
public class number_of_digits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numbers = input.nextInt();
    int i = 0;
    assert numberOfDigits(numbers) == i + 1;
    assert numberOfDigitsFast(numbers) == i + 1;
    assert numberOfDigitsFaster(numbers) == i + 1;
    assert numberOfDigitsRecursion(numbers) == i + 1;
    input.close();
  }

  /**
   * Find the number of digits in a number.
   */
  private static int numberOfDigits(int number) {
    int digits = 0;
    do {
      digits++;
      number /= 10;
    } while (number != 0);
    return digits;
  }

  /**
   * Find the number of digits in a number fast version.
   *
   * @param number number to find
   * @return number of digits of given number
   */
  private static int numberOfDigitsFast(int number) {
    return number == 0 ? 1 : (int) Math.floor(Math.log10(Math.abs(number)) + 1);
  }

  /**
   * Find the number of digits in a number faster version.
   */
  private static int numberOfDigitsFaster(int number) {
    return number < 0 ? (-number + "").length() : (number + "").length();
  }

  /**
   * Find the number of digits in a number using recursion.
   *
   */
  private static int numberOfDigitsRecursion(int number) {
    return number / 10 == 0 ? 1 : 1 + numberOfDigitsRecursion(number / 10);
  }
}
