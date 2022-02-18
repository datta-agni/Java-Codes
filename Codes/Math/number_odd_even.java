// program to check the number given is even ir odd

import java.util.Scanner;

public class number_odd_even {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    String even_odd = (num % 2 == 0) ? "even" : "odd";
    System.out.println(num + " is " + even_odd);
    input.close();
  }
}
