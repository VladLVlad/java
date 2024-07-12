package lesson3.practice;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[2];
        for (int i = 0; i < 2; i++){
            if(scanner.hasNextInt()){
                array[i] = scanner.nextInt();
            }
            else {
                System.out.println("Error");
            }
        }
        System.out.println(array[0] + " + " + array[1] + " = " + (array[0] + array[1]));
        }
    }

