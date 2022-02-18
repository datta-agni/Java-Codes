// conversion of string to date using predefined formatters

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class date_formatting {
  public static void main(String[] args) {
    // Format y-M-d or yyyy-MM-d
    Scanner input = new Scanner(System.in);
    String string = input.nextLine();
    LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
    input.close();
    System.out.println(date);
  }
}