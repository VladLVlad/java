package lesson19.examples.PECS;

public class SmartPhone extends MobilePhone{
    private String typeOS;

    public SmartPhone(String model, double cost, int countSim, String typeOS) {
        super(model, cost, countSim);
        this.typeOS = typeOS;
    }

    public String getTypeOS() {
        return typeOS;
    }

    public void setTypeOS(String typeOS) {
        this.typeOS = typeOS;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "typeOS='" + typeOS + '\'' +
                "} " + super.toString();
    }
}
