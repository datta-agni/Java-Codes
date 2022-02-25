import java.util.Scanner;

// matrix transpose
public class matrix_transpose {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF ROWS AND COLUMNS");

    int row = input.nextInt(), column = input.nextInt();
    int[][] matrix = new int[row][column];

    System.out.println("ENTER THE VALUE OF FIRST MATRIX");

    // input block for 1st matrix
    for (int i = 0; i < row; i++)
      for (int j = 0; j < column; j++) matrix[i][j] = input.nextInt();

    // Display current matrix
    display(matrix);

    // Transpose the matrix
    int[][] transpose = new int[column][row];

    for (int i = 0; i < row; i++)
      for (int j = 0; j < column; j++) transpose[j][i] = matrix[i][j];

    input.close();
    // Display transposed matrix
    display(transpose);
  }

  public static void display(int[][] matrix) {
    System.out.println("The matrix is: ");
    for (int[] row : matrix) {
      for (int column : row) System.out.print(column + "    ");
      System.out.println();
    }
  }
}
