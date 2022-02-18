import java.util.Scanner;
// n'th Lucas Number

public class lucas_number {
  // Iterative function
  static int lucas(int n) {
    // declaring base values for positions 0 and 1
    int a = 2, b = 1, c, i;

    if (n == 0)
      return a;

    // generating number
    for (i = 2; i <= n; i++) {
      c = a + b;
      a = b;
      b = c;
    }
    return b;
  }

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter The Limit: ");
    int n = input.nextInt();
    System.out.println(lucas(n));
    input.close();
  }
}
