package com.vehicle;

public class Bike extends Vehicle {
	Bike(String brand, int speed, String engineNumber, int fuelCapacity) {
        super(brand, speed, engineNumber, fuelCapacity);
    }

    @Override
    void drive() {
        System.out.println("Bike drives using Handle");
    }
}
