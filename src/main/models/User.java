package main.models;


public class User {

    private  String id;
    private String userName;
    private String passwored;
    private String Usertype;

    public User() {
    }

    public User(String id, String userName, String passwored, String usertype) {
        this.id = id;
        this.userName = userName;
        this.passwored = passwored;
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
        return passwored;
    }

    public void setPasswored(String passwored) {
        this.passwored = passwored;
    }

    public String getUsertype() {
        return Usertype;
    }

    public void setUsertype(String usertype) {
        Usertype = usertype;
    }
}
