// sum of natural numbers 1+2+.....+n

import java.util.Scanner;

public class natural_number_sum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt(), i = 1, sum = 0;

    while (i <= num) {
      sum += i;
      i++;
    }

    System.out.println("Sum = " + sum);
    input.close();
  }
}