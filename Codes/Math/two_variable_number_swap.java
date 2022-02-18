// swapping numbers without using temporary variable.

import java.util.Scanner;

public class two_variable_number_swap {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int first = input.nextInt();
    int second = input.nextInt();

    System.out.println("--Before swap--");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);
    // variable swap code
    first = first - second;
    second = first + second;
    first = second - first;

    System.out.println("--After swap--");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);

    input.close();
  }
}