// Take string from users and remove the white space

import java.util.Scanner;

public class whitespace_remover {
  public static void main(String[] args) {
    // create an object of Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string");

    // take the input
    String i = input.nextLine();
    System.out.println("Original String: " + i);

    // remove white spaces
    i = i.replaceAll("\\s", "");
    System.out.println("Final String: " + i);
    input.close();
  }
}
