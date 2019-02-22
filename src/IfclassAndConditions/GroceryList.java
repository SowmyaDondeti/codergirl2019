package IfclassAndConditions;

import java.util.Scanner;

public class GroceryList {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter three items in grocery list");
    String item1, item2, item3;
    System.out.print("Item1? ");
    item1 = keyboard.nextLine();
    System.out.print("Item2? ");
    item2 = keyboard.nextLine();
    System.out.print("Item3? ");
    item3 = keyboard.nextLine();
    System.out.println("Please enter the quantity of each item");
    int quantityOfItem1, quantityOfItem2, quantityOfItem3;
    System.out.print("How Many " + item1 + "? ");
    quantityOfItem1 = keyboard.nextInt();
    System.out.print("How Many " + item2 + "? ");
    quantityOfItem2 = keyboard.nextInt();
    System.out.print("How Many " + item3 + "? ");
    quantityOfItem3 = keyboard.nextInt();

    System.out.println("Please enter price of each item");
    float priceOfItem1, priceOfItem2, priceOfItem3;
    System.out.print("How much does one " + item1 + " cost? ");
    priceOfItem1 = keyboard.nextFloat();
    System.out.print("How much does one " + item2 + " cost? ");
    priceOfItem2 = keyboard.nextFloat();
    System.out.print("How much does one " + item3 + " cost? ");
    priceOfItem3 = keyboard.nextFloat();
    System.out.println("Calculating your grocery bill");
    float totalCost;
    totalCost =
        priceOfItem1 * (float) quantityOfItem1
            + priceOfItem2 * (float) quantityOfItem2
            + priceOfItem3 * (float) quantityOfItem3;
    System.out.println("Your total cost is " + totalCost);
  }
}
