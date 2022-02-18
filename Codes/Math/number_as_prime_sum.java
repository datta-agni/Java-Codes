import java.util.Scanner;

// represent a number as sum of two prime numbers
public class number_as_prime_sum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER");

    int number = input.nextInt();
    boolean flag = false;

    for (int i = 2; i <= number / 2; ++i) {
      // condition for i to be a prime number
      if (checkPrime(i)) {
        // condition for n-i to be a prime number
        if (checkPrime(number - i)) {
          // n = primeNumber1 + primeNumber2
          System.out.printf("%d = %d + %d\n", number, i, number - i);
          flag = true;
        }
      }
    }

    if (!flag)
      System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
    input.close();
  }

  // Function to check prime number
  static boolean checkPrime(int num) {
    boolean isPrime = true;

    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }

    return isPrime;
  }
}