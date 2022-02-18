import java.util.Scanner;

// prime number between n1 to n2
public class prime_numbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int low = input.nextInt(), high = input.nextInt();

    while (low < high) {
      boolean flag = false;

      for (int i = 2; i <= low / 2; ++i) {
        // condition for non prime number
        if (low % i == 0) {
          flag = true;
          break;
        }
      }

      if (!flag && low != 0 && low != 1)
        System.out.print(low + " ");

      ++low;
    }

    input.close();
  }
}