package lesson21.examples.example4;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class WRFile {
    public static void main(String[] args) throws Exception{
        File file = new File("src//lesson21//examples//out.txt");
        PrintWriter out = new PrintWriter(file);
        FileReader in = new FileReader(file);

        out.print("Vlad");
        out.print(" ");
        out.print(22);
        out.print(" ");
        out.print("years old");
        out.close();

        int tmp;
        while ((tmp = in.read()) != -1){
            System.out.print((char) tmp);
        }

        in.close();
    }
}
