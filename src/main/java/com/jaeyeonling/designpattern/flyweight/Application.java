package com.jaeyeonling.designpattern.flyweight;

import com.jaeyeonling.designpattern.flyweight.domain.FlyweightFactory;

public class Application {

    public static void main(final String... args) {
        final FlyweightFactory<String> flyweightFactory = new FlyweightFactory<>();

        System.out.println(flyweightFactory.getFlyweight("Hello"));
        System.out.println(flyweightFactory.getFlyweight("Hello"));
        System.out.println(flyweightFactory.getFlyweight("Hello"));

        System.out.println(flyweightFactory.getFlyweight("Hello2"));
        System.out.println(flyweightFactory.getFlyweight("Hello2"));
        System.out.println(flyweightFactory.getFlyweight("Hello2"));

        System.out.println(flyweightFactory.getFlyweight("Hello"));

        System.out.println(flyweightFactory.getFlyweight("Hello3"));
        System.out.println(flyweightFactory.getFlyweight("Hello4"));
    }
}
