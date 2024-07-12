package lesson23.examples.example1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderDemo {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        File file = new File("src\\lesson23\\examples\\example1\\people.bin");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));

        List<Person> people = new ArrayList<>();


        while (true) {
            try {
                people.add((Person) in.readObject());
            }catch (IOException | ClassNotFoundException exception){
                break;
            }



        }

        in.close();

        people.forEach(System.out::println);
    }
}
