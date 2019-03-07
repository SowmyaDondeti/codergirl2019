package DoWhile;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    boolean startGame = true;
    Random num = new Random(2);
    int number;
    int guessNum = 0;
    do {
      if (startGame) {
        guessNum = num.nextInt(100)+1;
        System.out.println("I'm thinking of a number between 1 and 100. what is it?");
        startGame = false;
      }

      Scanner keyboard = new Scanner(System.in);
      System.out.print("Guess:");
      number = keyboard.nextInt();
      if (number < 1 || number > 100) {
        System.out.println("Oops! That number isn't between 1 and 100. Try again");
      } else if (number > guessNum) {
        System.out.println("My number is lower");
      } else if (number < guessNum) {
        System.out.println("My number is higher");
      } else {
        System.out.println("you got it. my number was " + guessNum);
        System.out.println("Play again?");
        keyboard.skip("\n");
        String userInput = keyboard.nextLine();
        if (userInput.equals("yes")){
            number = 0;
            startGame = true;
        }
      }

    } while (number != guessNum);
  }
}
