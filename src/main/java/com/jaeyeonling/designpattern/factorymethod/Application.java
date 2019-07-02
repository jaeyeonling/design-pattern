package com.jaeyeonling.designpattern.factorymethod;

import com.jaeyeonling.designpattern.factorymethod.creator.HpCreator;
import com.jaeyeonling.designpattern.factorymethod.creator.ItemCreator;
import com.jaeyeonling.designpattern.factorymethod.creator.MpCreator;
import com.jaeyeonling.designpattern.factorymethod.framework.Item;

public class Application {

    public static void main(final String... args) {
        final ItemCreator hpCreator = new HpCreator();
        final Item hpPotion = hpCreator.create();

        hpPotion.use();

        final ItemCreator mpCreator = new MpCreator();
        final Item mpPotion = mpCreator.create();

        mpPotion.use();
    }
}
