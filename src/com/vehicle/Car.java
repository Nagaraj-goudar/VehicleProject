package com.vehicle;

public class Car extends Vehicle {
	Car(String companyName, int speed, String engineNumber, int fuelCapacity) {
        super(companyName, speed, engineNumber, fuelCapacity);
    }

    @Override
    void drive() {
        System.out.println("Car drives using Steering Wheel");
    }
}
