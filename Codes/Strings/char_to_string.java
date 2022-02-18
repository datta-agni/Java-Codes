import java.util.Scanner;

// conversion of char to string
public class char_to_string {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    char ch = input.next().charAt(0);
    String st = Character.toString(ch);
    /*
     * alternatively, st = String.valueOf(ch);
     */

    System.out.println("The string is: " + st);
    input.close();
  }
}