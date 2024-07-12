package lesson27.examples.example1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThreadRunnable implements Runnable{
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        for (int i = 1; i <= 20; i++){
            System.out.println(i + ": " + Thread.currentThread().getName());
        }
        lock.unlock();

    }
}
