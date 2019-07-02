package com.jaeyeonling.designpattern.proxy.domain;

public class RealSubject implements Subject {

    @Override
    public void lightResourceWork() {
        System.out.println("간단한 일은 프록시에서 해줬다.");
    }

    @Override
    public void heavyResourceWork() {
        System.out.println("복잡한 일은 대신 해줄 수 없다.");
    }
}
