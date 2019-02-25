package WhileLoops;

public class CountTo30
{
  public static void main(String[] args) {
    int count = 0;
    boolean keepGoing = true;
    while (keepGoing) {
      count++;
      System.out.println(count);
      if (count == 30) {
        keepGoing = false;
      }
    }
  }
}
