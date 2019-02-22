import java.util.Scanner;

public class ExerciseOfClass4 {
  public static void main(String[] args) {
    String name = getName();
    int language = getLanguage();
    greet(name, language);
  }

  public static String getName() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What's your name?");
    String name = keyboard.nextLine();
    return name;
  }

  public static int getLanguage() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What language should I use?");
    System.out.println("1-German \n2-Spanish \n3-French");
    int language = keyboard.nextInt();
    return language;
  }

  public static void greet(String name, int language) {
    if (language == 1) {
      System.out.println("Guten Tag," + name);
    } else if (language == 2) {
      System.out.println("Hola," + name);
    } else if (language == 3) {
      System.out.println("Bonjour," + name);
    }
  }
}
