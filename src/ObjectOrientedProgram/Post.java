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

    public static int getPostCounter()
    {
        return postCounter;
    }

    public static void setPostCounter(int postCounter)
    {
        Post.postCounter = postCounter;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public int getId() {
    return id;
  }

    public void setId(int id)
    {
        this.id = id;
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
