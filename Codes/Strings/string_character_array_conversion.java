// Convert String to char array

import java.util.Arrays;
import java.util.Scanner;

public class string_character_array_conversion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String st = input.nextLine();
    char[] chars = st.toCharArray();
    System.out.println(Arrays.toString(chars));
    input.close();
  }
}
