// concatenate arrays

import java.util.Arrays;
import java.util.Scanner;

public class concatenate_arrays {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1 = input.nextInt(), n2 = input.nextInt();
    int[] array1 = new int[n1], array2 = new int[n2];

    for (int i = 0; i < n1; i++) array1[i] = input.nextInt();
    for (int i = 0; i < n2; i++) array2[i] = input.nextInt();

    int aLen = array1.length;
    int bLen = array2.length;
    int[] result = new int[aLen + bLen];

    System.arraycopy(array1, 0, result, 0, aLen);
    System.arraycopy(array2, 0, result, aLen, bLen);

    System.out.println(Arrays.toString(result));

    input.close();
  }
}