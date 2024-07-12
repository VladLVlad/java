package lesson23.examples.example1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriterObject {
    public static void main(String[] args) throws Exception{
        File file = new File("src\\lesson23\\examples\\example1\\people.bin");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

        out.writeObject(new Person(1, "Vlad", 22));
        out.writeObject(new Person(2, "Sergey", 24));
        out.writeObject(new Person(3, "Alex", 21));

        out.close();
    }
}
