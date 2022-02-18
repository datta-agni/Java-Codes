import java.util.Scanner;

// A to Z print
// a to z print
public class character_print {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER 1 IF YOU WANT TO PRINT CAPITAL LETTER, 2 IF YOU WANT SMALL LETTERS ");

    char c;
    int n = input.nextInt();
    input.close();

    if (n == 1) {
      for (c = 'A'; c <= 'Z'; ++c) System.out.print(c + " ");
    } else if (n == 2) {
      for (c = 'a'; c <= 'z'; ++c) System.out.print(c + " ");
    } else
      System.exit(0);
  }
}