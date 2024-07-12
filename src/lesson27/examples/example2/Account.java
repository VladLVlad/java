package lesson27.examples.example2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    Lock lock = new ReentrantLock();

    Condition condition = lock.newCondition();
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void addMoney(int money) throws InterruptedException {

        lock.lock();
        Thread.sleep(1000);
        balance += money;
        condition.signalAll();
        lock.unlock();

    }

    public void removeMoney(int money) throws InterruptedException {
        lock.lock();
        while (money > balance){
            condition.await();
        }
        balance -= money;
        lock.unlock();
    }
}
