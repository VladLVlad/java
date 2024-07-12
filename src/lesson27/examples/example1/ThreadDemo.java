package lesson27.examples.example1;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        Thread thread1 = new Thread(myThread);
        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
        Thread thread2 = new Thread(myThreadRunnable, "Third thread");
        Thread thread3 = new Thread(myThreadRunnable, "Fourth thread");
        thread.setName("First thread");
        thread1.setName("Second thread");
        thread.start();
        //Thread.sleep(1000);
        //myThread.join();
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(thread.getState());
        System.out.println("Hello from main");
    }
}
