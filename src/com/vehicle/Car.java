package com.vehicle;

public class Car extends Vehicle {
	Car(String brand, int speed, String engineNumber, int fuelCapacity) {
        super(brand, speed, engineNumber, fuelCapacity);
    }

    @Override
    void drive() {
        System.out.println("Car drives using Steering Wheel");
    }
}
