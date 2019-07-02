package com.jaeyeonling.designpattern.prototype.circle;

public class Application {

    public static void main(final String... args) throws CloneNotSupportedException {
        final Circle circle1 = new Circle(1, 2, 3);

        final Circle circle2 = circle1.copy();

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println(circle1.equals(circle2));
    }
}
