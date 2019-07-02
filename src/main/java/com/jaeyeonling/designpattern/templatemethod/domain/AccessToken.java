package com.jaeyeonling.designpattern.templatemethod.domain;

class AccessToken {

    private final String token;

    AccessToken(final String token) {
        this.token = token;
    }

    User toUser() {
        return new User(token, token);
    }
}
