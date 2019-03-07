package ForLoops;

import java.util.Scanner;

public class MultiplicationTables {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How large would you like to see them?");
    int size = keyboard.nextInt();
    table(size);
  }
  public static void table(int size){
    if (size<=20){
      for (int i = 0; i <= size; i++) {
        for (int j = 0; j <= size; j++) {
          System.out.println(i + " * " + j + " = " + (i * j));
        }
      }
    }
  }
}
