import java.util.Scanner;

// Calculate Difference Between Two Time Periods
public class time_difference {
  int seconds;
  int minutes;
  int hours;

  public time_difference(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int h1 = input.nextInt(), h2 = input.nextInt();
    int m1 = input.nextInt(), m2 = input.nextInt();
    int s1 = input.nextInt(), s2 = input.nextInt();
    // create objects of Time class
    time_difference start = new time_difference(h1, m1, s1);
    time_difference stop = new time_difference(h2, m2, s2);
    time_difference diff;

    // call difference method
    diff = difference(start, stop);

    System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
    System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
    System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
    input.close();
  }

  public static time_difference difference(time_difference start, time_difference stop) {
    time_difference diff = new time_difference(0, 0, 0);

    // if start second is greater
    // convert minute of stop into seconds
    // and add seconds to stop second
    if (start.seconds > stop.seconds) {
      --stop.minutes;
      stop.seconds += 60;
    }

    diff.seconds = stop.seconds - start.seconds;

    // if start minute is greater
    // convert stop hour into minutes
    // and add minutes to stop minutes
    if (start.minutes > stop.minutes) {
      --stop.hours;
      stop.minutes += 60;
    }

    diff.minutes = stop.minutes - start.minutes;
    diff.hours = stop.hours - start.hours;

    // return the difference time
    return (diff);
  }
}
