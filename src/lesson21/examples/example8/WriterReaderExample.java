package lesson21.examples.example8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterReaderExample {
    public static void main(String[] args) {
        File file = new File("E:\\studies\\document.txt");
        try (PrintWriter out = new PrintWriter(file)){
            out.print("Hello");

        }catch (IOException ex){
            System.out.println("Exception");
        }
    }
}
