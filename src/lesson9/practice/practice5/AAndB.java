package lesson9.practice.practice5;

public class AAndB {
    public static void main(String[] args) {
        doRecourse(5, 2);
        doRecourse(14, 25);
        doRecourse(50, 50);
    }
    public static void doRecourse(int a, int b){
        if(a < b){
            System.out.print(a + " ");
            doRecourse(a+1, b);
        }
        if(a > b){
            System.out.print(a + " ");
            doRecourse(a-1, b);
        }
        if (a == b){
            System.out.println(b);
        }
    }
}
