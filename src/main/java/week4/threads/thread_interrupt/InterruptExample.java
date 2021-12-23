package week4.threads.thread_interrupt;

public class InterruptExample {

    public static void main(String[] args) {
        long shredderInterrupt = 4000;
        long startTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + " : starting");
        Thread turtleThread = new Thread(new MessageLooper());
        turtleThread.start();
        // Main turtleThread
        System.out.println(Thread.currentThread().getName() + " Shredder is waiting... ");

        while(turtleThread.isAlive()) {
            try {
                turtleThread.join(1000);
                if (System.currentTimeMillis() - startTime > shredderInterrupt && turtleThread.isAlive()) {
                    System.out.println(Thread.currentThread().getName() + " Shredder is tired of waiting...");
                    turtleThread.interrupt();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " shredder is on the loose");
    }
}
