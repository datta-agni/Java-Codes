// get current date time in localized style

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class formatted_current_date_time {
  public static void main(String[] args) {
    LocalDateTime current = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    String formatted = current.format(formatter);

    System.out.println("Current Date is: " + formatted);
  }
}
