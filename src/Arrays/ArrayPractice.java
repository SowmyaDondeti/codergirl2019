package Arrays;

import java.util.Scanner;

public class ArrayPractice {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] numbers = new int[5];
    for (int index = 0; index < numbers.length; index++) {
      System.out.println("Give me a number");
      numbers[index] = s.nextInt();
    }
    int max = numbers[0];
    for (int turd =1;turd<numbers.length;turd++){
        if (numbers[turd]>max){
            max =numbers[turd];
        }
    }
    System.out.println(max);
  }
}
