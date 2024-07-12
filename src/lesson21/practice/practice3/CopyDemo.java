package lesson21.practice.practice3;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("src\\lesson21\\practice\\practice3\\file.txt");
        File copyFile = new File("src\\lesson21\\practice\\practice3\\copy_file.txt");

        BufferedWriter out1 = new BufferedWriter(new FileWriter(file));
        BufferedReader in1 = new BufferedReader(new FileReader(file));
        BufferedWriter out2 = new BufferedWriter(new FileWriter(copyFile));

        out1.write("Hello");
        out1.write("\n");
        out1.write("Vlad");
        out1.write("\n");
        out1.write("Hello");
        out1.write("\n");
        out1.write("Vlad");

        out1.close();

        String s;
        //List<String> list = new ArrayList<>();
        while ((s = in1.readLine()) != null){
            out2.write(s + "\n");
        }

        in1.close();

        /*for (String str:
             list) {
            out2.write(str + "\n");
        }*/

        out2.close();
    }
}
