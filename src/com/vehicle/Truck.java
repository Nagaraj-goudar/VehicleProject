package com.vehicle;

public class Truck extends Vehicle {
	Truck(String companyName, int speed, String engineNumber, int fuelCapacity) {
        super(companyName, speed, engineNumber, fuelCapacity);
    }

    @Override
    void drive() {
        System.out.println("Truck drives using Heavy Gear System");
    }
}
