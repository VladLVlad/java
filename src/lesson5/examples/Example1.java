package lesson5.examples;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season;
        int month = scanner.nextInt();
        season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "April";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Not season";
        };
        System.out.println(season);
    }
}
