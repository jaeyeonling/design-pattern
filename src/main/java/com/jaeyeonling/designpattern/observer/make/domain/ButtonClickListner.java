package com.jaeyeonling.designpattern.observer.make.domain;

public class ButtonClickListner implements OnClickListener<Button> {

    @Override
    public void onClick(final Button item) {
        System.out.println(item + " Clicked");
    }
}
