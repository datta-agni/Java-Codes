import java.util.Scanner;

// Program to Add Two Matrices
public class matrix_addition {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF ROWS AND COLUMNS");

    int rows = input.nextInt(), columns = input.nextInt();

    int[][] firstMatrix = new int[rows][columns];
    int[][] secondMatrix = new int[rows][columns];

    System.out.println("ENTER THE VALUE OF FIRST MATRIX");
    // input block for 1st matrix
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < columns; j++) {
        firstMatrix[i][j] = input.nextInt();
      }

    System.out.println("ENTER THE VALUES OF SECOND MATRIX");
    // input block for second matrix
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < columns; j++) {
        secondMatrix[i][j] = input.nextInt();
      }

    // adding two matrices
    int[][] sum = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
      }
    }

    // displaying the result
    System.out.println("Sum of two matrices is: ");
    for (int[] row : sum) {
      for (int column : row) {
        System.out.print(column + "    ");
      }
      System.out.println();
    }
    input.close();
  }
}