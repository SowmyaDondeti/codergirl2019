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

      } else {
        keepGoing = false;
        System.out.println("Have a good day!");
      }
    } while (keepGoing);
  }

  public static void barChart(int number) {

    for (int i = 1; i <= number; i++) {
      System.out.print("#");
    }
    System.out.println(" ");
  }
}
