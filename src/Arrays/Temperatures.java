package Arrays;

public class Temperatures {
  public static void main(String[] args) {
    temperatures();
  }
  public static void temperatures(){
    int[][] temps = {
            {68, 70, 76, 70, 68, 71, 75},
            {76, 76, 87, 84, 82, 75, 83},
            {73, 72, 81, 78, 76, 73, 77},
            {64, 65, 69, 68, 70, 74, 72}
    };
    int sum_of_7am = 0;
    int sum_of_3pm = 0;
    int sum_of_7pm = 0;
    int sum_of_3am = 0;
    int sum_of_sun = 0;
    int sum_of_mon =0;
    int sum_of_tue =0;
    int sum_of_wed =0;
    int sum_of_thu =0;
    int sum_of_fri =0;
    int sum_of_sat =0;
    int sum_of_all_week = 0;
    int count = 0;
    for (int i = 0; i < temps.length; i++) {
      for (int j = 0; j < temps[0].length; j++) {
        sum_of_all_week += temps[i][j];
        count++;
        if (i == 0) {
          sum_of_7am += temps[i][j];
        }else if (i==1){
          sum_of_3pm+=temps[i][j];
        }else if (i==2){
          sum_of_7pm+=temps[i][j];
        }else{
          sum_of_3am+=temps[i][j];
        }
        if (j==0){
          sum_of_sun+=temps[i][j];
        }else if (j==1){
          sum_of_mon+=temps[i][j];
        }else if (j==2){
          sum_of_tue+=temps[i][j];
        }else if (j==3){
          sum_of_wed+=temps[i][j];
        }else if (j==4){
          sum_of_thu+=temps[i][j];
        }else if (j==5){
          sum_of_fri+=temps[i][j];
        }else {
          sum_of_sat+=temps[i][j];
        }
      }
    }
    System.out.println("Average of 7AM is: "+(sum_of_7am/temps[0].length));
    System.out.println("Average of 3PM is: "+(sum_of_3pm/temps[1].length));
    System.out.println("Average of 7PM is: "+(sum_of_7pm/temps[2].length));
    System.out.println("Average of 3PM is: "+(sum_of_3am/temps[3].length)+"\n");
    System.out.println("Average of Sun is: "+(sum_of_sun)/temps.length);
    System.out.println("Average of Mon is: "+(sum_of_mon)/temps.length);
    System.out.println("Average of Tue is: "+(sum_of_tue)/temps.length);
    System.out.println("Average of Wed is: "+(sum_of_wed)/temps.length);
    System.out.println("Average of Thu is: "+(sum_of_thu)/temps.length);
    System.out.println("Average of Fri is: "+(sum_of_fri)/temps.length);
    System.out.println("Average of Sat is: "+(sum_of_sat)/temps.length);
    int avg_of_all_week = sum_of_all_week / count;
    System.out.println("Average of whole week is : " + avg_of_all_week);
  }
}
