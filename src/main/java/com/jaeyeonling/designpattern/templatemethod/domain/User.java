package com.jaeyeonling.designpattern.templatemethod.domain;

public class User {

    private final String username;
    private final String password;

    User(final String username,
         final String password) {
        this.username = username;
        this.password = password;
    }
}
