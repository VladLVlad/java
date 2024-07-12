package lesson14.examples;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hi, brother");

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());
        System.out.println(str.charAt(2));
        str.setCharAt(2,'!');
        System.out.println(str);
        str.setLength(6);
        System.out.println(str);

        str.insert(str.length(),"other");
        System.out.println(str);

        str.reverse();
        System.out.println(str);

        str.delete(0,7);
        System.out.println(str);

        str.deleteCharAt(0);
        System.out.println(str);

        StringBuilder str2 = new StringBuilder("It is a test");
        str2.replace(3,5, "was");
        System.out.println(str2);
    }
}
