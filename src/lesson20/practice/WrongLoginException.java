package lesson20.practice;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
