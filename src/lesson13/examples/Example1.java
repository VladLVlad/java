package lesson13.examples;

public class Example1 {
    public static void main(String[] args) {
        Boolean b = Boolean.valueOf("d");
        Boolean b2 = true;
        System.out.println(b);
        Byte by = 1;
        Byte by2 = Byte.valueOf("12");
        Double d = 12.0;
        double d2 = Double.parseDouble("12.9");
        Float f = 11f;
        System.out.println(f);
        long l = Long.parseLong("12");
        System.out.println(l);
        System.out.println(d2);
        String s = Integer.toString(234, 16);
        System.out.println(s);

    }


}
