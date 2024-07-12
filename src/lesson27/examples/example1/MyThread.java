package lesson27.examples.example1;

public class MyThread extends Thread{
    @Override
    public synchronized void run() {
        for (int i = 1; i <= 20; i++){
            System.out.println(i + ": " + Thread.currentThread().getName());

        }
    }
}
