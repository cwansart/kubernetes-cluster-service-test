package de.openknowledge.user.service;

public class User {

    private String username;

    public User() {
    }

    public User(final String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }
}
