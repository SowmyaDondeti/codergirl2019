package Arrays;

public class NumToLetAndLetToNum {
  public static void main(String[] args) {
    int nums[] = {89, 111, 117, 39, 114, 101, 32, 97, 32, 115, 116, 97, 114, 33};
    letterToNums(nums);
    System.out.println(" ");
    String message = "crow flies at dawn";
    messageToNumbers(message);
   }

  public static void letterToNums(int nums[]) {
    for (int index = 0; index < nums.length; index++) {
      char letter = (char) nums[index];
      System.out.print(letter);

    }
  }
  public static void messageToNumbers(String message){
      char[] letter = message.toCharArray();
      for (int index=0;index<letter.length;index++){
          char character = letter[index];
          int numbers = (int)character;
          System.out.print(numbers+",");
      }
  }

}
