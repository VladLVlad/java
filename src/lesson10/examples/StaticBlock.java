package lesson10.examples;

import java.util.Scanner;

public class StaticBlock {
    static int a;

    static {
        System.out.println("static block is initialized");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
