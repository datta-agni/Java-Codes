// current date and time in default format

import java.time.LocalDateTime;

public class display_current_date {
  public static void main(String[] args) {
    LocalDateTime current = LocalDateTime.now();

    System.out.println("Current Date and Time is: " + current);
  }
}