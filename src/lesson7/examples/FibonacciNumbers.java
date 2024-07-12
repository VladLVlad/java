package lesson7.examples;

import java.time.Duration;
import java.time.LocalTime;

public class FibonacciNumbers {
    public static void main(String[] args) {


        LocalTime localTime1 = LocalTime.now();
        for (int i = 1; i < 40; i++) {
            System.out.print(doCycleFibonacci(i) + " ");
        }
        System.out.println();
        LocalTime localTime2 = LocalTime.now();
        Duration duration1 = Duration.between(localTime1, localTime2);
        System.out.println("Time: " + duration1);

        LocalTime localTime3 = LocalTime.now();
        for (int i = 1; i < 40; i++) {
            System.out.print(doRecursionFibonacci(i) + " ");
        }
        System.out.println();
        LocalTime localTime4 = LocalTime.now();
        Duration duration2 = Duration.between(localTime3, localTime4);
        System.out.println("Time: " + duration2);


    }

    public static int doCycleFibonacci(int n) {

        int result = 0;
        int resultMin1 = 1;
        int resultMin2 = 0;
        if (n == 1)
            return resultMin2;
        if (n == 2)
            return resultMin1;
        for (int i = 2; i < n; i++) {
            result = resultMin1 + resultMin2;
            resultMin2 = resultMin1;
            resultMin1 = result;
        }
        return result;
    }

    public static int doRecursionFibonacci(int n) {
        int result = 0;
        if(n == 1){
            return result;
        }
        if(n == 2){
            return result+1;
        }
        result = doRecursionFibonacci(n-1) + doRecursionFibonacci(n-2);
        return result;
    }


}
