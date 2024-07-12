package lesson27.examples.example2;

import static lesson27.examples.example2.AccountDemo.*;

public class AddMoney extends Thread{
    @Override
    public void run() {
        try {
            account.addMoney(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
