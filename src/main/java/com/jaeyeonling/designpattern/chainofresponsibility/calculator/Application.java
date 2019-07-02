package com.jaeyeonling.designpattern.chainofresponsibility.calculator;

import com.jaeyeonling.designpattern.chainofresponsibility.calculator.domain.Calculator;
import com.jaeyeonling.designpattern.chainofresponsibility.calculator.domain.PlusCalculator;
import com.jaeyeonling.designpattern.chainofresponsibility.calculator.domain.Request;
import com.jaeyeonling.designpattern.chainofresponsibility.calculator.domain.SubtractCalculator;

public class Application {

    public static void main(final String... args) {
        Calculator plusCalculator = new PlusCalculator();
        Calculator subtractCalculator = new SubtractCalculator();

        plusCalculator.setNextCalculator(subtractCalculator);

        Request request1 = new Request("+", 1, 2);
        Request request2 = new Request("-", 2, 1);
        Request request3 = new Request("A", 2, 2);

        System.out.println(plusCalculator.process(request1));
        System.out.println(plusCalculator.process(request2));
        System.out.println(plusCalculator.process(request3));
    }
}
