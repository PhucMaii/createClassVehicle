package Hatchback;

import Car.Car;

public class Hatchback extends Car {
    private String carType;

    public Hatchback(String model, String make, int numberOfWheels, int topSpeed, boolean hasAC, String engine,
            String sound, String carType) {
        super(model, make, numberOfWheels, topSpeed, hasAC, engine, sound);
        this.carType = carType;
    }

    public Hatchback() {
        this.carType = "Hatchback";
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}

