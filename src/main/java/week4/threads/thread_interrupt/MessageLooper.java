package week4.threads.thread_interrupt;

public class MessageLooper implements Runnable {

    @Override
    public void run() {
        String[] tmnt = {"Leonardo", "Michaelangelo", "Donatello", "Raphael"};

        for (String turtle : tmnt) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + turtle);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
