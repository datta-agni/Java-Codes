// swapping two numbers using a temporary variable

import java.util.Scanner;

public class number_swap {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int first = input.nextInt();
    int second = input.nextInt();

    System.out.println("--Before swap--");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);

    // Value of first is assigned to temporary
    int temporary = first;

    // Value of second is assigned to first
    first = second;

    // Value of temporary (which contains the initial value of first) is assigned to
    // second
    second = temporary;

    System.out.println("--After swap--");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);
    input.close();
  }
}