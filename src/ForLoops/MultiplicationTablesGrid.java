package ForLoops;

import java.util.Scanner;

public class MultiplicationTablesGrid {
  public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int N=keyboard.nextInt();
    System.out.print("    ");
    for (int i=0;i<=N;i++)
      System.out.print(pad(i)+" ");
      System.out.println();
      System.out.print("    ");
        for (int i=0;i<=N;i++)
            System.out.print("    ");
        System.out.println();
        for (int i=0;i<=N;i++){
            System.out.print(pad(i)+" ");
            for (int j=0;j<=N;j++){
                System.out.print(pad(i*j)+" ");
            }
            System.out.println();
        }

}
  public static String pad(int x){
      String s;
      if (x<10) s="  "+x;
      else if (x<100) s=" "+x;
      else s=""+x;
      return s;

  }
}
