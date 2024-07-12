package lesson9.examples.figure;

public class FigureDemo {
    public static void main(String[] args) {
        Figure[] figures = {new Cone(2,3), new Cylinder(2,4,3.14)};
        for (Figure f:
             figures) {
            f.calculateVolume();
        }
    }
}
