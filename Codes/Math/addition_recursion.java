import java.util.Scanner;

// addition of numbers from to n using recursion
public class addition_recursion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int sum = addNumbers(number);
    System.out.println("Sum = " + sum);
    input.close();
  }

  public static int addNumbers(int num) {
    if (num != 0)
      return num + addNumbers(num - 1);
    else
      return num;
  }
}
