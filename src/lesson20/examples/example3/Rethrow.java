package lesson20.examples.example3;

public class Rethrow {
    public static void main(String[] args) throws MoreTenException {
        try {
            div(21,2);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (MoreTenException exception) {
            System.out.println("Again");

        }
    }
    public static void div(int a, int b) throws ArithmeticException, MoreTenException {
        try {
            if (a >10) throw new MoreTenException(a);
            if (b >10) throw new MoreTenException(b);
            System.out.println("Division :" + (a / b));
        }catch (MoreTenException exception) {
            System.out.println(exception.getA() + " is more then 10");
            throw exception;
        }

    }
}
