import java.util.Scanner;

// Milliseconds to Seconds/Minutes Using Mathematical Formula
public class time_unit_conversion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long milliseconds = input.nextLong();

    long seconds = (milliseconds / 1000);
    System.out.println(milliseconds + " Milliseconds = " + seconds + " Seconds");

    long minutes = (milliseconds / 1000) / 60;
    System.out.println(milliseconds + " Milliseconds = " + minutes + " Minutes");

    input.close();
  }
}
