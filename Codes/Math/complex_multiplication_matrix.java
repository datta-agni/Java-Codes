import java.util.Scanner;

public class complex_multiplication_matrix {
  private double real = 0.0, img = 0.0;
  public complex_multiplication_matrix(double real, double img) {
    this.real = real;
    this.img = img;
  }
  public complex_multiplication_matrix() {
    this.real = 0;
    this.img = 0;
  }

  public complex_multiplication_matrix complex_Form(double re, double im) {
    complex_multiplication_matrix res = new complex_multiplication_matrix();
    res.real = re;
    res.img = im;
    return res;
  }
  public complex_multiplication_matrix multiplication(complex_multiplication_matrix C2) {
    complex_multiplication_matrix Res = new complex_multiplication_matrix();
    Res.real = (this.real * C2.real) - (this.img * C2.img);
    Res.img = (this.real * C2.img) + (this.img * C2.real);
    return Res;
  }
  public complex_multiplication_matrix addtion(complex_multiplication_matrix C2) {
    complex_multiplication_matrix Res = new complex_multiplication_matrix();
    this.real += C2.real;
    this.img += C2.img;
    Res.real = this.real;
    Res.img = this.img;
    return Res;
  }
  public complex_multiplication_matrix[][] matrix_multiplication(
      complex_multiplication_matrix[][] a, complex_multiplication_matrix[][] b,
      complex_multiplication_matrix[][] res, int n) {
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        for (int k = 0; k < n; k++) res[i][j] = res[i][j].addtion(a[i][k].multiplication(b[k][j]));
    return res;
  }
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the dimension of the square matrix: ");
    int n = input.nextInt();
    double re, im;
    complex_multiplication_matrix[][] a = new complex_multiplication_matrix[n][n];
    complex_multiplication_matrix[][] b = new complex_multiplication_matrix[n][n];
    complex_multiplication_matrix[][] res = new complex_multiplication_matrix[n][n];
    complex_multiplication_matrix C = new complex_multiplication_matrix();

    System.out.println("Enter the complex elements of 1st matrix: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        re = input.nextDouble();
        im = input.nextDouble();
        a[i][j] = C.complex_Form(re, im);
      }
    }

    System.out.println("Enter the complex elements of matrix: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        re = input.nextDouble();
        im = input.nextDouble();
        b[i][j] = C.complex_Form(re, im);
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        re = 0.0;
        im = 0.0;
        res[i][j] = C.complex_Form(re, im);
      }
    }

    res = C.matrix_multiplication(a, b, res, n);
    System.out.println("The Multiplication is:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) System.out.print(res[i][j].real + "+" + res[i][j].img + "i ");
      System.out.println();
    }
    input.close();
  }
}
