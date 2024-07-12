package lesson9.practice.practice7.vehicles;

import lesson9.practice.practice7.details.Engine;
import lesson9.practice.practice7.professions.Driver;

public class Car {
    private String carModel;
    private String carClass;
    private Driver driver;
    private Engine engine;

    public Car(String carModel, String carClass, Driver driver, Engine engine) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.driver = driver;
        this.engine = engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("Start");
    }

    public void stop(){
        System.out.println("Stop");
    }

    public void turnLeft(){
        System.out.println("Turn left");
    }

    public void turnRight(){
        System.out.println("Turn right");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carClass='" + carClass + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
