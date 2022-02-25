// multiplication of two numbers

import java.util.Scanner;

public class number_multiplication {
  public static void main(String[] args) {
    System.out.println("Enter two numbers");
    Scanner input = new Scanner(System.in);
    int first = input.nextInt(), second = input.nextInt();
    System.out.println(first + " " + second);
    // multiply two numbers
    int mul = first * second;
    System.out.println("The product is: " + mul);
    input.close();
  }
}
