package ForLoops;

import java.util.Scanner;

public class ForLoops2 {
  public static void main(String[] args) {
    int number;
    boolean keepGoing = true;
    do {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("number? ");
      number = keyboard.nextInt();
      if (number != 0) {
        barChart(number);
        number = 0;
      } else {
        keepGoing = false;
      }
    } while (keepGoing);
  }

  public static void barChart(int number) {

    for (int i = 1; i <= number; i++) {
      System.out.print("#");
    }
    System.out.println("");
  }
}
