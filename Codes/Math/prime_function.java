import java.util.Scanner;

// prime number using function
public class prime_function {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER THE NUMBERS BETWEEN WHICH PRIME NUMBERS ARE TO BE FOUND");

    int low = input.nextInt(), high = input.nextInt();

    while (low < high) {
      if (checkPrimeNumber(low))
        System.out.print(low + " ");

      ++low;
    }

    input.close();
  }

  public static boolean checkPrimeNumber(int num) {
    boolean flag = true;

    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        flag = false;
        break;
      }
    }

    return flag;
  }
}
