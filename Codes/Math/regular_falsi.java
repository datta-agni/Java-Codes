import java.util.Scanner;

public class regular_falsi {
  /*
   * function to find root for
   */
  public double f(double x) {
    /*
     * make your own function here but accordingly change (s, t)
     */
    return Math.cos(x) - x * x * x;

    /*
     * return x * x * x - 3 * x + 4;
     * return Math.cos(x) - 3 * x + 1;
     * return 2 * x - Math.log(x)/Math.log(10) - 7;
     * return x * x - Math.log(x) - 12;
     */
  }

  /*
   * function to find root
   */
  public double findRoot(double s, double t, double e, int m) {
    double r = 0.0, fr;
    int n, side = 0;

    /*
     * starting values at endpoints of interval
     */
    double fs = f(s);
    double ft = f(t);

    for (n = 0; n < m; n++) {
      r = (fs * t - ft * s) / (fs - ft);
      if (Math.abs(t - s) < e * Math.abs(t + s))
        break;
      fr = f(r);

      if (fr * ft > 0) {
        /*
         * fr and ft have same sign, copy r to t
         */
        t = r;
        ft = fr;
        if (side == -1)
          fs /= 2;
        side = -1;
      } else if (fs * fr > 0) {
        /*
         * fr and fs have same sign, copy r to s
         */
        s = r;
        fs = fr;
        if (side == +1)
          ft /= 2;
        side = +1;
      } else {
        /*
         * fr * f_ very small (looks like zero)
         */
        break;
      }
    }
    return r;
  }

  /*
   * Main function *
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Regular Falsi Test: ");

    regular_falsi rf = new regular_falsi();
    /*
     * lower limit
     */
    System.out.println("Lower limit: ");
    double s = input.nextDouble();

    /*
     * upper limit
     */
    System.out.println("Upper limit: ");
    double t = input.nextDouble();

    /*
     * half of upper bound for relative error
     */
    System.out.println("Half of upper bound for relative error: ");
    double e = input.nextDouble();

    /*
     * number of iterations
     */
    System.out.println();
    int iterations = 100;

    System.out.println("\nRoot : " + rf.findRoot(s, t, e, iterations));
    input.close();
  }
}
