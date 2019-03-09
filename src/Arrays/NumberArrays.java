package Arrays;
public class NumberArrays {
  public static void main(String[] args) {
    int week1_temp[] = {65, 68, 72, 83, 73, 66, 85};
    int week2_temp[] = {86, 87, 85, 78, 79, 78, 80};
    String week_day[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    int sum1 = 0;
    int sum2 = 0;
    int big1 =0;
    int big2 =0;
    for (int index = 0; index < week1_temp.length; index++) {
      sum1 += week1_temp[index];
      sum2 += week2_temp[index];
    }
    float avg1 = (float) sum1 / week1_temp.length;
    float avg2 = (float) sum2 / week2_temp.length;
    System.out.println("The average daily high temperature for week1 is " + avg1);
    System.out.println("The average daily high temperature for week2 is " + avg2);
    String day = "";
    String day1="";
    for (int index=0;index<week1_temp.length;index++){
      if (big1<week1_temp[index]){
        big1 = week1_temp[index];
        day = week_day[index];
      }
    }
    for (int index=0;index<week2_temp.length;index++){
      if (big2<week2_temp[index]){
        big2 = week2_temp[index];
        day1 = week_day[index];
      }
    }

    System.out.println("In week1,"+day+" was warmest,at " + big1 + " degrees");

    System.out.println("In week2,"+day1+" was warmest,at " + big2 + " degrees");
  }
}
