package lesson6.examples;

public class  Example3 {
    public static void main(String[] args) {

        String [][] arrayString = {
                {"q", "w"},
                {"q", "w"},
                {"q", "w"},
                {"q", "w"}


        };
        Double [][] arrayDouble = {
                {2.2, 1.0, 2.2},
                {12.2, 133.0, 2.5}
        };
        int [][] array = new int[5][];
        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];
        array[4] = new int[5];
        doRandom(array);
        printArray(array);
        printArray(arrayString);
        printArray(arrayDouble);

    }



    public static void doRandom(int [][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random() * 6);
            }
        }
    }

    public static <T> void printArray(T [][] array){
        for (T[] ints : array) {
            for (T anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static  void printArray(int [][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
