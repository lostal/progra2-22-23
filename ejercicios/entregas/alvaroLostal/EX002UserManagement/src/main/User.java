package main;
public class User {
    private String userName;
    private String userPassword;
    public boolean login;

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.login = false;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isLogin() {
        return login;
    }

    public void login() {
        this.login = true;
    }

    public void logout() {
        this.login = false;
    }
    public void setLogin(boolean login) {
        this.login = login;
    }

}