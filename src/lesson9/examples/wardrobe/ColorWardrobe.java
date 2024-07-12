package lesson9.examples.wardrobe;

public class ColorWardrobe extends Wardrobe{
    String color;

    public ColorWardrobe(){}


    public ColorWardrobe(double height, double width, double depth, String color) {
        super(height, width, depth);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setAll(double height, double width, double depth, String color) {
        super.setAll(height, width, depth);
        this.color = color;
    }

    @Override
    public void getInformation() {
        System.out.println("Volume is " + getVolume() + "; color is " + this.color);
    }
}
