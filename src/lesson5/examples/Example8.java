package lesson5.examples;

public class Example8 {
    public static void main(String[] args) {
        go("Hello", false);
        go("Hello", true);
        System.out.println("qwwdeec");
    }

    public static void go(String str, boolean b){

        System.out.println(str);
        if (b){
            System.exit(0);
        }
        System.out.println("b false");
    }
}
