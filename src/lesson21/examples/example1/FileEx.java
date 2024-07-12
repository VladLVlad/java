package lesson21.examples.example1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("src//lesson21//examples/out.txt");
        PrintWriter writer = new PrintWriter(file);

        writer.print("Hello,");
        writer.print(" Vlad");

        writer.close();
    }
}
