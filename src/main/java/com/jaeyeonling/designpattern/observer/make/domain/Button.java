package com.jaeyeonling.designpattern.observer.make.domain;

import java.util.Objects;

public class Button {

    private final OnClickListener listener;

    public Button(final OnClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (Objects.nonNull(this.listener)) {
            this.listener.onClick(this);
        }
    }
}
