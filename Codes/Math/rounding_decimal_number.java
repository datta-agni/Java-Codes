// Round a Number using DecimalFormat

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class rounding_decimal_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double num = input.nextDouble();
    DecimalFormat df = new DecimalFormat("#.###");
    df.setRoundingMode(RoundingMode.CEILING);
    System.out.println(df.format(num));
    input.close();
  }
}