package lesson12.examples.example3;

public interface SomeInterface {
    default void print(){
        System.out.println("Some interface");
    }
}
