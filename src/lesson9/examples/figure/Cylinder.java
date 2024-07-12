package lesson9.examples.figure;

public class Cylinder extends Figure{

    double pi;

    public Cylinder(double height, double radius, double pi) {
        super(height, radius);
        this.pi = pi;
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume is " + (pi * radius * radius * height));
    }
}
