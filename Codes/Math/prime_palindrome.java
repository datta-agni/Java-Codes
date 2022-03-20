public class prime_palindrome {
  public static void main(String[] args) {
    int startRange, endRange;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter start value");
    startRange = input.nextInt();

    System.out.println("Enter last value");
    endRange = input.nextInt();

    System.out.println("The PalPrime Numbers between" + startRange + " and " + endRange + "are: ");

    for (int i = startRange; i <= endRange; i++)
      if (checkPalPrimeNumber(i))
        System.out.println(i);
  }

  static boolean checkPalPrimeNumber(int number) {
    int temp, rem, i;
    int count = 0;
    int sum = 0;
    temp = number;

    for (i = 1; i <= temp; i++)
      if (temp % i == 0)
        count++;

    while (number > 0) {
      rem = number % 10;
      sum = sum * 10 + rem;
      number = number / 10;
    }

    if (temp == sum && count == 2)
      return true;
    else
      return false;
  }
}
