package lesson9.examples.wardrobe;

public class CostColorWardrobe extends ColorWardrobe {
    double cost;

    public CostColorWardrobe() {

    }

    public CostColorWardrobe(double height, double width, double depth, String color, double cost) {
        super(height, width, depth, color);
        this.cost = cost;
    }

    @Override
    public void getInformation() {
        super.getInformation();
        System.out.println("cost is " + cost);
    }
}
