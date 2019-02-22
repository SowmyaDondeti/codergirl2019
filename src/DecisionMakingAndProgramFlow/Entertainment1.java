package DecisionMakingAndProgramFlow;

import java.util.Scanner;

public class Entertainment1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("what is the weather like today? ");
    String weather = keyboard.next();
    if (!weather.equals("sunny") && !weather.equals("cloudy") && !weather.equals("rainy")) {
      System.out.println("your weather answer wasn't one of the options.");
    } else {
      System.out.print("What kind of mood are you in for activities? ");
      String mood = keyboard.next();

      if (!mood.equals("exercise") && !mood.equals("party") && !mood.equals("quiet")) {
        System.out.println("your mood wasn't one of the options");
      }
      if (weather.equals("sunny") && mood.equals("exercise")) {
        System.out.println("For exercise on a sunny day, try a brisk walk in a nature preserve.");
      } else if (weather.equals("sunny") && mood.equals("party")) {
        System.out.println("For a fun party on a sunny day, look for a street festival.");
      } else if (weather.equals("sunny") && mood.equals("quiet")) {
        System.out.println("A sunny day is a beautiful day to sit under a tree and read a book.");
      } else if (weather.equals("cloudy") && mood.equals("exercise")) {
        System.out.println(
            "For exercise on a cloudy day, the botanical gardens are a lovely walk.");
      } else if (weather.equals("cloudy") && mood.equals("party")) {
        System.out.println("For a fun party on a cloudy day, ride the paddle boats at the park.");
      } else if (weather.equals("cloudy") && mood.equals("quiet")) {
        System.out.println(
            "On a cloudy day, take a camera or paints to sketch the flowers at the lakeside.");
      } else if (weather.equals("rainy") && mood.equals("exercise")) {
        System.out.println("Giant indoor trampolines are a fun place to exercise on a rainy day.");
      } else if (weather.equals("rainy") && mood.equals("party")) {
        System.out.println("See if your friends are playing board games to pass a rainy day.");
      } else if (weather.equals("rainy") && mood.equals("quiet")) {
        System.out.println("A rainy day is a peaceful time to journal and daydream.");
      }
    }
  }
}
