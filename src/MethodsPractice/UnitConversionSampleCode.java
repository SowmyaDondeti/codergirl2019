package MethodsPractice;

import java.util.Scanner;

public class UnitConversionSampleCode {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("How many gallons? ");
    float howManyGallons = keyboard.nextFloat();

    System.out.println(
        howManyGallons + " gallons is this many ounces: " + gallonsToOunces(howManyGallons));

    System.out.println("How many ounces? ");
    float howManyOunces = keyboard.nextFloat();

    System.out.println(
        howManyOunces + " ounces is " + ouncesToGallons(howManyOunces) + " gallons.");
    System.out.println(howManyOunces + " ounces is " + ouncesToQuarts(howManyOunces) + " quarts.");
    System.out.println(howManyOunces + " ounces is " + ouncesToPints(howManyOunces) + " pints.");
    System.out.println(howManyOunces + " ounces is " + ouncesToCups(howManyOunces) + " cups.");
  }

  public static float gallonsToOunces(float gallons) {
    return gallons * 128F;
  }

  public static float quartsToOunces(float quarts) {
    return quarts * 32F;
  }

  public static float pintsToOunces(float pints) {
    return pints * 16F;
  }

  public static float cupsToOunces(float cups) {
    return cups * 8F;
  }

  public static float ouncesToGallons(float ounces) {
    return ounces / 128F;
  }

  public static float ouncesToQuarts(float ounces) {
    return ounces / 32F;
  }

  public static float ouncesToPints(float ounces) {
    return ounces / 16F;
  }

  public static float ouncesToCups(float ounces) {
    return ounces / 8F;
  }
}
