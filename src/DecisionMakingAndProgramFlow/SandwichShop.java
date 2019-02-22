package DecisionMakingAndProgramFlow;

import java.util.Scanner;

public class SandwichShop {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int goalForVeggieSandwiches = 50;
    int goalForBurgers = 250;
    int goalForSubs = 180;
    int goalForSoup = 70;
    int veggieSandwichesSold, burgersSold, subsSold, soupSold;
    System.out.print("How many veggie sandwiches are sold today?");
    veggieSandwichesSold = keyboard.nextInt();
    if (veggieSandwichesSold >= goalForVeggieSandwiches) {
      System.out.println("Meets goal");
    } else {
      System.out.println("Fell short");
    }
    System.out.print("How many burgers are sold today? ");
    burgersSold = keyboard.nextInt();
    if (burgersSold >= goalForBurgers) {
      System.out.println("Meets goal");
    } else {
      System.out.println("Fell short");
    }
    System.out.print("How many subs are sold today?");
    subsSold = keyboard.nextInt();
    if (subsSold >= goalForSubs) {
      System.out.println("Meets goal");
    } else {
      System.out.println("Fell short");
    }
    System.out.print("How many soups are sold today?");
    soupSold = keyboard.nextInt();
    if (soupSold >= goalForSoup) {
      System.out.println("Meets goal");
    } else {
      System.out.println("Fell short");
    }

    if (veggieSandwichesSold >= goalForVeggieSandwiches
        && burgersSold >= goalForBurgers
        && subsSold >= goalForSubs
        && soupSold >= goalForSoup) {
      System.out.println("Made goal for everything!");
    }
  }
}
