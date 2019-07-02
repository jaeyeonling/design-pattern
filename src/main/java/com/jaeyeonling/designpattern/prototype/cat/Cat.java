package com.jaeyeonling.designpattern.prototype.cat;

public class Cat implements Cloneable {

    private String name;
    private Age age;

    public Cat(final String name,
               final Age age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Cat shallowCopy() throws CloneNotSupportedException {
        final Cat copyCat = (Cat) clone();

        return copyCat;
    }

    public Cat deepCopy() throws CloneNotSupportedException {
        final Cat copyCat = (Cat) clone();
        copyCat.age = new Age(copyCat.age.getBirth(), copyCat.age.getCalledAge());

        return copyCat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
