package lesson9.practice.practice7.vehicles;

import lesson9.practice.practice7.details.Engine;
import lesson9.practice.practice7.professions.Driver;

public class CarDemo {

    public static void main(String[] args) {
        Car car = new SportCar("Tesla", "Business",
                new Driver("Ivanov A.A.", 25, 4),
                new Engine(345, "Tesla"),
                278.5);

        System.out.println(car.toString());
    }

}
