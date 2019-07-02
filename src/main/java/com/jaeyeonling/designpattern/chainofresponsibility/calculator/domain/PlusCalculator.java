package com.jaeyeonling.designpattern.chainofresponsibility.calculator.domain;

public class PlusCalculator extends Calculator {

    @Override
    protected boolean isSupport(final Request request) {
        return "+".equals(request.getOperator());
    }

    @Override
    protected int process(final int a,
                          final int b) {
        return a + b;
    }
}
