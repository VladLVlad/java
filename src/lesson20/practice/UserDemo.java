package lesson20.practice;

import java.util.Scanner;

public class UserDemo {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("""
                1 - create User
                2 - list users
                other - exit""");
            String s = scanner.nextLine();
            if (s.equals("1")) {
                Registration.createUser();
            } else if (s.equals("2")) {
                Registration.users.forEach(System.out::println);
            } else {
                System.exit(0);
            }
        }
    }
}
