package lesson27.examples.example2;

public class AccountDemo {
    public static Account account = new Account();

    public static void main(String[] args) throws InterruptedException {
        AddMoney addMoney = new AddMoney();
        RemoveMoney removeMoney = new RemoveMoney();
        Thread threadAdd = new Thread(addMoney);
        Thread threadAdd2 = new Thread(addMoney);
        Thread threadAdd3 = new Thread(removeMoney);
        Thread threadAdd4 = new Thread(removeMoney);
        threadAdd.start();
        threadAdd2.start();
        threadAdd3.start();
        threadAdd4.start();
        Thread.sleep(3000);
        System.out.println(account.getBalance());
    }
}
