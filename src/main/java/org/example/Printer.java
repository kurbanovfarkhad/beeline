package org.example;

import java.util.Stack;

public class Printer {
    private static Printer instance;

    public synchronized static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    private final Stack<Integer> numberToPrint = new Stack<>();

    public boolean addToQueue(Integer number) {
        return this.numberToPrint.push(number) != null;
    }

    public void print() {
        if (!numberToPrint.empty()) {
            System.out.println(numberToPrint.pop());
        }
    }
}
