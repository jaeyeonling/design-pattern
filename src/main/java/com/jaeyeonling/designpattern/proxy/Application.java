package com.jaeyeonling.designpattern.proxy;

import com.jaeyeonling.designpattern.proxy.domain.Proxy;
import com.jaeyeonling.designpattern.proxy.domain.RealSubject;
import com.jaeyeonling.designpattern.proxy.domain.Subject;

public class Application {

    public static void main(final String... args) {
        final Subject realSubject = new RealSubject();
        final Subject proxy = new Proxy(realSubject);

        proxy.lightResourceWork();
        proxy.lightResourceWork();
        proxy.lightResourceWork();

        proxy.heavyResourceWork();
        proxy.heavyResourceWork();
        proxy.heavyResourceWork();
    }
}
