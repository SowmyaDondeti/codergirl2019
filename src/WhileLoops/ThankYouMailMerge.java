package WhileLoops;

import java.util.Scanner;

public class ThankYouMailMerge
{
  public static void main(String[] args) {
    boolean keepGoing = true;
    System.out.println("----Thank You Letters---");
    while (keepGoing) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter person name");
      String personName = keyboard.nextLine();
      if (!personName.equals("quit")) {
        System.out.println("Enter donation amount");
        float amount = keyboard.nextFloat();
        keyboard.skip("\n");
        System.out.println("Dear " + personName + ",\n");
        System.out.println(
            "Thank you for your donation! We rely on donors like you to keep our \norganization effective, and you came through for us. Your donation of $"
                + amount
                + "\nwill help our efforts to make a difference in the world. \n");
        System.out.println(
            "As you may know, we are a registered non-profit organization, so your \ndonation is tax deductible. You may use this letter as a receipt for tax\n"
                + "purposes.\n\n"
                + "Thank you again for your support!\n\n"
                + "Sincerely, \nPaula Jones \nYourCharity.org");
      } else {
        keepGoing = false;
      }
    }
  }
}
