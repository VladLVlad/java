package lesson6.practice;

public class CharArray {
    public static void main(String[] args) {
        char [][] array = new char[][]{
                {'q', 'w'},
                {'e', 'r'},
                {'t', 'y'},
                {'u', 'i'}
        };
        for (char[] row:
             array) {
            for (char column:
                 row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
