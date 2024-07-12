package lesson21.examples.example5;

import java.io.*;

public class WRStream {
    public static void main(String[] args) throws Exception{
        File file = new File("src//lesson21//examples//out.txt");
        DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
        DataInputStream in = new DataInputStream(new FileInputStream(file));

        out.writeUTF("Hello");
        out.write(123);
        out.close();

        System.out.println(in.readUTF());
        System.out.println(in.read());
        in.close();
    }
}
