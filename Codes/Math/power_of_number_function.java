import java.util.Scanner;

// calculation of power a number using recursion
public class power_of_number_function {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER AND THE POWER OF THE NUMBER");

    long base = input.nextLong(), powerRaised = input.nextLong();
    long result = power(base, powerRaised);

    System.out.println(base + "^" + powerRaised + "=" + result);
    input.close();
  }

  public static long power(long base, long powerRaised) {
    if (powerRaised != 0) // recursive call to power()
      return (base * power(base, powerRaised - 1));
    else
      return 1;
  }
}
