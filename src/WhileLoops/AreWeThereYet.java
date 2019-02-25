package WhileLoops;

import java.util.Scanner;

public class areWeThereYet {
  public static void main(String[] args) {
    boolean keepGoing = true;
    while (keepGoing) {
      System.out.println("Are we there yet?");
      Scanner keyboard = new Scanner(System.in);
      String decision = keyboard.nextLine();
      if (decision.equals("yes")) {
        keepGoing = false;
        System.out.println("Yay!");
      } else if (decision.equals("no")) {
        keepGoing = true;
      } else {
        System.out.println("Huh i didn't understand.");
      }
    }
  }
}
