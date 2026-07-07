package com.vehicle;

public class Truck extends Vehicle {
	Truck(String brand, int speed, String engineNumber, int fuelCapacity) {
        super(brand, speed, engineNumber, fuelCapacity);
    }

    @Override
    void drive() {
        System.out.println("Truck drives using Heavy Gear System");
    }
}
