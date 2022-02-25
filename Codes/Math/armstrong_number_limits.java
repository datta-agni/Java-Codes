import java.util.Scanner;

// armstrong numbers from n1 to n2
public class armstrong_number_limits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int low = input.nextInt(), high = input.nextInt();

    for (int number = low + 1; number < high; ++number) {
      int digits = 0, result = 0, originalNumber = number;

      // number of digits calculation
      while (originalNumber != 0) {
        originalNumber /= 10;
        ++digits;
      }

      originalNumber = number;

      // result contains sum of nth power of its digits
      while (originalNumber != 0) {
        int remainder = originalNumber % 10;
        result += Math.pow(remainder, digits);
        originalNumber /= 10;
      }

      if (result == number)
        System.out.print(number + " ");

      input.close();
    }
  }
}
