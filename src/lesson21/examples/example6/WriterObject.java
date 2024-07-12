package lesson21.examples.example6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriterObject {
    public static void main(String[] args) throws Exception{
        File file = new File("src//lesson21//examples//out.txt");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

        out.writeObject("Hello");
        out.writeObject(123);
        out.writeObject(" my friend");

        out.close();
    }
}
