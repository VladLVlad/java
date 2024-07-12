package lesson14.practice.practice2;

public class StringBuilderDemo {
    public static void main(String[] args) {

        doMethod(2, 6);
        doMethod(23,3);
    }

    public static void doMethod(int a, int b) {
        StringBuilder str = new StringBuilder();
        int[] result = {
                a + b, a - b, a * b
        };
        char[] symbols = {
                '+', '-', '*'
        };
        for (int i = 0; i < result.length; i++) {
            str.append(a).append(" ").append(symbols[i]).append(" ").append(b).append(" = ").append(result[i]).append("\n");
        }

        System.out.println(str);

        int index;
        while ((index = str.indexOf("=")) != -1) {
            str.replace(index, index + 1, "is");
        }

        System.out.println(str);
    }
}
