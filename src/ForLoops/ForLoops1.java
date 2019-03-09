package ForLoops;

import java.util.Scanner;

public class ForLoops1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How big of a number should I count to?");
    int input = keyboard.nextInt();
    for (int i=1;i<=input;i++){
      System.out.print(i+" ");
    }
      System.out.println(" ");
    for (int i = input;i>=1;i--){
      System.out.print(i+" ");
    }
  }
}
