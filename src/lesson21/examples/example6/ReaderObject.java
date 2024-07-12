package lesson21.examples.example6;

import java.io.*;

public class ReaderObject {
    public static void main(String[] args) throws Exception {
        File file = new File("src//lesson21//examples//out.txt");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));

        String s = (String) in.readObject();
        int n = (int) in.readObject();
        String s2 = (String) in.readObject();

        System.out.println(s + s2);
        System.out.println(n);

        in.close();

        System.out.println(file.getPath());
     }
}
