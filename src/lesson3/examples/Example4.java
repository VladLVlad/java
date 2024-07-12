package lesson3.examples;

import java.io.IOException;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        char sym = (char) x;
        System.out.println("The code of the symbol '" + sym + "' is " + x);
    }
}
