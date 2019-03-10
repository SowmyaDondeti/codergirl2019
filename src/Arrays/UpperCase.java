package Arrays;

public class UpperCase
{
    public static void main(String[] args){
        String message ="Why is Easter in the Spring?";
        char[] letter = message.toCharArray();
        for (int index=0;index<letter.length;index++){
            char character = letter[index];
            int numbers = (int)character;
            if (numbers>96){
                numbers=numbers-32;
            }else{
                numbers =numbers;
            }
            char letter1 = (char)numbers;
            System.out.print(letter1);
        }
    }
}
