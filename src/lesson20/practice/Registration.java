package lesson20.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {

    private static final Pattern pattern = Pattern.compile("^\\w+$");
    private static final Scanner scanner = new Scanner(System.in);

    public static List<User> users = new ArrayList<>();

    public static void createUser() throws WrongLoginException, WrongPasswordException{
        String login, password, confirmPassword;
        boolean loginMatches, passwordMatches;
        try {
            System.out.println("Enter login: ");
            login = scanner.nextLine();
            loginMatches = pattern.matcher(login).matches();
            if(!loginMatches){
                throw new WrongLoginException("login '" + login + "' isn't correct");
            }
            System.out.println("Enter password: ");
            password = scanner.nextLine();
            passwordMatches = pattern.matcher(password).matches();
            if(!passwordMatches){
                throw new WrongPasswordException("password '" + password + "' isn't correct");
            }
            System.out.println("Repeat password");
            confirmPassword = scanner.nextLine();
            if(!(password.equals(confirmPassword))){
                System.out.println("'" + password + "' and '" + confirmPassword + "' is not equals");

            }else {
                users.add(new User(login,password));
            }
        }catch (WrongLoginException | WrongPasswordException exception){
            System.out.println(exception.getMessage());

        }

    }
}
