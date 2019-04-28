package ObjectOrientedProgram;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String args[]) {
    User john = new User("url", "coolGuyJohn", "John", "Doe", "john@gmail.com");
    User giri = new User("url1", "cuteGiri", "Giri", "M", "giri@hotmail.com");
    User manish = new User("url2", "naughtyManish", "Manish", "Mani", "manish@yahoo.com");

    List<Post> postList = new ArrayList<>();
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

    for (Post post : postList) {
      System.out.println(post.toString());
      System.out.println(" ");
    }
  }
}
