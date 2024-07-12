package lesson27.practice.practice3;

public class MainThread {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("a");
        MyThread thread = new MyThread(stringBuilder);
        Thread thread1 = new Thread(thread);
        Thread thread2 = new Thread(thread);
        Thread thread3 = new Thread(thread);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
