package lesson5.examples;

public class Example7 {
    public static void main(String[] args) {
        go("Hello", true);
        go("Hello", false);
    }

    public static void go(String str, boolean b){

        System.out.println(str);
        if (b){
            return;
        }
        System.out.println("b false");
    }
}
