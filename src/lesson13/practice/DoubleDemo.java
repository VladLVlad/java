package lesson13.practice;

public class DoubleDemo {
    public static void main(String[] args) {
        Double d = Double.valueOf("12.3");
        String s = "11.2";
        double d2 = Double.parseDouble(s);
        byte b = d.byteValue();
        short sh = d.shortValue();
        int i = d.intValue();
        long l = d.longValue();
        float f = d.floatValue();
        double d3= d;
        String d4 = Double.toString(3.14);
        System.out.println(d);
        System.out.println(d2);
        System.out.println(b);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d3);
        System.out.println(d4);
    }
}
