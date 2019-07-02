package com.jaeyeonling.designpattern.facade.domain;

class HelpSystem02 {

    HelpSystem02() {
        java.lang.System.out.println("Call Constructor: " + getClass().getSimpleName());
    }

    void process() {
        java.lang.System.out.println("Call Process: " + getClass().getSimpleName());
    }
}
