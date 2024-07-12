package lesson27.examples.example2;

import static lesson27.examples.example2.AccountDemo.*;

public class RemoveMoney extends Thread{
    @Override
    public void run() {
        try {
            account.removeMoney(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
