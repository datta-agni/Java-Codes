import java.util.Scanner;

public class caesar_cipher_decoder {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input the cipher_text message : ");
    String cipher_text = input.nextLine();
    System.out.println("Enter the shift value : ");
    int shift = input.nextInt();
    String decryptMessage = "";
    for (int i = 0; i < cipher_text.length(); i++) {
      // Shift one character at a time
      char alphabet = cipher_text.charAt(i);
      // if alphabet lies between a and z
      if (alphabet >= 'a' && alphabet <= 'z') {
        // shift alphabet
        alphabet = (char) (alphabet - shift);

        // shift alphabet lesser than 'a'
        if (alphabet < 'a') {
          // re-shift to starting position
          alphabet = (char) (alphabet - 'a' + 'z' + 1);
        }
        decryptMessage = decryptMessage + alphabet;
      }
      // if alphabet lies between A and Z
      else if (alphabet >= 'A' && alphabet <= 'Z') {
        // shift alphabet
        alphabet = (char) (alphabet - shift);

        // shift alphabet lesser than 'A'
        if (alphabet < 'A') {
          // re-shift to starting position
          alphabet = (char) (alphabet - 'A' + 'Z' + 1);
        }
        decryptMessage = decryptMessage + alphabet;
      } else
        decryptMessage = decryptMessage + alphabet;
    }
    System.out.println("Decrypted message : " + decryptMessage);
    input.close();
  }
}
