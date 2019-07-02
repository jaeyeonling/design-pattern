package com.jaeyeonling.designpattern.templatemethod.domain;

public class CustomGameConnectionHelper extends GameConnectionHelper {

    @Override
    AccessToken parse(final String request) {
        System.out.println("커스텀 토큰 파싱");
        return new AccessToken(request);
    }

    @Override
    boolean authentication(final AccessToken accessToken) {
        System.out.println("커스텀 권환 확인");
        return true;
    }

    @Override
    User login(final AccessToken accessToken) {
        System.out.println("커스텀 로그인");
        return accessToken.toUser();
    }

    @Override
    UserType authorization(final User user) {
        System.out.println("커스텀 권한 인가");
        return UserType.ADMIN;
    }
}
