package org.example;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test() {
        Stack<Integer> integers = new Stack<>();
        integers.push(5);
        integers.push(4);
        integers.push(3);

        while (true) {
            try {
                Long intervalBetweenPrinting = 10000L;
//                Long intervalBetweenPrinting = getPeriod().getKey();
                Long printingInterval = 7000L;
//                Long printingInterval = getPeriod().getValue();
                long currentTime = System.currentTimeMillis();// simple logic, printer should print in printingInterval with gap between of intervals in intervalBetweenPrinting
                System.out.println("start");
                while (System.currentTimeMillis() < currentTime + printingInterval) {
//                    System.out.println("asd");
                }
                System.out.println("finish");
                Thread.sleep(intervalBetweenPrinting); // interval between printing
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
