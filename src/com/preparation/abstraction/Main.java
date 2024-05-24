package com.preparation.abstraction;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", "Corolla", 2020, 4);
        Vehicle myBike = new Bike("Yamaha", "YZF-R3", 2018, true);

        myCar.start();
        myCar.drive();
        myCar.stop();
        System.out.println(myCar);

        myBike.start();
        myBike.drive();
        myBike.stop();
        System.out.println(myBike);
    }
}
