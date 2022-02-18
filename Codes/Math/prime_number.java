import java.util.Scanner;

// prime number
public class prime_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER");

    int num = input.nextInt(), i = 2;
    boolean flag = false;

    while (i <= num / 2) {
      // condition for non prime number
      if (num % i == 0) {
        flag = true;
        break;
      }
      ++i;
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");

    input.close();
  }
}