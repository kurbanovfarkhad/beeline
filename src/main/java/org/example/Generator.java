package org.example;

public class Generator {
    private int lastNumber;
    private int step;

    public Generator(int firstNumber, int step) {
        this.lastNumber = firstNumber;
        this.step = step;
    }

    public int getProgression() {
        this.lastNumber += step;
        return this.lastNumber;
    }

    public int getStep() {
        return step;
    }
}
