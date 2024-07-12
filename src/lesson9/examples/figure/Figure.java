package lesson9.examples.figure;

public abstract class Figure {
    double height;
    double radius;

    public Figure(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    public abstract void calculateVolume();

}
