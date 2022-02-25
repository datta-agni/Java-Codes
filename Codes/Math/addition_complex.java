import java.util.Scanner;

// add two complex numbers
public class addition_complex {
  double real, img;

  public addition_complex(double real, double img) {
    this.real = real;
    this.img = img;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int r1 = input.nextInt(), r2 = input.nextInt(), c1 = input.nextInt(), c2 = input.nextInt();
    addition_complex n1 = new addition_complex(r1, c1), n2 = new addition_complex(r2, c2), temp;
    temp = add(n1, n2);

    System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.img);
    input.close();
  }

  public static addition_complex add(addition_complex n1, addition_complex n2) {
    addition_complex temp = new addition_complex(0.0, 0.0);

    temp.real = n1.real + n2.real;
    temp.img = n1.img + n2.img;

    return (temp);
  }
}
