import java.util.Scanner;

// Round a Number using format
public class rounding_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double num = input.nextDouble();
    System.out.format("%.4f", num);
    input.close();
  }
}
