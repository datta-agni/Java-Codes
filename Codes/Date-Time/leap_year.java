// program to check for a leap year.

import java.util.Scanner;

public class leap_year {
  public static void main(String[] args) {
    int year;
    System.out.println("Enter an Year :: ");
    Scanner input = new Scanner(System.in);
    year = input.nextInt();

    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
      System.out.println("Specified year is a leap year");
    else
      System.out.println("Specified year is not a leap year");
    input.close();
  }
}