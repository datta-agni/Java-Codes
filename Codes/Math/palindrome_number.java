import java.util.Scanner;

// palindrome number
public class palindrome_number {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER");

    long num = input.nextLong(), reversedNum = 0, remainder;

    // store the number to originalNum
    long originalNum = num;

    // get the reverse of originalNum
    // store it in variable
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }

    // check if reversedNum and originalNum are equal
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    } else {
      System.out.println(originalNum + " is not Palindrome.");
    }
    input.close();
  }
}