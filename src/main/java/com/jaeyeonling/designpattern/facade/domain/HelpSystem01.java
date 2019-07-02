package com.jaeyeonling.designpattern.facade.domain;

class HelpSystem01 {

    HelpSystem01() {
        java.lang.System.out.println("Call Constructor: " + getClass().getSimpleName());
    }

    void process() {
        java.lang.System.out.println("Call Process: " + getClass().getSimpleName());
    }
}
