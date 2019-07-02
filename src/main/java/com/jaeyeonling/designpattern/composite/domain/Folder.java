package com.jaeyeonling.designpattern.composite.domain;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    private final List<Component> children;

    public Folder(final String name) {
        super(name);

        this.children = new ArrayList<>();
    }

    public boolean addComponent(final Component component) {
        return children.add(component);
    }

    public List<Component> getChildren() {
        return children;
    }
}
