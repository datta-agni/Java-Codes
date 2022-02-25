import java.util.Scanner;

// Program to Multiply Two Matrices using a Function
public class matrix_multiplication_function {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF ROWS AND COLUMNS");

    int r1 = input.nextInt(), c1 = input.nextInt();
    int r2 = input.nextInt(), c2 = input.nextInt();

    int[][] firstMatrix = new int[r1][c1];
    int[][] secondMatrix = new int[r2][c2];

    System.out.println("ENTER THE VALUE OF FIRST MATRIX");
    // input block for 1st matrix
    for (int i = 0; i < r1; i++)
      for (int j = 0; j < c1; j++) firstMatrix[i][j] = input.nextInt();

    System.out.println("ENTER THE VALUES OF SECOND MATRIX");
    // input block for second matrix
    for (int i = 0; i < r2; i++)
      for (int j = 0; j < c2; j++) secondMatrix[i][j] = input.nextInt();

    // multiplying Two matrices
    int[][] product = matrix_multiply(firstMatrix, secondMatrix, r1, c1, c2);

    // Displaying the result
    display_matrix(product);
    input.close();
  }

  public static int[][] matrix_multiply(
      int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
    int[][] product = new int[r1][c2];
    for (int i = 0; i < r1; i++)
      for (int j = 0; j < c2; j++)
        for (int k = 0; k < c1; k++) product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];

    return product;
  }

  public static void display_matrix(int[][] product) {
    System.out.println("Product of two matrices is: ");
    for (int[] row : product) {
      for (int column : row) System.out.print(column + "    ");
      System.out.println();
    }
  }
}
