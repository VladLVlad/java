package lesson5.examples;

public class Example9 {
    public static void main(String[] args) {
        int i = 1, j = 10;
        do {
            if (i > j) {
                break;
            }
            j--;
        } while (++i < 5);
        System.out.println("i = " + i + " and j = " + j);
    }
}
// i 1 2 3 4 5
// j 9 8 7 6