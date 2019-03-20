package Arrays;
public class NumberArrays {
  public static void main(String[] args) {
    int[] week1_temp = {65, 68, 72, 83, 73, 66, 85};
    int[] week2_temp = {86, 87, 85, 78, 79, 78, 80};
    String[] week_day={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    average(week1_temp);
    average(week2_temp);
    warmest(week1_temp,week_day);
    warmest(week2_temp,week_day);
  }
  private static void average(int[] week1_temp){
    int sum1 = 0;
    for (int index = 0; index < week1_temp.length; index++) {
      sum1 += week1_temp[index];

    }
    int  avg1 =  sum1 / week1_temp.length;
    System.out.println("The average daily high temperature for week is " + avg1);

  }
  private static void warmest(int[] week1_temp,String[] week_day){
    int big1 =0;

    String day = "";

    for (int index=0;index<week1_temp.length;index++){
      if (big1<week1_temp[index]){
        big1 = week1_temp[index];
        day = week_day[index];
      }
    }

    System.out.println("In this week,"+day+" was warmest,at " + big1 + " degrees");

  }
}
