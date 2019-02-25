package WhileLoops;

public class CountTo100By5
{
  public static void main(String[] args) {
    boolean keepgoing = true;
    int count = 0;
    while (keepgoing) {
      count = count + 5;
      System.out.println(count);
      if (count == 100) {
        keepgoing = false;
      }
    }
  }
}
