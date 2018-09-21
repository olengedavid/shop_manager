package main.models;


public class User {

    private  String id;
    private String userName;
    private String password;
    private String Usertype;

    public User() {
    }

    public User(String id, String userName, String passwored, String usertype) {
        this.id = id;
        this.userName = userName;
        this.password = passwored;
        Usertype = usertype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswored() {
        return password;
    }

    public void setPasswored(String passwored) {
        this.password = passwored;
    }

    public String getUsertype() {
        return Usertype;
    }

    public void setUsertype(String usertype) {
        Usertype = usertype;
    }
}
