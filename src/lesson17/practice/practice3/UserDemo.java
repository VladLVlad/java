package lesson17.practice.practice3;

public class UserDemo {
    public static void main(String[] args) {
        User.initialize("Egor", "aqw12");
        User.Query query = new User.Query();
        query.printToLog();
    }
}
