import java.util.Scanner;

// greatest common divisor
public class gcd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1 = input.nextInt(), n2 = input.nextInt();

    // Always set to positive
    n1 = (n1 > 0) ? n1 : -n1;
    n2 = (n2 > 0) ? n2 : -n2;

    while (n1 != n2) {
      if (n1 > n2) {
        n1 -= n2;
      } else {
        n2 -= n1;
      }
    }

    System.out.println("GCD: " + n1);
    input.close();
  }
}
