package com.jaeyeonling.designpattern.templatemethod.domain;

public abstract class GameConnectionHelper {

    abstract AccessToken parse(final String request);
    abstract boolean authentication(final AccessToken accessToken);
    abstract User login(final AccessToken accessToken);
    abstract UserType authorization(final User user);

    public User connection(final String requestToken) {
        final AccessToken accessToken = parse(requestToken);

        if (!authentication(accessToken)) {
            throw new IllegalArgumentException();
        }

        final User user = login(accessToken);
        final UserType userType = authorization(user);

        if (userType == UserType.ADMIN) {
            System.out.println("어드민 접속하십니다.");
        }

        return user;
    }
}
