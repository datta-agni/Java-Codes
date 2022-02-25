import java.util.Scanner;

public class caesar_cipher_encoder {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input the plaintext message : ");
    String plain_text = input.nextLine();
    System.out.println(
        "Enter the value by which each character in the plaintext message gets shifted : ");
    int shift = input.nextInt();
    String cipher_text = "";
    char alphabet;
    for (int i = 0; i < plain_text.length(); i++) {
      // Shift one character at a time
      alphabet = plain_text.charAt(i);

      // if alphabet lies between a and z
      if (alphabet >= 'a' && alphabet <= 'z') {
        // shift alphabet
        alphabet = (char) (alphabet + shift);
        // if shift alphabet greater than 'z'
        if (alphabet > 'z') {
          // re-shift to starting position
          alphabet = (char) (alphabet + 'a' - 'z' - 1);
        }
        cipher_text = cipher_text + alphabet;
      }

      // if alphabet lies between 'A' and 'Z'
      else if (alphabet >= 'A' && alphabet <= 'Z') {
        // shift alphabet
        alphabet = (char) (alphabet + shift);

        // if shift alphabet greater than 'Z'
        if (alphabet > 'Z') {
          // re-shift to starting position
          alphabet = (char) (alphabet + 'A' - 'Z' - 1);
        }
        cipher_text = cipher_text + alphabet;
      } else
        cipher_text = cipher_text + alphabet;
    }
    System.out.println("Encoded Message : " + cipher_text);
    input.close();
  }
}