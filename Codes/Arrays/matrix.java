import java.util.Scanner;

public class matrix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter number of matrix rows : ");
    int rows = input.nextInt();
    System.out.println("Please enter number of matrix columns : ");
    int columns = input.nextInt();

    // defining two dimensional array
    int[][] numbers = new int[rows][columns];

    // input matrix
    input_matrix(input, numbers, rows, columns);

    // printing 2d array as matrix
    display_matrix(numbers, rows, columns);
  }

  public static void input_matrix(Scanner scan, int[][] num, int rows, int columns) {
    System.out.println("Please enter elements in matrix : ");

    for (int a = 0; a < rows; a++) {
      for (int b = 0; b < columns; b++) {
        num[a][b] = scan.nextInt();
      }
    }
  }

  public static void display_matrix(int[][] num, int rows, int columns) {
    System.out.println("Printing matrix : ");

    for (int a = 0; a < rows; a++)
      for (int b = 0; b < columns; b++) System.out.print(num[a][b] + "\t");

    System.out.println();
  }
}
