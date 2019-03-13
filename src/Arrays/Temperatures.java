package Arrays;

public class Temperatures {
  public static void main(String[] args) {
    int[][] temps = {
      {68, 70, 76, 70, 68, 71, 75},
      {76, 76, 87, 84, 82, 75, 83},
      {73, 72, 81, 78, 76, 73, 77},
      {64, 65, 69, 68, 70, 74, 72}
    };
    String[] week_day = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    String[] time = {"7 AM", "3 PM", "7 PM", "3 AM"};
    int sum0 = 0;
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    int sum4 = 0;
    int sum5 = 0;
    int sum6 = 0;
    int sum_of_time0 = 0;
    int sum_of_time1 = 0;
    int sum_of_time2 = 0;
    int sum_of_time3 = 0;
    for (int i = 0; i < 4; i++) {
      sum0 += temps[i][0];
      sum1 += temps[i][1];
      sum2 += temps[i][2];
      sum3 += temps[i][3];
      sum4 += temps[i][4];
      sum5 += temps[i][5];
      sum6 += temps[i][6];
    }
    for (int i = 0; i < 7; i++) {
      sum_of_time0 += temps[0][i];
      sum_of_time1 += temps[1][i];
      sum_of_time2 += temps[2][i];
      sum_of_time3 += temps[3][i];
    }
    int avg_of_0 = sum0 / temps.length;
    int avg_of_1 = sum1 / temps.length;
    int avg_of_2 = sum2 / temps.length;
    int avg_of_3 = sum3 / temps.length;
    int avg_of_4 = sum4 / temps.length;
    int avg_of_5 = sum5 / temps.length;
    int avg_of_6 = sum6 / temps.length;
    int avg_of_time0 = sum_of_time0 / temps[0].length;
    int avg_of_time1 = sum_of_time1 / temps[0].length;
    int avg_of_time2 = sum_of_time2 / temps[0].length;
    int avg_of_time3 = sum_of_time3 / temps[0].length;
    System.out.println(week_day[0] + " : " + avg_of_0);
    System.out.println(week_day[1] + " : " + avg_of_1);
    System.out.println(week_day[2] + " : " + avg_of_2);
    System.out.println(week_day[3] + " : " + avg_of_3);
    System.out.println(week_day[4] + " : " + avg_of_4);
    System.out.println(week_day[5] + " : " + avg_of_5);
    System.out.println(week_day[6] + " : " + avg_of_6 + "\n");
    System.out.println(time[0] + " : " + avg_of_time0);
    System.out.println(time[1] + " : " + avg_of_time1);
    System.out.println(time[2] + " : " + avg_of_time2);
    System.out.println(time[3] + " : " + avg_of_time3);

    int sum_of_all_week = 0;
    int count = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 7; j++) {
        sum_of_all_week += temps[i][j];
        count++;
      }
    }
    int avg_of_all_week = sum_of_all_week / count;
    System.out.println("Average of whole week is : " + avg_of_all_week);
  }
}
