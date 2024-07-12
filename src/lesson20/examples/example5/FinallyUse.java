package lesson20.examples.example5;

public class FinallyUse {
    public static void procA() {
        try {
            System.out.println("In procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("finally for procA ");
        }
    }

    public static void procB() {
        try {
            System.out.println("In procB");

        } finally {
            System.out.println("finally for procB ");
        }
    }


    public static void procC() {
        try {
            System.out.println("In procC");
        } finally {
            System.out.println("finally procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception boom");
        }
        procB();
        procC();
    }
}
