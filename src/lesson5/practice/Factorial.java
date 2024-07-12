package lesson5.practice;

public class Factorial {
    public static void main(String[] args) {

        int fact = (int) (Math.random() * 6);
        int result = fact;
        if(fact == 0 || fact == 1){
            result = 1;
            System.out.println("Factorial " + fact + " is " + result);
            System.exit(0);
        }
        for (int i = 1, fact2 = fact - 1; i < fact; i++, fact2--){
            result *= fact2;
        }
        System.out.println("Factorial " + fact + " is " + result);
    }
}
