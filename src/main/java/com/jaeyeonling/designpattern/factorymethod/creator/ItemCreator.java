package com.jaeyeonling.designpattern.factorymethod.creator;

import com.jaeyeonling.designpattern.factorymethod.framework.Item;

public abstract class ItemCreator {

    abstract protected Item createItem();
    abstract protected void logging(final Item item);

    public Item create() {
        final Item item = createItem();
        logging(item);

        return item;
    }
}
