package com.jaeyeonling.designpattern.chainofresponsibility.calculator.domain;

public class Request {

    private final String operator;
    private final int value1;
    private final int value2;

    public Request(final String operator,
                   final int value1,
                   final int value2) {
        this.operator = operator;
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getOperator() {
        return operator;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }
}
