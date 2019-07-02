package com.jaeyeonling.designpattern.abstractfactory.gui.domain.concrete;

import com.jaeyeonling.designpattern.abstractfactory.gui.OS;
import com.jaeyeonling.designpattern.abstractfactory.gui.domain.Button;
import com.jaeyeonling.designpattern.abstractfactory.gui.domain.GuiFactory;
import com.jaeyeonling.designpattern.abstractfactory.gui.domain.TextArea;

public class FactoryInstance {

    public static GuiFactory getGuiFactory() {
        switch (currentOS()) {
            case WINDOW:
                return new WindowGuiFactory();
            case LINUX:
                return new LinuxGuiFactory();
        }

        throw new IllegalArgumentException();
    }

    private static OS currentOS() {
        final String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            return OS.WINDOW;
        }
        if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
            return OS.LINUX;
        }

        return OS.ETC;
    }

    static class LinuxGuiFactory implements GuiFactory {

        @Override
        public Button createButton() {
            return new LinuxButton();
        }

        @Override
        public TextArea createTextArea() {
            return new LinuxTextArea();
        }
    }

    static class LinuxButton implements Button {

        @Override
        public void click() {
            System.out.println("리눅스 버튼 클릭!");
        }

    }

    static class LinuxTextArea implements TextArea {

        @Override
        public String getText() {
            return "리눅스 텍스트 내용 가져가기!";
        }
    }

    static class WindowGuiFactory implements GuiFactory {

        @Override
        public Button createButton() {
            return new WindowButton();
        }

        @Override
        public TextArea createTextArea() {
            return new WindowTextArea();
        }
    }

    static class WindowButton implements Button {

        @Override
        public void click() {
            System.out.println("윈도우 버튼 클릭!");
        }
    }

    static class WindowTextArea implements TextArea {

        @Override
        public String getText() {
            return "윈도우 텍스트 내용 가져가기!";
        }

    }
}



