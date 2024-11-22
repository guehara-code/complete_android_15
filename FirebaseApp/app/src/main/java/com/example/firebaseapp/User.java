package com.example.firebaseapp;

public class User {

    String username;
    String phoneNumber;
    String groupUser;

    public User(String username, String phoneNumber, String groupUser) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.groupUser = groupUser;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroupUser() {
        return groupUser;
    }

    public void setGroupUser(String groupUser) {
        this.groupUser = groupUser;
    }
}
