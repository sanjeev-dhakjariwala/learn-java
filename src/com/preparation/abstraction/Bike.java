package com.preparation.abstraction;

// Concrete class
public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String make, String model, int year, boolean hasCarrier) {
        super(make, model, year);
        this.hasCarrier = hasCarrier;
    }

    public boolean hasCarrier() {
        return hasCarrier;
    }

    @Override
    public void drive() {
        System.out.println("The bike is being ridden.");
    }

    @Override
    public String toString() {
        return "Bike [Make=" + getMake() + ", Model=" + getModel() + ", Year=" + getYear() + ", Carrier=" + hasCarrier + "]";
    }
}
