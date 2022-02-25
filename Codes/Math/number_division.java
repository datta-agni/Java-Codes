// division of two numbers

import java.util.Scanner;

public class number_division {
  public static void main(String[] args) {
    System.out.println("Enter two numbers");
    Scanner input = new Scanner(System.in);
    int first = input.nextInt(), second = input.nextInt();
    System.out.println(first + " " + second);
    // quotient of two numbers
    int div = first / second;
    System.out.println("The quotient is: " + div);
    input.close();
  }
}
