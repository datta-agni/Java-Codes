import java.util.Scanner;

// lowest common divisor
public class lcm {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER");

    long n1 = input.nextLong(), n2 = input.nextLong(), gcd = 1;

    for (int i = 1; i <= n1 && i <= n2; ++i) {
      // Checks if i is factor of both integers
      if (n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }

    long lcm = (n1 * n2) / gcd;

    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
    input.close();
  }
}