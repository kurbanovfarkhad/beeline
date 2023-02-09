package org.example;

import java.util.ArrayList;

public class ProgressionGenerationThread extends Thread {
    private final ArrayList<Integer> arrayList = new ArrayList<>();

    @Override
    public void run() {
        Generator generator = new Generator(Randomizer.getIntegerMax10(), Randomizer.getIntegerMax10());
        while (true) {
            try {
                Thread.sleep(Randomizer.getIntegerMax10() * 1000L);
                int progression = generator.getProgression();
                System.out.println("Thread name: " + Thread.currentThread().getName() + " added number: " + progression + " step: " + generator.getStep());
                arrayList.add(progression);
                Printer.getInstance().addToQueue(progression);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
