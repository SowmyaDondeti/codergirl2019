package ObjectOrientedProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  static List<User> users = new ArrayList<>();
  static List<Post> postList = new ArrayList<>();
  static  Scanner keyboard = new Scanner(System.in);
  static User currentUser = null;
  public static void main(String args[]) {
        createExistingUsersAndPosts();

    while (true) {
      printMainMenu();
      int input = getUserSelection();
      keyboard.skip("\n");
      if (input == 1) {
        createUser();
      }
      if (input == 2) {
        selectExistingUser();
      }
      if (input == 3){
          if (currentUser == null){
              currentUser = users.get(0);
          }
        System.out.println("Enter the content");
          String content = keyboard.nextLine();
        System.out.println("Enter the url");
        String url = keyboard.nextLine();
        Post newPost = new Post(currentUser,content,url);
        postList.add(newPost);
        for (Post post:postList){
          System.out.println(post.toString());
          System.out.println(" ");
        }
      }
    }
  }
  private static  void printMainMenu(){
    System.out.println(
            "Main Menu \n1) Create a new user \n2) Become an existing user \n3) Create a post as the current user \n4) Print all posts \n5) Print all users \nWhat would you like to do?");
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
      User john = new User("url", "coolGuyJohn", "John", "Doe", "john@gmail.com");
      users.add(john);
      User giri = new User("url1", "cuteGiri", "Giri", "M", "giri@hotmail.com");
      users.add(giri);
      User manish = new User("url2", "naughtyManish", "Manish", "Mani", "manish@yahoo.com");
      users.add(manish);
      Post first = new Post(john, "My first post");
      postList.add(first);
      Post second = new Post(giri, "My second post", "www.awesome.com");
      postList.add(second);
      Post third = new Post(manish, "My third post");
      postList.add(third);
      Post fourth = new Post(manish, "My fourth post", "www.google.com");
      postList.add(fourth);
      Post fifth = new Post(john, "My fifth post", "www.gmail.com");
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
}
