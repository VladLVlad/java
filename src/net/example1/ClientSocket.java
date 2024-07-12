package net.example1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8081);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1: send message \n" +
                    "another: exit");
            if(scanner.nextLine().equals("1")){
                out.println(scanner.nextLine());
                out.flush();
            }else {
                break;
            }
        }

        out.close();
        socket.close();

    }
}
