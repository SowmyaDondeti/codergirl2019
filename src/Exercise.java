import java.util.Scanner;

public class Exercise
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two integers!");
        int input1 = keyboard.nextInt();
        keyboard.skip("\n");
        int input2 = keyboard.nextInt();
        if (input1 > input2)
        {
            System.out.println("The largest number is:" + input1);
        }
        else if (input1 < input2)
        {
            System.out.println("The largest number is:" + input2);
        }
        else
        {
            System.out.println("They are equal.");
        }

    }
}
