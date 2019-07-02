package com.jaeyeonling.designpattern.prototype.circle;

public class Circle extends Shape {

    private int x;
    private int y;
    private int r;

    public Circle(final int x,
                  final int y,
                  final int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle copy() throws CloneNotSupportedException {
        final Circle circle = (Circle) clone();

        circle.x += 1;
        circle.y += 1;
        circle.r += 1;

        return circle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}
