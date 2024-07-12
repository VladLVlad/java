package lesson9.examples.authorization;

public class Person {
    private String login, password;

    public Person() {
    }

    public Person(String login, String password) {
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
        return "*".repeat(password.length());
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
