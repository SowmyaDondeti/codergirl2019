package Arrays;

public class AsciiLectureExample {
  public static void main(String[] args) {
    int nums[] = {67, 97, 116, 115, 32, 97, 114, 101, 32, 102, 117, 114, 114, 121, 33};

    for (int index = 0; index < nums.length; index++) {
        char letter;
      if (nums[index] > 96) {

         letter = (char) (nums[index]-32);


      }else {
          letter =(char)nums[index];
      }
        System.out.print(letter);
    }

    System.out.println();
  }
}
