import java.util.Scanner;

// binary to octal conversion
public class binary_to_octal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    long binary = input.nextLong();
    int octal = convertBinarytoOctal(binary);

    System.out.println(binary + " in binary = " + octal + " in octal");
    input.close();
  }

  public static int convertBinarytoOctal(long binaryNumber) {
    int octalNumber = 0, decimalNumber = 0, i = 0;

    while (binaryNumber != 0) {
      decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
      ++i;
      binaryNumber /= 10;
    }

    i = 1;

    while (decimalNumber != 0) {
      octalNumber += (decimalNumber % 8) * i;
      decimalNumber /= 8;
      i *= 10;
    }

    return octalNumber;
  }
}