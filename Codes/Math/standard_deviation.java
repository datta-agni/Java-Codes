import java.util.Scanner;

// Program to Calculate Standard Deviation
public class standard_deviation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    double[] numArray = new double[n];

    for (int i = 0; i < n; i++) numArray[i] = input.nextInt();

    double SD = calculateSD(numArray);

    System.out.format("Standard Deviation = %.6f", SD);
    input.close();
  }

  public static double calculateSD(double[] numArray) {
    double sum = 0.0, standardDeviation = 0.0;
    int length = numArray.length;
    for (double num : numArray) sum += num;
    double mean = sum / length;
    for (double num : numArray) standardDeviation += Math.pow(num - mean, 2);
    return Math.sqrt(standardDeviation / length);
  }
}