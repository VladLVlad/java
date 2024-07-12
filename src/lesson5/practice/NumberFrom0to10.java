package lesson5.practice;

import java.util.Scanner;

public class NumberFrom0to10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x >= 0 && x < 10){
            System.out.println("positive number in a interval {0...9}");
        }else {
            System.out.println("number in less than 0 or more than 9");
        }
    }
}
