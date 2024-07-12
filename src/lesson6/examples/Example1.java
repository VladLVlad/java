package lesson6.examples;

public class Example1 {
    public static void main(String[] args) {

        printArray(new char[]{'H','e','l','l','o'});
    }

    public static void printArray(char[] array){
        for (char a:
             array) {
            System.out.print(a);
        }
    }
}
