package lesson12.examples.example5;

public class Smartphone extends Telephone{

    // has-a association
    private Case aCase;

    private double display;


    // has-a aggregation
    public Smartphone(Case aCase){
        this.aCase = aCase;
    }

    //has-a composition
    public Smartphone(){
        this.aCase = new Case();
    }



    public Smartphone(String company, String model, double weight, double display) {
        super(company, model, weight);
        this.display = display;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }
}
