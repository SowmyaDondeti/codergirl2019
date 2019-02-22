import java.util.Scanner;

public class Apples {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int appleCount;
    System.out.println("How many apples are there?");
    appleCount = keyboard.nextInt();

    int appleCostInCents;
    System.out.println("How many cents each?");
    appleCostInCents = keyboard.nextInt();

    int priceInCents = appleCount * appleCostInCents;
    float priceInDollars = priceInCents / 100f;
    System.out.println("The order price is " + priceInDollars + " dollars");
    System.out.println("The order price is " + priceInCents + " cents");
  }
}
