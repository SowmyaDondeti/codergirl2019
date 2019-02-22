package MethodsPractice;

public class VerseAndChorus {
  public static void lyric() {
    System.out.println(
        "With a knick-knack paddywhack,"
            + "\nGive the dog a bone,"
            + " \nThis old man came rolling home.\n");
  }

  public static void printMessage(String number, String thing) {
    System.out.println(
        "This old man, he played "
            + number
            + ". "
            + " \nHe played knick-knack on my "
            + thing
            + ";");
  }

  public static void main(String[] args) {
    printMessage("one", "thumb");
    lyric();
    printMessage("two", "shoe");
    lyric();
    printMessage("three", "knee");
    lyric();
    printMessage("four", "door");
    lyric();
    printMessage("five", "hive");
    lyric();
    printMessage("six", "sticks");
    lyric();
  }
}
