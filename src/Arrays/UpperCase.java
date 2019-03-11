package Arrays;

public class UpperCase
{
    public static void main(String[] args){
        String message ="Why is Easter in the Spring?";
        upperCase(message);
    }
    public static void upperCase( String message){
        char[] letter = message.toCharArray();
        for (int index=0;index<letter.length;index++){
            char character = letter[index];
              int numbers = (int)character;
            if (numbers>96){
                numbers=numbers-32;
            }
            char letter1 = (char)numbers;
            System.out.print(letter1);
        }
    }
}
