package week4.threads.basic_threads;

public class ThreadExample {

    public static class ExampleThread implements Runnable {

        @Override
        public void run() {
            System.out.println("Hi, I'm working on a particular thread");
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId());

        Thread ourThread = new Thread(new ExampleThread());

//        System.out.println(ourThread.getName());
//        System.out.println(ourThread.getId());
//        ourThread.run();

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
