import java.util.Scanner;

// reverse of a number
public class reverse_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER");

    int num = input.nextInt(), reversed = 0;
    input.close();

    for (; num != 0; num /= 10) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}