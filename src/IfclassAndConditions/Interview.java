package IfclassAndConditions;

import java.util.Scanner;

public class Interview {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int favouriteNumber;
    System.out.println("Hi. I'm going to ask you a few questions.");
    System.out.println("What's your name?");
    name = keyboard.next();

    System.out.println("Hi, " + name.toLowerCase() + " it's good to meet you.");
    System.out.println("Oops, did I forget to capitalize your name?\n");
    System.out.println("Hi, " + name.toUpperCase() + " it's good to meet you.");
    System.out.println("wait, that's not right either.\n");
    System.out.println("Hi, " + name + " it's good to meet you.\n");
    System.out.println("Your name has " + name.length() + " letters in it.");
    System.out.println("What's your favourite number?");

    favouriteNumber = keyboard.nextInt();
    if (favouriteNumber > 100) {
      System.out.println(favouriteNumber + "is a really big number!");
    } else {
      System.out.println("Here is a bar " + favouriteNumber + " x's long");
      for (int counter = 0; counter < favouriteNumber; counter++) {
        System.out.print("x");
      }
      System.out.println(" ");
      System.out.println("I hope it made you smile!");
    }
  }
}
