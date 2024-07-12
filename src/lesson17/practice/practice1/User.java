package lesson17.practice.practice1;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public class Query{
        public void printToLog(){
            System.out.println("User with login \"" + login + "\" and password \"" + password + "\" signed in system");
        }
    }

    public void createQuery(){
        Query query = new Query();
        query.printToLog();
    }
}
