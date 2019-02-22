package MethodsPractice;

public class LeapYear {
  public static void main(String[] args) {
    System.out.println("Testing your functions");
    int testFailures = 0;
    if (!isLeapYear(1600)) {
      System.out.println(
          "Error 1: isLeapYear failed test. Expected isLeapYear(1600) to be true,but got false.");
      testFailures++;
    }
    if (!isLeapYear(2000)) {
      System.out.println(
          "Error 2: isLeapYear failed test. Expected isLeapYear(2000) to be true,but got false.");
      testFailures++;
    }
    if (!isLeapYear(2400)) {
      System.out.println(
          "Error 3: isLeapYear failed test. Expected isLeapYear(2400) to be true,but got false.");
      testFailures++;
    }
    if (!isLeapYear(1988)) {
      System.out.println(
          "Error 4: isLeapYear failed test. Expected isLeapYear(1988) to be true,but got false.");
      testFailures++;
    }
    if (!isLeapYear(1996)) {
      System.out.println(
          "Error 5: isLeapYear failed test. Expected isLeapYear(1996) to be true,but got false.");
      testFailures++;
    }
    if (!isLeapYear(2004)) {
      System.out.println(
          "Error 6: isLeapYear failed test. Expected isLeapYear(2004) to be true,but got false.");
      testFailures++;
    }
    if (!isLeapYear(4000)) {
      System.out.println(
          "Error 7: isLeapYear failed test. Expected isLeapYear(4000) to be true,but got false.");
      testFailures++;
    }
    if (isLeapYear(1800)) {
      System.out.println(
          "Error 8: isLeapYear failed test. Expected isLeapYear(1800) to be true,but got false.");
      testFailures++;
    }
    if (isLeapYear(1900)) {
      System.out.println(
          "Error 9: isLeapYear failed test. Expected isLeapYear(1900) to be true,but got false.");
      testFailures++;
    }
    if (isLeapYear(2200)) {
      System.out.println(
          "Error 10: isLeapYear failed test. Expected isLeapYear(2200) to be true,but got false.");
      testFailures++;
    }
    if (isLeapYear(1987)) {
      System.out.println(
          "Error 11: isLeapYear failed test. Expected isLeapYear(1987) to be true,but got false.");
      testFailures++;
    }
    if (isLeapYear(1999)) {
      System.out.println(
          "Error 12: isLeapYear failed test. Expected isLeapYear(1999) to be true,but got false.");
      testFailures++;
    }
    if (isLeapYear(1900)) {
      System.out.println(
          "Error 13: isLeapYear failed test. Expected isLeapYear(1900) to be true,but got false.");
      testFailures++;
    }
    if (isLeapYear(2006)) {
      System.out.println(
          "Error 14: isLeapYear failed test. Expected isLeapYear(2006) to be true,but got false.");
      testFailures++;
    }
    if (testFailures == 0) {
      System.out.println("Success: All test cases passed");
    } else {
      System.out.println(testFailures + " tests failed. keep trying");
    }
  }

  public static boolean isLeapYear(int year) {
    if (year > 500 && year < 5000) {
      if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        return true;
      } else {
        return false;
      }
    }
    return true;
  }
}
