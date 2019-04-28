package ObjectOrientedProgram;

public class Post {
  private static int postCounter = 0;
  private User user;
  private int id;
  private String content;
  private String url;

  public Post(User user, String content) {
    postCounter++;
    this.id = postCounter;
    this.user = user;
    this.content = content;
  }

  public Post(User user, String content, String url) {
    postCounter++;
    this.id = postCounter;
    this.user = user;
    this.content = content;
    this.url = url;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Post number: "
        + this.id
        + "\n"
        + this.content
        + "\n"
        + "Written by :"
        + this.user.getUserName()
        + "\n"
        + "URL: "
        + (this.url != null ? this.url : "");
  }
}
