package com.jaeyeonling.designpattern.composite.domain;

public class File<T> extends Component {

    private final T data;

    public File(final String name) {
        this(name, null);
    }

    public File(final String name,
                final T data) {
        super(name);

        this.data = data;
    }
}
