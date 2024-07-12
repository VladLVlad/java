package lesson5.examples;

public class Example6 {
    public static void main(String[] args) {
        label:
        for (int i = 0; i < 4; i++) {
            for (int j = 15; j > 0; j--) {
                System.out.println("i " + i + "; j " + j);
                if (j == 13) {
                    continue label;
                }
            }

        }
    }
}
