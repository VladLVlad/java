package lesson14.examples;

public class IndexOfDemo {
    public static void main(String[] args) {
        String s = "??? ?????? ?? ???????? ? ????? Java ???????????? "
                + "?????? String, StringBuilder, StringBuffer.";
        System.out.println(s.length());
        System.out.println(s);
        System.out.println("indexOf(S) = "
                + s.indexOf('S'));
        System.out.println("lastIndexOf(r) = "
                + s.lastIndexOf('r'));
        System.out.println("indexOf(String) = "
                + s.indexOf("String"));
        System.out.println("lastIndexOf(String) = "
                + s.lastIndexOf("String"));
        System.out.println("indexOf(S, 60) = "
                + s.indexOf('S', 60));
        System.out.println("lastIndexOf(S, 70) = "
                + s.lastIndexOf('S', 70));

        char[] ch = {'a', 'b', 'c'};
        System.out.println(String.valueOf(ch));
        System.out.println(ch);

        System.out.println("Hello my friend".substring(6,8));

        System.out.println("Hello".concat(" World"));
        System.out.println("Hello".replace('l', 'w'));
        System.out.println("Hello".toLowerCase());
        System.out.println("Hello".toUpperCase());
        System.out.println("    Hello World ".trim());

        String result = String.join(" ", "Hello","my", "friend");
        System.out.println(result);

        String result2 = String.join(":", "foobar", "foo", "bar");
        System.out.println(result2);

        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());
    }
}
