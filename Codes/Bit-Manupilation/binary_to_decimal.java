import java.util.Scanner;

// binary to decimal conversion
public class binary_to_decimal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // binary number
    long num = input.nextLong();

    // call method by passing the binary number
    int decimal = convertBinaryToDecimal(num);

    System.out.println("Binary to Decimal");
    System.out.println(num + " = " + decimal);
    input.close();
  }

  public static int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;

    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }

    return decimalNumber;
  }
}