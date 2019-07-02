package com.jaeyeonling.designpattern.adapter;

final class Math {

    private Math() { }

    static double twoTime(final double number) {
        return number * 2;
    }

    static double half(final double number) {
        return number / 2;
    }
}
