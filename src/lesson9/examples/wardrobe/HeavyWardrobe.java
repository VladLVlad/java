package lesson9.examples.wardrobe;

public class HeavyWardrobe extends Wardrobe {
    double weight;

    public HeavyWardrobe(){}

    public HeavyWardrobe(double height, double width, double depth, double weight){
        super(height, width, depth);
        this.weight = weight;
    }

    @Override
    public void getInformation(){
        System.out.println("Volume is " + getVolume() + "; weight is " + weight);
    }
}
