package com.jaeyeonling.designpattern.prototype.cat;

import java.util.Date;

public class Age {

    private Date birth;
    private int calledAge;

    public Age(final Date birth,
               final int calledAge) {
        this.birth = birth;
        this.calledAge = calledAge;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getCalledAge() {
        return calledAge;
    }

    public void setCalledAge(int calledAge) {
        this.calledAge = calledAge;
    }

    @Override
    public String toString() {
        return "Age{" +
                "birth=" + birth +
                ", calledAge=" + calledAge +
                '}';
    }
}
