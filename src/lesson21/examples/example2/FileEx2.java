package lesson21.examples.example2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileEx2 {
    public static void main(String[] args) throws IOException {
        File file = new File("src//lesson21//examples//out.txt");
        Scanner in = new Scanner(file);

        while (in.hasNext()){
            String s = in.next();
            System.out.print(s + " ");
        }

        in.close();
    }
}
