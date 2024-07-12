package lesson9.examples.circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, 4.0);
        System.out.println(circle.getRadius());
        System.out.println(circle.getDiameter());

        circle.setRadius(3);
        System.out.println(circle.getRadius());
        System.out.println(circle.getDiameter());

        circle.setDiameter(5.6);
        System.out.println(circle.getRadius());
        System.out.println(circle.getDiameter());

    }
}
