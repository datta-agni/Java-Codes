// get current date time using predefined constants

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class display_current_predefined_formatted_date {
  public static void main(String[] args) {
    LocalDateTime current = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
    String formatted = current.format(formatter);

    System.out.println("Current Date is: " + formatted);
  }
}
