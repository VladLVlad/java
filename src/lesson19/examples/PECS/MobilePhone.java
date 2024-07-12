package lesson19.examples.PECS;

public class MobilePhone extends Phone{

    private int countSim;

    public MobilePhone(String model, double cost, int countSim) {
        super(model, cost);
        this.countSim = countSim;
    }

    public int getCountSim() {
        return countSim;
    }

    public void setCountSim(int countSim) {
        this.countSim = countSim;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "countSim=" + countSim +
                "} " + super.toString();
    }
}
