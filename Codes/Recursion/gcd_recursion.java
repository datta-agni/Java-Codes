import java.util.Scanner;

// greatest common divisor using recursion
public class gcd_recursion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER TWO NUMBERS TO FIND GCD ");

    long n1 = input.nextLong(), n2 = input.nextLong();
    long hcf = hcf(n1, n2);

    System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
    input.close();
  }

  public static long hcf(long n1, long n2) {
    if (n2 != 0)
      return hcf(n2, n1 % n2);
    else
      return n1;
  }
}
