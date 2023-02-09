package org.example;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("START OPERATION");
        Manager manager = new Manager();
        manager.process();
        System.out.println("FINISH OPERATION");
    }

}


