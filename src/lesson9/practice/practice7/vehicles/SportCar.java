package lesson9.practice.practice7.vehicles;

import lesson9.practice.practice7.details.Engine;
import lesson9.practice.practice7.professions.Driver;

public class SportCar extends Car{
    private double speed;

    public SportCar(String carModel, String carClass, Driver driver, Engine engine, double speed) {
        super(carModel, carClass, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
