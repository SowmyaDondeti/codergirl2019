package Arrays;

public class Temperatures {
  public static void main(String[] args) {
    temperatures();
  }

  public static void temperatures() {
    int[][] temps = {
      {68, 70, 76, 70, 68, 71, 75},
      {76, 76, 87, 84, 82, 75, 83},
      {73, 72, 81, 78, 76, 73, 77},
      {64, 65, 69, 68, 70, 74, 72}
    };
    String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    String[] times = {"7AM", "3PM", "7PM", "3AM"};
    int[] timesSum = new int[4];
    int[] daysSum = new int[7];
    int avg_of_week = 0;
    int count = 0;
    for (int i = 0; i < temps.length; i++) {
      for (int j = 0; j < temps[0].length; j++) {
        avg_of_week += temps[i][j];
        count++;
        timesSum[i] += temps[i][j];
        daysSum[j] += temps[i][j];
      }
    }
    System.out.println("Average of whole week: " + avg_of_week / count);
    for (int i = 0; i < times.length; i++) {
      System.out.println(times[i] + " : " + timesSum[i] / temps[i].length);
    }
    for (int i = 0; i < days.length; i++) {
      System.out.println(days[i] + " : " + daysSum[i] / temps.length);
    }
  }
}
