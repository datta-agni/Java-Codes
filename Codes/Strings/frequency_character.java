import java.util.Scanner;

// Find Frequency of Character
public class frequency_character {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();

    char ch = input.next().charAt(0);
    int frequency = 0;

    for (int i = 0; i < str.length(); i++) {
      if (ch == str.charAt(i))
        ++frequency;
    }

    System.out.println("Frequency of " + ch + " = " + frequency);
    input.close();
  }
}