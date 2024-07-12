package lesson27.practice.practice3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{

    Lock lock = new ReentrantLock();
    private StringBuilder str;

    public MyThread(StringBuilder str) {
        this.str = str;
    }


    @Override
    public void run() {
        lock.lock();
            for (int i = 1; i <= 50; i++){
                System.out.println(i + " " + str);
            }
            char c = str.charAt(0);
            str.setCharAt(0, ++c);
        lock.unlock();
    }
}
