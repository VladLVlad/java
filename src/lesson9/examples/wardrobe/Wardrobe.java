package lesson9.examples.wardrobe;

public class Wardrobe {
    private double height;
    private double width;
    private double depth;

    public Wardrobe() {
    }


    public Wardrobe(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setAll(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getVolume() {
        return this.height * this.width * this.depth;
    }

    public void getInformation(){
        System.out.println("Volume is " + getVolume());
    }
}
