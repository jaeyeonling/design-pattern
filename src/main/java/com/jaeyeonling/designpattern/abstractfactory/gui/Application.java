package com.jaeyeonling.designpattern.abstractfactory.gui;

import com.jaeyeonling.designpattern.abstractfactory.gui.domain.Button;
import com.jaeyeonling.designpattern.abstractfactory.gui.domain.GuiFactory;
import com.jaeyeonling.designpattern.abstractfactory.gui.domain.TextArea;
import com.jaeyeonling.designpattern.abstractfactory.gui.domain.concrete.FactoryInstance;

public class Application {

    public static void main(final String... args) {
        final GuiFactory guiFactory = FactoryInstance.getGuiFactory();

        final Button button = guiFactory.createButton();
        final TextArea textArea = guiFactory.createTextArea();

        button.click();
        System.out.println(textArea.getText());
    }
}
