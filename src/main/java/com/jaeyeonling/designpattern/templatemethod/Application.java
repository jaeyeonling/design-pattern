package com.jaeyeonling.designpattern.templatemethod;

import com.jaeyeonling.designpattern.templatemethod.domain.CustomGameConnectionHelper;
import com.jaeyeonling.designpattern.templatemethod.domain.DefaultGameConnectionHelper;
import com.jaeyeonling.designpattern.templatemethod.domain.GameConnectionHelper;
import com.jaeyeonling.designpattern.templatemethod.domain.User;

public class Application {

    public static void main(final String... args) {
        final GameConnectionHelper defaultGameConnectionHelper = new DefaultGameConnectionHelper();
        final GameConnectionHelper customGameConnectionHelper = new CustomGameConnectionHelper();

        final User defaultUser = defaultGameConnectionHelper.connection("접속합니다");
        final User customUser = customGameConnectionHelper.connection("접속합니다");
    }
}
