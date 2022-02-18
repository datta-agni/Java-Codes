import java.util.Scanner;

// find the largest element in an array
public class largest_element {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    double[] numArray = new double[n];

    for (int i = 0; i < n; i++) {
      numArray[i] = input.nextInt();
    }

    double largest = numArray[0];

    for (double num : numArray) {
      if (largest < num)
        largest = num;
    }

    System.out.format("Largest element = %.2f", largest);
    input.close();
  }
}