package ForLoops;

import java.util.Scanner;

public class Mario
{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int height;
    System.out.println("How many levels?");
    boolean keepGoing = true;
    do {
      height = keyboard.nextInt();
      if (height < 0 || height > 23) {
        System.out.println("Enter a number that is no greater than 23");
      } else {
        mario(height);
        keepGoing = false;
      }
    } while (keepGoing);
  }

  public static void mario(int height) {
      for (int i = 1; i < height+1; i++) {
          for(int j=(height-i); j>=0; j--)
          {
              System.out.print(" ");
          }
          for (int j = 0; j <= i; j++) {
          System.out.print("#");
        }
        System.out.println();
    }
  }
}
// create # box
// make loop create correct numbers of #,but backwards
// use loop with spaces to turn pyramid correct direction
