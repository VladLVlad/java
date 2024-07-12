package lesson21.examples.example7;

import java.io.*;
import java.util.Arrays;

public class WRObject {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\studies\\document.docx");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

        out.writeObject("String");
        out.writeObject(new int[] {1,2,3});

        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));

        System.out.println((String) in.readObject());

        System.out.println(Arrays.toString((int[]) in.readObject()));


    }
}
