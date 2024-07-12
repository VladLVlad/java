package lesson12.examples.example6;

public class HeavyBox extends Box implements Comparable<HeavyBox>{
    private double weight;

    public HeavyBox(double height, double width, double depth, double weight) {
        super(height, width, depth);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                "} " + super.toString();
    }

    @Override
    public int compareTo(HeavyBox o) {

        return Double.compare(this.getHeight(), o.getHeight());
    }
}
