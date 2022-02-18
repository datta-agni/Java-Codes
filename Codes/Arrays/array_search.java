import java.util.Scanner;

// check if int array contains a given value
public class array_search {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int lim = input.nextInt(), toFind = input.nextInt();
    double[] num = new double[lim];
    boolean found = false;

    for (int i = 0; i < lim; i++) {
      num[i] = input.nextInt();
    }

    for (double n : num) {
      if (n == toFind) {
        found = true;
        break;
      }
    }

    if (found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found.");
    input.close();
  }
}