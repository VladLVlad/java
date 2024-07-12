package lesson21.examples.example3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        File file = new File("src//lesson21//examples//out.txt");
        try (PrintWriter out = new PrintWriter(file)) {
            out.print("1, 2, 3, 4, 5, 6");

        } catch (IOException e) {
            System.out.println("IO");
        }
        try (Scanner in = new Scanner(file)){
            while (in.hasNext()) {
                String s = in.next();
                System.out.print(s + " ");
            }
        } catch (IOException e) {
            System.out.println("IO");
        }
    }
}
