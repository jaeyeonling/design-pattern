package com.jaeyeonling.designpattern.factorymethod.creator;

import com.jaeyeonling.designpattern.factorymethod.framework.HpPotion;
import com.jaeyeonling.designpattern.factorymethod.framework.Item;

public class HpCreator extends ItemCreator {

    @Override
    protected Item createItem() {
        return new HpPotion();
    }

    @Override
    protected void logging(final Item item) {
        System.out.println("HP 물약 생성 :" + item);
    }
}
