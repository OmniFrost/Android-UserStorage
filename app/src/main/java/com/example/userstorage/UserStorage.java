package com.example.userstorage;


import java.util.ArrayList;

public class UserStorage {
    private static UserStorage instance;
    private ArrayList<User> userList;

    private UserStorage() {
        userList = new ArrayList<>();
    }

    public static UserStorage getInstance() {
        if (instance == null) {
            instance = new UserStorage();
        }
        return instance;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public ArrayList<User> getUsers() {
        return userList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
}
