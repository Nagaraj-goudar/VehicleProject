package com.vehicle;

public class ElectricCar extends Vehicle {
	int batteryCapacity;

    ElectricCar(String brand, int speed, String engineNumber,
            int fuelCapacity, int batteryCapacity) {

        super(brand, speed, engineNumber, fuelCapacity);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void drive() {
        System.out.println("Electric Car drives silently.");
    }
}
