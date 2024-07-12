package lesson12.internet_shop.authorization;

import java.util.Objects;
import java.util.Scanner;

import static lesson12.internet_shop.authorization.UserDB.users;
import static lesson12.internet_shop.catalog.Category.showCategory;

public class User {

    private static Scanner scanner = new Scanner(System.in);
    private String login;
    private String password;



    public User() {
    }

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

    public static void signIn(){
        System.out.println("""
                Do you have an account?\s
                1. Yes\s
                2. No\s
                """);
        String s = scanner.nextLine();
        String login;
        String password;
        boolean tf = false;
        if(Objects.equals(s, "1")){
            System.out.println("Input login:");
            login = scanner.nextLine();
            System.out.println("Input password:");
            password = scanner.nextLine();
            for (User u:
                 users) {
                if(u.getLogin().equals(login) && u.getPassword().equals(password)){
                    System.out.println("You singed in system");
                    tf = true;

                }
            }
            if(!tf){
                System.out.println("login or password are wrong");
                signIn();
            }
            showCategory();


        } else if (Objects.equals(s, "2")) {
            createUser();
        } else {
            System.out.println("It isn't 1 or 2");
            signIn();
        }

    }

    public static void createUser(){
        User newUser = new User();
        System.out.println("Create user: \n" +
                "Create login:"  );
        newUser.setLogin(scanner.nextLine());
        System.out.println("Create password:");
        newUser.setPassword(scanner.nextLine());
        User[] newUsers = new User[users.length + 1];
        System.arraycopy(users, 0, newUsers, 0, users.length);
        newUsers[newUsers.length - 1] = newUser;
        users = newUsers;
        System.out.println("Account saved!");
        signIn();
    }





}
