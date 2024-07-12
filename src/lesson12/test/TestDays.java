package lesson12.test;

public class TestDays {
    public enum Days {MON, TUE, WED}

    ;

    public static void main(String[] args) {
        Days[] d2 = Days.values();
        System.out.println(d2[2]);
    }
}