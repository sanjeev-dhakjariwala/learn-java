package com.preparation.abstraction;

// Concrete class
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void drive() {
        System.out.println("The car is being driven.");
    }

    @Override
    public String toString() {
        return "Car [Make=" + getMake() + ", Model=" + getModel() + ", Year=" + getYear() + ", Doors=" + numberOfDoors + "]";
    }
}
