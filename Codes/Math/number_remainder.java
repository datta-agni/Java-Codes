// remainder of two numbers.

import java.util.Scanner;

public class number_remainder {
  public static void main(String[] args) {
    System.out.println("Enter two numbers");
    Scanner input = new Scanner(System.in);
    int first = input.nextInt();
    int second = input.nextInt();
    System.out.println(first + " " + second);
    // find th remainder of two numbers
    int rem = first + second;
    System.out.println("The remainder is: " + rem);
    input.close();
  }
}
