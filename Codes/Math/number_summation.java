// summation of two numbers.

import java.util.Scanner;

public class number_summation {
  public static void main(String[] args) {
    System.out.println("Enter two numbers");
    Scanner input = new Scanner(System.in);
    int first = input.nextInt();
    int second = input.nextInt();
    System.out.println(first + " " + second);
    // add two numbers
    int sum = first + second;
    System.out.println("The sum is: " + sum);
    input.close();
  }
}
