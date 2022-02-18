import java.util.Scanner;

public class tower_of_hanoi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of disks: ");
    int number = input.nextInt();
    int steps = (int) Math.pow(2, number) - 1;
    System.out.println("Number of steps required: " + steps);
    hanoi(number, 'A', 'B', 'C');

    input.close();
  }

  private static void hanoi(int n, char rodFrom, char rodMiddle, char rodTo) {
    if (n == 1) {
      System.out.println("Disk 1 moved from " + rodFrom + " to " + rodTo);
      return;
    }

    // Move top n-1 disks from A to B using C as middle
    hanoi(n - 1, rodFrom, rodTo, rodMiddle);

    // Move last disk from A to C
    System.out.println("Disk " + n + " moved from " + rodFrom + " to " + rodTo);

    // Move n-1 disks from B to C using A as middle
    hanoi(n - 1, rodMiddle, rodFrom, rodTo);
  }
}