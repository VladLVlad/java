package lesson20.examples.example1;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try {
                int div = getDiv(x, y);
                System.out.println("x / y = " + div);
            }catch (ArithmeticException exception){
                System.out.println("Division be zero!!!");
            }
        }
    }

    private static int getDiv(int x, int y) throws ArithmeticException{
        if(y == 0) throw new ArithmeticException();
        return x / y;
    }
}
