// subtraction of two numbers

import java.util.Scanner;

public class number_subtraction {
  public static void main(String[] args) {
    System.out.println("Enter two numbers");
    Scanner input = new Scanner(System.in);
    int first = input.nextInt();
    int second = input.nextInt();
    System.out.println(first + " " + second);
    // subtract two numbers
    int sub = first - second;
    System.out.println("The difference is: " + sub);
    input.close();
  }
}
