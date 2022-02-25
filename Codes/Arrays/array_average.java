import java.util.Scanner;

// calculate average using arrays
public class array_average {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    double[] numArray = new double[n];
    double sum = 0.0;

    for (int i = 0; i < n; i++) numArray[i] = input.nextDouble();
    for (double num : numArray) sum += num;

    double average = sum / numArray.length;
    System.out.format("The average is: %.2f", average);

    input.close();
  }
}