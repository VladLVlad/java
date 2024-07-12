package lesson17.practice.practice3;

public class User {
    private static String login;
    private static String password;

    public static void initialize(String login, String password){
        User.login = login;
        User.password = password;
    }

    public static class Query{
        public void printToLog(){
            System.out.println("User with login \"" + login + "\" and password \"" + password + "\" signed in system");
        }
    }
}
