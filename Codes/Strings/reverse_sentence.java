import java.util.Scanner;

// reverse of a sentence
public class reverse_sentence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String sentence = input.nextLine();
    String reversed = reverse(sentence);

    System.out.println("The reversed sentence is: " + reversed);
    input.close();
  }

  public static String reverse(String sentence) {
    if (sentence.isEmpty())
      return sentence;

    return reverse(sentence.substring(1)) + sentence.charAt(0);
  }
}
