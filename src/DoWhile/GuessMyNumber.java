package DoWhile;


import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber
{
    public static void main(String[] args){
        Random num =new Random(1);
       int  guessnum = num.nextInt(100);
         System.out.println("I'm thinking of a number between 1 and 100. what is it?"+guessnum);
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Guess:");
        int number;
        do{
            number = keyboard.nextInt();
            if (number <1 || number>100){
                System.out.println("Oops! That number isn't between 1 and 100. Try again");
            }else if (number > guessnum){
             System.out.println("My number is lower");
            }else if (number < guessnum){
                 System.out.println("My number is higher");
            }else{
              System.out.println("you got it. my number was "+number);
            }

        }while (number != guessnum);
    }
}
