package lesson17.practice.practice1;

public class UserDemo {
    public static void main(String[] args) {
        User user = new User("Vlad", "123");
        user.createQuery();
        User.Query query = user.new Query();
        query.printToLog();
        User.Query query2 = new User("Sergey", "qwe").new Query();
        query2.printToLog();
    }
}
