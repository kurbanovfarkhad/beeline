package org.example;

import java.util.Random;

public class Randomizer {
    Printer printer = new Printer();

    private static Random random = new Random();

    public static int getIntegerMax10() {
        return random.nextInt(9) + 1;
    }
}
