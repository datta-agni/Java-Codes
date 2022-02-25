import java.util.Scanner;

// string with spaces is empty or null
public class string_null_check {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // create a string with white spaces
    String str = input.nextLine();

    // check if str1 is null or empty
    System.out.println("str is " + isNullEmpty(str));
    input.close();
  }

  // method check if string is null or empty
  public static String isNullEmpty(String str) {
    // check if string is null
    if (str == null)
      return "NULL";

    // check if string is empty
    else if (str.trim().isEmpty())
      return "EMPTY";
    else
      return "neither NULL nor EMPTY";
  }
}
