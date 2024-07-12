package lesson17.practice.practice2;

public class User {
    private String login,password;

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

    public void showQuery(){
        class Query{
            public void showMessage(){
                System.out.println("User with login \"" + login + "\" and password \"" + password + "\" signed in system");
            }
        }
        Query query = new Query();
        query.showMessage();
    }
}
