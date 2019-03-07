package ForLoops;
import java.util.Scanner;

public class MultiplicationTablesGrid {

      public static void main(String[] args) {
          Scanner keyboard = new Scanner(System.in);
          int number = keyboard.nextInt();
          forLoop(number);
          System.out.print("    ");
          for (int i=0;i<=number;i++){
              System.out.print("    ");
          }
          System.out.println();
          for (int i=0;i<=number;i++){
              System.out.print(align(i)+" ");
              for (int j=0;j<=number;j++){
                  System.out.print(align(i*j)+" ");
              }
              System.out.println();
          }
      }

      public static String align(int x) {
          String s;
          if (x < 10) {
              s = "  " + x;
          } else if (x < 100) {
              s = " " + x;
          } else {
              s = "" + x;
          }
          return s;
      }
      public static void forLoop(int number){
          System.out.print("    ");
          for (int i = 0; i <= number; i++) {
              System.out.print(align(i) + " ");
          }
          System.out.println();
      }
}
