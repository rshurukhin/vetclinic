package model;

import service.Storage;

import java.util.Set;

public class User {
    private static int id = Storage.getLastUserId();
    private int userId;
    private String userName;
    private String userSurname;
    private String login;
    private String password;
    private Set<Pet> pets;

    public User(String userName, String userSurname, String login, String password){
        //this.id = Storage.getLastUserId();
        this.userId =  this.id++;
        this.userName = userName;
        this.userSurname = userSurname;
        this.login = login;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
