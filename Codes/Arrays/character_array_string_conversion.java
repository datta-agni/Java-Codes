// conversion of char array to string

import java.util.Scanner;

public class character_array_string_conversion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF ELEMENTS");

    int n = input.nextInt();
    char[] ch = new char[n];

    for (int i = 0; i < n; i++) {
      ch[i] = input.next().charAt(0);
    }

    String st = String.valueOf(ch);
    String st2 = new String(ch);

    System.out.println(st);
    System.out.println(st2);
    input.close();
  }
}