package WhileLoops;

import java.util.Scanner;

public class addingMachine {
  public static void main(String[] args) {
    boolean keepgoing = true;
    System.out.println("Welcome to adding machine!");
    int total = 0;
    int count = 0;

    while (keepgoing) {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("add:");
      int add = keyboard.nextInt();
      total = total + add;
      System.out.println("total:" + total);
      count++;
      if (add == 0) {
        count--;
        keepgoing = false;
      }
    }
    System.out.println("you entered " + count + " numbers for a final total of " + total);
  }
}
