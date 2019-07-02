package com.jaeyeonling.designpattern.factorymethod.creator;

import com.jaeyeonling.designpattern.factorymethod.framework.Item;
import com.jaeyeonling.designpattern.factorymethod.framework.MpPotion;

public class MpCreator extends ItemCreator {

    @Override
    protected Item createItem() {
        return new MpPotion();
    }

    @Override
    protected void logging(final Item item) {
        System.out.println("MP 물약 생성 :" + item);
    }
}
