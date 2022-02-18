// Fibonacci Series up to nth term.

import java.util.Scanner;

public class fibonacci_series {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("ENTER THE LIMIT OF THE FIBONACCI SERIES");
    int i = 0, n = input.nextInt(), firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");
    input.close();

    while (i <= n) {
      System.out.print(firstTerm + ", ");
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
      i++;
    }
  }
}
