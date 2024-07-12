package lesson12.examples.example6;

public class ColorBox extends Box{
    private String color;

    public ColorBox(double height, double width, double depth, String color) {
        super(height, width, depth);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorBox{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
