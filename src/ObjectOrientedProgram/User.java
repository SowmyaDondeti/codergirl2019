package ObjectOrientedProgram;

public class User
{
    private String avatarUrl;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;

    public User(String avatarUrl,String userName,String firstName,String lastName,String email){
        this.avatarUrl = avatarUrl;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public String getAvatarUrl(){return avatarUrl;}

    public void setAvatarUrl(String avatarUrl)
    {
        this.avatarUrl = avatarUrl;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
    this.userName = userName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    public String toString(){
        return "Avatar url:"+this.avatarUrl+"\nUserName:"+this.userName+"\nFirstName:"+this.firstName+"\nLastName:"+this.lastName+"\nEmail:"+this.email;
    }
}
