package lesson9.examples;

public class VarArgsDemo {


    public static void calculateSum(int ... subsequence){
        int sum = 0;
        for (int s:
             subsequence) {
            System.out.print(s + " ");
            sum += s;
        }
        System.out.print("= " + sum);
        System.out.println();
    }

    public static void calculateSum(double ... subsequence){
        double sum = 0.0;
        for (double s:
                subsequence) {
            System.out.print(s + " ");
            sum += s;
        }
        System.out.print("= " + sum);
        System.out.println();
    }

    public static void main(String[] args) {
        calculateSum(1, 4, 2 , 4, 1);
        calculateSum(1.1, 4.1, 2.1 , 4.1, 1.1);
        calculateSum();
    }
}
