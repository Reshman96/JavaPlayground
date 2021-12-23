package week4.threads.basic_threads;

public class ThreadExample {

    public static class ExampleThread implements Runnable {

        @Override
        public void run() {
            System.out.println("Hi, I'm working on a particular thread");
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
}
