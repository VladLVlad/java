package lesson9.practice.practice7.vehicles;

import lesson9.practice.practice7.details.Engine;
import lesson9.practice.practice7.professions.Driver;

public class Lorry extends Car{
    private int carrying;

    public Lorry(String carModel, String carClass, Driver driver, Engine engine, int carrying) {
        super(carModel, carClass, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                "} " + super.toString();
    }
}
