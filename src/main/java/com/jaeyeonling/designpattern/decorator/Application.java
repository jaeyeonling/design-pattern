package com.jaeyeonling.designpattern.decorator;

import com.jaeyeonling.designpattern.decorator.domain.Base;
import com.jaeyeonling.designpattern.decorator.domain.Beverage;
import com.jaeyeonling.designpattern.decorator.domain.Espresso;
import com.jaeyeonling.designpattern.decorator.domain.Milk;

import java.util.Scanner;

public class Application {

    public static void main(final String... args) {

        final Scanner scanner = new Scanner(System.in);

        Beverage beverage = new Base();
        boolean running = true;
        while (running) {
            System.out.println("음료 현재 가격: " + beverage.totalPrice());
            System.out.println("0: 종료 / 1: 샷 추가 / 2: 우유 추가 ");
            System.out.print("선택: ");

            switch (scanner.nextInt()) {
                case 0:
                    running = false;
                    break;
                case 1:
                    beverage = new Espresso(beverage);
                case 2:
                    beverage = new Milk(beverage);
            }
        }

        System.out.println("음료 최종 가격: " + beverage.totalPrice());
        scanner.close();
    }
}
