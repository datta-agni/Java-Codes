import java.util.Scanner;

// decimal to octal conversion
public class decimal_octal_conversion {
  public static void main(String[] args) {
    System.out.println("ENTER ANY NUMBER");
    Scanner input = new Scanner(System.in);
    int decimal = input.nextInt(), octal = convertDecimalToOctal(decimal);

    input.close();
    System.out.printf("%d in decimal = %d in octal", decimal, octal);
  }

  public static int convertDecimalToOctal(int decimal) {
    int octalNumber = 0, i = 1;

    while (decimal != 0) {
      octalNumber += (decimal % 8) * i;
      decimal /= 8;
      i *= 10;
    }

    return octalNumber;
  }
}