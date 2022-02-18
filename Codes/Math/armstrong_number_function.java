import java.util.Scanner;

// armstrong number using function
public class armstrong_number_function {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int low = input.nextInt(), high = input.nextInt();

    for (int number = low + 1; number < high; ++number) {
      if (checkArmstrong(number))
        System.out.print(number + " ");
    }
    input.close();
  }

  public static boolean checkArmstrong(int num) {
    int digits = 0;
    int result = 0;
    int originalNumber = num;

    // number of digits calculation
    while (originalNumber != 0) {
      originalNumber /= 10;
      ++digits;
    }

    originalNumber = num;

    // result contains sum of nth power of its digits
    while (originalNumber != 0) {
      int remainder = originalNumber % 10;
      result += Math.pow(remainder, digits);
      originalNumber /= 10;
    }

    return result == num;
  }
}