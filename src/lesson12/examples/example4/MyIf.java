package lesson12.examples.example4;

public interface MyIf {
    static int staticMethod(){
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(MyIf.staticMethod());
    }
}
