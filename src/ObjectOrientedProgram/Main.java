package ObjectOrientedProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  static List<User> users = new ArrayList<>();
  static List<Post> postList = new ArrayList<>();
  static  Scanner keyboard = new Scanner(System.in);
  static User currentUser = null;
  static int input;
  public static void main(String args[]) {
        createExistingUsersAndPosts();
    do {
      printMainMenu();
       input = getUserSelection();
      keyboard.skip("\n");
      mainMenuOptions();
    }while (input!=0);
  }

  private static  void printMainMenu(){
    System.out.println(
            "Main Menu \n1) Create a new user \n2) Become an existing user \n3) Create a post as the current user \n4) Print all posts \n5) Print all users \n0) Quit \nWhat would you like to do?");
  }
  private static  int getUserSelection(){
    return keyboard.nextInt();
  }
  private static void createUser(){
      System.out.println("Enter your username");
      String userName = keyboard.nextLine();
      System.out.println("Enter your Firstname");
      String firstName = keyboard.nextLine();
      System.out.println("Enter your lastName");
      String lastName = keyboard.nextLine();
      System.out.println("Enter your Avatar url");
      String avatarUrl = keyboard.nextLine();
      System.out.println("Enter your email");
      String email = keyboard.nextLine();

      User newUser = new User(avatarUrl, userName, firstName, lastName, email);
      users.add(newUser);
  }
  private static void createExistingUsersAndPosts(){
      User manaswi = new User("url", "coolGirlManaswi", "Manaswi", "Nancy", "manaswi@gmail.com");
      users.add(manaswi);
      User giri = new User("url1", "cuteGiri", "Giri", "M", "giri@hotmail.com");
      users.add(giri);
      User manish = new User("url2", "naughtyManish", "Manish", "Mani", "manish@yahoo.com");
      users.add(manish);
      Post first = new Post(manaswi, "My first post");
      postList.add(first);
      Post second = new Post(giri, "My second post", "www.awesome.com");
      postList.add(second);
      Post third = new Post(manish, "My third post");
      postList.add(third);
      Post fourth = new Post(manish, "My fourth post", "www.google.com");
      postList.add(fourth);
      Post fifth = new Post(manaswi, "My fifth post", "www.gmail.com");
      postList.add(fifth);
  }
  private static void selectExistingUser(){
      for (User user : users) {
          System.out.println(user.getUserName());
      }
      String userName = keyboard.nextLine();
      for (User user:users){
          if (user.getUserName().equals(userName)){
              currentUser = user;
          }
      }
  }
  private static void creatingPostAsCurrentUser(){
      if (currentUser == null){
          currentUser = users.get(0);
      }
      Post lastPost = null;
      for (Post post:postList){
          if (post.getUser().getUserName().equals(currentUser.getUserName())){
              lastPost = post;
          }
      }
    System.out.println(lastPost);
      System.out.println("Enter the content");
      String content = keyboard.nextLine();
      System.out.println("Enter the url");
      String url = keyboard.nextLine();
      Post newPost = new Post(currentUser,content,url);
      postList.add(newPost);
  }
  private static void printAllPosts(){
      for (Post post:postList){
          System.out.println(post.toString());
          System.out.println(" ");
      }
  }
  private static void printAllUsers(){
      for (User user:users){
          System.out.println(user.toString());
          System.out.println(" ");
      }
  }
  private static void mainMenuOptions(){
      if (input == 1) {
          createUser();
      }
      if (input == 2) {
          selectExistingUser();
      }
      if (input == 3){
          creatingPostAsCurrentUser();
      }
      if (input == 4){
          printAllPosts();
      }
      if (input == 5){
          printAllUsers();
      }
  }

}
