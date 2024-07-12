package lesson6.practice;

public class ArrayString {
    public static void main(String[] args) {
        String [][] array = new String[3][6];
        char symbol = 'a';
        for (int i = 0; i < array.length; i++, symbol ++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = "" + symbol + (j+1);
            }
        }
        for (String [] row : array){
            for (String column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
