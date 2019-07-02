package com.jaeyeonling.designpattern.composite;

import com.jaeyeonling.designpattern.composite.domain.Component;
import com.jaeyeonling.designpattern.composite.domain.File;
import com.jaeyeonling.designpattern.composite.domain.Folder;

public class Application {

    private static final String TAB = "\t";

    public static void main(final String... args) {
        final Folder root = new Folder("root");
        final Folder home = new Folder("home");
        final Folder garam = new Folder("garam");
        final Folder music = new Folder("music");
        final Folder picture = new Folder("picture");
        final Folder doc = new Folder("doc");
        final Folder usr = new Folder("usr");

        final File track1 = new File("track1");
        final File track2 = new File("track2");
        final File pic1 = new File("pic1");
        final File doc1 = new File("doc1");
        final File java = new File("java");

        root.addComponent(home);
            home.addComponent(garam);
                garam.addComponent(music);
                    music.addComponent(track1);
                    music.addComponent(track2);
                garam.addComponent(picture);
                    picture.addComponent(pic1);
                garam.addComponent(doc);
                    doc.addComponent(doc1);
        root.addComponent(usr);
            usr.addComponent(java);

        show(TAB, root);
    }

    private static void show(final String prefix, Component component) {
        System.out.println(prefix + component.getClass().getName() + " | " + component.getName());

        if (component instanceof Folder) {
            ((Folder) component).getChildren()
                    .forEach(c -> show(TAB + prefix, c));
        }
    }
}
