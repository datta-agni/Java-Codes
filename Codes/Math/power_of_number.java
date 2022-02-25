import java.util.Scanner;

// power of a number
public class power_of_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER");

    long base = input.nextLong(), exponent = input.nextLong();
    long result = 1;
    input.close();

    for (; exponent != 0; --exponent) result *= base;

    System.out.println("Answer = " + result);
  }
}
