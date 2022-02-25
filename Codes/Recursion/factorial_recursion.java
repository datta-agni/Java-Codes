import java.util.Scanner;

// factorial using recursion
public class factorial_recursion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER");

    long num = input.nextLong();
    long factorial = multiplyNumbers(num);

    input.close();
    System.out.println("Factorial of " + num + " = " + factorial);
  }

  public static long multiplyNumbers(long num) {
    if (num >= 1)
      return num * multiplyNumbers(num - 1);
    else
      return 1;
  }
}
