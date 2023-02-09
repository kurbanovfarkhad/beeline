package org.example;

import java.util.AbstractMap;

public class PrinterThread extends Thread {
    private AbstractMap.SimpleEntry<Long, Long> period;

    public AbstractMap.SimpleEntry<Long, Long> getPeriod() {
        if (this.period == null) {
            Long in = Randomizer.getIntegerMax10() * 1000L;
            Long out = Randomizer.getIntegerMax10() * 1000L;
            this.period = new AbstractMap.SimpleEntry<>(in, out);
        }
        return this.period;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Long intervalBetweenPrinting = getPeriod().getKey();
                Long printingInterval = getPeriod().getValue();
                long currentTime = System.currentTimeMillis();// simple logic, printer should print in printingInterval with gap between of intervals in intervalBetweenPrinting
                System.out.println("open window");
                while (System.currentTimeMillis() < currentTime + printingInterval) {
                    Printer.getInstance().print();
                }
                System.out.println("close window");
                Thread.sleep(intervalBetweenPrinting); // interval between printing
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
