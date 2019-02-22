package IfclassAndConditions;

import java.util.Scanner;

public class Practice {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Weekdays Examples");

    System.out.println("Enter a number from 1 to 7");
    int dayNumber = keyboard.nextInt();

    String name = getDayName(dayNumber);
    System.out.println(
        "The " + dayNumber + getNumberTh(dayNumber) + " day of the week is " + name + ".");
  }

  public static String getNumberTh(int num) {
    if (num == 1) {
      return "st";
    } else if (num == 2) {
      return "nd";
    } else if (num == 3) {
      return "rd";
    } else if (num >= 4) {
      return "th";
    } else if (num == 0) {
      return "th";
    }
    return "";
  }

  public static String getDayName(int day) {
    String dayName = "unknown";
    if (day == 1) {
      dayName = "Sunday";
    } else if (day == 2) {
      dayName = "Monday";
    } else if (day == 3) {
      dayName = "Tuesday";
    } else if (day == 4) {
      dayName = "Wednesday";
    } else if (day == 5) {
      dayName = "Thursday";
    } else if (day == 6) {
      dayName = "Friday";
    } else if (day == 7) {
      dayName = "Saturday";
    }
    return dayName;
  }
}
