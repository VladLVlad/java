package lesson6.examples;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {

        int [][] array = new int[3][4];
        doRandom(array);
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
    public static void doRandom(int [][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random() * 6);
            }
        }
    }
}
