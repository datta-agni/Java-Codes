import java.util.Scanner;

// multiplication table
public class multiplication_table {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    for (int i = 1; i <= 100; ++i) System.out.printf("%d * %d = %d \n", num, i, num * i);
    input.close();
  }
}
