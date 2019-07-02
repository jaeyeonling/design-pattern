package com.jaeyeonling.designpattern.proxy.domain;

public class Proxy implements Subject {

    private final Subject real;

    public Proxy(final Subject real) {
        this.real = real;
    }

    @Override
    public void lightResourceWork() {
        System.out.println("리소스가 조금 드는 가벼운 일은 프록시가 그냥 해준다.");
    }

    @Override
    public void heavyResourceWork() {
        System.out.println("리소스가 많이 드는 무거운 일은 넘긴다.");

        real.heavyResourceWork();
    }
}
