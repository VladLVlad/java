package lesson9.examples;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(doFactorial(1));
        System.out.println(doFactorial(2));
        System.out.println(doFactorial(3));
        System.out.println(doFactorial(4));
        System.out.println(doFactorial(5));
        System.out.println(doFactorial(6));
    }
    public static int doFactorial(int number){

        if(number < 2){
            return 1;
        }
        return doFactorial(number -1) * number;
    }
}
