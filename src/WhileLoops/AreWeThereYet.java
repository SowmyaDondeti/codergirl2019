package WhileLoops;

import java.util.Scanner;

public class AreWeThereYet
{
  public static void main(String[] args) {
    boolean keepGoing = true;
    while (keepGoing) {
      System.out.println("Are we there yet?");
      Scanner keyboard = new Scanner(System.in);
      String decision = keyboard.nextLine();
      if (decision.equals("yes")) {
        keepGoing = false;

      } else if (!decision.equals("no")) {

        System.out.println("Huh i didn't understand.");

    }
  }
    System.out.println("Yay!");
}}