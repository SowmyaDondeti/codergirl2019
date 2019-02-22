package MethodsPractice;

public class CalculatorMethods {
  public static int add(int a, int b) {
    // This works!
    return a + b;
  }

  public static int subtract(int a, int b) {
    // FIX the line below!
    return a - b;
  }

  public static int multiply(int a, int b) {
    // FIX the line below!
    return a * b;
  }

  public static float divide(int a, int b) {

    return (float) a / (float) b;
  }

  public static void main(String[] args) {
    // First we call the add function.
    // It takes two input parameters which are 5 and 7 here.
    // The return value of add(), which is 12,
    // gets saved in the variable x.
    int x = add(5, 7);
    // Then we print out the value of x in our print statement.
    System.out.println("5 plus 7 equals " + x);
    System.out.println("3 plus 4 equals " + add(3, 4));
    System.out.println("8 plus 6 equals " + add(8, 6));

    System.out.println("9 minus 4 equals " + subtract(9, 4));
    System.out.println("15 minus 2 equals " + subtract(15, 2));

    System.out.println("3 times 3 equals " + multiply(3, 3));
    System.out.println("8 times 8 equals " + multiply(8, 8));

    System.out.println("8 divided by 3 equals " + divide(8, 3));
    System.out.println("14 divided by 7 equals " + divide(14, 7));
    System.out.println("git test");
   
  }
}
