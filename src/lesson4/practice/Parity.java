package lesson4.practice;

import java.util.Scanner;

public class Parity {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a;
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
            if(a % 2 == 0){
                System.out.println(a + " even");
            }else {
                System.out.println(a + " odd");
            }
        }else {
            System.out.println("Error");
        }
    }
}
