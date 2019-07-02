package com.jaeyeonling.designpattern.bridge;

import com.jaeyeonling.designpattern.bridge.domain.MorseCodeFunction;
import com.jaeyeonling.designpattern.bridge.domain.PrintMorseCode;
import com.jaeyeonling.designpattern.bridge.domain.SoundMorseCodeFunction;

public class Application {

    public static void main(final String... args) {

//        final MorseCodeFunction morseCodeFunction = new CharacterMorseCodeFunction();
        final MorseCodeFunction morseCodeFunction = new SoundMorseCodeFunction();

        final PrintMorseCode printMorseCode = new PrintMorseCode(morseCodeFunction);

        printMorseCode.g().a().r().a().r();
    }
}
