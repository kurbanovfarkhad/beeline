package org.example;

public class Manager {
    /**
     * two threads generate number account progression
     * every Generator object has own set of number
     * every number pushing to queue
     * printer starts in another thread
     * printer print numbers from queue according to LIFO
     *
     * @throws InterruptedException
     */
    public void process() throws InterruptedException {
        System.out.println("START OPERATION");
        // creating threads of progression generation
        ProgressionGenerationThread firstGenerator = generateThread("First generator");
        ProgressionGenerationThread secondGenerator = generateThread("Second generator");
        // start generators
        firstGenerator.start();
        secondGenerator.start();
        // run Printer thread
        PrinterThread printerThread = new PrinterThread();
        printerThread.start();
    }

    private static ProgressionGenerationThread generateThread(String threadName) {
        ProgressionGenerationThread thread = new ProgressionGenerationThread();
        thread.setName(threadName);
        thread.setDaemon(true);
        return thread;
    }

}