package DoWhile;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Random num = new Random(2);

    do {

      System.out.println("I'm thinking of a number between 1 and 100. what is it?");
      int number = num.nextInt(100) + 1;
      System.out.println("Hint: " + number);
      boolean win = false;
      do{
      System.out.print("Guess:");
      int guess = keyboard.nextInt();
      keyboard.skip("\n");
      if (guess < 1 || guess > 100) {
        System.out.println("Oops! That number isn't between 1 and 100. Try again");
      } else if (guess > number) {
        System.out.println("My number is lower");
      } else if (guess < number) {
        System.out.println("My number is higher");
      } else {
        win=true;
      }
      }while (!win);
        System.out.println("you got it. my number was " + number);

        System.out.println("Play again?");


    } while (keyboard.nextLine().toLowerCase().contains("y"));
    System.out.println("BYE");
  }
}
