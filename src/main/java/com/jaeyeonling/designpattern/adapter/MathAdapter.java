package com.jaeyeonling.designpattern.adapter;

final class MathAdapter {

    private MathAdapter() { }

    static float twiceOf(final float number) {
        System.out.println(String.format("twiceOf 호출: %f", number));
        return (float) Math.twoTime(number);
    }

    static float halfOf(final float number) {
        System.out.println(String.format("halfOf 호출: %f", number));
        return (float) Math.half(number);
    }
}
