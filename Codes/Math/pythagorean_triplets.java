import java.util.Scanner;

public class pythagorean_triplets {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
    boolean n = isPythagoreanTriple(a, b, c);
    if (n == true)
      System.out.println("It is a Pythagorean Triplet.");
    else
      System.out.println("It is not a Pythagorean Triplet.");
    input.close();
  }

  /**
   * Check if a,b,c are a Pythagorean Triple
   */
  public static boolean isPythagoreanTriple(int a, int b, int c) {
    if (a <= 0 || b <= 0 || c <= 0) {
      return false;
    } else {
      return (a * a) + (b * b) == (c * c);
    }
  }
}
