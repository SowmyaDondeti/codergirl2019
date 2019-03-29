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
    System.out.println("Temperature Calculator");
    System.out.println();
    System.out.println("The data provided are:");
    int[] timesSum = new int[4];
    int[] daysSum = new int[7];
    int sum_of_week = 0;
    int count = 0;
    System.out.print("     ");
    for (int j=0;j<days.length;j++){
      System.out.print(days[j]+" ");
    }
    System.out.println();
    for (int i = 0; i < temps.length; i++) {
      System.out.print(times[i] + " : ");
      for (int j = 0; j < temps[0].length; j++) {
        System.out.print(temps[i][j]);
        if (j < temps[0].length - 1) {
          System.out.print(", ");
        }
        sum_of_week += temps[i][j];
        count++;
        timesSum[i] += temps[i][j];
        daysSum[j] += temps[i][j];
      }
      System.out.println();
    }
    System.out.println();
    System.out.println(
        "Based on that data , the following are the average temperatures for the week. \n");
    for (int i = 0; i < days.length; i++) {
      System.out.println(days[i] + " : " + daysSum[i] / temps.length);
    }
    System.out.println();
    for (int i = 0; i < times.length; i++) {
      System.out.println(times[i] + " : " + timesSum[i] / temps[i].length);
    }
    System.out.println();
    System.out.println("The final average temperature for the week was: \n");
    System.out.println("Overall: " + sum_of_week / count);
  }
}
