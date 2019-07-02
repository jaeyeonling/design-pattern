package com.jaeyeonling.designpattern.prototype.cat;

import java.util.Date;

public class Application {

    public static void main(final String... args) throws CloneNotSupportedException {
        final Age age = new Age(new Date(), 0);
        final Cat cat = new Cat("navi", age);

        final Cat shallowCopyCat = cat.shallowCopy();
        shallowCopyCat.setName("newname");
        shallowCopyCat.getAge().getBirth().setMonth(1);

        System.out.println(cat);
        System.out.println(shallowCopyCat);

        final Cat deepCopyCat = cat.deepCopy();
        deepCopyCat.setName("newname22");
        deepCopyCat.getAge().getBirth().setMonth(10);

        System.out.println(cat);
        System.out.println(deepCopyCat);
    }
}
