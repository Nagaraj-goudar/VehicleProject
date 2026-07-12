package com.vehicle;

public class Bike extends Vehicle {
	Bike(String companyName, int speed, String engineNumber, int fuelCapacity) {
        super(companyName, speed, engineNumber, fuelCapacity);
    }

    @Override
    void drive() {
        System.out.println("Bike drives using Handle");
    }
}
