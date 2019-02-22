package MethodsPractice;

public class PrettyDates {
  public static String formatNumberAsTwoDigits(int number) {
    if (number <= 9) {
      return "0" + number;
    } else {
      return String.valueOf(number);
    }
  }

  public static String formatYearAsTwoDigits(int number) {
    return formatNumberAsTwoDigits(number % 100);
  }

  public static String nameFormat(int year, int month, int day) {
    String monthName;
    switch (month) {
      case 1:
        monthName = "January";
        break;
      case 10:
        monthName = "October";
        break;
      case 12:
        monthName = "December";
        break;
      default:
        monthName = "You screwed up";
    }

    return monthName + " " + day + ", " + year;
  }

  public static String slashFormat(int year, int month, int day, String separator) {
    return formatNumberAsTwoDigits(month)
        + separator
        + formatNumberAsTwoDigits(day)
        + separator
        + year;
  }

  public static String format(int year, int month, int day) {
    return formatNumberAsTwoDigits(day)
        + "/"
        + formatNumberAsTwoDigits(month)
        + "/"
        + formatYearAsTwoDigits(year);
  }

  // don't change this code.
  public static void printDate(int year, int month, int day) {
    System.out.println(nameFormat(year, month, day));
    System.out.println(slashFormat(year, month, day, "/"));
    System.out.println(slashFormat(year, month, day, "-"));
    System.out.println(format(year, month, day));
    System.out.println();
  }

  // don't change this code.
  public static void main(String[] args) {
    System.out.println(formatNumberAsTwoDigits(3));
    System.out.println(formatNumberAsTwoDigits(9));
    System.out.println(formatNumberAsTwoDigits(10));
    System.out.println(formatNumberAsTwoDigits(12));
    printDate(2014, 10, 4);
    printDate(2015, 1, 1);
    printDate(2013, 12, 31);
  }
}
