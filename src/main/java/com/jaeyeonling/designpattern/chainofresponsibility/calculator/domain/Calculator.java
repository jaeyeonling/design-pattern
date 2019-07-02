package com.jaeyeonling.designpattern.chainofresponsibility.calculator.domain;

import java.util.Objects;

public abstract class Calculator {

    private Calculator nextCalculator;

    public void setNextCalculator(final Calculator nextCalculator) {
        this.nextCalculator = nextCalculator;
    }

    public int process(final Request request) {
        if (isSupport(request)) {
            return process(request.getValue1(), request.getValue2());
        }
        if (Objects.nonNull(nextCalculator)) {
            return nextCalculator.process(request);
        }

        return 0;
    }

    abstract protected boolean isSupport(final Request request);
    abstract protected int process(int a, int b);
}
