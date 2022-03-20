import java.util.Scanner;

public class linear_congruential_random_numbers {
  /*
   * Function to generate random numbers
   */
  static void linearCongruentialMethod(
      int Xo, int m, int a, int c, int[] randomNums, int noOfRandomNums) {
    /*
     * Initialize the seed state
     */
    randomNums[0] = Xo;

    /*
     * Traverse to generate required numbers of random numbers
     */
    for (int i = 1; i < noOfRandomNums; i++) randomNums[i] = ((randomNums[i - 1] * a) + c) % m;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    /*
     * Seed value
     */

    System.out.println("Enter the seed value: ");
    int Xo = input.nextInt();

    /*
     * Modulus parameter
     */

    System.out.println("Enter the modulus parameter: ");
    int m = input.nextInt();

    /*
     * Multiplier term
     */

    System.out.println("Enter the multiplier term: ");
    int a = input.nextInt();

    /*
     * Increment term
     */

    System.out.println("Enter the increment term: ");
    int c = input.nextInt();

    /*
     * Number of Random numbers to be generated
     */

    System.out.println("Enter the number of random numbers: ");
    int noOfRandomNums = input.nextInt();

    /*
     * To store random numbers
     */

    int[] randomNums = new int[noOfRandomNums];

    /*
     * Function Call
     */

    linearCongruentialMethod(Xo, m, a, c, randomNums, noOfRandomNums);

    /*
     * Print the generated random numbers
     */

    for (int i = 0; i < noOfRandomNums; i++) System.out.print(randomNums[i] + " ");

    input.close();
  }
}
