package lesson4.practice;

import java.util.Scanner;

public class MinModule {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double [] array = new double[3];
        double [] modArray = new double[3];

        for (int i = 0; i < array.length; i++){
            if(scanner.hasNextDouble()){
                array[i] = scanner.nextDouble();
                modArray[i] = array[i] < 0 ? -array[i] : array[i];
            }
        }

        if(modArray[0] < modArray[1] && modArray[0] < modArray[2]){
            System.out.println("smallest absolute value is " + array[0]);
        }else if (modArray[1] < modArray[2]){
            System.out.println("smallest absolute value is " + array[1]);
        }else {
            System.out.println("smallest absolute value is " + array[2]);
        }
    }
}
