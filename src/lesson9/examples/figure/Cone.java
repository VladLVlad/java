package lesson9.examples.figure;

public class Cone extends Figure{

    public Cone(double height, double radius) {
        super(height, radius);
    }

    @Override
    public void calculateVolume() {
        System.out.println("Volume is " + (0.33 * 3.14 * radius * radius * height));
    }




}
