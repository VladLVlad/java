package lesson6.practice;

public class MinMaxArray {
    public static void main(String[] args) {

        int [][] array = new int[][]{
                {13, 66, 34, 1, 87, 11, 99, 44},
                {23, 26, 24, 2, 37, 21, 49, 94},
                {33, 16, 94, 3, 27, 41, 39, 54},
                {43, 56, 64, 4, 57, 61, 29, 84},
                {53, 86, 14, 8, 17, 81, 19, 74},
        };
        int [][] newArray = new int[5][2];
        int min, max;
        for (int i = 0; i < array.length; i++){
            min = max = array[i][0];
            for (int j = 1; j < array[i].length; j ++){
                if(array[i][j] < min){
                    min = array[i][j];
                }
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
            newArray[i][0] = min;
            newArray[i][1] = max;
        }
        for (int[] row:
             newArray) {
            for (int column:
                 row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
